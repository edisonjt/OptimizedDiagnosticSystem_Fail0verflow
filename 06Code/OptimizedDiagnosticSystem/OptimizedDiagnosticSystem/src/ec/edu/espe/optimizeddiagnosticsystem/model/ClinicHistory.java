/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import java.util.*;

/**
 *
 * @author Fail0verflow
 */
public class ClinicHistory {

    private Patient patient;
    private ArrayList<Doctor> doctor = new ArrayList();
    private ArrayList<Diagnostic> diagnostic = new ArrayList();
    private Nurse nurse;

    public ClinicHistory(Patient patient, ArrayList<Doctor> doctor, ArrayList<Diagnostic> diagnostic, Nurse nurse) {
        this.patient = patient;
        this.doctor = doctor;
        this.diagnostic = diagnostic;
        this.nurse = nurse;
    }

    public ClinicHistory() {
    }

    public void register(String user) {
        int doctorControl = 1;

        Patient patientClass = new Patient();
        patientClass.register();

        List doctors;
        doctors = new ArrayList();

        List diagnostics;
        diagnostics = new ArrayList();

        Scanner scan = new Scanner(System.in);

        System.out.println("===================================== ");
        System.out.println("===========The Nurse List ========== ");
        System.out.println("===================================== ");
        Data.printNurse("nurse.csv");
        System.out.println("Enter the name and last name of the nurse in charge of the patient");
        String nurseName = scan.nextLine();
        String chainNurse = Data.find("nurse.csv", nurseName);
        String[] splitNurse = chainNurse.split(",");
        String nameNurse = splitNurse[0];
        String ageNurse = splitNurse[1];
        String genderNurse = splitNurse[2];
        System.out.println("Name: " + nameNurse + ", Age: " + ageNurse + ", Gender:" + genderNurse);
        Nurse nurseClass = new Nurse(nameNurse, Integer.parseInt(ageNurse), genderNurse);

        while (doctorControl != 0) {

            System.out.println("===================================== ");
            System.out.println("===========The Doctor List ========== ");
            System.out.println("===================================== ");
            Data.printDoctor("doctors.csv");
            String chainDoctor = Data.find("doctors.csv", user);
            System.out.println("Added doctor: " + chainDoctor);
            String[] splitDoctor = chainDoctor.split(",");
            String nameDoctor = splitDoctor[0];
            String titleDoctor = splitDoctor[1];
            String espDoctor = splitDoctor[2];
            String subEspDoctor = splitDoctor[3];
            String ageDoctor = splitDoctor[4];
            String genderDoctor = splitDoctor[5];
            Doctor doctorClass = new Doctor(nameDoctor, Integer.parseInt(ageDoctor), espDoctor, subEspDoctor, titleDoctor, genderDoctor);
            doctors.add(doctorClass);
            System.out.println("You need to add more doctors? please press 1 to add more or 0 to continue");
            doctorControl = Integer.parseInt(scan.nextLine());

            if (doctorControl == 1) {
                System.out.println("Please put the name of the doctor");
                user = scan.nextLine();
            }
        }

        System.out.print("Write the CIE10 DIAGNOSTIC to search in the file:");
        String data = scan.nextLine();
        System.out.println("\n --- > The name to Find is " + data + "\n ");
        String nameP = Data.find("cie-10.csv", data);
        System.out.println("|-------------------------------|");
        System.out.println("|" + nameP + "|");
        System.out.println("|-------------------------------|");
        Diagnostic diagnosticClass = new Diagnostic();
        diagnosticClass.resgister();
        diagnostics.add(diagnosticClass);
        
        Gson gson = new Gson();
        String jsonClinicHistory;

        ClinicHistory clinicHistory = new ClinicHistory(patientClass, (ArrayList<Doctor>) doctors, (ArrayList<Diagnostic>) diagnostics, nurseClass);

        //serialization
        jsonClinicHistory = gson.toJson(clinicHistory);
        System.out.println("Patient register --> " + jsonClinicHistory);
        Data.save("clinicHistory.json", jsonClinicHistory + "\n", true);
    }

    @Override
    public String toString() {
        return "ClinicHistory{" + "patient=" + getPatient() + ", doctor=" + getDoctor() + ", diagnostic=" + getDiagnostic() + ", nurse=" + getNurse() + '}';
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
    public ArrayList<Diagnostic> getDiagnostic() {
        return diagnostic;
    }

    /**
     * @param diagnostic the diagnostic to set
     */
    public void setDiagnostic(ArrayList<Diagnostic> diagnostic) {
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
