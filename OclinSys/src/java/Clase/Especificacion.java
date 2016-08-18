package Clase;

/**
 *
 * @author Tatiana Montilla
 */
public class Especificacion {

    private int idespecificacion,idsector,idcalle;
    private String Especificacion,punRef;

    public Especificacion() {
    }

    public Especificacion(int idespecificacion, int idsector, int idcalle, String Especificacion, String punRef) {
        this.idespecificacion = idespecificacion;
        this.idsector = idsector;
        this.idcalle = idcalle;
        this.Especificacion = Especificacion;
        this.punRef = punRef;
    }

    public int getIdespecificacion() {
        return idespecificacion;
    }

    public void setIdespecificacion(int idespecificacion) {
        this.idespecificacion = idespecificacion;
    }

    public int getIdsector() {
        return idsector;
    }

    public void setIdsector(int idsector) {
        this.idsector = idsector;
    }

    public int getIdcalle() {
        return idcalle;
    }

    public void setIdcalle(int idcalle) {
        this.idcalle = idcalle;
    }

    public String getEspecificacion() {
        return Especificacion;
    }

    public void setEspecificacion(String Especificacion) {
        this.Especificacion = Especificacion;
    }

    public String getPunRef() {
        return punRef;
    }

    public void setPunRef(String punRef) {
        this.punRef = punRef;
    }
    
    
}
