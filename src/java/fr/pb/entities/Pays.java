package fr.pb.entities;

// --------------
public class Pays {

    private String idPays;
    private String nomPays;

    public Pays() {
    }

    public Pays(String idPays, String nomPays) {
        this.idPays = idPays;
        this.nomPays = nomPays;
    }

    public String getIdPays() {
        return idPays;
    }

    public void setIdPays(String idPays) {
        this.idPays = idPays;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

} /// class