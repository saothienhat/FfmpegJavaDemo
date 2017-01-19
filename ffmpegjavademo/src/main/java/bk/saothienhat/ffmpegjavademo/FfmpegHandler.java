/*
 * Copyright (c) 2017 Sao Thien Hat. All rights reserved.
 */
package bk.saothienhat.ffmpegjavademo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

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
    public void convert(String option, String inputFilePath, String convertOption, String outputFilePath) {
        String command = getFfmpegPath() + " " + option + " " + inputFilePath + " " + convertOption + " " + outputFilePath;
        Logger.log("FfmpegHandler.convertVideoBasic(): start converting with Convert Info: ");
        Logger.log("\tInput:  " + inputFilePath);
        Logger.log("\tOutput: " + outputFilePath);
        Logger.log("\tOption:  " + option);
        Logger.log("\tConvert Option:  " + convertOption);

        execute(command);
    }
    
    /**
     * Method to execuse a certain FFMPEG command
     *
     * @param command
     */
    private void execute(String command){                
        try {            
            Logger.log("FfmpegHandler.execuse(): @@==============  Begin execute FFMPEG command: " + command);
            
            // Run FFMPEG command
            Process process = Runtime.getRuntime().exec(command);            
            
            /*
             * Get execution process info
             */
            InputStream stderr = process.getErrorStream();
            InputStreamReader isr = new InputStreamReader(stderr);
            BufferedReader br = new BufferedReader(isr);
            String line = "";
            while ( (line = br.readLine()) != null){                
                Logger.log("FfmpegHandler.execuse(): Running............................");
            }
                         
            
            int exitVal = process.waitFor();
            Logger.log("FfmpegHandler.execuse(): Execute FFMPEG command Finished !!!!! Process exitValue: " + exitVal);
            Logger.log("FfmpegHandler.execuse(): @@==============  Execute FFMPEG command DONE ======================@@");
        }
        catch( IOException e ) {
            e.printStackTrace();
            Logger.error(e.getMessage());
        }
        catch( InterruptedException e ) {
            e.printStackTrace();
            Logger.error(e.getMessage());
        }
    }

    
    /**
     * Method to get Video file information
     *
     * @param inputFilePath
     * @param isHideBanner: The -hide_banner option is used to hide a copyright notice shown my FFMPEG, 
     *      such as build options and library versions. This option can be used to suppress printing this information.
     */
    public void getVideoFileInfo(String inputFilePath, boolean isHideBanner) {
        Logger.log("FfmpegHandler.getVideoFileInfo(): get file info of Video file: " + inputFilePath);
        String hideBannerStr = (isHideBanner) ? (" " + AppConst.FFMPEG_OPTION_HIDE_BANNER) : "";
        String command = getFfmpegPath() + " " + AppConst.FFMPEG_OPTION_I + " " + inputFilePath + hideBannerStr;
        execute(command);
    }
    

}
