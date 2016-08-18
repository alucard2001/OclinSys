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
public class Dia extends Horario{
    private int iddia;
    private String dia;

    public Dia() {
    }

    public Dia(int iddia, String dia) {
        this.iddia = iddia;
        this.dia = dia;
    }

   

    public int getIddia() {
        return iddia;
    }

    public void setIddia(int iddia) {
        this.iddia = iddia;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
}
