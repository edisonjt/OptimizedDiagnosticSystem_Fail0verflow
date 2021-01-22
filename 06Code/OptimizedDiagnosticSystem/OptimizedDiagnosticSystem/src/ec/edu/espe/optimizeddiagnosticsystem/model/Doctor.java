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
public class Doctor {
    private String name; 
    private int age;
    private String speciality;
    private String subSpeciality;
    private String titleCode;
    private String gender;
    private boolean option;

    public Doctor() {
    }

    @Override
    public String toString() {
        return "Doctor{" + "name=" + name + ", age=" + age + ", speciality=" + speciality + ", subSpeciality=" + subSpeciality + ", titleCode=" + titleCode + ", gender=" + gender + ", option=" + option + '}';
    }


    public Doctor(String name, int age, String speciality, String subSpeciality, String titleCode, String gender) {
        this.name = name;
        this.age = age;
        this.speciality = speciality;
        this.subSpeciality = subSpeciality;
        this.titleCode = titleCode;
        this.gender = gender;
    }

    public void  registrer() {
        Scanner scan = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("*****Doctor's data*****");

        System.out.println("Title code: ");
        setTitleCode(scan.nextLine());

        System.out.println("Gender: ");
        setGender(scan.nextLine());

        System.out.println("Name: ");
        setName(scan.nextLine());

        System.out.println("Age: ");
        setAge(Integer.parseInt(scan.nextLine()));
        
        System.out.println("Sub Speciality : ");
        setSubSpeciality(scan.nextLine());
      
        System.out.println("Speciality : ");
        setSpeciality(scan.nextLine());
        
        System.out.println("Do you want to save? Please put True or False");
        setOption(scan.nextBoolean());

    }
    
    String takeExams (ClinicHistory clinicHistory) {
        
        
        return("0"); 
    }
    
    void performDiagnostic (Diagnostic diagnostic)
    {
        
    }
    
    void showData ()
    {
        
    }
    
    void updateMedicalHistory (ClinicHistory clinicHistory)
    {
        
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
     * @return the speciality
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * @param speciality the speciality to set
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * @return the subSpeciality
     */
    public String getSubSpeciality() {
        return subSpeciality;
    }

    /**
     * @param subSpeciality the subSpeciality to set
     */
    public void setSubSpeciality(String subSpeciality) {
        this.subSpeciality = subSpeciality;
    }

    /**
     * @return the titleCode
     */
    public String getTitleCode() {
        return titleCode;
    }

    /**
     * @param titleCode the titleCode to set
     */
    public void setTitleCode(String titleCode) {
        this.titleCode = titleCode;
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
