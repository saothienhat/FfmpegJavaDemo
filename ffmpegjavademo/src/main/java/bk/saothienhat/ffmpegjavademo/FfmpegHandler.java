/*
 * Copyright (c) 2017 Sao Thien Hat. All rights reserved.
 */
package bk.saothienhat.ffmpegjavademo;

import java.io.IOException;

import bk.saothienhat.ffmpegjavademo.model.AppConfig;
import bk.saothienhat.ffmpegjavademo.model.AppConst;
import bk.saothienhat.ffmpegjavademo.utils.Logger;

/**
 * @author Sao Thien Hat
 *
 */
public class FfmpegHandler {
    
    private String ffmpegPath;
    
    
    /**
     * Method to get field ffmpegPath as type String
     * @return the ffmpegPath
     */
    public String getFfmpegPath() {
        return ffmpegPath;
    }
    
    /**
     * Method to set value for field ffmpegPath
     *
     * @param ffmpegPath the ffmpegPath to set
     */
    public void setFfmpegPath(String ffmpegPath) {
        this.ffmpegPath = ffmpegPath;
    }
    
    
    
    
    /**
     * Construct new instance of FfmpegHandler
     */
    public FfmpegHandler() {
        setFfmpegPath(AppConfig.FFMPEG_4_WINDOW_PATH);
    }

    /**
     * Method to convert video basically with convert command: ffmpeg -i input.mp4 output.avi
     *
     * @param inputFilePath
     * @param outputFilePath
     */
    public void convertVideoBasic(String inputFilePath, String outputFilePath){   
        // Command: ffmpeg -i your_input_file your_output_file
        convert(AppConst.FFMPEG_OPTION_I, inputFilePath, AppConst.FFMPEG_OPTION_CONVERT_EMPTY, outputFilePath);
    }
    
    
    /**
     * Method to convert generally using FFMPE
     * Syntax: FFMPEG <option> your_input_file <convert_option> your_output_file
     * Example: 
     *          ffmpeg -i input.mp4 output.avi
     *          ffmpeg -i video.flv -vn -ar 44100 -ac 2 -ab 192 -f mp3 audio.mp3
     *
     * @param option
     * @param inputFilePath
     * @param convertOption
     * @param outputFilePath
     */
    public void convert(String option, String inputFilePath, String convertOption, String outputFilePath){
        String command = getFfmpegPath() + " " + option + " " + inputFilePath + " " + convertOption + " " + outputFilePath;        
        try {            
            Logger.log("FfmpegHandler.convertVideoBasic(): start converting with Convert Info: ");
            Logger.log("\tInput:  " + inputFilePath + "\n");
            Logger.log("\tOutput: " + outputFilePath + "\n");
            Logger.log("\tOption:  " + option + "\n");
            Logger.log("\tConvert Option:  " + convertOption + "\n");
            
            Process process = Runtime.getRuntime().exec(command);
        }
        catch( IOException e ) {
            e.printStackTrace();
        }
    }
    

}
