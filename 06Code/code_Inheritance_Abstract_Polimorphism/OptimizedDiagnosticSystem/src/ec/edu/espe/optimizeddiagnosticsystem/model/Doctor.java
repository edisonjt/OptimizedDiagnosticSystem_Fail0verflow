/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

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
    public Doctor(String speciality, String subSpeciality, String titleCode, String password, String surname, String name, int age, String homeAddress, String gender, String dateOfBirth, int emergencyNumber, boolean option) {
        super(titleCode, password, surname, name, age, homeAddress, gender, dateOfBirth, emergencyNumber, option);
        this.speciality = speciality;
        this.subSpeciality = subSpeciality;
    }

    public Doctor(String speciality, String subSpeciality, String titleCode, String name, String gender, String dateOfBirth) {
        super(name, gender, dateOfBirth);
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
        System.out.println("Name: ");
        setName(scan.nextLine());
        System.out.println("Surname: ");
        setSurname(scan.nextLine());
        System.out.println("Gender ");
        setGender(scan.nextLine());
        System.out.println("Date of birth");
        setDateOfBirth(scan.nextLine());
        try {
            System.out.println("Age: ");
            setAge(Integer.parseInt(scan.nextLine()));
            System.out.println("Emergency Number: ");
            setEmergencyNumber(Integer.parseInt(scan.nextLine()));
        } catch (NumberFormatException ex) {
            System.out.println("very large number");
        }

        System.out.println("Home Address: ");
        setHomeAddress(scan.nextLine());
        System.out.println("Sub Speciality : ");
        setSubSpeciality(scan.nextLine());
        System.out.println("Speciality : ");
        setSpeciality(scan.nextLine());
        System.out.println("Title code: ");
        setTitleCode(scan.nextLine());
        System.out.println("Do you want to save? Please put True or False");
        setOption(scan.nextBoolean());

    }

    @Override
    public void createPass(boolean option, String name) {
        if (option == true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the new password");
            String pass = scan.nextLine();
            String userToSave = pass + "," + name ;
            Data.save("LoginDoctor.csv", userToSave +"\n", true);
            String doctorToSave = pass;
            Data.save("PassDocSystem.csv", doctorToSave + "\n", true);
        }

    }

    @Override
    public void createPass(boolean option) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //SETT AND GETT
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setSubSpeciality(String subSpeciality) {
        this.subSpeciality = subSpeciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getSubSpeciality() {
        return subSpeciality;
    }

}
