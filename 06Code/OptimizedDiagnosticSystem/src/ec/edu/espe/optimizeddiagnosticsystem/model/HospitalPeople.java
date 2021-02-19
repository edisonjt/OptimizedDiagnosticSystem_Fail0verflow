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
public class HospitalPeople {
    private String name;
    private String gender;
    private String dateOfBirth;
    
    public HospitalPeople(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }
    
    public HospitalPeople(){
        
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + '}';
    }
    
    public void register(){
        Scanner scan = new Scanner(System.in);

        System.out.println("=======================================\n");
        
        System.out.println("Name");
        setName(scan.nextLine());

        System.out.println("Gender ");
        setGender(scan.nextLine());

        System.out.println("Date of birth");
        setDateOfBirth(scan.nextLine());

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
