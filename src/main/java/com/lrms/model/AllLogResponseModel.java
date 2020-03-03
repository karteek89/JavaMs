package com.lrms.model;

public class AllLogResponseModel {

    private String logDate;
    private int errorCount;
    private int infoCount;
    private int warningCount;

    public AllLogResponseModel() {
    }

    public AllLogResponseModel(String logDate, int errorCount, int infoCount, int warningCount) {

        this.logDate = logDate;
        this.errorCount = errorCount;
        this.infoCount = infoCount;
        this.warningCount = warningCount;
    }

    public String getlogDate() {
        return logDate;
    }

    public void setlogDate(String logDate) {
        this.logDate = logDate;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

    public int getInfoCount() {
        return infoCount;
    }

    public void setInfoCount(int infoCount) {
        this.infoCount = infoCount;
    }

    public int getWarningCount() {
        return warningCount;
    }

    public void setWarningCount(int warningCount) {
        this.warningCount = warningCount;
    }


}
