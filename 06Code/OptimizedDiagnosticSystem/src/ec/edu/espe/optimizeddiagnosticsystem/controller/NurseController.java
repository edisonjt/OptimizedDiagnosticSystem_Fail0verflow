/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.optimizeddiagnosticsystem.model.Nurse;
import ec.edu.espe.optimizeddiagnosticsystem.utils.MongoDBManager;
import java.util.Scanner;

/**
 *
 * @author Fail0verflow
 */
public class NurseController extends MedicalStaffController {
 
    MongoDBManager database = new MongoDBManager();

    public NurseController() {
    }
    
    public BasicDBObject register(Nurse nurse, String option) {
        BasicDBObject document = new BasicDBObject();
        BasicDBObject mainDocument = new BasicDBObject();

        document.put("Name", nurse.getName());
        document.put("Date Of Birth", nurse.getDateOfBirth());
        document.put("Gender", nurse.getGender());
        document.put("Title Code", nurse.getTitleCode());
        document.put("Home Address", nurse.getHomeAddress());
        document.put("Emergency Number", nurse.getEmergencyNumber());
        document.put("Work Shift", nurse.getWorkShift());

        if ("Clinic History".equals(option)) {
            mainDocument.put("Nurse", document);
            return mainDocument;
        }
        return document;
    }
    
     @Override
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
    
        @Override
    public void savePassword(String name, String password) {

        DBCollection collection;
        collection = database.getDataBase().getCollection("Users Password");
        BasicDBObject document = new BasicDBObject();

        document.put("Name", name);
        document.put("Password", password);
        collection.insert(document);
    }
    
    /**
     *
     * @param search
     * @return 
     */
    @Override
    public String[] read(String search) {
        DBCollection collection;
        database.openConnection();
        collection = database.getDataBase().getCollection("Nurse");
        
        String[] nurse = new String[2];

        BasicDBObject consultation = new BasicDBObject();
        consultation.put("Name", search);

        DBCursor cursor = collection.find(consultation);

        while (cursor.hasNext()) {
            nurse[0] = (String) cursor.next().get("Name");
            nurse[1] = (String) cursor.curr().get("Date Of Birth");
        }
        return nurse;
    }
    


   
}
