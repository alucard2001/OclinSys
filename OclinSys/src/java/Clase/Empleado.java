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
public class Empleado extends Persona{
    private int idempleado,idcontrato;
    private String estadocivil;

    public Empleado() {
    }

    public Empleado(int idempleado, int idcontrato, String estadocivil, String sexo, String apellido, int idtipopermiso, int idtercero, int tipotercero, String nombretercero, int iddni, String dni, int idtipodocumento) {
        super(sexo, apellido, idtipopermiso, idtercero, tipotercero, nombretercero, iddni, dni, idtipodocumento);
        this.idempleado = idempleado;
        this.idcontrato = idcontrato;
        this.estadocivil = estadocivil;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public int getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(int idcontrato) {
        this.idcontrato = idcontrato;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }
    
    
    
    
    
}
