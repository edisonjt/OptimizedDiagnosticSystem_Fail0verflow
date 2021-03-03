/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagoticsystem.view;

import ec.edu.espe.optimizeddiagnosticsystem.utils.Login;
import ec.edu.espe.optimizeddiagnosticsystem.model.Doctor;
import ec.edu.espe.optimizeddiagnosticsystem.model.MedicalStaff;
import ec.edu.espe.optimizeddiagnosticsystem.model.Nurse;
import com.mongodb.BasicDBObject;
import ec.edu.espe.optimizeddiagnosticsystem.utils.Database;
import ec.edu.espe.optimizeddiagnosticsystem.model.ClinicHistory;
import java.util.*;

/**
 *
 * @author FailOverflow
 */
public class SimulatorDiagnosticSystem {

    public static void main(String[] args) {

        try {
            Scanner scannum = new Scanner(System.in);
            Scanner scantext = new Scanner(System.in);

            Login login = new Login();
            String password;
            String nameDoctor;
            String passwordDoctor;
            int opSystem = 0, opRegister = 0, tryagain = 0;

            do {
                System.out.println("Enter System Password: ");
                password = scantext.nextLine();

                if (login.system(password)) {

                    while (opSystem != 3) {
                        menuSystem();
                        opSystem = scannum.nextInt();
                        switch (opSystem) {
                            case 1:
                                optionStaff();
                                opRegister = scannum.nextInt();

                                if (opRegister == 1) {

                                    while (opRegister != 3) {
                                        Database database = new Database();
                                        BasicDBObject register = new BasicDBObject();
                                        menuRegister();
                                        opRegister = scannum.nextInt();
                                        if (opRegister == 1) {

                                            MedicalStaff pass = new Doctor();
                                            Doctor doctor = new Doctor();
                                            doctor.register();
                                            
                                            register = database.dBDoctor(doctor, "Register");
                                            database.saveDatabase("Register", register, "Doctor");
                                            
                                            pass.createPass(doctor.isOption(), doctor.getName());

                                        }
                                        if (opRegister == 2) {

                                            MedicalStaff pass = new Nurse();
                                            Nurse nurse = new Nurse();
                                            nurse.register();
                                            
                                            register = database.dBNurse(nurse, "Register");
                                            database.saveDatabase("Register", register, "Nurse");
                                            
                                            pass.createPass(nurse.isOption(), nurse.getName());

                                        }
                                    }
                                } else if (opRegister == 2) {
                                    Database database = new Database();

                                    while (opRegister != 3) {
                                        optionRegister();

                                        opRegister = scannum.nextInt();

                                        if (opRegister == 1) {
                                            System.out.println("In what field do you want to search? ");
                                            String field = scantext.next();
                                            System.out.println("Enter the field value ");
                                            String fieldValue = scantext.next();

                                            database.readDoctor(fieldValue, field, "Doctor");

                                            System.out.println("Are you sure you want to delete? (true or false)");
                                            boolean decision = scantext.nextBoolean();

                                            database.deleteObject(fieldValue, field, "Doctor", decision);
                                        }

                                        if (opRegister == 2) {
                                            System.out.println("In what field do you want to search? ");
                                            String field = scantext.next();
                                            System.out.println("Enter the field value ");
                                            String fieldValue = scantext.next();

                                            database.readDoctor(fieldValue, field, "Nurse");

                                            System.out.println("Are you sure you want to delete? (true o false)");
                                            boolean decision = scantext.nextBoolean();

                                            database.deleteObject(fieldValue, field, "Nurse", decision);
                                        }
                                    }

                                }
                                break;
                            case 2:
                                System.out.println("============= Welcome Doctor =============");

                                do {

                                    System.out.println("Please enter the username");
                                    nameDoctor = scantext.nextLine();
                                    System.out.println("Please enter the Password");
                                    passwordDoctor = scantext.nextLine();

                                    if (login.loginHistoryUpdater(nameDoctor, passwordDoctor)) {

                                        Database database = new Database();
                                        Scanner scann = new Scanner(System.in);
                                        optionClinicHistory();

                                        opRegister = scannum.nextInt();

                                        if (opRegister == 1) {
                                            ClinicHistory clinicHistory = new ClinicHistory();
                                            clinicHistory.register(nameDoctor);
                                        } else if (opRegister == 2) {

                                            System.out.println("Enter the ID of the clinic history: ");
                                            String idClinicHistory = scann.next();
                                            database.readClinicHistory(idClinicHistory, "id", "ClinicHistory");
                                        } else if (opRegister == 3) {

                                            boolean decision = false;
                                            do {
                                                System.out.println("Enter the ID of the clinic history: ");
                                                String idClinicHistory = scann.next();
                                                database.readClinicHistory(idClinicHistory, "id", "ClinicHistory");

                                                System.out.println("Do you want to update that Clinic History? (true or false)");
                                                decision = scann.nextBoolean();

                                                System.out.println("Enter the field you want to update? ");
                                                String field = scann.next();

                                                database.updateClinicHistory(field, idClinicHistory);
                                            } while (!decision);

                                        } else if (opRegister == 4) {

                                            boolean decision = false;
                                            do {
                                                System.out.println("Enter the ID of the clinic history: ");
                                                String idClinicHistory = scann.next();
                                                database.readClinicHistory(idClinicHistory, "id", "ClinicHistory");

                                                System.out.println("Do you want to delete that Clinic History? (true or false)");
                                                decision = scann.nextBoolean();

                                                database.deleteObject(idClinicHistory, "id", "ClinicHistory", decision);
                                            } while (!decision);
                                        }
                                    } else {
                                        System.out.println("The password or user isn't correct, please try again! ");
                                    }
                                } while (!login.loginHistoryUpdater(nameDoctor, passwordDoctor));

                                break;

                            default:
                                tryagain = 3;
                                System.out.println("Thanks come back soon");
                                break;
                        }

                    }
                } else {
                    System.out.println("The password isn't correct, please try again! ");
                    tryagain++;
                    if (tryagain == 3) {
                        System.out.println("number of failed attempts !GOODBYE!");
                    }
                }
            } while (tryagain != 3) ;
        } catch (InputMismatchException | NumberFormatException ex) {
            System.out.println("The option no exist! The System will close");
        }

    }

    public static void menuSystem() {

        System.out.println("============= FailOverflow =============");
        System.out.println("**** Welcome to the hospital system ****");
        System.out.println("");
        System.out.println("1.- Medical staff");
        System.out.println("2.- Clinical histories");
        System.out.println("3.- Exit");

    }

    public static void menuRegister() {
        System.out.println("============= Register =============");
        System.out.println("");
        System.out.println("1. Register a new doctor");
        System.out.println("2. Register a new nurse");
        System.out.println("3.- Exit");
    }

    public static void optionStaff() {
        System.out.println("===========actions for Medical Staff==========");
        System.out.println("");
        System.out.println("1.- Add new staff");
        System.out.println("2.- Remove staff");

    }

    public static void optionClinicHistory() {
        System.out.println("What do you want to do?");
        System.out.println("1.- Create a new Clinic History");
        System.out.println("2.- Read Clinic History");
        System.out.println("3.- Update Clinic History");
        System.out.println("4.- Delete Clinic History");

    }

    public static void optionRegister() {
        System.out.println("============= Register =============");
        System.out.println("1. Remove doctor");
        System.out.println("2. Remove nurse");
        System.out.println("3.- Exit");

    }
}
