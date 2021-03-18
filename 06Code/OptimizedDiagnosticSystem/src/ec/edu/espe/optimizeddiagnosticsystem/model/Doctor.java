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
public class Doctor extends MedicalStaff {

    private String speciality;
    private String subSpeciality;

    //CONSTRUCTORS
    public Doctor(String speciality, String subSpeciality, String titleCode, String password, String name, String homeAddress, String gender, String dateOfBirth, String emergencyNumber, boolean option) {
        super(titleCode, password, name, homeAddress, gender, dateOfBirth, emergencyNumber, option);
        this.speciality = speciality;
        this.subSpeciality = subSpeciality;
    }

    public Doctor(String speciality, String subSpeciality, String titleCode, String name, String gender, String dateOfBirth) {
        super(name, gender, dateOfBirth);
        this.speciality = speciality;
        this.subSpeciality = subSpeciality;
    }

    public Doctor() { }

    //SETT AND GETT
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setSubSpeciality(String subSpeciality) {
        this.subSpeciality = subSpeciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getSubSpeciality() {
        return subSpeciality;
    }

}
