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
public class Medication {
    public String name;
    public String composition;
    public float concentration;
    public String administrationMode;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the composition
     */
    public String getComposition() {
        return composition;
    }

    /**
     * @param composition the composition to set
     */
    public void setComposition(String composition) {
        this.composition = composition;
    }

    /**
     * @return the concentration
     */
    public float getConcentration() {
        return concentration;
    }

    /**
     * @param concentration the concentration to set
     */
    public void setConcentration(float concentration) {
        this.concentration = concentration;
    }

    /**
     * @return the administrationMode
     */
    public String getAdministrationMode() {
        return administrationMode;
    }

    /**
     * @param administrationMode the administrationMode to set
     */
    public void setAdministrationMode(String administrationMode) {
        this.administrationMode = administrationMode;
    }
}
