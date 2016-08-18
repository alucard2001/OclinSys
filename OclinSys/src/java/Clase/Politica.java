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
public class Politica extends Empresa{

    public Politica(int idpolitica, String politica, int idempresa) {
        super(idempresa);
        this.idpolitica = idpolitica;
        this.politica = politica;
    }
    private int idpolitica;
    private String politica;

    public Politica() {
    }

    public int getIdpolitica() {
        return idpolitica;
    }

    public void setIdpolitica(int idpolitica) {
        this.idpolitica = idpolitica;
    }

    public String getPolitica() {
        return politica;
    }

    public void setPolitica(String politica) {
        this.politica = politica;
    }
    
    
    
}
