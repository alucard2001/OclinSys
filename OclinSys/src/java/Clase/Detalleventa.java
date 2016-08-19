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
public class Detalleventa {
    private int iddetalleventa,idventa,cantidadventa;
    private Number importe;

    public Detalleventa() {
    }

    public Detalleventa(int iddetalleventa, int idventa, int cantidadventa, Number importe) {
        this.iddetalleventa = iddetalleventa;
        this.idventa = idventa;
        this.cantidadventa = cantidadventa;
        this.importe = importe;
    }

    public int getIddetalleventa() {
        return iddetalleventa;
    }

    public void setIddetalleventa(int iddetalleventa) {
        this.iddetalleventa = iddetalleventa;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getCantidadventa() {
        return cantidadventa;
    }

    public void setCantidadventa(int cantidadventa) {
        this.cantidadventa = cantidadventa;
    }

    public Number getImporte() {
        return importe;
    }

    public void setImporte(Number importe) {
        this.importe = importe;
    }
    
    
}
