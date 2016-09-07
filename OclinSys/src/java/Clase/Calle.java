package Clase;

/**
 *
 * @author Tatiana Montilla
 */
public class Calle {

    private int idcalle,Idsector;
    private String calle;

    public Calle() {
    }

    public Calle(int idcalle, int Idsector, String calle) {
        this.idcalle = idcalle;
        this.Idsector = Idsector;
        this.calle = calle;
    }

    public int getIdsector() {
        return Idsector;
    }

    public void setIdsector(int Idsector) {
        this.Idsector = Idsector;
    }

    
    public int getIdcalle() {
        return idcalle;
    }

    public void setIdcalle(int idcalle) {
        this.idcalle = idcalle;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

}
