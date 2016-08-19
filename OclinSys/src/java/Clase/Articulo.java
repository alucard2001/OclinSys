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
public class Articulo {
    private int idarticulo,puntoreorden,iddetallecompra,idoferta,idcategoria,idalmacen,idsuplidor,idsucursal,iddetalleventa;
    private Number precioarticulo;

    public Articulo() {
    }

    public Articulo(int idarticulo, int puntoreorden, int iddetallecompra, int idoferta, int idcategoria, int idalmacen, int idsuplidor, int idsucursal, int iddetalleventa, Number precioarticulo) {
        this.idarticulo = idarticulo;
        this.puntoreorden = puntoreorden;
        this.iddetallecompra = iddetallecompra;
        this.idoferta = idoferta;
        this.idcategoria = idcategoria;
        this.idalmacen = idalmacen;
        this.idsuplidor = idsuplidor;
        this.idsucursal = idsucursal;
        this.iddetalleventa = iddetalleventa;
        this.precioarticulo = precioarticulo;
    }

    public int getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(int idarticulo) {
        this.idarticulo = idarticulo;
    }

    public int getPuntoreorden() {
        return puntoreorden;
    }

    public void setPuntoreorden(int puntoreorden) {
        this.puntoreorden = puntoreorden;
    }

    public int getIddetallecompra() {
        return iddetallecompra;
    }

    public void setIddetallecompra(int iddetallecompra) {
        this.iddetallecompra = iddetallecompra;
    }

    public int getIdoferta() {
        return idoferta;
    }

    public void setIdoferta(int idoferta) {
        this.idoferta = idoferta;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public int getIdalmacen() {
        return idalmacen;
    }

    public void setIdalmacen(int idalmacen) {
        this.idalmacen = idalmacen;
    }

    public int getIdsuplidor() {
        return idsuplidor;
    }

    public void setIdsuplidor(int idsuplidor) {
        this.idsuplidor = idsuplidor;
    }

    public int getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(int idsucursal) {
        this.idsucursal = idsucursal;
    }

    public int getIddetalleventa() {
        return iddetalleventa;
    }

    public void setIddetalleventa(int iddetalleventa) {
        this.iddetalleventa = iddetalleventa;
    }

    public Number getPrecioarticulo() {
        return precioarticulo;
    }

    public void setPrecioarticulo(Number precioarticulo) {
        this.precioarticulo = precioarticulo;
    }
    
    
            
    
    
}
