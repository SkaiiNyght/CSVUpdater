package model;

import java.util.Map;

/**
 *
 * @author Zach Larson
 */
public class Sample {
    private final Integer _CONTAINER_ID;
    private final String _LAB_NUMBER;
    private final String _SAMPLE_TYPE_ID;
    private final Map<String, Result> _RESULTS; 
    
    /**
     * Generates a new Sample object
     * @param containerID Integer representation of the containerID
     * @param labNumber String representation of the labNumber
     * @param sampleTypeID String representation of the Sample Type
     * @param results HashMap representation with Key as the testName and Value as the actual Result object
     */
    public Sample(Integer containerID, String labNumber, String sampleTypeID, Map<String, Result> results){
        this._CONTAINER_ID = containerID;
        this._LAB_NUMBER = labNumber;
        this._SAMPLE_TYPE_ID = sampleTypeID;
        this._RESULTS = results;
    }
    
    /**
     * Returns he container ID for the sample
     * @return Integer
     */
    public Integer getContainerID(){
        return this._CONTAINER_ID;
    }
    
    /**
     * Returns the lab number for the sample
     * @return String
     */
    public String getLabNumber(){
        return this._LAB_NUMBER;
    }
    
    /**
     * Returns the sample type for the sample
     * @return String
     */
    public String getSampleTypeID(){
        return this._SAMPLE_TYPE_ID;
    }
    
    /**
     * Returns a map with the Key as the test name and the Value as the Result
     * @return HashMap
     */
    public Map<String, Result> getResults(){
        return this._RESULTS;
    }
    
}
