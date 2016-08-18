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
public class Persona extends Tercero{ 
    private String sexo;
    private String apellido;
    private int idtipopermiso; 

    public Persona() {
    }

    public Persona(String sexo, String apellido, int idtipopermiso, int idtercero, int tipotercero, String nombretercero, int iddni, String dni, int idtipodocumento) {
        super(idtercero, tipotercero, nombretercero, iddni, dni, idtipodocumento);
        this.sexo = sexo;
        this.apellido = apellido;
        this.idtipopermiso = idtipopermiso;
    }
    

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdtipopermiso() {
        return idtipopermiso;
    }

    public void setIdtipopermiso(int idtipopermiso) {
        this.idtipopermiso = idtipopermiso;
    }

   
  

  
    
    
}
