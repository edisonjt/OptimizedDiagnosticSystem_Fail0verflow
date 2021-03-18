/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import ec.edu.espe.optimizeddiagnosticsystem.model.Diagnostic;
import ec.edu.espe.optimizeddiagnosticsystem.model.Doctor;
import ec.edu.espe.optimizeddiagnosticsystem.model.Nurse;
import ec.edu.espe.optimizeddiagnosticsystem.model.Patient;
import ec.edu.espe.optimizeddiagnosticsystem.utils.MongoDBManager;

/**
 *
 * @author Jhonatan
 */
public class ClinicHistoryController {

    MongoDBManager database = new MongoDBManager();
    
    public ClinicHistoryController() {
    }
    
    public void read(String search) {
        DBCollection collection;
        collection = database.getDataBase().getCollection("Clinic History");

        BasicDBObject consultation = new BasicDBObject();
        consultation.put("id", search);

        DBCursor cursor = collection.find(consultation);

        while (cursor.hasNext()) {
            System.out.println("id: " + cursor.next().get("id"));
            System.out.println("Patient: " + cursor.curr().get("Patient"));
            System.out.println("Doctor: " + cursor.curr().get("Doctor"));
            System.out.println("Diagnostic: " + cursor.curr().get("Diagnostic"));
            System.out.println("Nuse: " + cursor.curr().get("Nurse"));
            
        }
    }
    
    public void updateClinicHistory(String object, String id) {

        if (object.equalsIgnoreCase("Patient")) {
            Patient patient = new Patient();
            PatientController patientController = new PatientController();
            //patient.register();
            patientController.register(patient, "Clinic History");
        }

        if (object.equalsIgnoreCase("Doctor")) {
            Doctor doctor = new Doctor();
            DoctorController doctorController = new DoctorController();
            //doctor.register();
            doctorController.register(doctor, "Clinic History");
        }

        if (object.equalsIgnoreCase("Diagnostic")) {
            Diagnostic diagnostic = new Diagnostic();
            DiagnosticController diagnosticController = new DiagnosticController();
            diagnostic.resgister();
            diagnosticController.save(diagnostic, "Clinic History");
        }

        if (object.equalsIgnoreCase("Nurse")) {
            Nurse nurse = new Nurse();
            NurseController nurseController = new NurseController();
            //nurse.register();
            nurseController.register(nurse, "Clinic History");
        }

        BasicDBObject update = new BasicDBObject();
        update.append("$set", database.getMainDocument());

        BasicDBObject searchId = new BasicDBObject();
        searchId.append("id", id);

        database.getCollection().update(searchId, update);
        
        
    }
}
