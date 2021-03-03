/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FailOverflow
 */
public class ClinicHistoryTest {
    
    public ClinicHistoryTest() {
    }

    /**
     * Test of register method, of class ClinicHistory.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        String user = "";
        ClinicHistory instance = new ClinicHistory();
        instance.register(user);

    }

    /**
     * Test of toString method, of class ClinicHistory.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ClinicHistory instance = new ClinicHistory();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of chooseNurse method, of class ClinicHistory.
     */
    @Test
    public void testChooseNurse() {
        System.out.println("chooseNurse");
        ClinicHistory instance = new ClinicHistory();
        Nurse expResult = null;
        Nurse result = instance.chooseNurse();
        assertEquals(expResult, result);

    }

    /**
     * Test of addDoctor method, of class ClinicHistory.
     */
    @Test
    public void testAddDoctor() {
        System.out.println("addDoctor");
        String user = "";
        ClinicHistory instance = new ClinicHistory();
        ArrayList expResult = null;
        ArrayList result = instance.addDoctor(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of addDiagnostic method, of class ClinicHistory.
     */
    @Test
    public void testAddDiagnostic() {
        System.out.println("addDiagnostic");
        ClinicHistory instance = new ClinicHistory();
        ArrayList expResult = null;
        ArrayList result = instance.addDiagnostic();
        assertEquals(expResult, result);

    }

    /**
     * Test of getPatient method, of class ClinicHistory.
     */
    @Test
    public void testGetPatient() {
        System.out.println("getPatient");
        ClinicHistory instance = new ClinicHistory();
        Patient expResult = null;
        Patient result = instance.getPatient();
        assertEquals(expResult, result);

    }

    /**
     * Test of setPatient method, of class ClinicHistory.
     */
    @Test
    public void testSetPatient() {
        System.out.println("setPatient");
        Patient patient = null;
        ClinicHistory instance = new ClinicHistory();
        instance.setPatient(patient);

    }

    /**
     * Test of getDoctor method, of class ClinicHistory.
     */
    @Test
    public void testGetDoctor() {
        System.out.println("getDoctor");
        ClinicHistory instance = new ClinicHistory();
        ArrayList<Doctor> expResult = null;
        ArrayList<Doctor> result = instance.getDoctor();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDoctor method, of class ClinicHistory.
     */
    @Test
    public void testSetDoctor() {
        System.out.println("setDoctor");
        ArrayList<Doctor> doctor = null;
        ClinicHistory instance = new ClinicHistory();
        instance.setDoctor(doctor);

    }

    /**
     * Test of getDiagnostic method, of class ClinicHistory.
     */
    @Test
    public void testGetDiagnostic() {
        System.out.println("getDiagnostic");
        ClinicHistory instance = new ClinicHistory();
        ArrayList<Diagnostic> expResult = null;
        ArrayList<Diagnostic> result = instance.getDiagnostic();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDiagnostic method, of class ClinicHistory.
     */
    @Test
    public void testSetDiagnostic() {
        System.out.println("setDiagnostic");
        ArrayList<Diagnostic> diagnostic = null;
        ClinicHistory instance = new ClinicHistory();
        instance.setDiagnostic(diagnostic);

    }

    /**
     * Test of getNurse method, of class ClinicHistory.
     */
    @Test
    public void testGetNurse() {
        System.out.println("getNurse");
        ClinicHistory instance = new ClinicHistory();
        Nurse expResult = null;
        Nurse result = instance.getNurse();
        assertEquals(expResult, result);

    }

    /**
     * Test of setNurse method, of class ClinicHistory.
     */
    @Test
    public void testSetNurse() {
        System.out.println("setNurse");
        Nurse nurse = null;
        ClinicHistory instance = new ClinicHistory();
        instance.setNurse(nurse);

    }
    
}
