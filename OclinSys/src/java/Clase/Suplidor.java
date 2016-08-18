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
public class Suplidor extends Persona{
    private int idsuplidor;
    private boolean estadosuplidor;

    public Suplidor() {
    }

    public Suplidor(int idsuplidor, boolean estadosuplidor, String sexo, String apellido, int idtipopermiso, int idtercero, int tipotercero, String nombretercero, int iddni, String dni, int idtipodocumento) {
        super(sexo, apellido, idtipopermiso, idtercero, tipotercero, nombretercero, iddni, dni, idtipodocumento);
        this.idsuplidor = idsuplidor;
        this.estadosuplidor = estadosuplidor;
    }

    public int getIdsuplidor() {
        return idsuplidor;
    }

    public void setIdsuplidor(int idsuplidor) {
        this.idsuplidor = idsuplidor;
    }

    public boolean isEstadosuplidor() {
        return estadosuplidor;
    }

    public void setEstadosuplidor(boolean estadosuplidor) {
        this.estadosuplidor = estadosuplidor;
    }
    
        
    
}
