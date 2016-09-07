package Clase;

/**
 *
 * @author Tatiana Montilla
 */
public class Municipio {
    private int idprovincia, idmunicipio;
    private String municipio,provincia;

    public Municipio() {
    }

    public Municipio(int idprovincia, int idmunicipio, String municipio) {
        this.idprovincia = idprovincia;
        this.idmunicipio = idmunicipio;
        this.municipio = municipio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getIdprovincia() {
        return idprovincia;
    }

    public void setIdprovincia(int idprovincia) {
        this.idprovincia = idprovincia;
    }

    public int getIdmunicipio() {
        return idmunicipio;
    }

    public void setIdmunicipio(int idmunicipio) {
        this.idmunicipio = idmunicipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    
}
