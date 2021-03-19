/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edison Toapanta
 */
public class FileManagerTest {
    
    public FileManagerTest() {
    }

    /**
     * Test of save method, of class FileManager.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String fileName = "";
        Object src = null;
        boolean Option = false;
        FileManager instance = new FileManager();
        instance.save(fileName, src, Option);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class FileManager.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String fileName = "";
        String word = "";
        FileManager instance = new FileManager();
        String expResult = "";
        String result = instance.find(fileName, word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class FileManager.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        String fileName = "";
        Object src = null;
        FileManager instance = new FileManager();
        instance.read(fileName, src);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
