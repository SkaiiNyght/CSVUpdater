package model;

/**
 *
 * @author Zach Larson
 */
public class Result {
    private final String _TEST_NAME;
    private final Double _VALUE;
    private Integer _versionNumber;
    
    /**
     * Creates a new Result object
     * @param testName String representation of the test name for this result.
     * @param value Double representation of the value for this result.
     */
    public Result(String testName, Double value){
        this._TEST_NAME = testName;
        this._VALUE = value;
    }
    
    /**
     * Returns the testName of this test result
     * @return String
     */
    public String getTestName(){
        return this._TEST_NAME;
    }
    
    /**
     * Returns the value of this test result
     * @return Double
     */
    public Double getValue(){
        return this._VALUE;
    }
    
    /**
     * Returns the version number for this result, if it does not have one it will
     * return -1
     * @return Integer
     */
    public Integer getVersionNumber(){
        if(this._versionNumber == null){
            return -1;
        }else{
            return this._versionNumber;
        }
    }
    
    /**
     * Sets the version number for this result.
     * @param versionNumber Integer representation of the version number.
     */
    public void setVersionNumber(Integer versionNumber){
        this._versionNumber = versionNumber;
    }
}
