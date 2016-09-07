/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clase.Descuento;
import java.util.List;

/**
 *
 * @author Tatiana Montilla
 */
public interface MDescuento {
    
       public List<Descuento> list();

    public Descuento search(String descuento);

    public boolean save(Descuento descuento);

    public boolean delete(int iddescuento);
    
}
