/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blooddata;

/**
 *
 * @author lab_services_student
 */
public class BloodData {

  // Fields to hold blood type and Rh factor
    private String bloodType;
    private String rhFactor;
    
    public BloodData(){
        this.bloodType = "O";
        this.rhFactor = "+";
    }
    
    //Parameterized constructor 
    public BloodData(String bloodType, String rhFactor){
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }
    //Getter for bloodType
    public String getBloodType(){
        return bloodType;
    }
    //Setter for bloodType
    public void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }
    //Getter for rhFactor
    public String getRhFactor(){
        return rhFactor;
    }
    //Setter for rhFactor 
    public void setRhFactor(String rhFactor){
        this.rhFactor = rhFactor;
    }
}
