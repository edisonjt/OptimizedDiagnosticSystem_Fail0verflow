/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.utils;

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
public class LoginTest {

    @Test
    public void test1System() {
        System.out.println("system");
        String pass = "rootpass";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.system(pass);
        assertEquals(expResult, result);

    }
      /**
     * Test of system method, of class Login.
     */
    @Test
    public void test2System() {
        System.out.println("system");
        String pass = "12345";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.system(pass);
        assertEquals(expResult, result);

    }

    /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test1LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Samantha Tipanguano";
        String pass = "170";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }

     /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test2LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Jhonatan Tituana";
        String pass = "180";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }

        /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test3LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Edison Toapanta";
        String pass = "190";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }

        /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test4LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Luis Tavaris";
        String pass = "200";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }

        /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test5LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Alejandra Ordonez";
        String pass = "345";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }

        /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test6LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Maria Alvarado";
        String pass = "244";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }

        /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test7LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Carla Perez";
        String pass = "272";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);


    }

        /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test8LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Juliana Andes";
        String pass = "214";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }

        /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test9LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Jose Mendoza";
        String pass = "251";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }

        /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test10LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Valeria Perez";
        String pass = "236";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }

        /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test11LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Pamela Perez";
        String pass = "255";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }

        /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test12LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Carla Perez";
        String pass = "182632";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }

        /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test13LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Jose Mendoza";
        String pass = "1190";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }

        /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test14LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Edison Toapanta";
        String pass = "11930";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }

          /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test15LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Carla Perez";
        String pass = "11950";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }
          /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test16LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Edison Toapanta";
        String pass = "11390";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }
          /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test17LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Luis tavaris";
        String pass = "200";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }
          /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test18LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Samantha Tipanguano";
        String pass = "171";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }
          /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test19LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Edisfon Toapanta";
        String pass = "1190";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }
          /**
     * Test of loginHistoryUpdater method, of class Login.
     */
    @Test
    public void test20LoginHistoryUpdater() {
        System.out.println("loginHistoryUpdater");
        String user = "Edisron Toapanta";
        String pass = "1190";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginHistoryUpdater(user, pass);
        assertEquals(expResult, result);

    }
    
}
