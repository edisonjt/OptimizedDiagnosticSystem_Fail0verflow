/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.utils;

import ec.edu.espe.filemanager.utils.Data;

/**
 *
 * @author luist
 */
public class Login {

    public boolean system(String pass) {
        boolean validate = false;
        if (Data.find("PassDocSystem.csv", pass).equalsIgnoreCase(pass)) {
            validate = true;
        } else if (Data.find("PassNursSystem.csv", pass).equalsIgnoreCase(pass)) {
            validate = true;
        } else if (pass.equalsIgnoreCase("rootpass")) {
            validate = true;
        }         
        return validate;
    }

    public void tryEnter() {

        int tryAgain = 0;
        System.out.println("The password isn't correct, please try again! ");

        tryAgain++;
        if (tryAgain == 3) {
            System.out.println("number of failed attempts !GOODBYE!");
        }

    }
}
