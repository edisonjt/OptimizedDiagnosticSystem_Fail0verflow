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
public class ClinicHistoryControllerTest {
    
    public ClinicHistoryControllerTest() {
    }

    /**
     * Test of read method, of class ClinicHistoryController.
     */
    @org.junit.Test
    public void testRead() {
        System.out.println("read");
        String search = "";
        ClinicHistoryController instance = new ClinicHistoryController();
        instance.read(search);
      
    }

    /**
     * Test of update method, of class ClinicHistoryController.
     */
    @org.junit.Test
    public void testUpdate() {
        System.out.println("update");
        String object = "";
        String id = "";
        ClinicHistoryController instance = new ClinicHistoryController();
        instance.update(object, id);
     
    }
    
}
