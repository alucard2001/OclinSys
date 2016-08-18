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
public class Especialidad extends Contrato{
    private int idespecialidad;
    private String especialidad;

    public Especialidad() {
    }

    public Especialidad(int idespecialidad, String especialidad, int idtipocontrato) {
        super(idtipocontrato);
        this.idespecialidad = idespecialidad;
        this.especialidad = especialidad;
    }
    
    
}
