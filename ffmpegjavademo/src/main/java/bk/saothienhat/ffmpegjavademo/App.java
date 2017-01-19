package bk.saothienhat.ffmpegjavademo;

import bk.saothienhat.ffmpegjavademo.utils.Logger;


public class App 
{
    public static void main( String[] args )
    {
        Logger.log("==============================  FFMPEG with JAVA demo   ==============================");
        
        String inputFilePath = "D://PROJECTS/KOGA_VN/ATMViewer/05_DATA/testData/multi_audio/00D2023F_DV2.avi";
        String outputFilePath = "D://binh_new_new.mp4";
        
        FfmpegHandler ffmpegHandler = new FfmpegHandler();
        ffmpegHandler.convertVideoBasic(inputFilePath, outputFilePath);
        
    }
}
