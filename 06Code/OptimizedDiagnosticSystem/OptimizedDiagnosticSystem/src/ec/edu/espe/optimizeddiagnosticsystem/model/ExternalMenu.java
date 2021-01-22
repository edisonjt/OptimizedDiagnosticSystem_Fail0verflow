/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import java.util.Scanner;


/**
 *
 * @author Fail0verflow
 */
public class ExternalMenu {

    public void menuList() {

        int option;

        do {
            System.out.println("===================================================");
            System.out.println("      Hi! Who will update the medical record?      ");
            System.out.println("1. Doctor");
            System.out.println("2. Nurse");
            System.out.println("3. Exit");
            System.out.println("===================================================");
            Scanner op = new Scanner(System.in);
            option = op.nextInt();

            if (option == 1) {

                Doctor regdoctor = new Doctor();
                regdoctor.registrer();
                
                Doctor doctor = new Doctor(regdoctor.getName(), regdoctor.getAge(), regdoctor.getSpeciality(), regdoctor.getSubSpeciality(), regdoctor.getTitleCode(), regdoctor.getGender()); 
                Gson gson = new Gson();
                String jsonDoctor;
                
                //serialization
                jsonDoctor = gson.toJson(doctor);
                System.out.println("Patiente register --> " + jsonDoctor);
                Data.save("Doctors.json", jsonDoctor, regdoctor.isOption());

                Menu menu = new Menu();
             //   menu.menuList();
                
            } else if (option == 2) {
                Nurse regnurse = new Nurse();
                //regnurse.registerPatient();
                
                Nurse nurse = new Nurse(regnurse.getName(), regnurse.getAge(), regnurse.getGender()); 
                Gson gson = new Gson();
                String jsonNurse;
                
                //serialization
                jsonNurse = gson.toJson(nurse);
                System.out.println("Patiente register --> " + jsonNurse);
                Data.save("Nurses.json", jsonNurse, regnurse.isOption());

                Menu menu = new Menu();
                //menu.menuList();
            }

        } while (option != 3);

    }
}
