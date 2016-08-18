package Clase;

/**
 *
 * @author Tatiana Montilla
 */
public class Departamento {

    private int iddepartamento, idsucursal, idpolitica;
    private String departamento;

    public Departamento() {
    }

    public Departamento(int iddepartamento, int idsucursal, int idpolitica, String departamento) {
        this.iddepartamento = iddepartamento;
        this.idsucursal = idsucursal;
        this.idpolitica = idpolitica;
        this.departamento = departamento;
    }
    

    public int getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(int iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public int getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(int idsucursal) {
        this.idsucursal = idsucursal;
    }

    public int getIdpolitica() {
        return idpolitica;
    }

    public void setIdpolitica(int idpolitica) {
        this.idpolitica = idpolitica;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
