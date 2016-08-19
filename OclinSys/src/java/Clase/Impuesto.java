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
public class Impuesto {
    private int idimpuesto,iddetalleventa;
    private Number impuesto;

    public Impuesto() {
    }

    public Impuesto(int idimpuesto, int iddetalleventa, Number impuesto) {
        this.idimpuesto = idimpuesto;
        this.iddetalleventa = iddetalleventa;
        this.impuesto = impuesto;
    }

    public int getIdimpuesto() {
        return idimpuesto;
    }

    public void setIdimpuesto(int idimpuesto) {
        this.idimpuesto = idimpuesto;
    }

    public int getIddetalleventa() {
        return iddetalleventa;
    }

    public void setIddetalleventa(int iddetalleventa) {
        this.iddetalleventa = iddetalleventa;
    }

    public Number getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Number impuesto) {
        this.impuesto = impuesto;
    }
    
}
