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
public class Sector {

    private int idsector, idmunicipio;
    private String sector,municipio;

    public Sector() {
    }

    public Sector(int idsector, int idmunicipio, String sector) {
        this.idsector = idsector;
        this.idmunicipio = idmunicipio;
        this.sector = sector;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getIdsector() {
        return idsector;
    }

    public void setIdsector(int idsector) {
        this.idsector = idsector;
    }

    public int getIdmunicipio() {
        return idmunicipio;
    }

    public void setIdmunicipio(int idmunicipio) {
        this.idmunicipio = idmunicipio;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    
}
