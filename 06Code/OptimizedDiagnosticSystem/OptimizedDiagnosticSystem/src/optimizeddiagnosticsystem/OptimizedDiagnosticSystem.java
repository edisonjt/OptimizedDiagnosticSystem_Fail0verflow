/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimizeddiagnosticsystem;
import ec.edu.espe.optimizeddiagnosticsystem.model.Menu;
import java.util.*;
import ec.edu.espe.optimizeddiagnosticsystem.model.Doctor;
import ec.edu.espe.optimizeddiagnosticsystem.model.Nurse;

/**
 *
 * @author Fail0verflow
 */
public class OptimizedDiagnosticSystem {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int option;
        
        do {
            System.out.println("===================================================");
            System.out.println("      Hi! Who will update the medical record?      ");
            System.out.println("1. Doctor");
            System.out.println("2. Nurse");
            System.out.println("3. Exit");
            System.out.println("===================================================");
            Scanner op = new Scanner(System.in);
            option = op.nextInt();
            
            if(option==1){
                
                Doctor doctor = new Doctor();
                doctor.registrer();
                
                Menu menu = new Menu();
                menu.menuList();
            }else if(option==2){
                Nurse nurse = new Nurse();
                nurse.registerPatient();
                
                Menu menu = new Menu();
                menu.menuList();
            }
                       
        } while (option != 3);                     
        
    }
    
}
