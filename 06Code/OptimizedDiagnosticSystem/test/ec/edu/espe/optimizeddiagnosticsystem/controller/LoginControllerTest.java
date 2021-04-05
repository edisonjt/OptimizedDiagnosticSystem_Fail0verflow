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
 * @author luist
 */
public class LoginControllerTest {
    
    public LoginControllerTest() {
    }
      
    @Test
    public void testSystem() {
        System.out.println("system");
        String pass = "87546";
        LoginController instance = new LoginController();
        boolean expResult = false;
        boolean result = instance.system(pass);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testSystem_1() {
        System.out.println("system");
        String pass = "rootpass";
        LoginController instance = new LoginController();
        boolean expResult = true;
        boolean result = instance.system(pass);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testSystem_2() {
        System.out.println("system");
        String pass = "rootpas";
        LoginController instance = new LoginController();
        boolean expResult = false;
        boolean result = instance.system(pass);
        assertEquals(expResult, result);
       
    }
    
        @Test
    public void testSystem_3() {
        System.out.println("system");
        String pass = "rotpass";
        LoginController instance = new LoginController();
        boolean expResult = false;
        boolean result = instance.system(pass);
        assertEquals(expResult, result);
       
    }
    
        @Test
    public void testSystem_4() {
        System.out.println("system");
        String pass = "ROOTPASS";
        LoginController instance = new LoginController();
        boolean expResult = true;
        boolean result = instance.system(pass);
        assertEquals(expResult, result);
       
    }

 
    @Test
    public void testHistoryUpdater() {
        System.out.println("historyUpdater");
        String user = "y8645";
        String pass = "976fd";
        LoginController instance = new LoginController();
        boolean expResult = false;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testHistoryUpdater_1() {
        System.out.println("historyUpdater");
        String user = "Jhonatan Tituana";
        String pass = "180";
        LoginController instance = new LoginController();
        boolean expResult = true;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testHistoryUpdater_2() {
        System.out.println("historyUpdater");
        String user = "Luis Tavaris";
        String pass = "200";
        LoginController instance = new LoginController();
        boolean expResult = true;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testHistoryUpdater_3() {
        System.out.println("historyUpdater");
        String user = "Samantha Tipanguano";
        String pass = "170";
        LoginController instance = new LoginController();
        boolean expResult = true;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testHistoryUpdater_4() {
        System.out.println("historyUpdater");
        String user = "Edison Toapanta";
        String pass = "190";
        LoginController instance = new LoginController();
        boolean expResult = true;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testHistoryUpdater_5() {
        System.out.println("historyUpdater");
        String user = "Alejandra Ordonez";
        String pass = "230";
        LoginController instance = new LoginController();
        boolean expResult = true;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testHistoryUpdater_6() {
        System.out.println("historyUpdater");
        String user = "Maria Alvarado";
        String pass = "342";
        LoginController instance = new LoginController();
        boolean expResult = true;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testHistoryUpdater_7() {
        System.out.println("historyUpdater");
        String user = "Carla Perez";
        String pass = "321";
        LoginController instance = new LoginController();
        boolean expResult = true;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testHistoryUpdater_8() {
        System.out.println("historyUpdater");
        String user = "Jose Mendoza";
        String pass = "453";
        LoginController instance = new LoginController();
        boolean expResult = true;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testHistoryUpdater_9() {
        System.out.println("historyUpdater");
        String user = "Ivone";
        String pass = "1994";
        LoginController instance = new LoginController();
        boolean expResult = true;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testHistoryUpdater_10() {
        System.out.println("historyUpdater");
        String user = "Angelica Armijos";
        String pass = "1993";
        LoginController instance = new LoginController();
        boolean expResult = true;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testHistoryUpdater_11() {
        System.out.println("historyUpdater");
        String user = "Kim";
        String pass = "rootpas";
        LoginController instance = new LoginController();
        boolean expResult = true;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testHistoryUpdater_12() {
        System.out.println("historyUpdater");
        String user = "fer";
        String pass = "13332";
        LoginController instance = new LoginController();
        boolean expResult = true;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testHistoryUpdater_13() {
        System.out.println("historyUpdater");
        String user = "ericka";
        String pass = "0001";
        LoginController instance = new LoginController();
        boolean expResult = true;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testHistoryUpdater_14() {
        System.out.println("historyUpdater");
        String user = "fernando";
        String pass = "L0123";
        LoginController instance = new LoginController();
        boolean expResult = true;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
       
    }
    
    
    @Test
    public void testHistoryUpdater_15() {
        System.out.println("historyUpdater");
        String user = "Jhonatan Tituan";
        String pass = "180";
        LoginController instance = new LoginController();
        boolean expResult = false;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testHistoryUpdater_16() {
        System.out.println("historyUpdater");
        String user ="Luis T";
        String pass = "180";
        LoginController instance = new LoginController();
        boolean expResult = false;
        boolean result = instance.historyUpdater(user, pass);
        assertEquals(expResult, result);
       
    }
    
    
    
}
