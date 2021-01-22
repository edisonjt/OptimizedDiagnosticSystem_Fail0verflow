/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import java.util.Scanner;

/**
 *
 * @author Fail0verflow
 */
public class Menu {

    private int option;
    private String name;
    private int option2;

    public Menu() {

    }

    /*public void menuList() {

        do {
            System.out.println("===================================================");
            System.out.println("       Hi! Choose the option you want to do...     ");
            System.out.println("1. New patient (recommended)");
            System.out.println("2. Old patient ");
            System.out.println("3. Exit ");
            System.out.println("===================================================");
            Scanner op = new Scanner(System.in);
            option = op.nextInt();

            if (option == 1) {
                Patient regpatient = new Patient();
                regpatient.register();

                Patient patient = new Patient(regpatient.getName(), regpatient.getAge(), regpatient.getWeight(), regpatient.getHeight(), regpatient.getBloodType(), regpatient.getAllergies(), regpatient.getGender(), regpatient.getEmergencyContact(), regpatient.getIdentificationCard());
                Gson gson = new Gson();
                String jsonPatient;

                //serialization
                jsonPatient = gson.toJson(patient);
                System.out.println("Patiente register --> " + jsonPatient);
                Data.save("Patients.json", jsonPatient, regpatient.isOption());

            } else if (option == 2) {
                while (option2 != 3) {

                    System.out.println("===================================================");
                    System.out.println("1. Perform diagnosis ");
                    System.out.println("2. Make a prescription ");
                    System.out.println("3. Exit");
                    option2 = op.nextInt();

                    if (option2 == 1) {
                        Doctor doctor = new Doctor();
                        doctor.registrer();

                        Diagnostic diagnostic = new Diagnostic();

                        Scanner keyboard = new Scanner(System.in);
                        System.out.print("Write the word to search in the file:");
                        String data = keyboard.nextLine();
                        System.out.println("\n --- > The name to Find is " + data + "\n ");
                        String nameP = Data.find("cie-10.csv", data);
                        System.out.println("|-------------------------------|");
                        System.out.println("|" + nameP + "|");
                        System.out.println("|-------------------------------|");
                        diagnostic.resgister();

                    } else if (option2 == 2) {
                        MedicalRecipe medicalrecipe = new MedicalRecipe();
                    }
                }
            }
        } while (option != 3);

    }*/
    public void options1() {
        System.out.println("1.-Personnel registration");
        System.out.println("2.-Clinical histories");
        System.out.println("3.- Exit");

    }

    public void optionsRegister() {
        System.out.println("1. Register a new doctor");
        System.out.println("2. Register a new nurse");
    }

    public Patient registerP() {
        Patient patient = new Patient();
        patient.register();

        return patient;
    }

    public Doctor registerD() {
        Scanner scan = new Scanner(System.in);
        Doctor doctor = new Doctor();
        doctor.registrer();
        String dataToSave=doctor.getName()+","+doctor.getTitleCode()+","+doctor.getSpeciality()
                +","+doctor.getSubSpeciality()+","+doctor.getAge()+","+doctor.getGender()+"\n";
        Data.save("doctors.csv", dataToSave, true);
        System.out.println("Enter the new password");
        String pass = scan.nextLine();
        String userToSave = doctor.getName() + "," + pass;
        Data.save("users.csv", userToSave, true);
        return doctor;
    }

    public Nurse registerN() {
        Nurse nurse = new Nurse();
        nurse.register();
        String dataToSave = nurse.getName()+","+nurse.getAge()+","+nurse.getGender()+"\n";
        Data.save("nurse.csv", dataToSave, true);
        return nurse;

    }

    public Diagnostic diagnostic() {
        Diagnostic diagnostic = new Diagnostic();
        return diagnostic;
    }

    public Boolean login(String pass) {
        Boolean validate = false;
        if (Data.find("pass.csv", pass).equalsIgnoreCase(pass)) {
            validate = true;
        } else {
            validate = false;
        }

        return validate;
    }

    public Boolean loginHistoryUpdater(String user, String pass) {
        Boolean validate = false;
        String cadena = Data.find("users.csv", user);
        String[] split = cadena.split(",");
        String p1 = split[0];
        String p2 = split[1];
        if (p1.equalsIgnoreCase(user)) {
            System.out.println("The user exist");
            if (p1.equalsIgnoreCase(user) && p2.equalsIgnoreCase(pass)) {
                validate = true;
                System.out.println("The password is correct!");
            }

        } else {
            validate = false;
            System.out.println("The password isn't correct, please try again! ");
        }

        return validate;
    }

}