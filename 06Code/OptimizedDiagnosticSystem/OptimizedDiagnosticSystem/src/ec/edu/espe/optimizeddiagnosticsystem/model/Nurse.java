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

    @Override
    public String toString() {
        return "Nurse{" + "name=" + getName() + ", age=" + getAge() + ", gender=" + getGender() + '}';
    }

   public void registerPatient (){
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter the name of the nurse");
        setName(scan.nextLine());
        System.out.println("Please enter the age");
        setAge(scan.nextInt());
        System.out.println("Please enter the gender ");
        setGender(scan.nextLine());
        
    }
    
     
    public void suppliesMedication (MedicalRecipe medicalrecipe)
    {
        
    }
    
    
    
    public void showData ()
    {
        
    }
    
    public void updateMedicalHistory (ClinicHistory clinicHistory)
    {
        
    }
   
    public void takeASample ()
    {
        
    }
    
    ClinicHistory transferPatients (ClinicHistory clinicHistory){
        
        return(clinicHistory);
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
    
    
}
