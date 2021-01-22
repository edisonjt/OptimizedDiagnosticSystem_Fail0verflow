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
    
    private String name; 
    private int age;
    private float weight;
    private float height;
    private String bloodType;
    private String allergies;
    private String gender;
    private int emergencyContact;
    private String identificationCard;
    private boolean option;

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

    @Override
    public String toString() {
        return "Patient{" + "name=" + getName() + ", age=" + getAge() + ", weight=" + getWeight() + ", height=" + getHeight() + ", bloodType=" + getBloodType() + ", allergies=" + getAllergies() + ", gender=" + getGender() + ", emergencyContact=" + getEmergencyContact() + ", identificationCard=" + getIdentificationCard() + ", option=" + isOption() + '}';
    }
    
    public Patient(){
        
    }

    public void register(){
        
        Scanner patient = new Scanner(System.in); 
        Scanner patientnum = new Scanner(System.in);
        
        System.out.println("=======================================");
        System.out.println("*****Patient's data*****");
        
        System.out.println("Identification Card: ");
        setIdentificationCard(patient.nextLine());
        
        System.out.println("Gander: ");
        setGender(patient.nextLine());
        
        System.out.println("Name: ");
        setName(patient.nextLine());
        
        System.out.println("Age: ");
        setAge(patient.nextInt());
        
        System.out.println("Blood Type: ");
        setBloodType(patientnum.nextLine());
        
        System.out.println("Weight: ");
        setWeight(patient.nextFloat());
        
        System.out.println("Height: ");
        setHeight(patient.nextFloat());
        
        System.out.println("Allergies: ");
        setAllergies(patientnum.nextLine());
        
        System.out.println("Emergency Contac: ");
        setEmergencyContact(patient.nextInt());
        
        System.out.println("Do you want to save? Please put True or False");
        setOption(patient.nextBoolean());
    } 
        
    
    boolean  eat () {
        return true;
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

    /**
     * @return the option
     */
    public boolean isOption() {
        return option;
    }

    /**
     * @param option the option to set
     */
    public void setOption(boolean option) {
        this.option = option;
    }
    
    
}
