package com.lrms.contract;

import com.lrms.controller.request.SftpRequestModel;

public interface IStatusService {
    /**
     * Get SFTP status
     *
     * @param stfpRequest
     * @return
     */
    boolean getSftpStatus(SftpRequestModel stfpRequest);


}
