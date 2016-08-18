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
public class Paciente extends Persona{
    
    private int idpaciente, idsegurosalud, idhistorialclinico;

    public Paciente() {
    }

    public Paciente(int idpaciente, int idsegurosalud, int idhistorialclinico, String sexo, String apellido, int idtipopermiso, int idtercero, int tipotercero, String nombretercero, int iddni, String dni, int idtipodocumento) {
        super(sexo, apellido, idtipopermiso, idtercero, tipotercero, nombretercero, iddni, dni, idtipodocumento);
        this.idpaciente = idpaciente;
        this.idsegurosalud = idsegurosalud;
        this.idhistorialclinico = idhistorialclinico;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public int getIdsegurosalud() {
        return idsegurosalud;
    }

    public void setIdsegurosalud(int idsegurosalud) {
        this.idsegurosalud = idsegurosalud;
    }

    public int getIdhistorialclinico() {
        return idhistorialclinico;
    }

    public void setIdhistorialclinico(int idhistorialclinico) {
        this.idhistorialclinico = idhistorialclinico;
    }
    
    
    
    
}
