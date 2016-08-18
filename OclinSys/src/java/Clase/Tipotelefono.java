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
public class Tipotelefono {
    private int idtipotelefono;
    private String tipotelefono;

    public Tipotelefono() {
    }

    public Tipotelefono(int idtipotelefono, String tipotelefono) {
        this.idtipotelefono = idtipotelefono;
        this.tipotelefono = tipotelefono;
    }

    public int getIdtipotelefono() {
        return idtipotelefono;
    }

    public void setIdtipotelefono(int idtipotelefono) {
        this.idtipotelefono = idtipotelefono;
    }

    public String getTipotelefono() {
        return tipotelefono;
    }

    public void setTipotelefono(String tipotelefono) {
        this.tipotelefono = tipotelefono;
    }
    
    
    
}
