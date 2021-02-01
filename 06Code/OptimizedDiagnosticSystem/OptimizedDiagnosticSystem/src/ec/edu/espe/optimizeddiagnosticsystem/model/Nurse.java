/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

import java.util.Scanner;

/**
 *
 * @author Fail0verflow
 */
public class Nurse {

    private String name;
    private int age;
    private String gender;
    private boolean option;

    @Override
    public String toString() {
        return "Nurse{" + "name=" + name + ", age=" + age + ", gender=" + gender + ", option=" + option + '}';
    }

    public Nurse(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public Nurse(){
        
    }

    public void register() {
        Scanner scan = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("*****Nurse's data*****");
        
        System.out.println("Name");
        setName(scan.nextLine());

        System.out.println("Gender ");
        setGender(scan.nextLine());

        System.out.println("Age");
        setAge(scan.nextInt());

        System.out.println("Do you want to save? Please put True or False");
        setOption(scan.nextBoolean());

    }


    public void showData() {

    }

    public void updateMedicalHistory(ClinicHistory clinicHistory) {

    }

    public void takeASample() {

    }

    ClinicHistory transferPatients(ClinicHistory clinicHistory) {

        return (clinicHistory);
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
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
