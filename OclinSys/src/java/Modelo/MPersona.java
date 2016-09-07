package Modelo;

import Clase.Persona;
import java.util.List;

/**
 *
 * @author Alucard
 */
public interface MPersona {

    public List<Persona> list();

    public Persona search(String persona);

    public boolean save(Persona persona);

    public boolean delete(int idPersona);
}
