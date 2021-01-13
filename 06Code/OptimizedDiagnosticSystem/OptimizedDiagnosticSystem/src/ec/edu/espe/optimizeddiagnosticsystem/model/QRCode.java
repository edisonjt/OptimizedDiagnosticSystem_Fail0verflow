/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.model;

/**
 *
 * @author Fail0verflow
 */
public class QRCode {

    int codigo;

    public QRCode() {
    }

    public QRCode(int codigo) {
        this.codigo = codigo;
    }
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   
    
}
