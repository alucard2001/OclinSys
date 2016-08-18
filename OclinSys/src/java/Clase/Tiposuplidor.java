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
public class Tiposuplidor {
    private int idtiposuplidor, idsuplidor;
    private String tiposuplidor;

    public Tiposuplidor() {
    }

    public Tiposuplidor(int idtiposuplidor, int idsuplidor, String tiposuplidor) {
        this.idtiposuplidor = idtiposuplidor;
        this.idsuplidor = idsuplidor;
        this.tiposuplidor = tiposuplidor;
    }

    public int getIdtiposuplidor() {
        return idtiposuplidor;
    }

    public void setIdtiposuplidor(int idtiposuplidor) {
        this.idtiposuplidor = idtiposuplidor;
    }

    public int getIdsuplidor() {
        return idsuplidor;
    }

    public void setIdsuplidor(int idsuplidor) {
        this.idsuplidor = idsuplidor;
    }

    public String getTiposuplidor() {
        return tiposuplidor;
    }

    public void setTiposuplidor(String tiposuplidor) {
        this.tiposuplidor = tiposuplidor;
    }
    
}
