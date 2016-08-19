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
public class Movimiento {
    private int idmovimiento,idarticulo;
    private String descripcionmovimiento,fechamoviento;

    public Movimiento() {
    }

    public Movimiento(int idmovimiento, int idarticulo, String descripcionmovimiento, String fechamoviento) {
        this.idmovimiento = idmovimiento;
        this.idarticulo = idarticulo;
        this.descripcionmovimiento = descripcionmovimiento;
        this.fechamoviento = fechamoviento;
    }

    public int getIdmovimiento() {
        return idmovimiento;
    }

    public void setIdmovimiento(int idmovimiento) {
        this.idmovimiento = idmovimiento;
    }

    public int getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(int idarticulo) {
        this.idarticulo = idarticulo;
    }

    public String getDescripcionmovimiento() {
        return descripcionmovimiento;
    }

    public void setDescripcionmovimiento(String descripcionmovimiento) {
        this.descripcionmovimiento = descripcionmovimiento;
    }

    public String getFechamoviento() {
        return fechamoviento;
    }

    public void setFechamoviento(String fechamoviento) {
        this.fechamoviento = fechamoviento;
    }
    
}
