package server.bean;

/**
 * Created by b.bassac on 12/01/2015.
 */

public class Bd implements Comparable {

    private Long id;

    private String titre;

    private String numero;

    private String couvertureUrl;



    public Bd() {
    }

    public Bd(Long id, String numero, String titre, String url) {
        this.id = id;
        this.numero = numero;
        this.titre = titre;
        this.couvertureUrl = url;
    }

    public Bd( String numero, String titre, String url) {
        this.numero = numero;
        this.titre = titre;
        this.couvertureUrl = url;
    }

    public String getCouvertureUrl() {
        return couvertureUrl;
    }

    public void setCouvertureUrl(String couvertureUrl) {
        this.couvertureUrl = couvertureUrl;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }


    @Override
    public int compareTo(Object o) {
        return this.getId().compareTo(((Bd) o).getId());
    }
}
