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
import ec.edu.espe.optimizeddiagnosticsystem.model.Doctor;
import ec.edu.espe.optimizeddiagnosticsystem.utils.MongoDBManager;
import java.util.Scanner;

/**
 *
 * @author Fail0verflow
 */
public class DoctorController extends MedicalStaffController{
    
    MongoDBManager database = new MongoDBManager();

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
    
      @Override
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

    
    @Override
    public void savePassword(String name, String password) {

        DBCollection collection;
        collection = database.getDataBase().getCollection("Users Password");
        BasicDBObject document = new BasicDBObject();

        document.put("Name", name);
        document.put("Password", password);
        collection.insert(document);
    }
    
    @Override
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
