/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.controller;

import com.mongodb.BasicDBObject;
import ec.edu.espe.optimizeddiagnosticsystem.model.Doctor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edison Toapanta
 */
public class DoctorControllerTest {
    
    public DoctorControllerTest() {
    }

    /**
     * Test of register method, of class DoctorController.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        Doctor doctor = null;
        String option = "";
        DoctorController instance = new DoctorController();
        BasicDBObject expResult = null;
        BasicDBObject result = instance.register(doctor, option);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPass method, of class DoctorController.
     */
    @Test
    public void testCreatePass() {
        System.out.println("createPass");
        boolean option = false;
        String name = "";
        DoctorController instance = new DoctorController();
        instance.createPass(option, name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of savePassword method, of class DoctorController.
     */
    @Test
    public void testSavePassword() {
        System.out.println("savePassword");
        String name = "";
        String password = "";
        DoctorController instance = new DoctorController();
        instance.savePassword(name, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class DoctorController.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String search = "";
        DoctorController instance = new DoctorController();
        String[] expResult = null;
        String[] result = instance.read(search);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
