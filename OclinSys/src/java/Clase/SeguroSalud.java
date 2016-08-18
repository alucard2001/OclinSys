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
public class SeguroSalud extends TipoSeguro{
    private int idseguro;
    private String seguro;
    private int numafiliado;

    public SeguroSalud() {
    }

    public SeguroSalud(int idseguro, String seguro, int numafiliado, int idtiposeguro) {
        super(idtiposeguro);
        this.idseguro = idseguro;
        this.seguro = seguro;
        this.numafiliado = numafiliado;
    }

    public int getIdseguro() {
        return idseguro;
    }

    public void setIdseguro(int idseguro) {
        this.idseguro = idseguro;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public int getNumafiliado() {
        return numafiliado;
    }

    public void setNumafiliado(int numafiliado) {
        this.numafiliado = numafiliado;
    }
    
    
    
}
