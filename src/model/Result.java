/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ag User
 */
public class Result {
    private final String _TEST_NAME;
    private final Double _VALUE;
    
    public Result(String testName, Double value){
        this._TEST_NAME = testName;
        this._VALUE = value;
    }
    public String getTestName(){
        return this._TEST_NAME;
    }
    public Double getValue(){
        return this._VALUE;
    }
}
