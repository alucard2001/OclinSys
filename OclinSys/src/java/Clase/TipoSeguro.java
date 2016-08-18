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
public class TipoSeguro {
    private int idtiposeguro;
    private String tiposeguro;

    public TipoSeguro() {
    }

    public TipoSeguro(int idtiposeguro, String tiposeguro) {
        this.idtiposeguro = idtiposeguro;
        this.tiposeguro = tiposeguro;
    }

    public TipoSeguro(int idtiposeguro) {
        this.idtiposeguro = idtiposeguro;
    }

    public int getIdtiposeguro() {
        return idtiposeguro;
    }

    public void setIdtiposeguro(int idtiposeguro) {
        this.idtiposeguro = idtiposeguro;
    }

    public String getTiposeguro() {
        return tiposeguro;
    }

    public void setTiposeguro(String tiposeguro) {
        this.tiposeguro = tiposeguro;
    }
    
    
}
