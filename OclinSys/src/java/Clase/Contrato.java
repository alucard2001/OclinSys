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
public class Contrato extends Tipocontrato{
    private int idcontrato, idturno;
    private String contrato, fechacontrato;
    private int iddepartamento;

    public Contrato() {
    }

    public Contrato(int idcontrato, int idturno, String contrato, String fechacontrato, int iddepartamento, int idtipocontrato) {
        super(idtipocontrato);
        this.idcontrato = idcontrato;
        this.idturno = idturno;
        this.contrato = contrato;
        this.fechacontrato = fechacontrato;
        this.iddepartamento = iddepartamento;
    }

    public Contrato(int idtipocontrato) {
        super(idtipocontrato);
    }
    
    

    public int getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(int idcontrato) {
        this.idcontrato = idcontrato;
    }

    public int getIdturno() {
        return idturno;
    }

    public void setIdturno(int idturno) {
        this.idturno = idturno;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getFechacontrato() {
        return fechacontrato;
    }

    public void setFechacontrato(String fechacontrato) {
        this.fechacontrato = fechacontrato;
    }

    public int getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(int iddepartamento) {
        this.iddepartamento = iddepartamento;
    }
    

   
    
    
}
