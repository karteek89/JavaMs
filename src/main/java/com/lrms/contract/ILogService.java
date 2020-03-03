package com.lrms.contract;

import java.util.List;
import com.lrms.controller.request.AllLogsRequestModel;
import com.lrms.controller.request.DateLogsRequestModel;
import com.lrms.model.AllLogResponseModel;
import com.lrms.model.LogInfoResponseModel;

public interface ILogService {
    /**
     * Get all logs
     *
     * @param allLogsRequestModel
     * @return
     */
    List<AllLogResponseModel> GetAllLogs(AllLogsRequestModel allLogsRequestModel);


    /**
     * Get Date wise logs
     *
     * @param dateLogsRequestModel
     * @return
     */
    List<LogInfoResponseModel> GetDateWiseLogs(DateLogsRequestModel dateLogsRequestModel);

}
