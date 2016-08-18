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
public class Otrospagos {
    
    private int idotrospagos;
    private String otrospagos;
    private Number valorpago;
    private int cantidadunidades;

    public Otrospagos() {
    }

    public Otrospagos(int idotrospagos, String otrospagos, Number valorpago, int cantidadunidades) {
        this.idotrospagos = idotrospagos;
        this.otrospagos = otrospagos;
        this.valorpago = valorpago;
        this.cantidadunidades = cantidadunidades;
    }

    public int getIdotrospagos() {
        return idotrospagos;
    }

    public void setIdotrospagos(int idotrospagos) {
        this.idotrospagos = idotrospagos;
    }

    public String getOtrospagos() {
        return otrospagos;
    }

    public void setOtrospagos(String otrospagos) {
        this.otrospagos = otrospagos;
    }

    public Number getValorpago() {
        return valorpago;
    }

    public void setValorpago(Number valorpago) {
        this.valorpago = valorpago;
    }

    public int getCantidadunidades() {
        return cantidadunidades;
    }

    public void setCantidadunidades(int cantidadunidades) {
        this.cantidadunidades = cantidadunidades;
    }
    
    
    
}
