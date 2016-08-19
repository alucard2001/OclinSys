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
public class TipocomprobanteCF {
    private int idtipocomprobante;
    private String tipocomprobante;

    public TipocomprobanteCF() {
    }

    public TipocomprobanteCF(int idtipocomprobante, String tipocomprobante) {
        this.idtipocomprobante = idtipocomprobante;
        this.tipocomprobante = tipocomprobante;
    }

    public int getIdtipocomprobante() {
        return idtipocomprobante;
    }

    public void setIdtipocomprobante(int idtipocomprobante) {
        this.idtipocomprobante = idtipocomprobante;
    }

    public String getTipocomprobante() {
        return tipocomprobante;
    }

    public void setTipocomprobante(String tipocomprobante) {
        this.tipocomprobante = tipocomprobante;
    }
    
}
