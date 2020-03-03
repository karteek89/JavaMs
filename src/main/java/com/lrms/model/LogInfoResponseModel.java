package com.lrms.model;

public class LogInfoResponseModel {

    private String logDate;
    private String type;
    private String message;
    private String description;

    public LogInfoResponseModel() {
    }

    public LogInfoResponseModel(String logDate, String type, String message, String description) {

        this.logDate = logDate;
        this.type = type;
        this.message = message;
        this.description = description;
    }

    public String getlogDate() {
        return logDate;
    }

    public void setlogDate(String logDate) {
        this.logDate = logDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
