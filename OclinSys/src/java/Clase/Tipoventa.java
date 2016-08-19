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
public class Tipoventa {
    
    private int idtipoventa;
    private String tipoventa;

    public Tipoventa() {
    }

    public Tipoventa(int idtipoventa, String tipoventa) {
        this.idtipoventa = idtipoventa;
        this.tipoventa = tipoventa;
    }

    public int getIdtipoventa() {
        return idtipoventa;
    }

    public void setIdtipoventa(int idtipoventa) {
        this.idtipoventa = idtipoventa;
    }

    public String getTipoventa() {
        return tipoventa;
    }

    public void setTipoventa(String tipoventa) {
        this.tipoventa = tipoventa;
    }
    
    
    
}
