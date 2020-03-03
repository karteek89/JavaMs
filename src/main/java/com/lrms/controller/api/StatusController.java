
package com.lrms.controller.api;

import com.lrms.contract.IStatusService;
import com.lrms.controller.request.SftpRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/status/")
public class StatusController {

	@Autowired
	private IStatusService statusService;

	@PostMapping(value = "/getSftpStatus", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean getSftpStatus(@RequestBody SftpRequestModel sftpRequest) {
		boolean res = statusService.getSftpStatus(sftpRequest);
		return res;
	}


	@PostMapping(value = "/getAdaptorStatus", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean getAdaptorStatus(@RequestBody SftpRequestModel sftpRequest) {
		boolean res = statusService.getSftpStatus(sftpRequest);
		return res;
	}
}
