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
public class Patient extends HospitalPeople {
    
    private float weight;
    private float height;
    private String bloodType;
    private String allergies;
    private int emergencyContact;
    private String identificationCard;
    private boolean option;

    public Patient(float weight, float height, String bloodType, String allergies, 
            int emergencyContact, String identificationCard, String name, 
            String gender, String dateOfBirth) {   
        super(name, gender, dateOfBirth);
        this.weight = weight;
        this.height = height;
        this.bloodType = bloodType;
        this.allergies = allergies;
        this.emergencyContact = emergencyContact;
        this.identificationCard = identificationCard;
    }

    public Patient() {
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + getName() 
                + ", age=" + getDateOfBirth() + ", weight=" + getWeight() 
                + ", height=" + getHeight() + ", bloodType=" + getBloodType() 
                + ", allergies=" + getAllergies() + ", gender=" + getGender() 
                + ", emergencyContact=" + getEmergencyContact() 
                + ", identificationCard=" + getIdentificationCard() + '}';
    }

    @Override
    public void register(){
        Scanner patient = new Scanner(System.in); 
        
        System.out.println("\n=======================================");
        System.out.println("*****Patient's data*****");
        
        super.register();
        
        System.out.println("Identification Card: ");
        setIdentificationCard(patient.nextLine());
        
        System.out.println("Allergies: ");
        setAllergies(patient.nextLine());
        
        System.out.println("Blood Type: ");
        setBloodType(patient.nextLine());
        
        System.out.println("Weight: ");
        setWeight(patient.nextFloat());
        
        System.out.println("Height: ");
        setHeight(patient.nextFloat());
        
        System.out.println("Emergency Contac: ");
        setEmergencyContact(patient.nextInt());
        
        System.out.println("Do you want to save? Please put True or False");
        setOption(patient.nextBoolean());
    }
    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the bloodType
     */
    public String getBloodType() {
        return bloodType;
    }

    /**
     * @param bloodType the bloodType to set
     */
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    /**
     * @return the allergies
     */
    public String getAllergies() {
        return allergies;
    }

    /**
     * @param allergies the allergies to set
     */
    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    /**
     * @return the emergencyContact
     */
    public int getEmergencyContact() {
        return emergencyContact;
    }

    /**
     * @param emergencyContact the emergencyContact to set
     */
    public void setEmergencyContact(int emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    /**
     * @return the identificationCard
     */
    public String getIdentificationCard() {
        return identificationCard;
    }

    /**
     * @param identificationCard the identificationCard to set
     */
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
