/*
 * Copyright (c) 2017 Trinh Thanh Binh. All rights reserved.
 */
package bk.saothienhat.ffmpegjavademo.model;

/**
 * @author binhtt
 *
 */
public class FfmpegCommand {
    private String command;
    private FFMPEGCommandType commandType;
    
    public static final int LOGLEVEL_ALL = 0; // log all message of execution output
    public static final int LOGLEVEL_ERROR = 1; // log Error of execution output only
    public static final int LOGLEVEL_NO = 2; // Do not log anything
    
    /**
     * Construct new instance of ffmpegCommand
     * @param command
     * @param commandType
     */
    public FfmpegCommand(String command, FFMPEGCommandType commandType) {
        this.command = command;
        this.commandType = commandType;
    }

    /**
     * Method to get field command as type String
     * @return the command
     */
    public String getCommand() {
        return command;
    }

    /**
     * Method to set value for field command
     *
     * @param command the command to set
     */
    public void setCommand(String command) {
        this.command = command;
    }

    /**
     * Method to get field commandType as type FFMPEGCommandType
     * @return the commandType
     */
    public FFMPEGCommandType getCommandType() {
        return commandType;
    }

    /**
     * Method to set value for field commandType
     *
     * @param commandType the commandType to set
     */
    public void setCommandType(FFMPEGCommandType commandType) {
        this.commandType = commandType;
    }

       
    

}
