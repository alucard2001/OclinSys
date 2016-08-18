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
public class Contacto {
    
   private int idcontacto;
   private int idtercero;
   private int idalmacen;

    public Contacto() {
    }

    public Contacto(int idcontacto, int idtercero, int idalmacen) {
        this.idcontacto = idcontacto;
        this.idtercero = idtercero;
        this.idalmacen = idalmacen;
    }

    public int getIdcontacto() {
        return idcontacto;
    }

    public void setIdcontacto(int idcontacto) {
        this.idcontacto = idcontacto;
    }

    public int getIdtercero() {
        return idtercero;
    }

    public void setIdtercero(int idtercero) {
        this.idtercero = idtercero;
    }

    public int getIdalmacen() {
        return idalmacen;
    }

    public void setIdalmacen(int idalmacen) {
        this.idalmacen = idalmacen;
    }
   
    
}
