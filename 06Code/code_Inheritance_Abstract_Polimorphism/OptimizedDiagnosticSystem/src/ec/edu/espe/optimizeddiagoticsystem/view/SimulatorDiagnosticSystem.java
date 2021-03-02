/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagoticsystem.view;

import ec.edu.espe.filemanager.utils.Data2;
import ec.edu.espe.optimizeddiagnosticsystem.utils.Login;
import ec.edu.espe.optimizeddiagnosticsystem.model.Doctor;
import ec.edu.espe.optimizeddiagnosticsystem.model.HospitalPeople;
import ec.edu.espe.optimizeddiagnosticsystem.model.MedicalStaff;
import ec.edu.espe.optimizeddiagnosticsystem.model.Nurse;
import java.util.Scanner;

/**
 *
 * @author luist
 */
public class SimulatorDiagnosticSystem {

    public static void menuSystem() {

        System.out.println("============= FailOverflow =============");
        System.out.println("**** Welcome to the hospital system ****");
        System.out.println("");
        System.out.println("1.-Personnel registration");
        System.out.println("2.-Clinical histories");
        System.out.println("3.- Exit");

    }

    public static void menuRegister() {
        System.out.println("============= Register =============");
        System.out.println("1. Register a new doctor");
        System.out.println("2. Register a new nurse");
        System.out.println("3.- Exit");
    }

    public static void main(String[] args) {

        Scanner scannum = new Scanner(System.in);
        Scanner scantext = new Scanner(System.in);

        Login login = new Login();
        String password;
        int opSystem, opRegister, tryagain = 0;

        do {
            System.out.println("Enter System Password: ");
            password = scantext.nextLine();

            if (login.system(password)) {

                do {
                    menuSystem();
                    opSystem = scannum.nextInt();
                    if (opSystem == 1) {

                        do {
                            menuRegister();
                            opRegister = scannum.nextInt();
                            if (opRegister == 1) {

                                MedicalStaff pass = new Doctor();
                                HospitalPeople doctor = new Doctor();
                                doctor.register();
                                Data2.save("registerDoctor.json", doctor, doctor.isOption());
                                pass.createPass(doctor.isOption(), doctor.getName());

                            }
                            if (opRegister == 2) {

                                MedicalStaff pass = new Nurse();
                                HospitalPeople nurse = new Nurse();
                                nurse.register();
                                Data2.save("registerNurse.json", nurse, nurse.isOption());
                                pass.createPass(nurse.isOption());

                            }
                            if (opRegister == 3) {
                                System.out.println("");
                                break;

                            }
                            if (opRegister > 3) {
                                System.out.println("The option no exist!");

                            }

                        } while (opRegister != 3);
                    }
                    if (opSystem == 3) {
                        System.out.println("GOODBYE");
                        break;
                    }
                    if (opSystem > 3) {
                        System.out.println("The option no exist! The System will close");
                        return;

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
