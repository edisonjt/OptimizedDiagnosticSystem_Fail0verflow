/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luist
 */
public class DoctorTest {
    
    public DoctorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of register method, of class Doctor.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        Doctor instance = new Doctor();
        instance.register();
      
    }

    /**
     * Test of createPass method, of class Doctor.
     */
    @Test
    public void testCreatePass_boolean_String() {
        System.out.println("createPass");
        boolean option = false;
        String name = "luis";
        Doctor instance = new Doctor();
        instance.createPass(option, name);
      
    }

    /**
     * Test of createPass method, of class Doctor.
     */
    @Test
    public void testCreatePass_boolean() {
        System.out.println("createPass");
        boolean option = false;
        Doctor instance = new Doctor();
        instance.createPass(option);
    
    }

    /**
     * Test of setSpeciality method, of class Doctor.
     */
    @Test
    public void testSetSpeciality() {
        System.out.println("setSpeciality");
        String speciality = "";
        Doctor instance = new Doctor();
        instance.setSpeciality(speciality);
       
    }

    /**
     * Test of setSubSpeciality method, of class Doctor.
     */
    @Test
    public void testSetSubSpeciality() {
        System.out.println("setSubSpeciality");
        String subSpeciality = "";
        Doctor instance = new Doctor();
        instance.setSubSpeciality(subSpeciality);
     
    }

    /**
     * Test of getSpeciality method, of class Doctor.
     */
    @Test
    public void testGetSpeciality() {
        System.out.println("getSpeciality");
        Doctor instance = new Doctor();
        String expResult = "";
        String result = instance.getSpeciality();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of getSubSpeciality method, of class Doctor.
     */
    @Test
    public void testGetSubSpeciality() {
        System.out.println("getSubSpeciality");
        Doctor instance = new Doctor();
        String expResult = "";
        String result = instance.getSubSpeciality();
        assertEquals(expResult, result);
     
    }
    
}
