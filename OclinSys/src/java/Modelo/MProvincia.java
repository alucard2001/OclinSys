package Modelo;

import Clase.Provincia;
import java.util.List;

/**
 *
 * @author Alucard
 */
public interface MProvincia {
    public List<Provincia> list();

    public Provincia search(String provincia);

    public boolean save(Provincia provincia);

    public boolean delete(int idprovincia);
}
