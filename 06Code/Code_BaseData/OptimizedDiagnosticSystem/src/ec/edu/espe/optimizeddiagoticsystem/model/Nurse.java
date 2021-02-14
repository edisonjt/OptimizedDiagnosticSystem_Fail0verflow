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
public class Nurse {

    private String surname;
    private String name;
    private int age;
    private String gender;
    private long cellphone;
    private String turn;
    private String homeaddress;
    private boolean option;

    public void register() {
        Scanner scan = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("*****Nurse's data*****");

        System.out.println("Surname");
        setSurname(scan.nextLine());

        System.out.println("Name");
        setName(scan.nextLine());

        System.out.println("Age");
       setAge(Integer.parseInt(scan.nextLine()));

        System.out.println("Gender ");
        setGender(scan.nextLine());

        System.out.println("Cell Phone");
        setCellphone(Integer.parseInt(scan.nextLine()));

        System.out.println("Home Address");
        setHomeaddress(scan.nextLine());

        System.out.println("Turn");
        setTurn(scan.nextLine());

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getCellphone() {
        return cellphone;
    }

    public void setCellphone(long cellphone) {
        this.cellphone = cellphone;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }

}
