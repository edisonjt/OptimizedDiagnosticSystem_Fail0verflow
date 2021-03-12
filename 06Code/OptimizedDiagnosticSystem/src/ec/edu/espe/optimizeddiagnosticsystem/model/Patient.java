/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

import java.util.Scanner;

/**
 *
 * @author FailOverflow
 */
public class Patient extends HospitalPeople {

    private int weight;
    private int height;
    private String bloodType;
    private String allergies;
    private String identificationCard;

    //CONSTRUCTORS
    public Patient(int weight, int height, String bloodType, String allergies, String identificationCard, String name, String homeAddress, String gender, String dateOfBirth, String emergencyNumber, boolean option) {
        super(name, homeAddress, gender, dateOfBirth, emergencyNumber, option);
        this.weight = weight;
        this.height = height;
        this.bloodType = bloodType;
        this.allergies = allergies;
        this.identificationCard = identificationCard;
    }

    public Patient() {

    }

    // METHODS
    @Override
    public void register() {
        Scanner patient = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("                       *****Patient's data*****                               ");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.println("Name: ");
        setName(scan.nextLine());
        System.out.println("Gender ");
        setGender(scan.nextLine());
        System.out.println("Date of birth");
        setDateOfBirth(scan.nextLine());
        System.out.println("Emergency Number: ");
        setEmergencyNumber(scan.nextLine());
        System.out.println("Home Address: ");
        setHomeAddress(scan.nextLine());
        System.out.println("Identification Card: ");
        setIdentificationCard(patient.nextLine());
        System.out.println("Blood Type: ");
        setBloodType(patient.nextLine());
        System.out.println("Weight(in kilos): ");
        setWeight(patient.nextInt());
        System.out.println("Height(in centimetres): ");
        setHeight(patient.nextInt());
        System.out.println("Allergies: ");
        setAllergies(patient.next());
        System.out.println("Do you want to save? Please put True or False");
        setOption(patient.nextBoolean());

    }

    //SETTER and GETTER
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
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

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
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
