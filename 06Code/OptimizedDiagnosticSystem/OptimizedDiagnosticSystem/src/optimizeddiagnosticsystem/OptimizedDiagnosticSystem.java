/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimizeddiagnosticsystem;

import ec.edu.espe.optimizeddiagnosticsystem.model.ExternalMenu;
import ec.edu.espe.optimizeddiagnosticsystem.model.Menu;
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
        Scanner scan = new Scanner(System.in);
        int option;
        Menu menu = new Menu();
        if (menu.login("c2") == true) {
            System.out.println("Hola");
            menu.loginHistoryUpdater("edison", "171");
            menu.options1();
            option = Integer.parseInt(scan.next());
            switch (option) {
                case 1:
                    menu.optionsRegister();
                    if (Integer.parseInt(scan.next()) == 1)
                     {
                         menu.registerD();
                    }
                    if (Integer.parseInt(scan.next()) == 2)
                    {
                        menu.registerN();
                    }
                    
                    break;
            }

        }
    }
}
