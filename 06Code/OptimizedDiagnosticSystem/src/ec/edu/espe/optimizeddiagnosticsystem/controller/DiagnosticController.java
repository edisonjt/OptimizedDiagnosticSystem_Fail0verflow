/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.controller;

import com.mongodb.BasicDBObject;
import ec.edu.espe.optimizeddiagnosticsystem.model.Diagnostic;

/**
 *
 * @author Fail0verflow
 */
public class DiagnosticController {

    public DiagnosticController() {
    }
    
    public BasicDBObject register(Diagnostic diagnostic) {
        BasicDBObject document = new BasicDBObject();
        BasicDBObject mainDocument = new BasicDBObject();

        document.put("Diagnostic", diagnostic.getName());
        document.put("Cie10", diagnostic.getCie10());

        /*if ("Clinic History".equals(option)) {
            mainDocument.put("Diagnostic", document);
            return mainDocument;
        }*/
        return document;
    }
    
    public String search(String search){
        
        String name = "";
        
        
        
        return name;
    }
    
}
