package bk.saothienhat.ffmpegjavademo;

import bk.saothienhat.ffmpegjavademo.model.AppConfig;
import bk.saothienhat.ffmpegjavademo.model.AppConst;
import bk.saothienhat.ffmpegjavademo.model.FFMPEGOptionType;
import bk.saothienhat.ffmpegjavademo.model.FfmpegCommand;
import bk.saothienhat.ffmpegjavademo.utils.Logger;

public class App {
    public static void main(String[] args) {
        Logger.log("==============================  FFMPEG with JAVA demo   ==============================");
        Logger.log("===  FFMPEG website: " + AppConfig.FFMPEG_WEBSITE);
        Logger.log("===  FFMPEG vesion: " + AppConfig.FFMPEG_VERSION);
        Logger.log("======================================================================================\n");

        long startTime = System.currentTimeMillis();

        String inputFilePath = "D://your_file.avi";
        String convertedMp4OutputFile = "D://Converted_Media_File.mp4";
        String compressedAVIOutputFile = "D://Compressed_Avi_Media_File.avi";
        String finalMp4OutputFile = "D://Final_Mp4_File.mp4";
        String finalAviOutputFile = "D://Final_AVI_File.avi";

        /* Setup for FFMPEF */
        FfmpegHandler ffmpegHandler = new FfmpegHandler();
        String ffmpegPath = "D://your_ffmpeg.exe_file_path_on_PC.exe"; // Example of path on Window OS: D://ffmpeg.exe
        ffmpegHandler.setFfmpegPath(ffmpegPath);
        ffmpegHandler.setLogLevel(FfmpegCommand.LOGLEVEL_ERROR);

        /* Get video file info */
        // ffmpegHandler.getVideoFileInfo(inputFilePath, false);  

        /*
         * Convert AVI => MP4 and reduce MP4 output file
         *  Ref: https://andre.blue/blog/converting-avi-to-mp4-with-ffmpeg/
         */
        String audioBitrates = "128k";
        String videoBitrates = "120k";
        StringBuilder convertOptionBuilder = new StringBuilder();
        StringBuilder optionBuilder = new StringBuilder();
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
        // option: <<-loglevel error>> -i
        if( ffmpegHandler.getLogLevel() == FfmpegCommand.LOGLEVEL_ERROR ) {
            optionBuilder.append(FFMPEGOptionType.LOGLEVEL_ERROR.getOption());
            optionBuilder.append(AppConst.SPACE);
        }
        optionBuilder.append(FFMPEGOptionType.I.getOption());
        String option = optionBuilder.toString();
        String convertOptions = convertOptionBuilder.toString();
//        ffmpegHandler.convert(option, inputFilePath, convertOptions, finalMp4OutputFile);

        long stopTime = System.currentTimeMillis();
        long exeTime = stopTime - startTime;
        Logger.log("**** App.java: To finish all of them, it takes: " + (exeTime / 1000) + " (s) !!!");

    }

}
