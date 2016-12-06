package hello;

import java.util.Date;

/**
 * Created by nicol on 04/12/2016.
 */
public class VisiteMedicale {

    private String idVisiteMedicale;
    private Date date;
    private String nni;

    public String getIdVisiteMedicale() {
        return idVisiteMedicale;
    }

    public void setIdVisiteMedicale(String idVisiteMedicale) {
        this.idVisiteMedicale = idVisiteMedicale;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNni() {
        return nni;
    }

    public void setNni(String nni) {
        this.nni = nni;
    }
}