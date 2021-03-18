/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import ec.edu.espe.optimizeddiagnosticsystem.model.Doctor;
import ec.edu.espe.optimizeddiagnosticsystem.utils.Database;

/**
 *
 * @author Jhonatan
 */
public class DoctorController {
    
    Database database = new Database();

    public DoctorController() {
    }
    
    public BasicDBObject save(Doctor doctor, String option) {
        BasicDBObject document = new BasicDBObject();

        document.put("Name", doctor.getName());
        document.put("Date Of Birth", doctor.getDateOfBirth());
        document.put("Gender", doctor.getGender());
        document.put("Speciality", doctor.getSpeciality());
        document.put("SubSpeciality", doctor.getSubSpeciality());
        document.put("Title Code", doctor.getTitleCode());
        document.put("Home Address", doctor.getHomeAddress());
        document.put("Emergency Number", doctor.getEmergencyNumber());

        if ("Clinic History".equals(option)) {
            database.getMainDocument().put("Doctor", document);
        }
        return document;
    }
    
    public void savePassword(String name, String password) {

        DBCollection collection;
        collection = database.getDataBase().getCollection("Users Password");
        BasicDBObject document = new BasicDBObject();

        document.put("Name", name);
        document.put("Password", password);
        collection.insert(document);
    }
    
    public void read(String search) {
        DBCollection collection;
        collection = database.getDataBase().getCollection("Doctor");

        BasicDBObject consultation = new BasicDBObject();
        consultation.put("Name", search);

        DBCursor cursor = collection.find(consultation);

        while (cursor.hasNext()) {
            System.out.println("Name: " + cursor.next().get("Name"));
            System.out.println("Title Code: " + cursor.curr().get("Title Code"));
        }
    }
    
    
}
