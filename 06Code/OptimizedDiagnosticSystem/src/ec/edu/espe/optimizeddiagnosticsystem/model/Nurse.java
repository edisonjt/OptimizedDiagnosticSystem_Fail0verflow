/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

/**
 *
 * @author FailOverflow
 */
public class Nurse extends MedicalStaff {

    private String workShift;

    //CONSTRUCTORS
    public Nurse(String workShift, String titleCode, String password, String name, String homeAddress, String gender, String dateOfBirth, String emergencyNumber, boolean option) {
        super(titleCode, password, name, homeAddress, gender, dateOfBirth, emergencyNumber, option);
        this.workShift = workShift;
    }

    public Nurse(String name, String gender, String dateOfBirth) {
        super(name, gender, dateOfBirth);
    }

    public Nurse() { }

    //SETT AND GETT
    public void setWorkShift(String workShift) {
        this.workShift = workShift;
    }

    public String getWorkShift() {
        return workShift;
    }

}
