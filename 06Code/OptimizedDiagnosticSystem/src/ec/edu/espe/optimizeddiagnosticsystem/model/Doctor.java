/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.optimizeddiagnosticsystem.utils.Database;
import java.util.*;

/**
 *
 * @author Fail0verflow
 */
public class Doctor extends HospitalPeople {

    private String speciality;
    private String subSpeciality;
    private String titleCode;
    private boolean option;
    private String password;

    public Doctor(String speciality, String subSpeciality, String titleCode, String name, String gender, String dateOfBirth) {
        super(name, gender, dateOfBirth);
        this.speciality = speciality;
        this.subSpeciality = subSpeciality;
        this.titleCode = titleCode;
    }

    public Doctor() {

    }

    @Override
    public void register() {
        Database database = new Database();
        Scanner scan = new Scanner(System.in);

        System.out.println("\n=======================================");
        System.out.println("*****Doctor's data*****");

        super.register();

        System.out.println("Title code: ");
        setTitleCode(scan.nextLine());

        System.out.println("Sub Speciality : ");
        setSubSpeciality(scan.nextLine());

        System.out.println("Speciality : ");
        setSpeciality(scan.nextLine());

        System.out.println("Do you want to save? Please put True or False");
        setOption(scan.nextBoolean());

        String dataToSave = getName() + "," + getTitleCode() + "," + getSpeciality()
                + "," + getSubSpeciality() + "," + getDateOfBirth() + "," + getGender() + "\n";

        Data.save("doctors.csv", dataToSave, isOption());

        if (isOption()) {
            
            System.out.println("Enter the new password");
            setPassword(scan.next());
            String userToSave = getName() + ", " + getPassword() + "\n";
            database.dbUsersPassword(getName(), getPassword());
            
            Data.save("users.csv", userToSave, true);
        }
    }

    @Override
    public String toString() {
        return "Doctor{" + "name=" + getName() + ", age="
                + getDateOfBirth() + ", speciality=" + speciality
                + ", subSpeciality=" + subSpeciality + ", titleCode="
                + titleCode + ", gender=" + getGender() + '}';
    }

    String takeExams(ClinicHistory clinicHistory) {

        return ("0");
    }

    void performDiagnostic(Diagnostic diagnostic) {

    }

    void showData() {

    }

    void updateMedicalHistory(ClinicHistory clinicHistory) {

    }

    /**
     * @return the speciality
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * @param speciality the speciality to set
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * @return the subSpeciality
     */
    public String getSubSpeciality() {
        return subSpeciality;
    }

    /**
     * @param subSpeciality the subSpeciality to set
     */
    public void setSubSpeciality(String subSpeciality) {
        this.subSpeciality = subSpeciality;
    }

    /**
     * @return the titleCode
     */
    public String getTitleCode() {
        return titleCode;
    }

    /**
     * @param titleCode the titleCode to set
     */
    public void setTitleCode(String titleCode) {
        this.titleCode = titleCode;
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

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
