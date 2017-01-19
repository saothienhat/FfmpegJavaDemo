package bk.saothienhat.ffmpegjavademo;

import bk.saothienhat.ffmpegjavademo.model.AppConfig;
import bk.saothienhat.ffmpegjavademo.model.AppConst;
import bk.saothienhat.ffmpegjavademo.model.FFMPEGOptionType;
import bk.saothienhat.ffmpegjavademo.model.FileType;
import bk.saothienhat.ffmpegjavademo.utils.Logger;


public class App 
{
    public static void main( String[] args )
    {
        Logger.log("==============================  FFMPEG with JAVA demo   ==============================");
        long startTime = System.currentTimeMillis();
        
        String inputFilePath = "D://your_file.avi";
        String convertedMp4OutputFile = "D://Converted_Media_File.mp4";
        String compressedAVIOutputFile = "D://Compressed_Avi_Media_File.avi";
        String finalMp4OutputFile = "D://Final_Mp4_File.mp4";
        String finalAviOutputFile = "D://Final_AVI_File.avi";
        
        
        FfmpegHandler ffmpegHandler = new FfmpegHandler();
        ffmpegHandler.setFfmpegPath(AppConfig.FFMPEG_4_WINDOW_PATH);       

        /* Get video file info */
        // ffmpegHandler.getVideoFileInfo(inputFilePath, false);  
        
        
        /*
         * Convert AVI => MP4 and reduce MP4 output file
         *  Ref: https://andre.blue/blog/converting-avi-to-mp4-with-ffmpeg/
         */
        String audioBitrates = "128k";
        String videoBitrates = "120k";
        StringBuilder convertOptionBuilder = new StringBuilder(); 
        // convertOptions: -acodec libfaac -b:a 128k -vcodec mpeg4 -b:v 120k -flags +aic+mv4
        convertOptionBuilder.append(FFMPEGOptionType.ACODEC.getOption());
        convertOptionBuilder.append(AppConst.SPACE);
        convertOptionBuilder.append(FFMPEGOptionType.LIBFAAC.getOption());
        convertOptionBuilder.append(AppConst.SPACE);
        convertOptionBuilder.append(FFMPEGOptionType.BA.getOption());
        convertOptionBuilder.append(AppConst.SPACE);
        convertOptionBuilder.append(audioBitrates);
        convertOptionBuilder.append(AppConst.SPACE);
        convertOptionBuilder.append(FFMPEGOptionType.VCODEC.getOption());
        convertOptionBuilder.append(AppConst.SPACE);
        convertOptionBuilder.append(FFMPEGOptionType.MPEG4.getOption());
        convertOptionBuilder.append(AppConst.SPACE);
        convertOptionBuilder.append(FFMPEGOptionType.BV.getOption());
        convertOptionBuilder.append(AppConst.SPACE);
        convertOptionBuilder.append(videoBitrates);
        convertOptionBuilder.append(AppConst.SPACE);
        convertOptionBuilder.append(FFMPEGOptionType.FLAGS.getOption());
        convertOptionBuilder.append(AppConst.SPACE);
        convertOptionBuilder.append("+" + FFMPEGOptionType.AIC.getOption() + "+" + FFMPEGOptionType.MV4.getOption()); // +aic+mv4  
        String convertOptions = convertOptionBuilder.toString();
//        ffmpegHandler.convert(FFMPEGOptionType.I.getOption(), inputFilePath, convertOptions, finalMp4OutputFile);
      
        long stopTime = System.currentTimeMillis();
        long exeTime = stopTime - startTime;
        Logger.log("**** App.java: To finish all of them, it takes: " + (exeTime / 1000) + " (s) !!!");

    }
    

}
