package Modelo;

import Clase.Pais;
import java.util.List;

/**
 *
 * @author Alucard
 */
public interface MPais {
    
    public List<Pais> list();

    public Pais edit(int idpais);

    public boolean save(Pais pais);

    public boolean delete(int idpais);
    
}
