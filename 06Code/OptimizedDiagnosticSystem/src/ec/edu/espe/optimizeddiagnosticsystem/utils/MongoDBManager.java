/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.optimizeddiagnosticsystem.model.Diagnostic;
import ec.edu.espe.optimizeddiagnosticsystem.model.Doctor;
import ec.edu.espe.optimizeddiagnosticsystem.model.Nurse;
import ec.edu.espe.optimizeddiagnosticsystem.model.Patient;
import javax.swing.text.Document;


/**
 *
 * @author FailOverflow
 */
public class MongoDBManager {

    DB dataBase;
    DBCollection collection;
    BasicDBObject mainDocument = new BasicDBObject();
    

    public MongoDBManager() {  }
    
     public void openConnection(){
        try {
            MongoClientURI uri = new MongoClientURI(
                    "mongodb+srv://tentacle:atlas1234@cluster0.pq2gf.mongodb.net/FailOverFlow?retryWrites=true&w=majority");

            MongoClient mongoClient = new MongoClient(uri);
             MongoDatabase database = mongoClient.getDatabase("FailOverflow");
            MongoCollection<org.bson.Document> collections = database.getCollection("FailOverflow");
            dataBase = mongoClient.getDB("FailOverflow");
            collection = dataBase.getCollection("FailOverflow");

        } catch (Exception ex) {
            System.out.println("The connection was unsuccesfull");
        }

    }

    /*public void id(String id) {
        mainDocument.put("id", id);
    }

   

    /*public void dbUsersPassword(String name, String password) {

        collection = dataBase.getCollection("Users Password");
        BasicDBObject document = new BasicDBObject();

        document.put("Name", name);
        document.put("Password", password);
        collection.insert(document);
    }*/

  

    /*public BasicDBObject dBDiagnostic(Diagnostic diagnostic, String option) {
        BasicDBObject document = new BasicDBObject();

        document.put("Diagnostic", diagnostic.getName());
        document.put("Cie10", diagnostic.getCie10());

        if ("Clinic History".equals(option)) {
            mainDocument.put("Diagnostic", document);
        }
        return document;
    }*/

    public void saveDatabase(String option, BasicDBObject basicObject, String dBCollection) {
        collection = dataBase.getCollection(dBCollection);

        if ("Register".equals(option)) {
            collection.insert(basicObject);
        } else if ("Clinic History".equals(option)) {
            collection.insert(mainDocument);
        }
    }

    /*public void readClinicHistory(String search, String basicObject, String dBCollection) {
        collection = dataBase.getCollection(dBCollection);

        BasicDBObject consultation = new BasicDBObject();
        consultation.put(basicObject, search);

        DBCursor cursor = collection.find(consultation);

        while (cursor.hasNext()) {
            System.out.println("id: " + cursor.next().get("id"));
            System.out.println("Patient: " + cursor.curr().get("Patient"));
            System.out.println("Doctor: " + cursor.curr().get("Doctor"));
            System.out.println("Diagnostic: " + cursor.curr().get("Diagnostic"));
            System.out.println("Nuse: " + cursor.curr().get("Nurse"));
            
        }
    }*/

    /*public void readDoctor(String search, String basicObject, String dBCollection) {
        collection = dataBase.getCollection(dBCollection);

        BasicDBObject consultation = new BasicDBObject();
        consultation.put(basicObject, search);

        DBCursor cursor = collection.find(consultation);

        while (cursor.hasNext()) {
            System.out.println("Name: " + cursor.next().get("Name"));
            System.out.println("Title Code: " + cursor.curr().get("Title Code"));
        }
    }*/

    /*public void readNurse(String search, String basicObject, String dBCollection) {
        collection = dataBase.getCollection(dBCollection);

        BasicDBObject consultation = new BasicDBObject();
        consultation.put(basicObject, search);

        DBCursor cursor = collection.find(consultation);

        while (cursor.hasNext()) {
            System.out.println("Name: " + cursor.next().get("Name"));
            System.out.println("Date Of Birth: " + cursor.curr().get("Date Of Birth"));
        }
    }*/
    
    /*public String readTotal(String dBCollection) {
        collection = dataBase.getCollection(dBCollection);

        DBCursor cursor = collection.find();
        String name = "";
        int x;
        for(x=0;x<=cursor.size();x++) {
            System.out.println(cursor.next().get("Name"));
            name = "Name: " + cursor.curr().get("Name");
            return name;
        }
        return name;
    }*/

    /*public void updateClinicHistory(String object, String id) {

        if (object.equalsIgnoreCase("Patient")) {
            Patient patient = new Patient();
            patient.register();
            dBPatient(patient, "Clinic History");
        }

        if (object.equalsIgnoreCase("Doctor")) {
            Doctor doctor = new Doctor();
            doctor.register();
            dBDoctor(doctor, "Clinic History");
        }

        if (object.equalsIgnoreCase("Diagnostic")) {
            Diagnostic diagnostic = new Diagnostic();
            diagnostic.resgister();
            dBDiagnostic(diagnostic, "Clinic History");
        }

        if (object.equalsIgnoreCase("Nurse")) {
            Nurse nurse = new Nurse();
            nurse.register();
            dBNurse(nurse, "Clinic History");
        }

        BasicDBObject update = new BasicDBObject();
        update.append("$set", mainDocument);

        BasicDBObject searchId = new BasicDBObject();
        searchId.append("id", id);

        collection.update(searchId, update);
    }*/

    public void deleteObject(String search, String basicObject, String dBCollection, boolean decision) {
        collection = dataBase.getCollection(dBCollection);
        if (decision) {
            collection.remove(new BasicDBObject().append(basicObject, search));
        }
    }
    
    public String[] readPassword(String search, String dBCollection) {
        collection = dataBase.getCollection(dBCollection);
        
        String[] user = new String[2];

        BasicDBObject consultation = new BasicDBObject();
        consultation.put("Name", search);

        DBCursor cursor = collection.find(consultation);

        while (cursor.hasNext()) {
            user[0] = (String) cursor.next().get("Name");
            user[1] = (String) cursor.curr().get("Password");
        }
        return user;
    }
    public DB getDataBase() {
        return dataBase;
    }

    public void setDataBase(DB dataBase) {
        this.dataBase = dataBase;
    }

    public DBCollection getCollection() {
        return collection;
    }

    public void setCollection(DBCollection collection) {
        this.collection = collection;
    }
    
    public BasicDBObject getMainDocument() {
        return mainDocument;
    }

    public void setMainDocument(BasicDBObject mainDocument) {
        this.mainDocument = mainDocument;
    }

}

