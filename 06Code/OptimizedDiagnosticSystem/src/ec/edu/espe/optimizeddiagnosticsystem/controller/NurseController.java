/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.controller;

import com.mongodb.*;
import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.optimizeddiagnosticsystem.model.Nurse;
import ec.edu.espe.optimizeddiagnosticsystem.utils.*;
import java.util.Scanner;

/**
 *
 * @author Fail0verflow
 */
public class NurseController {
 
    NoSqlDBManager dataBase = new MongoDBManager();

    public NurseController() {
    }
    
    public BasicDBObject register(Nurse nurse) {
        BasicDBObject document = new BasicDBObject();
        BasicDBObject mainDocument = new BasicDBObject();

        document.put("Name", nurse.getName());
        document.put("Date Of Birth", nurse.getDateOfBirth());
        document.put("Gender", nurse.getGender());
        document.put("Title Code", nurse.getTitleCode());
        document.put("Home Address", nurse.getHomeAddress());
        document.put("Emergency Number", nurse.getEmergencyNumber());
        document.put("Work Shift", nurse.getWorkShift());

        /*if ("Clinic History".equals(option)) {
            mainDocument.put("Nurse", document);
            return mainDocument;
        }*/
        return document;
    }
    
 
    public void createPass(boolean option, String name) {
             if (option == true) {
            Scanner scan = new Scanner(System.in);
            NurseController nurse = new NurseController();

            System.out.println("Enter the new password");
            String pass = scan.nextLine();

            String nurseToSave = name + ", " + pass + "\n";
            Data.save("Users.csv", nurseToSave + "\n", true);
            nurse.savePassword(name, pass);
        }
    }
    
    public void savePassword(String name, String password) {

        DBCollection collection;
        collection = dataBase.getDataBase().getCollection("Users Password");
        BasicDBObject document = new BasicDBObject();

        document.put("Name", name);
        document.put("Password", password);
        collection.insert(document);
    }
    

    public String[] read(String search) {
        DBCollection collection;
        dataBase.openConnection();
        collection = dataBase.getDataBase().getCollection("Nurse");
        
        
        String[] nurse = new String[7];

        BasicDBObject consultation = new BasicDBObject();
        consultation.put("Name", search);

        DBCursor cursor = collection.find(consultation);

        while (cursor.hasNext()) {
            nurse[0] = (String) cursor.next().get("Name");
            nurse[1] = (String) cursor.curr().get("Date Of Birth");
            nurse[2] = (String) cursor.curr().get("Gender");
            nurse[3] = (String) cursor.curr().get("Title Code");
            nurse[4] = (String) cursor.curr().get("Home Address");
            nurse[5] = (String) cursor.curr().get("Emergency Number");
            nurse[6] = (String) cursor.curr().get("Work Shift");
        }
        return nurse;
    }
    


   
}
