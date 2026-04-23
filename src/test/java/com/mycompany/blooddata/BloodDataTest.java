/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blooddata;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class BloodDataTest {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        //Declare two BloodData objects
        //Object 1: Uses default constructors (O and +) 
        BloodData defaultBlood = new BloodData();
        
        //Object 2: Promt user for values 
        System.out.print("Enter blood type (O,A,B or AB): ");
        String userBloodType = input.nextLine();
        
        System.out.print("Enter Rh factor (+ or -)");
        String userRHFactor = input.nextLine();
        
        BloodData userBlood = new BloodData(userBloodType, userRhFactor);
        
        System.out.println("\n---Initial Details---");
        System.out.println("Default Blood Data");
        displayBloodData(defaultBlood);
        
        System.out.println("\nUser Blood Data:");
        displayBloodData(userBlood);
        
        defaultBlood.setBloodType(userBloodype);
        defaultBlood.setRhFactor(userRhFactor);
        
        System.out.println("\n---After Modifying Default Object---");
        System.out.println("Blood Type:" + blood.getBloodType());
        System.out.println("Rh Fcator:" + blood.getRhFactor());
     
    }
    
}
