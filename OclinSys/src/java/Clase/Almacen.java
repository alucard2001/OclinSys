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
public class Almacen {
    private int idalmacen,idespecificacion;
    private String almacen;

    public Almacen() {
    }

    public Almacen(int idalmacen, int idespecificacion, String almacen) {
        this.idalmacen = idalmacen;
        this.idespecificacion = idespecificacion;
        this.almacen = almacen;
    }

    public int getIdalmacen() {
        return idalmacen;
    }

    public void setIdalmacen(int idalmacen) {
        this.idalmacen = idalmacen;
    }

    public int getIdespecificacion() {
        return idespecificacion;
    }

    public void setIdespecificacion(int idespecificacion) {
        this.idespecificacion = idespecificacion;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }
    
    
}
