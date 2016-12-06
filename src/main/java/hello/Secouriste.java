package hello;

import java.util.Date;

/**
 * Created by audrey on 04/12/2016.
 */
public class Secouriste {

    private int idSecouriste;
    private String libelle;
    private Date date;
    private String nni;

    public int getIdSecouriste() {
        return idSecouriste;
    }

    public void setIdSecouriste(int idSecouriste) {
        this.idSecouriste = idSecouriste;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getNni() {
        return nni;
    }

    public void setNni(String nni) {
        this.nni = nni;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
