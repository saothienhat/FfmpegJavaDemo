/*
 * Copyright (c) 2017 Sao Thien Hat. All rights reserved.
 */
package bk.saothienhat.ffmpegjavademo.model;

/**
 * @author Sao Thien Hat
 * Ref: https://en.wikibooks.org/wiki/FFMPEG_An_Intermediate_Guide/Flags_Flags
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
    MV4( "mv4", "use four motion vector by macroblock (mpeg4)" ),
    LOGLEVEL_ERROR("-loglevel error", "Log error"),
    OBMC("obmc", "use overlapped block motion compensation (h263+)"),
    QPEL("qpel", "use 1/4 pel motion compensation"),
    LOOP("loop", "use loop filter"),
    GMC("gmc", "use gmc"),
    PART("part", "use data partitioning"),
    GRAY("gray", "only decode/encode grayscale"),
    PSNR("psnr", "error[?] variables will be set during encoding"),
    NAQ("naq", "normalize adaptive quantization"),
    LOW_DELAY("low_delay", "force low delay"),
    ALT("alt", "enable alternate scantable (mpeg2/mpeg4)"),
    GLOBAL_HEADER("global_header", "place global headers in extradata instead of every keyframe"),
    BITEXACT("bitexact", "EDVAS use only bitexact stuff (except (i)dct)"),
    AIC("aic", "h263 advanced intra coding / mpeg4 ac prediction"),
    CBP("cbp", "use rate distortion optimization for cbp"),
    QPkRD("qprd", "use rate distortion optimization for qp selection"),
    AIV("aiv", "h263 alternative inter vlc"),
    ILME("ilme", 
            "Force InterLaced Motion Estimation, this is only necessary if you are working with interlaced video. It will force FFMPEG to maintain Quality with interlace footage. If you wish to deinterlace your footage please use '-deinterlace' option, but this will cause a quality lose in the video. Rule of thumb is anything intended is for television is interlace, any other delivery format is most likely progressive."),
    ILDCT("ildct", "Use when encoding Interlaced footage to ensure that FFMPEG doesn't field merge your DCT. Only affects Interlaced footage."),
    SCAN_OFFSET("scan_offset", "will reserve space for svcd scan offset user data"),
    CGOP("cgop", "closed gop"),    
    FLAG_ACTIVE("+", "active flag "),
    FLAG_INACTIVE("-", "inactive flag ")
    
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
