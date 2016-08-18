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
public class Horario{
   private int idhorario;
    private String iniciohorario;
    private String finhorario;

    public Horario() {
    }

    public Horario(int idhorario, String iniciohorario, String finhorario) {
        this.idhorario = idhorario;
        this.iniciohorario = iniciohorario;
        this.finhorario = finhorario;
    }

    public int getIdhorario() {
        return idhorario;
    }

    public void setIdhorario(int idhorario) {
        this.idhorario = idhorario;
    }

    public String getIniciohorario() {
        return iniciohorario;
    }

    public void setIniciohorario(String iniciohorario) {
        this.iniciohorario = iniciohorario;
    }

    public String getFinhorario() {
        return finhorario;
    }

    public void setFinhorario(String finhorario) {
        this.finhorario = finhorario;
    }
    
}
