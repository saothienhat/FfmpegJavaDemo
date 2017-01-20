/*
 * Copyright (c) 2017 Sao Thien Hat. All rights reserved.
 */
package bk.saothienhat.ffmpegjavademo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sao Thien Hat
 *
 */
public class FFMPEGRespond {
    public static final int EXE_UNKNOWN = -1;
    public static final int EXE_FAIL = 0;
    public static final int EXE_SUCCESS = 1;
    private List<String> errors;
    private int executionResult;
    private long exeTime; // (seconds)

    /**
     * Construct new instance of FFMPEGRespond
     * @param errors
     */
    public FFMPEGRespond(List<String> errors) {
        this.errors = errors;
    }
    
    
    public FFMPEGRespond(){
        this.errors = new ArrayList<String>();
        this.executionResult = EXE_UNKNOWN;
        this.exeTime = 0;
    }

    
    public void setExeTime(long value){
        this.exeTime = value;
    }
    
    public long getExeTime(){
        return this.exeTime;
    }

    /**
     * Method to get field errors as type List<String>
     * @return the errors
     */
    public List<String> getErrors() {
        return errors;
    }


    /**
     * Method to set value for field errors
     *
     * @param errors the errors to set
     */
    public void setErrors(List<String> errors) {
        this.errors = errors;
    }


    /**
     * Method to get field executionResult as type int
     * @return the executionResult
     */
    public int getExecutionResult() {
        return executionResult;
    }


    /**
     * Method to set value for field executionResult
     *
     * @param executionResult the executionResult to set
     */
    public void setExecutionResult(int executionResult) {
        this.executionResult = executionResult;
    }
    
    

}
