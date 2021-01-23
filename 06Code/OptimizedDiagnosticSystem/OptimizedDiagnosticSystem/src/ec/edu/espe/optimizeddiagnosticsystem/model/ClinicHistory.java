/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

import java.util.*;
/**
 *
 * @author Fail0verflow
 */
public class ClinicHistory {

    private Patient patient;
    private ArrayList<Doctor> doctor = new ArrayList();
    private Diagnostic diagnostic;
    private Nurse nurse;

    public ClinicHistory(Patient patient, ArrayList<Doctor> doctor, Diagnostic diagnostic, Nurse nurse) {
        this.patient = patient;
        this.doctor = doctor;
        this.diagnostic = diagnostic;
        this.nurse = nurse;
    }

    public ClinicHistory() {
    }

    @Override
    public String toString() {
        return "ClinicHistory{" + "patient=" + getPatient() + ", doctor=" + getDoctor() + ", diagnostic=" + getDiagnostic() + ", nurse=" + getNurse() + '}';
    }
    
    public void saveHistory ()
    {
        
    }

    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * @return the doctor
     */
    public ArrayList<Doctor> getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(ArrayList<Doctor> doctor) {
        this.doctor = doctor;
    }

    /**
     * @return the diagnostic
     */
    public Diagnostic getDiagnostic() {
        return diagnostic;
    }

    /**
     * @param diagnostic the diagnostic to set
     */
    public void setDiagnostic(Diagnostic diagnostic) {
        this.diagnostic = diagnostic;
    }

    /**
     * @return the nurse
     */
    public Nurse getNurse() {
        return nurse;
    }

    /**
     * @param nurse the nurse to set
     */
    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

}
