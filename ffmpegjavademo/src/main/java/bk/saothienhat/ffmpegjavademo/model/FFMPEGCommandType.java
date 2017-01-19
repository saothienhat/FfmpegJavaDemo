/*
 * Copyright (c) 2017 Trinh Thanh Binh. All rights reserved.
 */
package bk.saothienhat.ffmpegjavademo.model;

/**
 * @author binhtt
 *
 */
public enum FFMPEGCommandType {
    CONVERT_MEDIA_FILE(1, "Comvert Media file"),
    COMPRESS_MEDIA_FILE(2, "Compress Media file")
    ;
    
    private int commandId;
    private String commandDescription;
    
    FFMPEGCommandType(int commandId,    String commandDescription){
        this.commandDescription = commandDescription;
        this.commandId = commandId;
    }

    /**
     * Method to get field commandId as type int
     * @return the commandId
     */
    public int getCommandId() {
        return commandId;
    }

    /**
     * Method to set value for field commandId
     *
     * @param commandId the commandId to set
     */
    public void setCommandId(int commandId) {
        this.commandId = commandId;
    }

    /**
     * Method to get field commandDescription as type String
     * @return the commandDescription
     */
    public String getCommandDescription() {
        return commandDescription;
    }

    /**
     * Method to set value for field commandDescription
     *
     * @param commandDescription the commandDescription to set
     */
    public void setCommandDescription(String commandDescription) {
        this.commandDescription = commandDescription;
    }
    
    
    
    
}
