
package com.lrms.controller.api;

import java.util.List;
import com.lrms.contract.ILogService;
import com.lrms.controller.request.AllLogsRequestModel;
import com.lrms.controller.request.DateLogsRequestModel;
import com.lrms.model.AllLogResponseModel;
import com.lrms.model.LogInfoResponseModel;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logs")
public class LogController {

	@Autowired
	private ILogService logService;

	@PostMapping(value = "/getAll", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<AllLogResponseModel> getAllLogs(
			@RequestBody AllLogsRequestModel allLogsRequestModel) {
		return logService.GetAllLogs(allLogsRequestModel);
	}

	@PostMapping(value = "/getLogsBy", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<LogInfoResponseModel> GetDateWiseLogs(
			@RequestBody DateLogsRequestModel dateLogsRequestModel) {
		return logService.GetDateWiseLogs(dateLogsRequestModel);
	}

}
