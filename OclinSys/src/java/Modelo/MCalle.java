/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clase.Calle;
import java.util.List;

/**
 *
 * @author Tatiana Montilla
 */
public interface MCalle {
      public List<Calle> list();

    public Calle search(String calle);

    public boolean save(Calle calle);

    public boolean delete(int idcalle);
}
