/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.controller;

import com.mongodb.BasicDBObject;
import ec.edu.espe.optimizeddiagnosticsystem.model.Patient;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edison Toapanta
 */
public class PatientControllerTest {
    
    public PatientControllerTest() {
    }

    /**
     * Test of register method, of class PatientController.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        Patient patient = null;
        String option = "";
        PatientController instance = new PatientController();
        BasicDBObject expResult = null;
        BasicDBObject result = instance.register(patient, option);
        assertEquals(expResult, result);

    }
    
}
