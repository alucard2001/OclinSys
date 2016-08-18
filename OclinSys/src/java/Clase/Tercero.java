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
public class Tercero extends DNI{
    
    private int idtercero, tipotercero;
     private String nombretercero;

    public Tercero() {
    }

    public Tercero(int idtercero, int tipotercero, String nombretercero, int iddni, String dni, int idtipodocumento) {
        super(iddni, dni, idtipodocumento);
        this.idtercero = idtercero;
        this.tipotercero = tipotercero;
        this.nombretercero = nombretercero;
    }

 
    
    

    public Tercero(int idtercero, int tipotercero, String nombretercero, int iddni) {
        super(iddni);
        this.idtercero = idtercero;
        this.tipotercero = tipotercero;
        this.nombretercero = nombretercero;
    }

    public Tercero(String nombretercero, int iddni, String dni, int idtipodocumento) {
        super(iddni, dni, idtipodocumento);
        this.nombretercero = nombretercero;
    }
    
    
    

    public int getIdtercero() {
        return idtercero;
    }

    public void setIdtercero(int idtercero) {
        this.idtercero = idtercero;
    }

    public int getTipotercero() {
        return tipotercero;
    }

    public void setTipotercero(int tipotercero) {
        this.tipotercero = tipotercero;
    }

    public String getNombretercero() {
        return nombretercero;
    }

    public void setNombretercero(String nombretercero) {
        this.nombretercero = nombretercero;
    }
     
     
  
     
    
    
}
