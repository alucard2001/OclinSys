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
public class Sucursal extends Empresa{
    
    private int idsucursal;
    private String sucursal;
    private boolean estadosucursal;
    private String puntoEmision;

    public Sucursal() {
    }

    public Sucursal(int idsucursal, String sucursal, boolean estadosucursal, String puntoEmision, int idempresa) {
        super(idempresa);
        this.idsucursal = idsucursal;
        this.sucursal = sucursal;
        this.estadosucursal = estadosucursal;
        this.puntoEmision = puntoEmision;
    }

    public int getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(int idsucursal) {
        this.idsucursal = idsucursal;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public boolean isEstadosucursal() {
        return estadosucursal;
    }

    public void setEstadosucursal(boolean estadosucursal) {
        this.estadosucursal = estadosucursal;
    }

    public String getPuntoEmision() {
        return puntoEmision;
    }

    public void setPuntoEmision(String puntoEmision) {
        this.puntoEmision = puntoEmision;
    }
    
    

    
    
    
    
    
}
