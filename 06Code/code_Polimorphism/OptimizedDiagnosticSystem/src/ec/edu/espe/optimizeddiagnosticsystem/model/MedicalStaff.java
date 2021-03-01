/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

/**
 *
 * @author luist
 */
public class MedicalStaff extends HospitalPeople {

    private String titleCode;
    private String password;

    //CONSTRUCTORS
    public MedicalStaff(String titleCode, String password, String surname, String name, int age, String homeAddress, String gender, String dateOfBirth, int emergencyNumber, boolean option) {
        super(surname, name, age, homeAddress, gender, dateOfBirth, emergencyNumber, option);
        this.titleCode = titleCode;
        this.password = password;
    }

    public MedicalStaff(String name, String gender, String dateOfBirth) {
        super(name, gender, dateOfBirth);
        this.titleCode = titleCode;
        this.password = password;
    }

    public MedicalStaff() {

    }

    //METHODS
    public void createPass(boolean option, String name) {

    }

    /**
     *
     * @param option
     */
    public void createPass(boolean option) {

    }

    //SETT AND GETT
    public void setTitleCode(String titleCode) {
        this.titleCode = titleCode;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitleCode() {
        return titleCode;
    }

    public String getPassword() {
        return password;
    }

}
