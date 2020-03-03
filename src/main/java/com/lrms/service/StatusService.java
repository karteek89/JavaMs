package com.lrms.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.lrms.contract.IStatusService;
import com.lrms.controller.request.SftpRequestModel;
import org.springframework.stereotype.Component;

@Component
public class StatusService implements IStatusService {

    @Override
    public boolean getSftpStatus(SftpRequestModel sftpRequest) {

        boolean isSftpSuccess = false;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(sftpRequest.getFilePath()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(sftpRequest.getKeyWord())) {
                    isSftpSuccess = true;
                    break;
                }
            }
            reader.close();
        } catch (IOException e) {
            isSftpSuccess = false;
        }

        return isSftpSuccess;
    }

}
