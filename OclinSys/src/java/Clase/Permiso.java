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
public class Permiso extends Tipopermiso{
    private int idpermiso;
    private String user;
    private String  pass;
    private boolean estadous;

    public Permiso() {
    }

    public Permiso(int idtipopermiso) {
        super(idtipopermiso);
    }
    
    

    public Permiso(int idpermiso, String user, String pass, boolean estadous, int idtipopermiso) {
        super(idtipopermiso);
        this.idpermiso = idpermiso;
        this.user = user;
        this.pass = pass;
        this.estadous = estadous;
        
    }

  

    
    
    

    public int getIdpermiso() {
        return idpermiso;
    }

    public void setIdpermiso(int idpermiso) {
        this.idpermiso = idpermiso;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isEstadous() {
        return estadous;
    }

    public void setEstadous(boolean estadous) {
        this.estadous = estadous;
    }
    
    
    
    
    
}
