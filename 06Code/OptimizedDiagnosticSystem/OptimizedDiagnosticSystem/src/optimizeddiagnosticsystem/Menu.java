/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimizeddiagnosticsystem;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.optimizeddiagnosticsystem.model.ClinicHistory;
import ec.edu.espe.optimizeddiagnosticsystem.model.Diagnostic;
import ec.edu.espe.optimizeddiagnosticsystem.model.Doctor;
import ec.edu.espe.optimizeddiagnosticsystem.model.Nurse;
import ec.edu.espe.optimizeddiagnosticsystem.model.Patient;
import java.util.*;

/**
 *
 * @author Fail0verflow
 */
public class Menu {

    private int option;
    private String name;
    private int option2;

    public Menu() {

    }

    public void options1() {
        System.out.println("1.-Personnel registration");
        System.out.println("2.-Clinical histories");
        System.out.println("3.- Exit");

    }

    public void optionsRegister() {
        System.out.println("1. Register a new doctor");
        System.out.println("2. Register a new nurse");
        System.out.println("3.- Exit");
    }

    public Doctor registerDoctor() {

        Scanner scan = new Scanner(System.in);

        Doctor doctor = new Doctor();
        doctor.registrer();

        String dataToSave = doctor.getName() + "," + doctor.getTitleCode() + "," + doctor.getSpeciality()
                + "," + doctor.getSubSpeciality() + "," + doctor.getAge() + "," + doctor.getGender() + "\n";
        Data.save("doctors.csv", dataToSave, doctor.isOption());
        if (doctor.isOption()) {
            System.out.println("Enter the new password");
            String pass = scan.nextLine();
            String userToSave = doctor.getName() + "," + pass;
            Data.save("users.csv", userToSave, true);
        }

        return doctor;
    }

    public Nurse registerNurse() {

        Nurse nurse = new Nurse();
        nurse.register();

        String dataToSave = nurse.getName() + "," + nurse.getAge() + "," + nurse.getGender() + "\n";
        Data.save("nurse.csv", dataToSave, nurse.isOption());

        return nurse;
    }

    public boolean login(String pass) {
        boolean validate = false;
        if (Data.find("pass.csv", pass).equalsIgnoreCase(pass)) {
            validate = true;
        }

        return validate;
    }

    public boolean loginHistoryUpdater(String user, String pass) {
        boolean validate = false;

        String chain = Data.find("users.csv", user);

        String[] split = chain.split(",");
        String p1 = split[0];

        if (p1.equalsIgnoreCase(user)) {
            String p2 = split[1];
            if (p1.equalsIgnoreCase(user) && p2.equalsIgnoreCase(pass)) {
                validate = true;
            }
        }

        return validate;
    }

    public void clinicHistoryRegister(String user) {
        int doctorContro = 1;

        Patient patient = new Patient();
        patient.register();

        List doctors;
        doctors = new ArrayList();

        List diagnostics;
        diagnostics = new ArrayList();

        Scanner scan = new Scanner(System.in);

        System.out.println("===================================== ");
        System.out.println("===========The Nurse List ========== ");
        System.out.println("===================================== ");
        Data.printN("nurse.csv");
        System.out.println("Enter the name and last name of the nurse in charge of the patient");
        String nurseName = scan.nextLine();
        String chainNurse = Data.find("nurse.csv", nurseName);
        String[] splitNurse = chainNurse.split(",");
        String nameNurse = splitNurse[0];
        String ageNurse = splitNurse[1];
        String genderNurse = splitNurse[2];
        System.out.println("" + nameNurse + "" + ageNurse + "" + genderNurse);
        Nurse nurse = new Nurse(nameNurse, Integer.parseInt(ageNurse), genderNurse);

        while (doctorContro != 0) {

            System.out.println("===================================== ");
            System.out.println("===========The Doctor List ========== ");
            System.out.println("===================================== ");
            Data.printD("doctors.csv");
            String chainDoctor = Data.find("doctors.csv", user);
            System.out.println("Added doctor: " + chainDoctor);
            String[] splitDoctor = chainDoctor.split(",");
            String nameDoctor = splitDoctor[0];
            String titleDoctor = splitDoctor[1];
            String espDoctor = splitDoctor[2];
            String subEspDoctor = splitDoctor[3];
            String ageDoctor = splitDoctor[4];
            String genderDoctor = splitDoctor[5];
            Doctor doctor = new Doctor(nameDoctor, Integer.parseInt(ageDoctor), espDoctor, subEspDoctor, titleDoctor, genderDoctor);
            doctors.add(doctor);
            System.out.println("You need to add more doctors? please press 1 to add more or 0 to continue");
            doctorContro = Integer.parseInt(scan.nextLine());

            if (doctorContro == 1) {
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
        Diagnostic diagnostic = new Diagnostic();
        diagnostic.resgister();
        diagnostics.add(diagnostic);

        Gson gson = new Gson();
        String jsonClinicHistory;

        ClinicHistory clinicHistory = new ClinicHistory(patient, (ArrayList<Doctor>) doctors, (ArrayList<Diagnostic>) diagnostics, nurse);

        //serialization
        jsonClinicHistory = gson.toJson(clinicHistory);
        System.out.println("Patient register --> " + jsonClinicHistory);
        Data.save("clinicHistory.json", jsonClinicHistory + "\n", true);

    }

}
