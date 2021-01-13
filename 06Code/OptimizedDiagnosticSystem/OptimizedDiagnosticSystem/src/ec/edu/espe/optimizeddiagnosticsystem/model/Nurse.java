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
public class Nurse {
    
    String name; 
    int age;
    String subSpeciality;
    String gender;

    public Nurse() {
    }

    public Nurse(String name, int age, String subSpeciality, String gender) {
        this.name = name;
        this.age = age;
        this.subSpeciality = subSpeciality;
        this.gender = gender;
    }
    
    void suppliesMedication (MedicalRecipe medicalrecipe)
    {
        
    }
    
    void registerPatient (Patient patient){
        
    }
    
    void showData ()
    {
        
    }
    
    void updateMedicalHistory (ClinicHistory clinicHistory)
    {
        
    }
   
    void takeASample ()
    {
        
    }
    
    ClinicHistory transferPatients (ClinicHistory clinicHistory){
        
        return(clinicHistory);
    }
    
    
}
