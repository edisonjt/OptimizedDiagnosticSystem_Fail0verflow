/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

/**
 *
 * @author Fail0verflow
 */
public class Diagnostic {

    String cie10;
    String name; 

    public Diagnostic() {
    }

    public Diagnostic(String cie10, String name) {
        this.cie10 = cie10;
        this.name = name;
    }
   
    public String getCie10() {
        return cie10;
    }

    public void setCie10(String cie10) {
        this.cie10 = cie10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
