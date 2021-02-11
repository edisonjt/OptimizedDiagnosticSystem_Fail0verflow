/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimizeddiagnosticsystem;

import ec.edu.espe.optimizeddiagnosticsystem.controller.Login;
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

                        System.out.println("1.-Personnel registration");
                        System.out.println("2.-Clinical histories");
                        System.out.println("3.- Exit");
                        option = scannum.nextInt();

                        if (option == 1) {

                            while (option1 != 3) {
                                System.out.println("============= Register =============");
                                System.out.println("1. Register a new doctor");
                                System.out.println("2. Register a new nurse");
                                System.out.println("3.- Exit");
                                option1 = scannum.nextInt();
                                if (option1 == 1) {
                                    Doctor doctor = new Doctor();
                                    doctor.registrer();
                                }

                                if (option1 == 2) {
                                    Nurse nurse = new Nurse();
                                    nurse.register();
                                }
                            }

                        } else if (option == 2) {

                            System.out.println("============= Welcome Doctor =============");

                            do {

                                System.out.println("Please enter the username");
                                nameDoctor = scantext.nextLine();
                                System.out.println("Please enter the Password");
                                passwordDoctor = scantext.nextLine();

                                if (login.loginHistoryUpdater(nameDoctor, passwordDoctor)) {

                                    System.out.println("What do you want to do?");
                                    System.out.println("1.- Create a new Histry Clinic");
                                    option1 = scannum.nextInt();

                                    if (option1 == 1) {
                                        ClinicHistory clinicHistory = new ClinicHistory();
                                        clinicHistory.register(nameDoctor);
                                    }
                                } else {
                                    System.out.println("The password or user isn't correct, please try again! ");
                                }
                            } while (!login.loginHistoryUpdater(nameDoctor, passwordDoctor));

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
