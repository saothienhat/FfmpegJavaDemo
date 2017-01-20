/*
 * Copyright (c) 2017 Sao Thien Hat. All rights reserved.
 */
package bk.saothienhat.ffmpegjavademo.model;

/**
 * @author Sao Thien Hat
 *
 */
public class MediaFile {
    private String name;
    private String path;
    private int audiobitrate; // (kbps)
    private int videobitrate; // (kbps)
    
    /**
     * Construct new instance of MediaFile
     * @param name
     * @param path
     * @param audiobitrate
     * @param videobitrate
     */
    public MediaFile(String name, String path, int audiobitrate, int videobitrate) {
        this.name = name;
        this.path = path;
        this.audiobitrate = audiobitrate;
        this.videobitrate = videobitrate;
    }

    /**
     * Method to get field name as type String
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Method to set value for field name
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to get field path as type String
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * Method to set value for field path
     *
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Method to get field audiobitrate as type int
     * @return the audiobitrate
     */
    public int getAudiobitrate() {
        return audiobitrate;
    }

    /**
     * Method to set value for field audiobitrate
     *
     * @param audiobitrate the audiobitrate to set
     */
    public void setAudiobitrate(int audiobitrate) {
        this.audiobitrate = audiobitrate;
    }

    /**
     * Method to get field videobitrate as type int
     * @return the videobitrate
     */
    public int getVideobitrate() {
        return videobitrate;
    }

    /**
     * Method to set value for field videobitrate
     *
     * @param videobitrate the videobitrate to set
     */
    public void setVideobitrate(int videobitrate) {
        this.videobitrate = videobitrate;
    }
    
    

}
