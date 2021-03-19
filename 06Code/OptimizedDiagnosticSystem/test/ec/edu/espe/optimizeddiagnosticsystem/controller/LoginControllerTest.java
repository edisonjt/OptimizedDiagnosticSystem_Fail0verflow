/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edison Toapanta
 */
public class LoginControllerTest {
    
    public LoginControllerTest() {
    }

    /**
     * Test of system method, of class LoginController.
     */
    @Test
    public void testSystem() {
        System.out.println("system");
        String pass = "";
        LoginController instance = new LoginController();
        boolean expResult = false;
        boolean result = instance.system(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of historyUpdater method, of class LoginController.
     */
    @Test
    public void testHistoryUpdater() {
        System.out.println("historyUpdater");
        String user = "";
        String pass = "";
        LoginController instance = new LoginController();
        boolean expResult = false;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
