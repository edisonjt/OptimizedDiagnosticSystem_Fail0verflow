/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

import ec.edu.espe.filemanager.utils.Data;
import java.util.*;

/**
 *
 * @author Fail0verflow
 */
public class Nurse extends HospitalPeople{

    private boolean prescription;
    private boolean option;

    public Nurse(boolean prescription, String name, String gender, String dateOfBirth) {
        super(name, gender, dateOfBirth);
        this.prescription = prescription;
    }

    public Nurse() {
    }

    @Override
    public String toString() {
        return "Nurse{" + "name=" + getName() + ", age=" + getDateOfBirth() + 
                ", gender=" + getGender() + ", prescription=" + isPrescription() + '}';
    }

    public boolean prescription(){
        setPrescription(true);
        return isPrescription();
    }
    
    @Override
    public void register(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n=======================================");
        System.out.println("*****Nurse's data*****");
        
        super.register();
        
        System.out.println("Do you want to save? Please put True or False");
        setOption(scan.nextBoolean());
        
        String dataToSave = getName() + "," + getDateOfBirth() + "," + getGender() + "\n";
        Data.save("nurse.csv", dataToSave, isOption());
    }
    
    public void showData() {
        
    }

    public void updateMedicalHistory(ClinicHistory clinicHistory) {
        
    }

    public void takeASample() {
        
    }
    
    /**
     * @return the prescription
     */
    public boolean isPrescription() {
        return prescription;
    }

    /**
     * @param prescription the prescription to set
     */
    public void setPrescription(boolean prescription) {
        this.prescription = prescription;
    }

    /**
     * @return the option
     */
    public boolean isOption() {
        return option;
    }

    /**
     * @param option the option to set
     */
    public void setOption(boolean option) {
        this.option = option;
    }

}
