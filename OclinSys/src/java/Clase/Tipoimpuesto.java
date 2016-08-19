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
public class Tipoimpuesto {
    private int idtipoimpuesto,idimpuesto;
    private String tipoimpuesto;

    public Tipoimpuesto() {
    }

    public Tipoimpuesto(int idtipoimpuesto, int idimpuesto, String tipoimpuesto) {
        this.idtipoimpuesto = idtipoimpuesto;
        this.idimpuesto = idimpuesto;
        this.tipoimpuesto = tipoimpuesto;
    }

    public int getIdtipoimpuesto() {
        return idtipoimpuesto;
    }

    public void setIdtipoimpuesto(int idtipoimpuesto) {
        this.idtipoimpuesto = idtipoimpuesto;
    }

    public int getIdimpuesto() {
        return idimpuesto;
    }

    public void setIdimpuesto(int idimpuesto) {
        this.idimpuesto = idimpuesto;
    }

    public String getTipoimpuesto() {
        return tipoimpuesto;
    }

    public void setTipoimpuesto(String tipoimpuesto) {
        this.tipoimpuesto = tipoimpuesto;
    }

   
    
}
