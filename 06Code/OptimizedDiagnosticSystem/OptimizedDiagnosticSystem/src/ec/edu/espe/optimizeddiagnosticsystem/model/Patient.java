/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;
import java.util.*;
/**
 *
 * @author Fail0verflow
 */
public class Patient {
    
    public String name; 
    public int age;
    public float weight;
    public float height;
    public String bloodType;
    public String allergies;
    public String gender;
    public int emergencyContact;
    public String identificationCard;
    boolean option;

    public Patient(String name, int age, float weight, float height, String bloodType, String allergies, String gender, int emergencyContact, String identificationCard) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.bloodType = bloodType;
        this.allergies = allergies;
        this.gender = gender;
        this.emergencyContact = emergencyContact;
        this.identificationCard = identificationCard;
    }
    
    public Patient(){
        
    }

    public void register(){
        
        Scanner patient = new Scanner(System.in); 
        Scanner patientnum = new Scanner(System.in);
        
        System.out.println("=======================================");
        System.out.println("*****Patient's data*****");
        
        System.out.println("Identification Card: ");
        identificationCard = patient.nextLine();
        
        System.out.println("Gander: ");
        gender = patient.nextLine();
        
        System.out.println("Name: ");
        name = patient.nextLine();
        
        System.out.println("Age: ");
        age = patient.nextInt();
        
        System.out.println("Blood Type: ");
        bloodType = patientnum.nextLine();
        
        System.out.println("Weight: ");
        weight = patient.nextFloat();
        
        System.out.println("Height: ");
        height = patient.nextFloat();
        
        System.out.println("Allergies: ");
        allergies = patientnum.nextLine();
        
        System.out.println("Emergency Contac: ");
        emergencyContact = patient.nextInt();
        
        System.out.println("Do you want to save? Please put True or False");
        option = patient.nextBoolean();
    } 
        
    
    boolean  eat () {
        return true;
    }
    
    void takeMedication (MedicalRecipe medicalrecipe){
        
    }
    
    boolean  urination () {
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(int emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }
    
    
}
