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

public class DNI extends Tipo_documento{
    
    private int iddni;
    private String dni;

    public DNI() {
    }

//    public DNI(int idtipopermiso) {
//        super(idtipopermiso);
//    }
    

    public DNI(int iddni, String dni, int idtipodocumento) {
        super(idtipodocumento);
        this.iddni = iddni;
        this.dni = dni;
    }

    public DNI(int iddni) {
        this.iddni = iddni;
    }
    
    
    
    

    
    
    public int getIddni() {
        return iddni;
    }

    public void setIddni(int iddni) {
        this.iddni = iddni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    

    
}

