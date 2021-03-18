/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.controller;

import com.mongodb.BasicDBObject;
import ec.edu.espe.optimizeddiagnosticsystem.model.Diagnostic;
import ec.edu.espe.optimizeddiagnosticsystem.utils.Database;

/**
 *
 * @author Jhonatan
 */
public class DiagnosticController {
 
    Database database = new Database();

    public DiagnosticController() {
    }
    
    public BasicDBObject save(Diagnostic diagnostic, String option) {
        BasicDBObject document = new BasicDBObject();

        document.put("Diagnostic", diagnostic.getName());
        document.put("Cie10", diagnostic.getCie10());

        if ("Clinic History".equals(option)) {
            database.getMainDocument().put("Diagnostic", document);
        }
        return document;
    }
    
}
