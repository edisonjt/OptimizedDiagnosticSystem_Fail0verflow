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
public class ClinicHistory {

    private Patient patient;
    private Doctor doctor;
    private Diagnostic diagnostic;
    private Nurse nurse;

    public ClinicHistory(Patient patient, Doctor doctor, Diagnostic diagnostic, Nurse nurse) {
        this.patient = patient;
        this.doctor = doctor;
        this.diagnostic = diagnostic;
        this.nurse = nurse;
    }

    public ClinicHistory() {
    }

    @Override
    public String toString() {
        return "ClinicHistory{" + "patient=" + patient + ", doctor=" + doctor + ", diagnostic=" + diagnostic + ", nurse=" + nurse + '}';
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
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(Doctor doctor) {
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
