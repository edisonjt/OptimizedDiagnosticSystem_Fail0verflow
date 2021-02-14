/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagoticsystem.control;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.optimizeddiagoticsystem.model.Doctor;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luist
 */
public class BaseData {

    DB basedata;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();

    public void Connection() {

        try {
            Mongo mongo = new Mongo("LocalHost", 27017);
            basedata = mongo.getDB("MedicalStaff");
            collection = basedata.getCollection("Doctors");
            System.out.println("successful connection");

        } catch (UnknownHostException ex) {
            Logger.getLogger(BaseData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void FileDoctor(String doctorsjson, Doctor doctor, boolean Option) {
        // SAVE GSON
        Gson gson = new Gson();
        String jsonRecord;
        jsonRecord = gson.toJson(doctor);
        Data.save(doctorsjson, jsonRecord + "\n", doctor.isOption());
        // SAVE DATABASE
        if (doctor.isOption() == true) {
            document.put("Age", "´" + doctor.getAge() + "´");
            document.put("Gender", "´" + doctor.getGender() + "´");
            document.put("Name", "´" + doctor.getName() + "´");
            document.put("Speciality", "´" + doctor.getSpeciality() + "´");
            document.put("SubSpeciality", "´" + doctor.getSubSpeciality() + "´");
            document.put("Title Code", "´" + doctor.getTitleCode() + "´");
            collection.insert(document);
        } else {
            System.out.println("unsaved data");
        }
        // COLLECTION PASSWORD
        Scanner scan = new Scanner(System.in);
        if (doctor.isOption() == true) {
            // SAVE CSV
            System.out.println("Enter the new password");
            String pass = scan.nextLine();
            String userToSave = doctor.getName() + "," + pass;
            Data.save("PassDoctor.csv", userToSave, true);
            // SAVE DATABASE
            collection = basedata.getCollection("PassDoctor");
            BasicDBObject document1 = new BasicDBObject();
            document1.put("Name", "´" + doctor.getName() + "´");
            document1.put("Password", pass);
            collection.insert(document1);

        }
    }

    public boolean CollectionDoctor(Doctor doctor) {

        return true;
    }

    public void view() {
        DBCursor cursor = collection.find();
        while (cursor.hasNext()) {
            System.out.println(cursor.next());

        }

    }

}
