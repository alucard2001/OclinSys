package Modelo;

import Clase.Pais;
import java.util.List;

/**
 *
 * @author Alucard
 */
public interface MPais {
    
    public List<Pais> list();

    public Pais search(String Pais);

    public boolean save(Pais pais);

    public boolean delete(int idpais);
    
}
