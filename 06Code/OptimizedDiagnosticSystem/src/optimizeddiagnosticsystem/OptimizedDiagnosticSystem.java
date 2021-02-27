/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimizeddiagnosticsystem;

import com.mongodb.BasicDBObject;
import ec.edu.espe.optimizeddiagnosticsystem.utils.Database;
import ec.edu.espe.optimizeddiagnosticsystem.utils.Login;
import ec.edu.espe.optimizeddiagnosticsystem.model.ClinicHistory;
import ec.edu.espe.optimizeddiagnosticsystem.model.Doctor;
import ec.edu.espe.optimizeddiagnosticsystem.model.Nurse;
import java.util.*;

/**
 *
 * @author Fail0verflow
 */
public class OptimizedDiagnosticSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Scanner scannum = new Scanner(System.in);
            Scanner scantext = new Scanner(System.in);

            String nameDoctor;
            String password;
            String passwordDoctor;
            int option = 0, option1 = 0;

            Login login = new Login();

            System.out.println("Enter password: ");
            do {
                password = scantext.nextLine();

                if (login.login(password)) {

                    while (option != 3) {

                        System.out.println("============= FailOverflow =============");

                        System.out.println("1.- Medical staff");
                        System.out.println("2.- Clinical histories");
                        System.out.println("3.- Exit");
                        option = scannum.nextInt();

                        switch (option) {
                            case 1:

                                System.out.println("1.- Add new staff");
                                System.out.println("2.- Remove staff");
                                option1 = scannum.nextInt();

                                if (option1 == 1) {
                                    while (option1 != 3) {
                                        Database database = new Database();
                                        BasicDBObject register = new BasicDBObject();
                                        
                                        System.out.println("============= Register =============");
                                        System.out.println("1. Register a new doctor");
                                        System.out.println("2. Register a new nurse");
                                        System.out.println("3.- Exit");
                                        option1 = scannum.nextInt();

                                        if (option1 == 1) {
                                            Doctor doctor = new Doctor();
                                            doctor.register();
                                            
                                            register = database.dBDoctor(doctor, "Register");
                                            database.saveDatabase("Register", register, "Doctor");
                                            
                                        }

                                        if (option1 == 2) {
                                            Nurse nurse = new Nurse();
                                            nurse.register();
                                            
                                            register = database.dBNurse(nurse, "Register");
                                            database.saveDatabase("Register", register, "Nurse");
                                            
                                        }
                                    }
                                } else if (option1 == 2) {

                                    Database database = new Database();

                                    while (option1 != 3) {
                                        System.out.println("============= Register =============");
                                        System.out.println("1. Remove doctor");
                                        System.out.println("2. Remove nurse");
                                        System.out.println("3.- Exit");
                                        option1 = scannum.nextInt();

                                        if (option1 == 1) {
                                            System.out.println("In what field do you want to search? ");
                                            String field = scantext.next();
                                            System.out.println("Enter the field value ");
                                            String fieldValue = scantext.next();

                                            database.readDoctor(fieldValue, field, "Doctor");

                                            System.out.println("Are you sure you want to delete? (true or false)");
                                            boolean decision = scantext.nextBoolean();

                                            database.deleteObject(fieldValue, field, "Doctor", decision);
                                        }

                                        if (option1 == 2) {
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

                                        System.out.println("What do you want to do?");
                                        System.out.println("1.- Create a new Clinic History");
                                        System.out.println("2.- Read Clinic History");
                                        System.out.println("3.- Update Clinic History");
                                        System.out.println("4.- Delete Clinic History");
                                        option1 = scannum.nextInt();

                                        if (option1 == 1) {
                                            ClinicHistory clinicHistory = new ClinicHistory();
                                            clinicHistory.register(nameDoctor);
                                        } else if (option1 == 2) {

                                            System.out.println("Enter the ID of the clinic history: ");
                                            String idClinicHistory = scann.next();
                                            database.readClinicHistory(idClinicHistory, "id", "ClinicHistory");
                                        } else if (option1 == 3) {

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

                                        } else if (option1 == 4) {

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
                                break;
                        }
                    }
                } else {
                    System.out.println("The password isn't correct, please try again! ");
                }
            } while (!login.login(password));
        } catch (InputMismatchException | NumberFormatException ex) {
            System.out.println("The option no exist! The System will close");
        }

    }
}
