/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clase.HistorialClinico;
import java.util.List;

/**
 *
 * @author Tatiana Montilla
 */
public interface MHistorialclinico {
        public List<HistorialClinico> list();

    public HistorialClinico search(int idhistorialclinico);

    public boolean save(HistorialClinico observacion);

    public boolean delete(int idhistorialclinico);
    
}
