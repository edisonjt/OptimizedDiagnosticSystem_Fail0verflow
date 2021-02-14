/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagoticsystem.model;



import java.util.Scanner;

/**
 *
 * @author luist
 */
public class Doctor {

    private String name;
    private int age;
    private String speciality;
    private String subSpeciality;
    private String titleCode;
    private String gender;
    private boolean option;

    public Doctor() {
        
    }

    @Override
    public String toString() {
        return "Doctor{" + "name=" + name + ", age=" + age + ", speciality=" + speciality + ", subSpeciality=" + subSpeciality + ", titleCode=" + titleCode + ", gender=" + gender + '}';
    }


    

    public void registrer() {
        Scanner scan = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("*****Doctor's data*****");

        System.out.println("Title code: ");
        setTitleCode(scan.nextLine());

        System.out.println("Gender: ");
        setGender(scan.nextLine());

        System.out.println("Name: ");
        setName(scan.nextLine());

        System.out.println("Age: ");
        setAge(Integer.parseInt(scan.nextLine()));

        System.out.println("Sub Speciality : ");
        setSubSpeciality(scan.nextLine());

        System.out.println("Speciality : ");
        setSpeciality(scan.nextLine());

        System.out.println("Do you want to save? Please put True or False");
        setOption(scan.nextBoolean());
       
        
       
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSubSpeciality() {
        return subSpeciality;
    }

    public void setSubSpeciality(String subSpeciality) {
        this.subSpeciality = subSpeciality;
    }

    public String getTitleCode() {
        return titleCode;
    }

    public void setTitleCode(String titleCode) {
        this.titleCode = titleCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isOption() {
        return option;
    }

    public void setOption(boolean option) {
        this.option = option;
    }

}
