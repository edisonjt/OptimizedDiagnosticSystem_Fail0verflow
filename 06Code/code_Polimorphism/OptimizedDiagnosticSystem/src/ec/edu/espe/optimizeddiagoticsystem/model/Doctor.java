/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagoticsystem.model;

import ec.edu.espe.filemanager.utils.Data;
import java.util.Scanner;

/**
 *
 * @author luist
 */
public class Doctor extends MedicalStaff {

    private String speciality;
    private String subSpeciality;

    //CONSTRUCTORS
    public Doctor(String speciality, String subSpeciality, String titleCode, String surname, String name, int age, String homeAddress, int emergencyNumber, boolean option) {
        super(titleCode, surname, name, age, homeAddress, emergencyNumber, option);
        this.speciality = speciality;
        this.subSpeciality = subSpeciality;
    }

    public Doctor() {

    }

    // METHODS
    /**
     *
     */
    @Override
    public void register() {
        Scanner scan = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("*****Doctor's data*****");
        System.out.println("");
        System.out.println("Surname: ");
        setSurname(scan.nextLine());
        System.out.println("Name: ");
        setName(scan.nextLine());
        System.out.println("Age: ");
        setAge(Integer.parseInt(scan.nextLine()));
         System.out.println("Sub Speciality : ");
        setSubSpeciality(scan.nextLine());
        System.out.println("Speciality : ");
        setSpeciality(scan.nextLine());
        System.out.println("Home Address: ");
        setHomeAddress(scan.nextLine());
        System.out.println("Emergency Number: ");
        setEmergencyNumber(Integer.parseInt(scan.nextLine()));
         System.out.println("Title code: ");
        setTitleCode(scan.nextLine());
        System.out.println("Do you want to save? Please put True or False");
        setOption(scan.nextBoolean());

    }
    @Override
     public void createPass(boolean option) {
        if(option==true){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the new password");
        String pass = scan.nextLine();
        String userToSave = getName() + "," + pass;
        Data.save("PassDoctor.csv", userToSave + "\n", true);
        }
    }
     
 //SETT AND GETT
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setSubSpeciality(String subSpeciality) {
        this.subSpeciality = subSpeciality;
    }
    
    
    

}
