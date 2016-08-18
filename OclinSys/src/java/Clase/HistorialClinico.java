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
public class HistorialClinico {
    private int idhistorialclinico;
    private String observacion;

    public HistorialClinico() {
    }

    public HistorialClinico(int idhistorialclinico, String observacion) {
        this.idhistorialclinico = idhistorialclinico;
        this.observacion = observacion;
    }

    public HistorialClinico(int idhistorialclinico) {
        this.idhistorialclinico = idhistorialclinico;
    }

    public int getIdhistorialclinico() {
        return idhistorialclinico;
    }

    public void setIdhistorialclinico(int idhistorialclinico) {
        this.idhistorialclinico = idhistorialclinico;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    
    
}
