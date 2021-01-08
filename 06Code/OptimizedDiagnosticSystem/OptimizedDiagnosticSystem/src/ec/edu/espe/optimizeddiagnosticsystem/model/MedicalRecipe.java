/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.SimulatorofOptimizeddiagnosticsytem.model;

/**
 *
 * @author Fail0verflow
 */
public class MedicalRecipe {
    public String instructions;
    public String nameOfPacient;
    public String date;
    public String medications;

    /**
     * @return the instructions
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * @param instructions the instructions to set
     */
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * @return the nameOfPacient
     */
    public String getNameOfPacient() {
        return nameOfPacient;
    }

    /**
     * @param nameOfPacient the nameOfPacient to set
     */
    public void setNameOfPacient(String nameOfPacient) {
        this.nameOfPacient = nameOfPacient;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the medications
     */
    public String getMedications() {
        return medications;
    }

    /**
     * @param medications the medications to set
     */
    public void setMedications(String medications) {
        this.medications = medications;
    }
}
