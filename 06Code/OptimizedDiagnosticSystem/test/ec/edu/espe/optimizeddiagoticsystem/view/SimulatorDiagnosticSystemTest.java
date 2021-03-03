/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagoticsystem.view;

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
public class SimulatorDiagnosticSystemTest {
    
    public SimulatorDiagnosticSystemTest() {
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
     * Test of main method, of class SimulatorDiagnosticSystem.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SimulatorDiagnosticSystem.main(args);

    }

    /**
     * Test of menuSystem method, of class SimulatorDiagnosticSystem.
     */
    @Test
    public void testMenuSystem() {
        System.out.println("menuSystem");
        SimulatorDiagnosticSystem.menuSystem();
    
    }

    /**
     * Test of menuRegister method, of class SimulatorDiagnosticSystem.
     */
    @Test
    public void testMenuRegister() {
        System.out.println("menuRegister");
        SimulatorDiagnosticSystem.menuRegister();

    }

    /**
     * Test of optionStaff method, of class SimulatorDiagnosticSystem.
     */
    @Test
    public void testOptionStaff() {
        System.out.println("optionStaff");
        SimulatorDiagnosticSystem.optionStaff();

    }

    /**
     * Test of optionClinicHistory method, of class SimulatorDiagnosticSystem.
     */
    @Test
    public void testOptionClinicHistory() {
        System.out.println("optionClinicHistory");
        SimulatorDiagnosticSystem.optionClinicHistory();

    }

    /**
     * Test of optionRegister method, of class SimulatorDiagnosticSystem.
     */
    @Test
    public void testOptionRegister() {
        System.out.println("optionRegister");
        SimulatorDiagnosticSystem.optionRegister();

    }
    
}
