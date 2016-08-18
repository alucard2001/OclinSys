package Clase;

/**
 *
 * @author Tatiana Montilla
 */
public class Region {

    private int idregion, idpais;
    private String region;

    public Region() {
    }

    public Region(int idregion, int idpais, String region) {
        this.idregion = idregion;
        this.idpais = idpais;
        this.region = region;
    }

    public int getIdregion() {
        return idregion;
    }

    public void setIdregion(int idregion) {
        this.idregion = idregion;
    }

    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
