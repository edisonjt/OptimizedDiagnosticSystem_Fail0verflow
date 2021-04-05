/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.controller;

import com.mongodb.*;
import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.optimizeddiagnosticsystem.model.Doctor;
import ec.edu.espe.optimizeddiagnosticsystem.utils.*;
import java.util.Scanner;

/**
 *
 * @author Fail0verflow
 */
public class DoctorController{
    
    NoSqlDBManager dataBase = new MongoDBManager();

    public DoctorController() {
    }
       
 
    public BasicDBObject register(Doctor doctor, String option) {
        BasicDBObject document = new BasicDBObject();
        BasicDBObject mainDocument = new BasicDBObject();

        document.put("Name", doctor.getName());
        document.put("Date Of Birth", doctor.getDateOfBirth());
        document.put("Gender", doctor.getGender());
        document.put("Speciality", doctor.getSpeciality());
        document.put("SubSpeciality", doctor.getSubSpeciality());
        document.put("Title Code", doctor.getTitleCode());
        document.put("Home Address", doctor.getHomeAddress());
        document.put("Emergency Number", doctor.getEmergencyNumber());

        if ("Clinic History".equals(option)) {
            mainDocument.put("Doctor", document);
            return mainDocument;
        }
        return document;
    }
    
    
    public void createPass(boolean option, String name) {    
          if (option == true) {
            Scanner scan = new Scanner(System.in);
            DoctorController doctor = new DoctorController();

            System.out.println("Enter the new password");
            String pass = scan.nextLine();

            String userToSave = name + ", " + pass + "\n";
            Data.save("Users.csv", userToSave, true);
            doctor.savePassword(name, pass);

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
        collection = dataBase.getDataBase().getCollection("Doctor");
        
        
        String[] doctor = new String[8];

        BasicDBObject consultation = new BasicDBObject();
        consultation.put("Name", search);

        DBCursor cursor = collection.find(consultation);

        while (cursor.hasNext()) {
            doctor[0] = (String) cursor.next().get("Name");
            doctor[1] = (String) cursor.curr().get("Date Of Birth");
            doctor[2] = (String) cursor.curr().get("Gender");
            doctor[3] = (String) cursor.curr().get("Speciality");
            doctor[4] = (String) cursor.curr().get("SubSpeciality");
            doctor[5] = (String) cursor.curr().get("Title Code");
            doctor[6] = (String) cursor.curr().get("Home Address");
            doctor[7] = (String) cursor.curr().get("Emergency Number");
        }
        return doctor;
    }
   
}
