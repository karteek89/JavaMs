package com.lrms.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.lrms.contract.ILogService;
import com.lrms.controller.request.AllLogsRequestModel;
import com.lrms.controller.request.DateLogsRequestModel;
import com.lrms.model.AllLogResponseModel;
import com.lrms.model.LogInfoResponseModel;
import org.springframework.stereotype.Component;

@Component
public class LogService implements ILogService {


    @Override
    public List<AllLogResponseModel> GetAllLogs(AllLogsRequestModel allLogsRequestModel) {
        List<AllLogResponseModel> allLogs = new ArrayList<AllLogResponseModel>();
        try {
            File folder = new File(allLogsRequestModel.getFilePath());
            File[] listOfFiles = folder.listFiles();

            for (int i = 0; i < listOfFiles.length; i++) {

                if (listOfFiles[i].isFile()) {
                    String fileName = listOfFiles[i].getName();
                    if (fileName.endsWith("." + allLogsRequestModel.getfileExtn())) {
                        String logDate = fileName.split("\\.")[0];
                        AllLogResponseModel log = ReadLogsCount(listOfFiles[i], logDate);
                        allLogs.add(log);
                    }
                }
            }

        } catch (Exception e) {
        }
        return allLogs;
    }

    @Override
    public List<LogInfoResponseModel> GetDateWiseLogs(DateLogsRequestModel dateLogsRequestModel) {
        return ReadLogs(dateLogsRequestModel);
    }

    // #region Private Sections

    private AllLogResponseModel ReadLogsCount(File file, String logDate) {

        AllLogResponseModel responseModel = new AllLogResponseModel(logDate, 0, 0, 0);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String firstWord = line.split("\\s+")[0];

                switch (firstWord) {
                    case ":INFO:":
                        responseModel.setInfoCount(responseModel.getInfoCount() + 1);
                        break;
                    case ":WARN:":
                        responseModel.setWarningCount(responseModel.getWarningCount() + 1);
                        break;
                    case ":ERROR:":
                        responseModel.setErrorCount(responseModel.getErrorCount() + 1);
                        break;
                    default:
                        break;
                }
            }
            reader.close();
        } catch (IOException e) {
        }

        return responseModel;
    }

    private List<LogInfoResponseModel> ReadLogs(DateLogsRequestModel dateLogsRequestModel) {
        List<LogInfoResponseModel> list = new ArrayList<LogInfoResponseModel>();
        try {

            int limit = dateLogsRequestModel.getLimit();
            int page = dateLogsRequestModel.getPage();

            int offset = (page - 1) * limit;
            FileReader fileReader = new FileReader(dateLogsRequestModel.getFilePath());
            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            LogInfoResponseModel newLog = null;
            int logsCount = 0;

            while ((line = reader.readLine()) != null) {

                String firstWord = line.split("\\s+")[0];
                boolean isNewLog = firstWord.equals(":INFO:") || firstWord.equals(":WARN:")
                        || firstWord.equals(":ERROR:");

                if (isNewLog)
                    newLog = null;

                if (isNewLog) {
                    if (limit == list.size())
                        break;

                    logsCount++;

                    if (logsCount <= offset)
                        continue;

                    String type = firstWord;
                    String message = line.split("\\#\\#\\#")[1];
                    String description = line.split("\\[]\\[]")[1];
                    newLog = new LogInfoResponseModel("", type, message, description);

                    list.add(newLog);
                } else if (newLog != null) {
                    String desc = newLog.getDescription();
                    newLog.setDescription(desc + line);
                }

            }
            reader.close();
        } catch (IOException e) {
        }

        return list;
    }
    // #endregion
}
