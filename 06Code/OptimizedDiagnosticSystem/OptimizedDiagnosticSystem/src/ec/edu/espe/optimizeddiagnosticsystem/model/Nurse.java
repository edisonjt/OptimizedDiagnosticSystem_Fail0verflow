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
public class Nurse {
    
    String name; 
    int age;
    String subSpeciality;
    String gender;

    public Nurse() {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter the name of the nurse");
        name = scan.nextLine();
        System.out.println("Please enter the age");
        age = scan.nextInt();
        System.out.println("Please enter the SubSpeciality");
        subSpeciality = scan.nextLine();
        System.out.println("Please enter the gender ");
        gender = scan.nextLine();
    }
    
 
    
    public void suppliesMedication (MedicalRecipe medicalrecipe)
    {
        
    }
    
    public void registerPatient (Patient patient){
        
    }
    
    public void showData ()
    {
        
    }
    
    public void updateMedicalHistory (ClinicHistory clinicHistory)
    {
        
    }
   
    public void takeASample ()
    {
        
    }
    
    ClinicHistory transferPatients (ClinicHistory clinicHistory){
        
        return(clinicHistory);
    }
    
    
}
