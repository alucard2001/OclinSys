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
public class Nomina extends Contrato{
    private int idnomina;
    private String fechanomina;

    public Nomina() {
    }

    public Nomina(int idnomina, String fechanomina, int idtipocontrato) {
        super(idtipocontrato);
        this.idnomina = idnomina;
        this.fechanomina = fechanomina;
    }

    public Nomina(int idnomina) {
        this.idnomina = idnomina;
    }

    public int getIdnomina() {
        return idnomina;
    }

    public void setIdnomina(int idnomina) {
        this.idnomina = idnomina;
    }

    public String getFechanomina() {
        return fechanomina;
    }

    public void setFechanomina(String fechanomina) {
        this.fechanomina = fechanomina;
    }
    
}
