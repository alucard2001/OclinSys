/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clase.Region;
import java.util.List;

/**
 *
 * @author Alucard
 */
public interface MRegion {
    
      public List<Region> list();

    public Region search(String region);

    public boolean save(Region region);

    public boolean delete(int idregion);
    
}
