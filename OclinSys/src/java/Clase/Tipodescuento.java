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
public class Tipodescuento {
    private int idtipodescuento;
    private String tipodescuento;
    private Number descuento;

    public Tipodescuento() {
    }

    public Tipodescuento(int idtipodescuento, String tipodescuento, Number descuento) {
        this.idtipodescuento = idtipodescuento;
        this.tipodescuento = tipodescuento;
        this.descuento = descuento;
    }

    public int getIdtipodescuento() {
        return idtipodescuento;
    }

    public void setIdtipodescuento(int idtipodescuento) {
        this.idtipodescuento = idtipodescuento;
    }

    public String getTipodescuento() {
        return tipodescuento;
    }

    public void setTipodescuento(String tipodescuento) {
        this.tipodescuento = tipodescuento;
    }

    public Number getDescuento() {
        return descuento;
    }

    public void setDescuento(Number descuento) {
        this.descuento = descuento;
    }
    
    
    
}
