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
public class Tutor extends Persona{
    private int idtutor,idpaciente;

    public Tutor() {
    }

    public Tutor(int idtutor, int idpaciente, String sexo, String apellido, int idtipopermiso, int idtercero, int tipotercero, String nombretercero, int iddni, String dni, int idtipodocumento) {
        super(sexo, apellido, idtipopermiso, idtercero, tipotercero, nombretercero, iddni, dni, idtipodocumento);
        this.idtutor = idtutor;
        this.idpaciente = idpaciente;
    }

    public int getIdtutor() {
        return idtutor;
    }

    public void setIdtutor(int idtutor) {
        this.idtutor = idtutor;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }
    
    
}
