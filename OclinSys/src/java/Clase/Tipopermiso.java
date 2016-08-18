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
public class Tipopermiso {
    
   private int idtipopermiso;
   private String tipopermiso;

    public Tipopermiso() {
    }

    public Tipopermiso(int idtipopermiso, String tipopermiso) {
        this.idtipopermiso = idtipopermiso;
        this.tipopermiso = tipopermiso;
    }

    public Tipopermiso(int idtipopermiso) {
        this.idtipopermiso = idtipopermiso;
    }
    
    

    public int getIdtipopermiso() {
        return idtipopermiso;
    }

    public void setIdtipopermiso(int idtipopermiso) {
        this.idtipopermiso = idtipopermiso;
    }

    public String getTipopermiso() {
        return tipopermiso;
    }

    public void setTipopermiso(String tipopermiso) {
        this.tipopermiso = tipopermiso;
    }
   
   
    
}
