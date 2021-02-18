/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagoticsystem.model;





/**
 *
 * @author luist
 */
public class MedicalStaff extends HospitalPeople {

    private String titleCode;
    private String password;

    //CONSTRUCTORS
    public MedicalStaff(String titleCode, String surname, String name, int age, String homeAddress, int emergencyNumber, boolean option) {
        super(surname, name, age, homeAddress, emergencyNumber, option);
        this.titleCode = titleCode;
    }

    public MedicalStaff() {

    }

    //METHODS
    public void createPass(boolean option) {
        
       
    }
    
 //SETT AND GETT
    public void setTitleCode(String titleCode) {
        this.titleCode = titleCode;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
