/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagoticsystem.view;

import ec.edu.espe.filemanager.utils.Data2;
import ec.edu.espe.optimizeddiagoticsystem.control.Login;
import ec.edu.espe.optimizeddiagoticsystem.model.Doctor;
import ec.edu.espe.optimizeddiagoticsystem.model.Nurse;
import java.util.Scanner;

/**
 *
 * @author luist
 */
public class SimulatorDiagnosticSystem {

    public static void MenuSystem() {

        System.out.println("============= FailOverflow =============");
        System.out.println("**** Welcome to the hospital system ****");
        System.out.println("");
        System.out.println("1.-Personnel registration");
        System.out.println("2.-Clinical histories");
        System.out.println("3.- Exit");

    }

    public static void MenuRegister() {
        System.out.println("============= Register =============");
        System.out.println("1. Register a new doctor");
        System.out.println("2. Register a new nurse");
        System.out.println("3.- Exit");
    }

    public static void main(String[] args) {

        Scanner scannum = new Scanner(System.in);
        Scanner scantext = new Scanner(System.in);

        Login login = new Login();
        int tryagain = 0;
        int opSystem, opRegister;

        do {
            System.out.println("Enter System Password: ");
            String password = scantext.nextLine();

            if (login.System(password)) {

                do {
                    MenuSystem();
                    opSystem = scannum.nextInt();
                    if (opSystem == 1) {

                        do {
                            MenuRegister();
                            opRegister = scannum.nextInt();
                            if (opRegister == 1) {
                                Doctor doctor = new Doctor();
                                doctor.register();
                                Data2.save("Doctors.json", doctor, doctor.isOption());
                                doctor.createPass(doctor.isOption());

                            }
                            if (opRegister == 2) {
                                Nurse nurse = new Nurse();
                                nurse.register();
                                Data2.save("Nurse.json", nurse, nurse.isOption());
                                nurse.createPass(nurse.isOption());

                            }

                        } while (opRegister != 3);
                    }
                    if (opSystem == 3) {
                        System.out.println("GOODBYE");
                    }

                } while (opSystem != 3);
            } else {
                System.out.println("The password isn't correct, please try again! ");
                tryagain++;
                if (tryagain == 3) {
                    System.out.println("number of failed attempts !GOODBYE!");
                }
            }

        } while (tryagain < 3);

    }

}
