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
public class Detallemovimiento {
    private int cantidadmovimiento,idmovimiento;

    public Detallemovimiento() {
    }

    public Detallemovimiento(int cantidadmovimiento, int idmovimiento) {
        this.cantidadmovimiento = cantidadmovimiento;
        this.idmovimiento = idmovimiento;
    }

    public int getCantidadmovimiento() {
        return cantidadmovimiento;
    }

    public void setCantidadmovimiento(int cantidadmovimiento) {
        this.cantidadmovimiento = cantidadmovimiento;
    }

    public int getIdmovimiento() {
        return idmovimiento;
    }

    public void setIdmovimiento(int idmovimiento) {
        this.idmovimiento = idmovimiento;
    }
    
    
    
}
