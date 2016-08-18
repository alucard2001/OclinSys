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
public class Provincia {

    private int idprovincia, idregion;
    private String provincia;

    public Provincia() {
    }

    public Provincia(int idprovincia, int idregion, String provincia) {
        this.idprovincia = idprovincia;
        this.idregion = idregion;
        this.provincia = provincia;
    }

    public int getIdprovincia() {
        return idprovincia;
    }

    public void setIdprovincia(int idprovincia) {
        this.idprovincia = idprovincia;
    }

    public int getIdregion() {
        return idregion;
    }

    public void setIdregion(int idregion) {
        this.idregion = idregion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

}
