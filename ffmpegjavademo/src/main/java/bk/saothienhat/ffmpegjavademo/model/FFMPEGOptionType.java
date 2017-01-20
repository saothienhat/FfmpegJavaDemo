/*
 * Copyright (c) 2017 Sao Thien Hat. All rights reserved.
 */
package bk.saothienhat.ffmpegjavademo.model;

/**
 * @author Sao Thien Hat
 *
 */
public enum FFMPEGOptionType {
    EMPTY( "", "" ), 
    I( "-i", "-identify option" ), 
    HIDE_BANNER( "-hide_banner",
            "-hide_banner is used to hide a copyright notice shown my ffmpeg, such as build options and library versions. This option can be used to suppress printing this information." ),
    ACODEC( "-acodec", "NA" ),
    LIBFAAC( "libfaac", "NA" ), 
    BA( "-b:a", "NA" ), 
    BV( "-b:v", "NA" ),
    VCODEC( "-vcodec", "NA" ), 
    MPEG4( "mpeg4", "NA" ), 
    FLAGS( "-flags", "NA" ),
    AIC( "aic", "NA" ), 
    MV4( "mv4", "NA" ),
    LOGLEVEL_ERROR("-loglevel error", "Log error")
    
    ;
    
    private String option;
    private String description;
    
    FFMPEGOptionType(String option, String description) {
        this.option = option;
        this.description = description;
    }

    /**
     * Method to get field option as type String
     * @return the option
     */
    public String getOption() {
        return option;
    }



    /**
     * Method to get field description as type String
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    
    
    
    
}
