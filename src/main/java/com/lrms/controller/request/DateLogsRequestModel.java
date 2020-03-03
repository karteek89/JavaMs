package com.lrms.controller.request;


public class DateLogsRequestModel {

    private String filePath;
    private String fileExtn;
    private String logDate;
    private String logLevel;
    private int limit;
    private int page;

    public DateLogsRequestModel() {
    }

    public DateLogsRequestModel(String filePath, String fileExtn, String logDate, String logLevel,
            int limit, int page) {

        this.limit = limit;
        this.page = page;
        this.filePath = filePath;
        this.fileExtn = fileExtn;
        this.logDate = logDate;
        this.logLevel = logLevel;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getLogDate() {
        return logDate;
    }

    public void setLogDate(String logDate) {
        this.logDate = logDate;
    }

    public String getfileExtn() {
        return fileExtn;
    }

    public void setfileExtn(String fileExtn) {
        this.fileExtn = fileExtn;
    }

}
