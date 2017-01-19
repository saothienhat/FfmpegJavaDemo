/*
 * Copyright (c) 2017 Trinh Thanh Binh. All rights reserved.
 */
package bk.saothienhat.ffmpegjavademo.model;

/**
 * @author binhtt
 *
 */
public enum FileType {
    AVI("avi"),
    MP4("mp4")
    ;
    
    private String fileType;
    
    FileType(String fileType){
        this.fileType = fileType;
    }

    /**
     * Method to get field fileType as type String
     * @return the fileType
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Method to set value for field fileType
     *
     * @param fileType the fileType to set
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    
    
    
    
    
}
