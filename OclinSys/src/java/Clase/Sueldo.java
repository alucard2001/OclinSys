/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author Tatiana Montilla
 */
public class Sueldo extends Contrato{
    
    private int idsueldo;
    private String sueldo;

    public Sueldo() {
    }

    public Sueldo(int idsueldo, String sueldo, int idtipocontrato) {
        super(idtipocontrato);
        this.idsueldo = idsueldo;
        this.sueldo = sueldo;
    }

    public int getIdsueldo() {
        return idsueldo;
    }

    public void setIdsueldo(int idsueldo) {
        this.idsueldo = idsueldo;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
