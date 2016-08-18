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
public class Descuento {
    
    private int iddescuento;
    private int montodescuento;
    private String fechadescuento;

    public Descuento() {
    }

    public Descuento(int iddescuento, int montodescuento, String fechadescuento) {
        this.iddescuento = iddescuento;
        this.montodescuento = montodescuento;
        this.fechadescuento = fechadescuento;
    }

    public int getIddescuento() {
        return iddescuento;
    }

    public void setIddescuento(int iddescuento) {
        this.iddescuento = iddescuento;
    }

    public int getMontodescuento() {
        return montodescuento;
    }

    public void setMontodescuento(int montodescuento) {
        this.montodescuento = montodescuento;
    }

    public String getFechadescuento() {
        return fechadescuento;
    }

    public void setFechadescuento(String fechadescuento) {
        this.fechadescuento = fechadescuento;
    }
    
    
}
