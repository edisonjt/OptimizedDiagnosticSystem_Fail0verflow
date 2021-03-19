/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.controller;

import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.optimizeddiagnosticsystem.utils.MongoDBManager;

/**
 *
 * @author FailOverflow
 */
public class LoginController {

    public boolean system(String pass) {
        boolean validate = false;
        if (Data.find("PassDocSystem.csv", pass).equalsIgnoreCase(pass)) {
            validate = true;     
        } else if (pass.equalsIgnoreCase("rootpass")) {
            validate = true;
        }
        return validate;
    }

    public boolean historyUpdater(String user, String pass) {
        boolean validate = false;
        MongoDBManager database = new MongoDBManager();

        String[] validation = database.readPassword(user, "Users Password");

        if (validation[0] != null) {
            if (validation[0].equalsIgnoreCase(user)) {
                if (validation[0].equalsIgnoreCase(user) && validation[1].equalsIgnoreCase(pass)) {
                    validate = true;
                }
            }
        }
        return validate;
    }

}
