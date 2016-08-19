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
public class NCF {
    private int iddetallecompracf,cantidadcf,idcompracf,idseriecf,idsecuencia,idareaimprecion,idtipocomprobante,idncf,idventa;
    private String secuencia_i;

    public NCF() {
    }

    public NCF(int iddetallecompracf, int cantidadcf, int idcompracf, int idseriecf, int idsecuencia, int idareaimprecion, int idtipocomprobante, int idncf, int idventa, String secuencia_i) {
        this.iddetallecompracf = iddetallecompracf;
        this.cantidadcf = cantidadcf;
        this.idcompracf = idcompracf;
        this.idseriecf = idseriecf;
        this.idsecuencia = idsecuencia;
        this.idareaimprecion = idareaimprecion;
        this.idtipocomprobante = idtipocomprobante;
        this.idncf = idncf;
        this.idventa = idventa;
        this.secuencia_i = secuencia_i;
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

    public int getIdseriecf() {
        return idseriecf;
    }

    public void setIdseriecf(int idseriecf) {
        this.idseriecf = idseriecf;
    }

    public int getIdsecuencia() {
        return idsecuencia;
    }

    public void setIdsecuencia(int idsecuencia) {
        this.idsecuencia = idsecuencia;
    }

    public int getIdareaimprecion() {
        return idareaimprecion;
    }

    public void setIdareaimprecion(int idareaimprecion) {
        this.idareaimprecion = idareaimprecion;
    }

    public int getIdtipocomprobante() {
        return idtipocomprobante;
    }

    public void setIdtipocomprobante(int idtipocomprobante) {
        this.idtipocomprobante = idtipocomprobante;
    }

    public int getIdncf() {
        return idncf;
    }

    public void setIdncf(int idncf) {
        this.idncf = idncf;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public String getSecuencia_i() {
        return secuencia_i;
    }

    public void setSecuencia_i(String secuencia_i) {
        this.secuencia_i = secuencia_i;
    }
    
}
