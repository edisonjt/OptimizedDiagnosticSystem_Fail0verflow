/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

/**
 *
 * @author Jhonatan
 */
public class Patient {
    String name; 
    int age;
    float weight;
    float height;
    String bloodType;
    String allergies;
    String gender;
    int emergencyContact;
    String identificationCard;
    
    boolean  eat () {
     
        return true;
    }
    
    void takeMedication (MedicalRecipe medicalrecipe){
        
    }
    
    boolean  urination () {
     
        return true;
    }
}
