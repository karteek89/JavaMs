package com.lrms.controller.request;


public class AllLogsRequestModel {

    private int daysCount;
    private String filePath;
    private String fileExtn;

    public AllLogsRequestModel() {
    }

    public AllLogsRequestModel(int daysCount, String filePath, String fileExtn) {

        this.daysCount = daysCount;
        this.filePath = filePath;
        this.fileExtn = fileExtn;
    }

    public int getDaysCount() {
        return daysCount;
    }

    public void setDaysCount(int daysCount) {
        this.daysCount = daysCount;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getfileExtn() {
        return fileExtn;
    }

    public void setfileExtn(String fileExtn) {
        this.fileExtn = fileExtn;
    }


}
