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
 * @author FailOverflow
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
     * Test of getSpeciality method, of class Doctor.
     */
    @Test
    public void testGetSpecialityNull() {
        System.out.println("getSpeciality");
        Doctor instance = new Doctor();
        String expResult = null ;
        String result = instance.getSpeciality();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of getSubSpeciality method, of class Doctor.
     */
    @Test
    public void testGetSubSpecialityNull() {
        System.out.println("getSubSpeciality");
        Doctor instance = new Doctor();
        String expResult = null ;
        String result = instance.getSubSpeciality();
        assertEquals(expResult, result);
     
    }
    
}
