package com.lrms.controller.request;


public class SftpRequestModel {

    private String filePath;
    private String keyWord;

    public SftpRequestModel() {
    }

    public SftpRequestModel(String filePath, String keyWord) {
        this.filePath = filePath;
        this.keyWord = keyWord;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyword) {
        this.keyWord = keyword;
    }


}
