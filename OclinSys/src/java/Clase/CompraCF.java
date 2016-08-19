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
public class CompraCF {
    private int idcompracf,idsucursal;

    public CompraCF() {
    }

    public CompraCF(int idcompracf, int idsucursal) {
        this.idcompracf = idcompracf;
        this.idsucursal = idsucursal;
    }

    public int getIdcompracf() {
        return idcompracf;
    }

    public void setIdcompracf(int idcompracf) {
        this.idcompracf = idcompracf;
    }

    public int getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(int idsucursal) {
        this.idsucursal = idsucursal;
    }
    
   
}
