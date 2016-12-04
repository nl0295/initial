package hello;

import java.util.Date;

/**
 * Created by nicol on 04/12/2016.
 */
public class Competences {

    private String idCompetence;
    private String libelle;
    private Date dateFinCompetence;

    public String getIdCompetence() {
        return idCompetence;
    }

    public void setIdCompetence(String idCompetence) {
        this.idCompetence = idCompetence;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Date getDateFinCompetence() {
        return dateFinCompetence;
    }

    public void setDateFinCompetence(Date dateFinCompetence) {
        this.dateFinCompetence = dateFinCompetence;
    }
}
