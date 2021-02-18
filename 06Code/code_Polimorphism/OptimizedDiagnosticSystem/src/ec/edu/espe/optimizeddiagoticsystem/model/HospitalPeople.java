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
public class HospitalPeople {

    private String surname;
    private String name;
    private int age;  
    private String homeAddress;
    private int emergencyNumber;
    private boolean option;

    //CONSTRUCTORS
    public HospitalPeople(String surname, String name, int age, String homeAddress, int emergencyNumber, boolean option) {
        this.surname = surname;
        this.name = name;
        this.age = age;        
        this.homeAddress = homeAddress;
        this.emergencyNumber = emergencyNumber;
        this.option = option;
    }

    public HospitalPeople() {
    }

    //METHODS
    public void register() {

     
                                              
    }
    
   //SETT AND GETT

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public void setAge(int age) {
        this.age = age;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setEmergencyNumber(int emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
    }

    public void setOption(boolean option) {
        this.option = option;
    }

    
    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
   

    public String getHomeAddress() {
        return homeAddress;
    }

    public int getEmergencyNumber() {
        return emergencyNumber;
    }

    public boolean isOption() {
        return option;
    }

   
}
