/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimizeddiagnosticsystem;

import ec.edu.espe.optimizeddiagnosticsystem.model.Menu;
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
            Scanner scan = new Scanner(System.in);
            Scanner scanp = new Scanner(System.in);
            Scanner scanpd = new Scanner(System.in);

            String username;
            String password;
            int option = 0, option1;

            Menu menu = new Menu();

            System.out.println("Enter password: ");
            password = scanp.next();

            if (menu.login(password) == true) {

                while (option != 3) {

                    System.out.println("=========== Welcome ===========");

                    menu.options1();
                    option = scan.nextInt();

                    if (option == 1) {

                        menu.optionsRegister();
                        option1 = scan.nextInt();
                        if (option1 == 1) {
                            menu.registerD();
                        }

                        if (option1 == 2) {
                            menu.registerN();
                        }
                    } else if (option == 2) {

                        System.out.println("Please enter the username");
                        username = scanpd.nextLine();
                        System.out.println("Please enter the Password");
                        String pass = scanpd.next();
                        menu.loginHistoryUpdater(username, pass);
                        System.out.println("What do you want to do?");
                        System.out.println("1.- Create a new Histry Clinic");
                        option1 = scan.nextInt();
                        if (option1 == 1) {
                            menu.clinicHistoryRegister(username);
                        }

                    }
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("The option no exist! The System will close");
        } catch (NumberFormatException e) {
            System.out.println("The option no exist! The System will close");
        }

    }
}
