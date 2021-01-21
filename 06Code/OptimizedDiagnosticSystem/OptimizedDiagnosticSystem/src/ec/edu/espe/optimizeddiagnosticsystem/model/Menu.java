/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import java.util.Scanner;

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

    @Override
    public String toString() {
        return "Menu{" + "option=" + getOption() + ", name=" + getName() + ", option2=" + getOption2() + '}';
    }

    public void menuList() {

        do {
            System.out.println("===================================================");
            System.out.println("       Hi! Choose the option you want to do...     ");
            System.out.println("1. New patient (recommended)");
            System.out.println("2. Old patient ");
            System.out.println("3. Exit ");
            System.out.println("===================================================");
            Scanner op = new Scanner(System.in);
            option = op.nextInt();

            if (option == 1) {
                Patient regpatient = new Patient();
                regpatient.register();

                Patient patient = new Patient(regpatient.getName(), regpatient.getAge(), regpatient.getWeight(), regpatient.getHeight(), regpatient.getBloodType(), regpatient.getAllergies(), regpatient.getGender(), regpatient.getEmergencyContact(), regpatient.getIdentificationCard());
                Gson gson = new Gson();
                String jsonPatient;

                //serialization
                jsonPatient = gson.toJson(patient);
                System.out.println("Patiente register --> " + jsonPatient);
                Data.save("Patients.json", jsonPatient, regpatient.isOption());

            } else if (option == 2) {
                while (option2 != 3) {

                    System.out.println("===================================================");
                    System.out.println("1. Perform diagnosis ");
                    System.out.println("2. Make a prescription ");
                    System.out.println("3. Exit");
                    option2 = op.nextInt();

                    if (option2 == 1) {
                        Doctor doctor = new Doctor();
                        doctor.registrer();

                        Diagnostic diagnostic = new Diagnostic();

                        Scanner keyboard = new Scanner(System.in);
                        System.out.print("Write the word to search in the file:");
                        String data = keyboard.nextLine();
                        System.out.println("\n --- > The name to Find is " + data + "\n ");
                        String nameP = Data.find("cie-10.csv", data);
                        System.out.println("|-------------------------------|");
                        System.out.println("|" + nameP + "|");
                        System.out.println("|-------------------------------|");
                        diagnostic.resgister();

                    } else if (option2 == 2) {
                        MedicalRecipe medicalrecipe = new MedicalRecipe();
                    }
                }
            }
        } while (option != 3);

    }

    /**
     * @return the option
     */
    public int getOption() {
        return option;
    }

    /**
     * @param option the option to set
     */
    public void setOption(int option) {
        this.option = option;
    }

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
     * @return the option2
     */
    public int getOption2() {
        return option2;
    }

    /**
     * @param option2 the option2 to set
     */
    public void setOption2(int option2) {
        this.option2 = option2;
    }

}
