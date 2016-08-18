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
public class Tipocompra {
    private int idtipocompra;
    private String tipocompra;

    public Tipocompra() {
    }

    public Tipocompra(int idtipocompra, String tipocompra) {
        this.idtipocompra = idtipocompra;
        this.tipocompra = tipocompra;
    }

    public int getIdtipocompra() {
        return idtipocompra;
    }

    public void setIdtipocompra(int idtipocompra) {
        this.idtipocompra = idtipocompra;
    }

    public String getTipocompra() {
        return tipocompra;
    }

    public void setTipocompra(String tipocompra) {
        this.tipocompra = tipocompra;
    }
    
    
}
