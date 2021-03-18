/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

/**
 *
 * @author FailOverflow
 */
public class Patient extends HospitalPeople {

    private String weight;
    private String height;
    private String bloodType;
    private String allergies;
    private String identificationCard;

    //CONSTRUCTORS
    public Patient(String weight, String height, String bloodType, String allergies, String identificationCard, String name, String homeAddress, String gender, String dateOfBirth, String emergencyNumber, boolean option) {
        super(name, homeAddress, gender, dateOfBirth, emergencyNumber, option);
        this.weight = weight;
        this.height = height;
        this.bloodType = bloodType;
        this.allergies = allergies;
        this.identificationCard = identificationCard;
    }

    public Patient() {  }

    //SETTER and GETTER
    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    public String getWeight() {
        return weight;
    }

    public String getHeight() {
        return height;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getAllergies() {
        return allergies;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

}
