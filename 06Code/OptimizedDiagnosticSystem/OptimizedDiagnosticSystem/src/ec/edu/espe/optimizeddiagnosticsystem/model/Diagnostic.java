/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

import java.util.Scanner;

/**
 *
 * @author Fail0verflow
 */
public class Diagnostic {

    String cie10;
    String name; 

    public Diagnostic() {
    }
    

    public void resgister() {
        Scanner scan = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("*****Cie-10 data*****");
        
        System.out.println("Name of diagnosis");
        name = scan.nextLine();
        
        System.out.println("CIE-10: ");
        cie10 = scan.nextLine();
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
