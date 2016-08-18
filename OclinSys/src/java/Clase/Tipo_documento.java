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
public class Tipo_documento extends Permiso{
    
    private int idtipodocumento;
    private String tipodocumento;

    public Tipo_documento() {
    }

    public Tipo_documento(int idtipodocumento, String tipodocumento) {
        this.idtipodocumento = idtipodocumento;
        this.tipodocumento = tipodocumento;
    }
    
    

    public Tipo_documento(int idtipodocumento) {
        this.idtipodocumento = idtipodocumento;
    }

    
//    public Tipo_documento(int idtipopermiso) {
//        super(idtipopermiso);
//    }

    public int getIdtipodocumento() {
        return idtipodocumento;
    }

    public void setIdtipodocumento(int idtipodocumento) {
        this.idtipodocumento = idtipodocumento;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }
    
    
   
}
