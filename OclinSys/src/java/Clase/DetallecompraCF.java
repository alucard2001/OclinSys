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
public class DetallecompraCF {
    private int iddetallecompracf,cantidadcf,idcompracf,idserie,idsecuencia,idareaimpresion,idtipocomprobante;
    private String secuencia;

    public DetallecompraCF() {
    }

    public DetallecompraCF(int iddetallecompracf, int cantidadcf, int idcompracf, int idserie, int idsecuencia, int idareaimpresion, int idtipocomprobante, String secuencia) {
        this.iddetallecompracf = iddetallecompracf;
        this.cantidadcf = cantidadcf;
        this.idcompracf = idcompracf;
        this.idserie = idserie;
        this.idsecuencia = idsecuencia;
        this.idareaimpresion = idareaimpresion;
        this.idtipocomprobante = idtipocomprobante;
        this.secuencia = secuencia;
    }

    public int getIddetallecompracf() {
        return iddetallecompracf;
    }

    public void setIddetallecompracf(int iddetallecompracf) {
        this.iddetallecompracf = iddetallecompracf;
    }

    public int getCantidadcf() {
        return cantidadcf;
    }

    public void setCantidadcf(int cantidadcf) {
        this.cantidadcf = cantidadcf;
    }

    public int getIdcompracf() {
        return idcompracf;
    }

    public void setIdcompracf(int idcompracf) {
        this.idcompracf = idcompracf;
    }

    public int getIdserie() {
        return idserie;
    }

    public void setIdserie(int idserie) {
        this.idserie = idserie;
    }

    public int getIdsecuencia() {
        return idsecuencia;
    }

    public void setIdsecuencia(int idsecuencia) {
        this.idsecuencia = idsecuencia;
    }

    public int getIdareaimpresion() {
        return idareaimpresion;
    }

    public void setIdareaimpresion(int idareaimpresion) {
        this.idareaimpresion = idareaimpresion;
    }

    public int getIdtipocomprobante() {
        return idtipocomprobante;
    }

    public void setIdtipocomprobante(int idtipocomprobante) {
        this.idtipocomprobante = idtipocomprobante;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }
    
}
