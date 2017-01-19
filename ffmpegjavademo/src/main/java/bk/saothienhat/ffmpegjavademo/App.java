package bk.saothienhat.ffmpegjavademo;

import bk.saothienhat.ffmpegjavademo.utils.Logger;


public class App 
{
    public static void main( String[] args )
    {
        Logger.log("==============================  FFMPEG with JAVA demo   ==============================");
        
        String inputFilePath = "D://your_avi_file.avi";
        String outputFilePath = "D://Converted_Media_File.mp4";
        
        FfmpegHandler ffmpegHandler = new FfmpegHandler();
        
        ffmpegHandler.convertVideoBasic(inputFilePath, outputFilePath);
        
//        ffmpegHandler.getVideoFileInfo(inputFilePath, true);        

    }
    

}
