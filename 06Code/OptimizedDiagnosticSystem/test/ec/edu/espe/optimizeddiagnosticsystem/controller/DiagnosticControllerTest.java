/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.controller;

import com.mongodb.BasicDBObject;
import ec.edu.espe.optimizeddiagnosticsystem.model.Diagnostic;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edison Toapanta
 */
public class DiagnosticControllerTest {
    
    public DiagnosticControllerTest() {
    }

    /**
     * Test of register method, of class DiagnosticController.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        Diagnostic diagnostic = null;
        String option = "";
        DiagnosticController instance = new DiagnosticController();
        BasicDBObject expResult = null;
        BasicDBObject result = instance.register(diagnostic, option);
        assertEquals(expResult, result);
              
    }
    
}
