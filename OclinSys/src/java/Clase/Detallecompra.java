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
public class Detallecompra {
    private int iddetallecompra,cantidadcompra,idcompra;
    private Number preciocompra;

    public Detallecompra() {
    }

    public Detallecompra(int iddetallecompra, int cantidadcompra, int idcompra, Number preciocompra) {
        this.iddetallecompra = iddetallecompra;
        this.cantidadcompra = cantidadcompra;
        this.idcompra = idcompra;
        this.preciocompra = preciocompra;
    }

    public int getIddetallecompra() {
        return iddetallecompra;
    }

    public void setIddetallecompra(int iddetallecompra) {
        this.iddetallecompra = iddetallecompra;
    }

    public int getCantidadcompra() {
        return cantidadcompra;
    }

    public void setCantidadcompra(int cantidadcompra) {
        this.cantidadcompra = cantidadcompra;
    }

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public Number getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(Number preciocompra) {
        this.preciocompra = preciocompra;
    }
    
    
    
}
