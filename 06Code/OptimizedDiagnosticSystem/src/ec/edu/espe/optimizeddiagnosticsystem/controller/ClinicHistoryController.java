/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import ec.edu.espe.optimizeddiagnosticsystem.model.Diagnostic;
import ec.edu.espe.optimizeddiagnosticsystem.model.Doctor;
import ec.edu.espe.optimizeddiagnosticsystem.model.Nurse;
import ec.edu.espe.optimizeddiagnosticsystem.model.Patient;
import ec.edu.espe.optimizeddiagnosticsystem.utils.MongoDBManager;

/**
 *
 * @author Fail0verflow
 */
public class ClinicHistoryController {

    MongoDBManager database = new MongoDBManager();
    
    public void read(String search) {
        DBCollection collection;
        collection = database.getDataBase().getCollection("Clinic History");

        BasicDBObject consultation = new BasicDBObject();
        consultation.put("id", search);

        DBCursor cursor = collection.find(consultation);

        while (cursor.hasNext()) {
            System.out.println("id: " + cursor.next().get("id"));
            System.out.println("Patient: " + cursor.curr().get("Patient"));
            System.out.println("Doctor: " + cursor.curr().get("Doctor"));
            System.out.println("Diagnostic: " + cursor.curr().get("Diagnostic"));
            System.out.println("Nurse: " + cursor.curr().get("Nurse"));
            
        }
    }
    
    public void update(String object, String id) {
        BasicDBObject document = new BasicDBObject();

        DBCollection collection;
        collection = database.getDataBase().getCollection("Clinic History");

        if (object.equalsIgnoreCase("Patient")) {
            Patient patient = new Patient();
            PatientController patientController = new PatientController();
            //patient.register();
            document = patientController.register(patient, "Clinic History");
        }

        if (object.equalsIgnoreCase("Doctor")) {
            Doctor doctor = new Doctor();
            DoctorController doctorController = new DoctorController();
            //doctor.register();
            document = doctorController.register(doctor, "Clinic History");
        }

        if (object.equalsIgnoreCase("Diagnostic")) {
            Diagnostic diagnostic = new Diagnostic();
            DiagnosticController diagnosticController = new DiagnosticController();
            //diagnostic.resgister();
            document = diagnosticController.register(diagnostic, "Clinic History");
        }

        if (object.equalsIgnoreCase("Nurse")) {
            Nurse nurse = new Nurse();
            NurseController nurseController = new NurseController();
            //nurse.register();
            document = nurseController.register(nurse, "Clinic History");
        }

        BasicDBObject update = new BasicDBObject();
        update.append("$set", document);

        BasicDBObject searchId = new BasicDBObject();
        searchId.append("id", id);

        collection.update(searchId, update);          
    }
    
    /*public void register(String user) {

        Patient patientClass = new Patient();
        BasicDBObject document = new BasicDBObject();
        Scanner scann = new Scanner(System.in);
        
        System.out.println("Ingrese el id: ");
        String id = scann.next();
        
        //dataBase.id(id);
       // patientClass.register();
        chooseNurse();
        addDoctor(user);
        addDiagnostic();
        
        //dataBase.dBPatient(patientClass, "Clinic History");

        dataBase.saveDatabase("Clinic History", document, "Clinic History");
    }

    @Override
    public String toString() {
        return "ClinicHistory{" + "patient=" + getPatient() + ", doctor=" + getDoctor() + ", diagnostic=" + getDiagnostic() + ", nurse=" + getNurse() + '}';
    }

    public void chooseNurse() {

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

        System.out.println("\n===================================== ");
        System.out.println("Added nurse: \n" + "Name: " + nameNurse + "\nAge: " + ageNurse + "\nGender:" + genderNurse);

        Nurse nurseClass = new Nurse(nameNurse, genderNurse, ageNurse);
        //dataBase.dBNurse(nurseClass, "Clinic History");

    }

    public void addDoctor(String user) {

        ArrayList doctors = new ArrayList();

        Scanner scan = new Scanner(System.in);

        int doctorControl = 1;

        while (doctorControl != 0) {

            System.out.println("===================================== ");
            System.out.println("===========The Doctor List ========== ");
            System.out.println("===================================== ");
            
            Data.printDoctor("doctors.csv");
            
            String chainDoctor = Data.find("doctors.csv", user);
            String[] splitDoctor = chainDoctor.split(",");
            String nameDoctor = splitDoctor[0];
            String titleDoctor = splitDoctor[1];
            String specialityDoctor = splitDoctor[2];
            String subSpDoctor = splitDoctor[3];
            String dateOfBirthDoctor = splitDoctor[4];
            String genderDoctor = splitDoctor[5];
            
            System.out.println("\n===================================== ");
            System.out.println("Added doctor: \n" + "Name: " + nameDoctor + "\nTitle Code: " + titleDoctor);
            
            Doctor doctorClass = new Doctor(specialityDoctor, subSpDoctor, titleDoctor, nameDoctor, genderDoctor, dateOfBirthDoctor);
           // dataBase.dBDoctor(doctorClass, "Clinic History");
            
            doctors.add(doctorClass);
            
            System.out.println("You need to add more doctors? please press 1 to add more or 0 to continue");
            doctorControl = Integer.parseInt(scan.nextLine());

            if (doctorControl == 1) {
                System.out.println("Please put the name of the doctor");
                user = scan.nextLine();
            }
        }

    }

    public void addDiagnostic() {

        ArrayList diagnostics = new ArrayList();

        Scanner scan = new Scanner(System.in);

        int diagnosticControl = 1;

        while (diagnosticControl != 0) {

            System.out.print("Write the CIE10 DIAGNOSTIC to search in the file:");
            String diagnosisCode = scan.nextLine();
            
            System.out.println("\n --- > The name to Find is " + diagnosisCode + "\n ");
            String diagnosisName = Data.find("cie-10.csv", diagnosisCode);
            System.out.println("|-------------------------------|");
            System.out.println("|" + diagnosisName + "|");
            System.out.println("|-------------------------------|");
            
            Diagnostic diagnosticClass = new Diagnostic();
            diagnosticClass.resgister();
            //dataBase.dBDiagnostic(diagnosticClass, "Clinic History");
            diagnostics.add(diagnosticClass);
            
            System.out.println("You need to add more diagnostics? please press 1 to add more or 0 to continue");
            diagnosticControl = Integer.parseInt(scan.nextLine());
        }

    }*/
}
