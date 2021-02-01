/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimizeddiagnosticsystem;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

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

            String username;
            String password;
            int option = 0, option1 = 0;

            Menu menu = new Menu();
            do {
                System.out.println("Enter password: ");
                password = scantext.nextLine();

                if (menu.login(password)) {

                    while (option != 3) {

                        System.out.println("============= FailOverflow =============");

                        menu.options1();
                        option = scannum.nextInt();

                        if (option == 1) {

                            while (option1 != 3) {
                                System.out.println("============= Register =============");
                                menu.optionsRegister();
                                option1 = scannum.nextInt();
                                if (option1 == 1) {
                                    menu.registerDoctor();
                                }

                                if (option1 == 2) {
                                    menu.registerNurse();
                                }
                            }

                        } else if (option == 2) {

                            System.out.println("============= Welcome Doctor =============");

                            do {

                                System.out.println("Please enter the username");
                                username = scantext.nextLine();
                                System.out.println("Please enter the Password");
                                password = scantext.nextLine();

                                if (menu.loginHistoryUpdater(username, password)) {

                                    System.out.println("What do you want to do?");
                                    System.out.println("1.- Create a new Histry Clinic");
                                    option1 = scannum.nextInt();

                                    if (option1 == 1) {
                                        menu.clinicHistoryRegister(username);
                                    }
                                } else {
                                    System.out.println("The password or user isn't correct, please try again! ");
                                }
                            } while (!menu.loginHistoryUpdater(username, password));

                        }
                    }
                } else {
                    System.out.println("The password isn't correct, please try again! ");
                }
            } while (!menu.login(password));
        } catch (InputMismatchException ex) {
            System.out.println("The option no exist! The System will close");
        } catch (NumberFormatException e) {
            System.out.println("The option no exist! The System will close");
        }

    }
}
