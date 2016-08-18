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
public class Telefono {
    private int idtelefono, idtipotelefono,idcontacto;
    private String telefono;

    public Telefono() {
    }

    public Telefono(int idtelefono, int idtipotelefono, int idcontacto, String telefono) {
        this.idtelefono = idtelefono;
        this.idtipotelefono = idtipotelefono;
        this.idcontacto = idcontacto;
        this.telefono = telefono;
    }

    public int getIdtelefono() {
        return idtelefono;
    }

    public void setIdtelefono(int idtelefono) {
        this.idtelefono = idtelefono;
    }

    public int getIdtipotelefono() {
        return idtipotelefono;
    }

    public void setIdtipotelefono(int idtipotelefono) {
        this.idtipotelefono = idtipotelefono;
    }

    public int getIdcontacto() {
        return idcontacto;
    }

    public void setIdcontacto(int idcontacto) {
        this.idcontacto = idcontacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
