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
public class Detallepago extends Nomina{
    
    private int iddetallepago, idotrospagos;

    public Detallepago() {
    }

    public Detallepago(int iddetallepago, int idotrospagos, int idnomina, String fechanomina, int idtipocontrato) {
        super(idnomina, fechanomina, idtipocontrato);
        this.iddetallepago = iddetallepago;
        this.idotrospagos = idotrospagos;
    }

    

    public Detallepago(int idnomina) {
        super(idnomina);
    }

    public int getIddetallepago() {
        return iddetallepago;
    }

    public void setIddetallepago(int iddetallepago) {
        this.iddetallepago = iddetallepago;
    }

    public int getIdotrospagos() {
        return idotrospagos;
    }

    public void setIdotrospagos(int idotrospagos) {
        this.idotrospagos = idotrospagos;
    }
    
    
}
