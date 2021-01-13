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
public class Menu {

    private int option;
    private String name;
    private int option2;

    public Menu() {
        System.out.println("===================================================");
        System.out.println("       Hi! Choose the option you want to do...     ");
        System.out.println("1. New patient (recommended)");
        System.out.println("2. Old patient ");
        System.out.println("===================================================");
        Scanner op = new Scanner(System.in);
        option = op.nextInt();

        if (option == 1) {
            Patient patient = new Patient();
            patient.Register();

        } else if (option == 2) {
            while (option2 != 3) {
                
                System.out.println("===================================================");
                System.out.println("1. Perform diagnosis ");
                System.out.println("2. Make a prescription ");
                System.out.println("3. Exit");
                option2 = op.nextInt();
                
                if (option2 == 1){
                    Diagnostic diagnostic = new Diagnostic();
                }else if (option2 == 2){
                    MedicalRecipe medicalrecipe = new MedicalRecipe(); 
                }
            }
        }

    }

}
