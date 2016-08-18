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
public class Empresa extends Tercero{
    
    private String razoncomercial;
    private int idempresa;

    public Empresa() {
    }

    public Empresa(String razoncomercial, int idempresa, String nombretercero, int iddni, String dni, int idtipodocumento) {
        super(nombretercero, iddni, dni, idtipodocumento);
        this.razoncomercial = razoncomercial;
        this.idempresa = idempresa;
    }

    public Empresa(int idempresa) {
        this.idempresa = idempresa;
    }
    
    

    public String getRazoncomercial() {
        return razoncomercial;
    }

    public void setRazoncomercial(String razoncomercial) {
        this.razoncomercial = razoncomercial;
    }

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }
    
    
    
}
