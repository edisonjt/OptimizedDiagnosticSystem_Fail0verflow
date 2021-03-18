/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.controller;

import com.mongodb.BasicDBObject;
import ec.edu.espe.optimizeddiagnosticsystem.model.Patient;
import ec.edu.espe.optimizeddiagnosticsystem.utils.Database;

/**
 *
 * @author Jhonatan
 */
public class PatientController {
    
    Database database = new Database();

    public PatientController() {
    }
    
    public BasicDBObject save(Patient patient, String option) {
        BasicDBObject document = new BasicDBObject();

        document.put("Name", patient.getName());
        document.put("Date Of Birth", patient.getDateOfBirth());
        document.put("Gender", patient.getGender());
        document.put("Identification Card", patient.getIdentificationCard());
        document.put("Blood Type", patient.getBloodType());
        document.put("Height", patient.getHeight());
        document.put("Weight", patient.getWeight());
        document.put("Allergies", patient.getAllergies());
        document.put("Emergency Contact", patient.getEmergencyNumber());

        if ("Clinic History".equals(option)) {
            database.getMainDocument().put("Patient", document);
        }
        return document;
    }
    
}
