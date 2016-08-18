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
public class Enfermedad extends HistorialClinico{
    private int idenfermedad;
    private String enfermedad;

    public Enfermedad() {
    }

    public Enfermedad(int idenfermedad, String enfermedad, int idhistorialclinico) {
        super(idhistorialclinico);
        this.idenfermedad = idenfermedad;
        this.enfermedad = enfermedad;
    }

    public int getIdenfermedad() {
        return idenfermedad;
    }

    public void setIdenfermedad(int idenfermedad) {
        this.idenfermedad = idenfermedad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
    
    
    
}
