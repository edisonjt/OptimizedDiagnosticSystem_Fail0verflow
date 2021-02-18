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
public class Nurse extends MedicalStaff {

    private String workShift;

    //CONSTRUCTORS
    public Nurse(String workShift, String titleCode, String surname, String name, int age, String homeAddress, int emergencyNumber, boolean option) {
        super(titleCode, surname, name, age, homeAddress, emergencyNumber, option);
        this.workShift = workShift;
    }

    public Nurse() {

    }

    //METHODS
    @Override
    public void register() {
        System.out.println("=======================================");
        System.out.println("*****Nurse's data*****");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.println("Surname: ");
        setSurname(scan.nextLine());
        System.out.println("Name: ");
        setName(scan.nextLine());
        System.out.println("Age: ");
        setAge(Integer.parseInt(scan.nextLine()));
        System.out.println("Home Address: ");
        setHomeAddress(scan.nextLine());
        System.out.println("Work Shift");
        setWorkShift(scan.nextLine());
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
        Data.save("PassNurse.csv", userToSave + "\n", true);
        }
    }

      //SETT AND GETT
    public void setWorkShift(String workShift) {
        this.workShift = workShift;
    }

}
