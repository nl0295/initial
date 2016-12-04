package hello;

import java.util.Date;

/**
 * Created by nicol on 01/12/2016.
 */
public class Reunion {

    private String titre;
    private Date date;
    private Date dateModif;

    public Reunion(String t, Date d){
        titre=t;
        date=d;
    }


    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateModif() {
        return dateModif;
    }

    public void setDateModif(Date dateModif) {
        this.dateModif = dateModif;
    }
}
