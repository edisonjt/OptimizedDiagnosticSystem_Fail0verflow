/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.controller;

/**
 *
 * @author luist
 */
public abstract class MedicalStaffController {

    public abstract void createPass(boolean option, String name);

    public abstract void savePassword(String name, String password);

    public abstract void read(String search);

}
