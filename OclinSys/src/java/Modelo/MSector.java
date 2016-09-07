/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clase.Sector;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tatiana Montilla
 */
public interface MSector {
    
     public List<Sector> list();

    public Sector search(String secor);

    public boolean save(Sector sector);

    public boolean delete(int idsector);
    
}
