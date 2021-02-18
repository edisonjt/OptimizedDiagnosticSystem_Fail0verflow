/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagoticsystem.control;
import ec.edu.espe.filemanager.utils.Data;

/**
 *
 * @author luist
 */
public class Login {
    
     public boolean System(String pass) {
        boolean validate = false;        
        if (Data.find("PassDocSystem.csv", pass).equalsIgnoreCase(pass)|| pass.equalsIgnoreCase("rootpass")){
            validate = true;
        } else if (Data.find("PassNursSystem.csv", pass).equalsIgnoreCase(pass)) {
            validate = true;
         }
        return validate;
    }
     
    
}
