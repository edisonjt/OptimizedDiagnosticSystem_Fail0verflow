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
public class Doctor {
    String name; 
    int age;
    String speciality;
    String subSpeciality;
    String titleCode;
    String gender;

    public Doctor() {
    }

    public Doctor(String name, int age, String speciality, String subSpeciality, String titleCode, String gender) {
        this.name = name;
        this.age = age;
        this.speciality = speciality;
        this.subSpeciality = subSpeciality;
        this.titleCode = titleCode;
        this.gender = gender;
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
    
    MedicalExams requestMedicalExams (MedicalExams medicalExams){
        
        return(medicalExams);
    }
    
    
}
