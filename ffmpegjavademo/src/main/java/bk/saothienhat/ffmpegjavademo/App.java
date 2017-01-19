package bk.saothienhat.ffmpegjavademo;

import bk.saothienhat.ffmpegjavademo.model.AppConfig;
import bk.saothienhat.ffmpegjavademo.model.FileType;
import bk.saothienhat.ffmpegjavademo.utils.Logger;


public class App 
{
    public static void main( String[] args )
    {
        Logger.log("==============================  FFMPEG with JAVA demo   ==============================");
        long startTime = System.currentTimeMillis();
        
        String inputFilePath = "D://your_file.avi";
        String finalOutputFile = "D://Final_Output_File.mp4";
        
        FfmpegHandler ffmpegHandler = new FfmpegHandler();
        ffmpegHandler.setFfmpegPath(AppConfig.FFMPEG_4_WINDOW_PATH);       
        
        
//        ffmpegHandler.compressMediaFile(FileType.AVI, inputFilePath, outputFilePath);        
//        ffmpegHandler.getVideoFileInfo(inputFilePath, false);        
      
      long stopTime = System.currentTimeMillis();
      long exeTime = stopTime - startTime;
      Logger.log("**** App.java: To finish all of them, it takes: " + (exeTime / 1000) + " (s) !!!");

    }
    

}
