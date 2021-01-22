/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;


import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ec.edu.espe.optimizeddiagnosticsystem.model.Doctor;
import java.util.Iterator;

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
    }

    public Patient registerP() {
        Patient patient = new Patient();
        patient.register();

        return patient;
    }

    public Doctor registerD() {
        Scanner scan = new Scanner(System.in);
        Doctor doctor = new Doctor();
        doctor.registrer();
        String dataToSave = doctor.getName() + "," + doctor.getTitleCode() + "," + doctor.getSpeciality()
                + "," + doctor.getSubSpeciality() + "," + doctor.getAge() + "," + doctor.getGender() + "\n";
        Data.save("doctors.csv", dataToSave, true);
        System.out.println("Enter the new password");
        String pass = scan.nextLine();
        String userToSave = doctor.getName() + "," + pass;
        Data.save("users.csv", userToSave, true);
        return doctor;
    }

    public Nurse registerN() {
        Nurse nurse = new Nurse();
        nurse.register();
        String dataToSave = nurse.getName() + "," + nurse.getAge() + "," + nurse.getGender() + "\n";
        Data.save("nurse.csv", dataToSave, true);
        return nurse;

    }

    public Diagnostic diagnostic() {
        Diagnostic diagnostic = new Diagnostic();
        return diagnostic;
    }

    public Boolean login(String pass) {
        Boolean validate = false;
        if (Data.find("pass.csv", pass).equalsIgnoreCase(pass)) {
            validate = true;
        } else {
            validate = false;
        }

        return validate;
    }

    public Boolean loginHistoryUpdater(String user, String pass) {
        Boolean validate = false;
        String cadena = Data.find("users.csv", user);
        String[] split = cadena.split(",");
        String p1 = split[0];
        String p2 = split[1];
        if (p1.equalsIgnoreCase(user)) {
            System.out.println("The user exist");
            if (p1.equalsIgnoreCase(user) && p2.equalsIgnoreCase(pass)) {
                validate = true;
                System.out.println("The password is correct!");
            }

        } else {
            validate = false;
            System.out.println("The password isn't correct, please try again! ");
        }

        return validate;
    }

    public void clinicHistoryRegister(String user) {
        int doctorControl = 1;
        Patient patient = new Patient();
        List doctors ;
        doctors = new ArrayList();
        Scanner scan = new Scanner(System.in);
        patient.register();
        System.out.println("===================================== ");
        System.out.println("===========The Nurse List ========== ");
        System.out.println("===================================== ");
        Data.printN("nurse.csv");
        System.out.println("Enter the name and last name of the nurse in charge of the patient");
        String nurseN = scan.nextLine();
        String chainN = Data.find("nurse.csv", nurseN);
        String[] splitN = chainN.split(",");
        String nameN = splitN[0];
        String ageN = splitN[1];
        String gN = splitN[2];
        System.out.println("" + nameN + "" + ageN + "" + gN);
        Nurse nurse = new Nurse(nameN, Integer.parseInt(ageN), gN);
        while (doctorControl != 0) {
            System.out.println("===================================== ");
            System.out.println("===========The Doctor List ========== ");
            System.out.println("===================================== ");
            Data.printD("doctors.csv");
            String chainD = Data.find("doctors.csv", user);
            System.out.println("Added doctor: " + chainD);
            String[] splitD = chainD.split(",");
            String nameD = splitD[0];
            String title = splitD[1];
            String spec = splitD[2];
            String subSpec = splitD[3];
            String age = splitD[4];
            String gender = splitD[5];
            Doctor doctor = new Doctor(nameD, Integer.parseInt(age), spec, subSpec, title, gender);
            doctors.add(doctor);
            System.out.println("You need to add more doctors? please press 1 to add more or 0 to continue");
            doctorControl= Integer.parseInt(scan.nextLine());
            if(doctorControl==1)
            {
                System.out.println("Please put the name of the doctor");
                user= scan.nextLine();
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
        ClinicHistory clinicHistory = new ClinicHistory(patient, (Doctor) doctors.get(0), diagnostic, nurse);
        Gson gson = new Gson();
        String jsonClinicHistory;
        String jsonDoctors= gson.toJson(doctors.get(0));

        //serialization
        
        for(int i=1; i<doctors.size();i++)
        {
            jsonDoctors = jsonDoctors + gson.toJson(doctors.get(i));
        }
        jsonClinicHistory = gson.toJson(clinicHistory)+jsonDoctors;
        System.out.println("Patient register --> " + jsonClinicHistory);
        Data.save("clinicHistory.json", jsonClinicHistory, true);
        
    }

}
