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
public class Venta {
    private int idventa, idtipoventa,idempleado,idpaciente;
    private String fechavent;
   private Number montoventa;

    public Venta() {
    }

    public Venta(int idventa, int idtipoventa, int idempleado, int idpaciente, String fechavent, Number montoventa) {
        this.idventa = idventa;
        this.idtipoventa = idtipoventa;
        this.idempleado = idempleado;
        this.idpaciente = idpaciente;
        this.fechavent = fechavent;
        this.montoventa = montoventa;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdtipoventa() {
        return idtipoventa;
    }

    public void setIdtipoventa(int idtipoventa) {
        this.idtipoventa = idtipoventa;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getFechavent() {
        return fechavent;
    }

    public void setFechavent(String fechavent) {
        this.fechavent = fechavent;
    }

    public Number getMontoventa() {
        return montoventa;
    }

    public void setMontoventa(Number montoventa) {
        this.montoventa = montoventa;
    }
   
   
}
