/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.utils;

import com.mongodb.BasicDBObject;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edison Toapanta
 */
public class MongoDBManagerTest {
    
    public MongoDBManagerTest() {
    }

    /**
     * Test of openConnection method, of class MongoDBManager.
     */
    @Test
    public void testOpenConnection() {
        System.out.println("openConnection");
        MongoDBManager instance = new MongoDBManager();
        instance.openConnection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class MongoDBManager.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String option = "";
        BasicDBObject basicObject = null;
        String dBCollection = "";
        MongoDBManager instance = new MongoDBManager();
        instance.save(option, basicObject, dBCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class MongoDBManager.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String dBCollection = "";
        MongoDBManager instance = new MongoDBManager();
        String expResult = "";
        String result = instance.read(dBCollection);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteObject method, of class MongoDBManager.
     */
    @Test
    public void testDeleteObject() {
        System.out.println("deleteObject");
        String search = "";
        String basicObject = "";
        String dBCollection = "";
        boolean decision = false;
        MongoDBManager instance = new MongoDBManager();
        instance.deleteObject(search, basicObject, dBCollection, decision);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readPassword method, of class MongoDBManager.
     */
    @Test
    public void testReadPassword() {
        System.out.println("readPassword");
        String search = "";
        String dBCollection = "";
        MongoDBManager instance = new MongoDBManager();
        String[] expResult = null;
        String[] result = instance.readPassword(search, dBCollection);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
