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
public class Cita {
    private int idcita, idtipocita, iddetallecita, idpaciente, idempleado;
    private String fechacita;

    public Cita() {
    }

    public Cita(int idcita, int idtipocita, int iddetallecita, int idpaciente, int idempleado, String fechacita) {
        this.idcita = idcita;
        this.idtipocita = idtipocita;
        this.iddetallecita = iddetallecita;
        this.idpaciente = idpaciente;
        this.idempleado = idempleado;
        this.fechacita = fechacita;
    }

    public int getIdcita() {
        return idcita;
    }

    public void setIdcita(int idcita) {
        this.idcita = idcita;
    }

    public int getIdtipocita() {
        return idtipocita;
    }

    public void setIdtipocita(int idtipocita) {
        this.idtipocita = idtipocita;
    }

    public int getIddetallecita() {
        return iddetallecita;
    }

    public void setIddetallecita(int iddetallecita) {
        this.iddetallecita = iddetallecita;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getFechacita() {
        return fechacita;
    }

    public void setFechacita(String fechacita) {
        this.fechacita = fechacita;
    }
    
}
