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
public class Correo {
    private int idcorreo;
    private String email;
    private int idcontacto;

    public Correo() {
    }

    public Correo(int idcorreo, String email, int idcontacto) {
        this.idcorreo = idcorreo;
        this.email = email;
        this.idcontacto = idcontacto;
    }

    public int getIdcorreo() {
        return idcorreo;
    }

    public void setIdcorreo(int idcorreo) {
        this.idcorreo = idcorreo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdcontacto() {
        return idcontacto;
    }

    public void setIdcontacto(int idcontacto) {
        this.idcontacto = idcontacto;
    }
    
    
}
