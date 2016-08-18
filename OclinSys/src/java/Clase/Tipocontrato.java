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
public class Tipocontrato {
    private int idtipocontrato;
    private String tipocontrato;

    public Tipocontrato() {
    }

    public Tipocontrato(int idtipocontrato, String tipocontrato) {
        this.idtipocontrato = idtipocontrato;
        this.tipocontrato = tipocontrato;
    }

    public Tipocontrato(int idtipocontrato) {
        this.idtipocontrato = idtipocontrato;
    }

    public int getIdtipocontrato() {
        return idtipocontrato;
    }

    public void setIdtipocontrato(int idtipocontrato) {
        this.idtipocontrato = idtipocontrato;
    }

    public String getTipocontrato() {
        return tipocontrato;
    }

    public void setTipocontrato(String tipocontrato) {
        this.tipocontrato = tipocontrato;
    }
    
    
    
}
