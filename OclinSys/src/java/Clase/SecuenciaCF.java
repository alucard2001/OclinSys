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
public class SecuenciaCF {
    private int idsecuencia;
    private String secuencia;

    public SecuenciaCF() {
    }

    public SecuenciaCF(int idsecuencia, String secuencia) {
        this.idsecuencia = idsecuencia;
        this.secuencia = secuencia;
    }

    public int getIdsecuencia() {
        return idsecuencia;
    }

    public void setIdsecuencia(int idsecuencia) {
        this.idsecuencia = idsecuencia;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }
    
}
