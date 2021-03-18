/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import ec.edu.espe.optimizeddiagnosticsystem.model.Nurse;
import ec.edu.espe.optimizeddiagnosticsystem.utils.Database;

/**
 *
 * @author Jhonatan
 */
public class NurseController {
 
    Database database = new Database();

    public NurseController() {
    }
    
    public BasicDBObject save(Nurse nurse, String option) {
        BasicDBObject document = new BasicDBObject();

        document.put("Name", nurse.getName());
        document.put("Date Of Birth", nurse.getDateOfBirth());
        document.put("Gender", nurse.getGender());
        document.put("Title Code", nurse.getTitleCode());
        document.put("Home Address", nurse.getHomeAddress());
        document.put("Emergency Number", nurse.getEmergencyNumber());
        document.put("Work Shift", nurse.getWorkShift());

        if ("Clinic History".equals(option)) {
            database.getMainDocument().put("Nurse", document);
            
        }
        return document;
    }
    
    public void read(String search) {
        DBCollection collection;
        collection = database.getDataBase().getCollection("Nurse");

        BasicDBObject consultation = new BasicDBObject();
        consultation.put("Name", search);

        DBCursor cursor = collection.find(consultation);

        while (cursor.hasNext()) {
            System.out.println("Name: " + cursor.next().get("Name"));
            System.out.println("Date Of Birth: " + cursor.curr().get("Date Of Birth"));
        }
    }
    
    public void savePassword(String name, String password) {

        DBCollection collection;
        collection = database.getDataBase().getCollection("Users Password");
        BasicDBObject document = new BasicDBObject();

        document.put("Name", name);
        document.put("Password", password);
        collection.insert(document);
    }
}
