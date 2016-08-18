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
public class Compra {
    
    private int idcompra,montocompra, idtipocompra,idsuplidor;
    private String fechacompra;

    public Compra() {
    }

    public Compra(int idcompra, int montocompra, int idtipocompra, int idsuplidor, String fechacompra) {
        this.idcompra = idcompra;
        this.montocompra = montocompra;
        this.idtipocompra = idtipocompra;
        this.idsuplidor = idsuplidor;
        this.fechacompra = fechacompra;
    }

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public int getMontocompra() {
        return montocompra;
    }

    public void setMontocompra(int montocompra) {
        this.montocompra = montocompra;
    }

    public int getIdtipocompra() {
        return idtipocompra;
    }

    public void setIdtipocompra(int idtipocompra) {
        this.idtipocompra = idtipocompra;
    }

    public int getIdsuplidor() {
        return idsuplidor;
    }

    public void setIdsuplidor(int idsuplidor) {
        this.idsuplidor = idsuplidor;
    }

    public String getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(String fechacompra) {
        this.fechacompra = fechacompra;
    }
    
}
