/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Map;

/**
 *
 * @author Ag User
 */
public class Sample {
    private final Integer _CONTAINER_ID;
    private final String _LAB_NUMBER;
    private final String _SAMPLE_TYPE_ID;
    private final Map<String, Result> _RESULTS; 
    
    public Sample(Integer containerID, String labNumber, String sampleTypeID, Map<String, Result> results){
        this._CONTAINER_ID = containerID;
        this._LAB_NUMBER = labNumber;
        this._SAMPLE_TYPE_ID = sampleTypeID;
        this._RESULTS = results;
    }
    
    public Integer getContainerID(){
        return this._CONTAINER_ID;
    }
    public String getLabNumber(){
        return this._LAB_NUMBER;
    }
    public String getSampleTypeID(){
        return this._SAMPLE_TYPE_ID;
    }
    public Map<String, Result> getResults(){
        return this._RESULTS;
    }
    
}
