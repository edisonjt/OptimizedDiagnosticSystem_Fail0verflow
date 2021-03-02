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
import com.mongodb.Mongo;
import ec.edu.espe.optimizeddiagnosticsystem.model.Diagnostic;
import ec.edu.espe.optimizeddiagnosticsystem.model.Doctor;
import ec.edu.espe.optimizeddiagnosticsystem.model.Nurse;
import ec.edu.espe.optimizeddiagnosticsystem.model.Patient;

/**
 *
 * @author Jhonatan
 */
public class Database {

    DB database;
    DBCollection collection;
    BasicDBObject mainDocument = new BasicDBObject();

    public Database() {
        Mongo mongo = new Mongo("localhost", 27017);
        database = mongo.getDB("FailOverflow");
        //System.out.println("conectada");
    }

    public void id(String id) {
        mainDocument.put("id", id);
    }

    public BasicDBObject dBDoctor(Doctor doctor, String option) {
        BasicDBObject document = new BasicDBObject();

        document.put("Name", doctor.getName());
        document.put("Age", doctor.getDateOfBirth());
        document.put("Gender", doctor.getGender());
        document.put("Speciality", doctor.getSpeciality());
        document.put("SubSpeciality", doctor.getSubSpeciality());
        document.put("Title Code", doctor.getTitleCode());

        if ("Clinic History".equals(option)) {
            mainDocument.put("Doctor", document);
        }
        return document;
    }

    public void dbUsersPassword(String name, String password) {

        collection = database.getCollection("Users Password");
        BasicDBObject document = new BasicDBObject();

        document.put("Name", name);
        document.put("Password", password);
        collection.insert(document);
    }

    public BasicDBObject dBNurse(Nurse nurse, String option) {
        BasicDBObject document = new BasicDBObject();

        document.put("Name", nurse.getName());
        document.put("Age", nurse.getDateOfBirth());
        document.put("Gender", nurse.getGender());

        if ("Clinic History".equals(option)) {
            mainDocument.put("Nurse", document);
        }
        return document;
    }

    public BasicDBObject dBPatient(Patient patient, String option) {
        BasicDBObject document = new BasicDBObject();

        document.put("Name", patient.getName());
        document.put("Age", patient.getDateOfBirth());
        document.put("Gender", patient.getGender());
        document.put("Identification Card", patient.getIdentificationCard());
        document.put("Blood Type", patient.getBloodType());
        document.put("Height", patient.getHeight());
        document.put("Weight", patient.getWeight());
        document.put("Allergies", patient.getAllergies());
        document.put("Emergency Contact", patient.getEmergencyNumber());

        if ("Clinic History".equals(option)) {
            mainDocument.put("Patient", document);
        }
        return document;
    }

    public BasicDBObject dBDiagnostic(Diagnostic diagnostic, String option) {
        BasicDBObject document = new BasicDBObject();

        document.put("Diagnostic", diagnostic.getName());
        document.put("Cie10", diagnostic.getCie10());

        if ("ClinicHistory".equals(option)) {
            mainDocument.put("Diagnostic", document);
        }
        return document;
    }

    public void saveDatabase(String option, BasicDBObject basicObject, String dBCollection) {
        collection = database.getCollection(dBCollection);

        if ("Register".equals(option)) {
            collection.insert(basicObject);
        } else if ("Clinic History".equals(option)) {
            collection.insert(mainDocument);
        }
    }

    public void readClinicHistory(String search, String basicObject, String dBCollection) {
        collection = database.getCollection(dBCollection);

        BasicDBObject consultation = new BasicDBObject();
        consultation.put(basicObject, search);

        DBCursor cursor = collection.find(consultation);

        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
    }

    public void readDoctor(String search, String basicObject, String dBCollection) {
        collection = database.getCollection(dBCollection);

        BasicDBObject consultation = new BasicDBObject();
        consultation.put(basicObject, search);

        DBCursor cursor = collection.find(consultation);

        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
    }

    public void readNurse(String search, String basicObject, String dBCollection) {
        collection = database.getCollection(dBCollection);

        BasicDBObject consultation = new BasicDBObject();
        consultation.put(basicObject, search);

        DBCursor cursor = collection.find(consultation);

        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
    }

    public void updateClinicHistory(String object, String id) {

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
    }

    public void deleteObject(String search, String basicObject, String dBCollection, boolean decision) {
        collection = database.getCollection(dBCollection);
        if (decision) {
            collection.remove(new BasicDBObject().append(basicObject, search));
        }
    }
}
