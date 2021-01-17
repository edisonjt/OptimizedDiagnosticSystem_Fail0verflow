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
public class Doctor {
    String name; 
    int age;
    String speciality;
    String subSpeciality;
    String titleCode;
    String gender;

    public Doctor() {
    }

    public void  registrer() {
        Scanner scan = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("*****Doctor's data*****");

        System.out.println("Title code: ");
        titleCode = scan.nextLine();

        System.out.println("Gender: ");
        gender = scan.nextLine();

        System.out.println("Name: ");
        name = scan.nextLine();

        System.out.println("Age: ");
        age = scan.nextInt();
        
        System.out.println("Sub Speciality : ");
        subSpeciality= scan.nextLine();
      
        System.out.println("Speciality : ");
        speciality= scan.nextLine();

    }
    
    String takeExams (ClinicHistory clinicHistory) {
        
        
        return("0"); 
    }
    
    void performDiagnostic (Diagnostic diagnostic)
    {
        
    }
    
    void makeRecipe (MedicalRecipe medicalrecipe){
        
    }
    
    void showData ()
    {
        
    }
    
    void updateMedicalHistory (ClinicHistory clinicHistory)
    {
        
    }
   
    
}
