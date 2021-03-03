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
public class PatientTest {
    
    public PatientTest() {
    }

    /**
     * Test of register method, of class Patient.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        Patient instance = new Patient();
        instance.register();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setWeight method, of class Patient.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        int weight = 0;
        Patient instance = new Patient();
        instance.setWeight(weight);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setWeight2 method, of class Patient.
     */
    @Test
    public void testSetWeight2() {
        System.out.println("setWeight");
        int weight = 70;
        Patient instance = new Patient();
        instance.setWeight(weight);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class Patient.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        int height = 0;
        Patient instance = new Patient();
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setHeight2 method, of class Patient.
     */
    @Test
    public void testSetHeight2() {
        System.out.println("setHeight");
        int height = 170;
        Patient instance = new Patient();
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBloodType method, of class Patient.
     */
    @Test
    public void testSetBloodType() {
        System.out.println("setBloodType");
        String bloodType = "";
        Patient instance = new Patient();
        instance.setBloodType(bloodType);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAllergies method, of class Patient.
     */
    @Test
    public void testSetAllergies() {
        System.out.println("setAllergies");
        String allergies = "";
        Patient instance = new Patient();
        instance.setAllergies(allergies);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdentificationCard method, of class Patient.
     */
    @Test
    public void testSetIdentificationCard() {
        System.out.println("setIdentificationCard");
        String identificationCard = "";
        Patient instance = new Patient();
        instance.setIdentificationCard(identificationCard);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class Patient.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Patient instance = new Patient();
        int expResult = 0;
        int result = instance.getWeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getWeight2 method, of class Patient.
     */
    @Test
    public void testGetWeight2() {
        System.out.println("getWeight");
        Patient instance = new Patient();
        int expResult = 0;
        int result = instance.getWeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class Patient.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Patient instance = new Patient();
        int expResult = 0;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getHeight2 method, of class Patient.
     */
    @Test
    public void testGetHeight2() {
        System.out.println("getHeight");
        Patient instance = new Patient();
        int expResult = 170;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBloodType method, of class Patient.
     */
    @Test
    public void testGetBloodType() {
        System.out.println("getBloodType");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getBloodType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllergies method, of class Patient.
     */
    @Test
    public void testGetAllergies() {
        System.out.println("getAllergies");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getAllergies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdentificationCard method, of class Patient.
     */
    @Test
    public void testGetIdentificationCard() {
        System.out.println("getIdentificationCard");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getIdentificationCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
