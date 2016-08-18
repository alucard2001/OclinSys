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
public class Tipocita {
    private int idtipocita;
    private String tipocita;

    public Tipocita() {
    }

    public Tipocita(int idtipocita, String tipocita) {
        this.idtipocita = idtipocita;
        this.tipocita = tipocita;
    }

    public int getIdtipocita() {
        return idtipocita;
    }

    public void setIdtipocita(int idtipocita) {
        this.idtipocita = idtipocita;
    }

    public String getTipocita() {
        return tipocita;
    }

    public void setTipocita(String tipocita) {
        this.tipocita = tipocita;
    }
    
    
}
