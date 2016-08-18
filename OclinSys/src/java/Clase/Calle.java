package Clase;

/**
 *
 * @author Tatiana Montilla
 */
public class Calle {

    private int idcalle;
    private String calle;

    public Calle() {
    }

    public Calle(int idcalle, String calle) {
        this.idcalle = idcalle;
        this.calle = calle;
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
