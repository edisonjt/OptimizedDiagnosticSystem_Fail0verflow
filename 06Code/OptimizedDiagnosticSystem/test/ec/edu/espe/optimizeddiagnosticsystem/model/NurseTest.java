/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FailOverflow
 */
public class NurseTest {
    
    public NurseTest() {
    }

    /**
     * Test of register method, of class Nurse.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        Nurse instance = new Nurse();
        instance.register();

    }

    /**
     * Test of createPass method, of class Nurse.
     */
    @Test
    public void testCreatePass_boolean_String() {
        System.out.println("createPass");
        boolean option = false;
        String name = "";
        Nurse instance = new Nurse();
        instance.createPass(option, name);

    }

    /**
     * Test of createPass method, of class Nurse.
     */
    @Test
    public void testCreatePass_boolean() {
        System.out.println("createPass");
        boolean option = false;
        Nurse instance = new Nurse();
        instance.createPass(option);

    }

    /**
     * Test of setWorkShift method, of class Nurse.
     */
    @Test
    public void testSetWorkShift() {
        System.out.println("setWorkShift");
        String workShift = "";
        Nurse instance = new Nurse();
        instance.setWorkShift(workShift);

    }

    /**
     * Test of getWorkShift method, of class Nurse.
     */
    @Test
    public void testGetWorkShift() {
        System.out.println("getWorkShift");
        Nurse instance = new Nurse();
        String expResult = "";
        String result = instance.getWorkShift();
        assertEquals(expResult, result);

    }

    /**
     * Test of isPrescription method, of class Nurse.
     */
    @Test
    public void testIsPrescription() {
        System.out.println("isPrescription");
        Nurse instance = new Nurse();
        boolean expResult = false;
        boolean result = instance.isPrescription();
        assertEquals(expResult, result);

    }

    /**
     * Test of setPrescription method, of class Nurse.
     */
    @Test
    public void testSetPrescription() {
        System.out.println("setPrescription");
        boolean prescription = false;
        Nurse instance = new Nurse();
        instance.setPrescription(prescription);

    }
    
}
