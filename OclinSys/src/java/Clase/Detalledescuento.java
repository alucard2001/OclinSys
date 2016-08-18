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
public class Detalledescuento {
    
    private int iddetalledescuento, iddescuento,idtipodescuento,idnomina;

    public Detalledescuento() {
    }

    public Detalledescuento(int iddetalledescuento, int iddescuento, int idtipodescuento, int idnomina) {
        this.iddetalledescuento = iddetalledescuento;
        this.iddescuento = iddescuento;
        this.idtipodescuento = idtipodescuento;
        this.idnomina = idnomina;
    }

    public int getIddetalledescuento() {
        return iddetalledescuento;
    }

    public void setIddetalledescuento(int iddetalledescuento) {
        this.iddetalledescuento = iddetalledescuento;
    }

    public int getIddescuento() {
        return iddescuento;
    }

    public void setIddescuento(int iddescuento) {
        this.iddescuento = iddescuento;
    }

    public int getIdtipodescuento() {
        return idtipodescuento;
    }

    public void setIdtipodescuento(int idtipodescuento) {
        this.idtipodescuento = idtipodescuento;
    }

    public int getIdnomina() {
        return idnomina;
    }

    public void setIdnomina(int idnomina) {
        this.idnomina = idnomina;
    }
    
    
}
