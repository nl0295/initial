package hello;

import javax.persistence.*;
import java.util.Date;

public class VPS_BDD {

    private int id;
    private Date dateVPS;
    private String chantierVPS;
    private String visiteurVPS;

    public VPS_BDD(Date dateVPS, String chantierVPS, String visiteurVPS){
        this.dateVPS=dateVPS;
        this.chantierVPS=chantierVPS;
        this.visiteurVPS=visiteurVPS;
    }


    public Date getDateVPS() {
        return dateVPS;
    }

    public void setDateVPS(Date dateVPS) {
        this.dateVPS = dateVPS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChantierVPS() {
        return chantierVPS;
    }

    public void setChantierVPS(String chantierVPS) {
        this.chantierVPS = chantierVPS;
    }

    public String getVisiteurVPS() {
        return visiteurVPS;
    }

    public void setVisiteurVPS(String visiteurVPS) {
        this.visiteurVPS = visiteurVPS;
    }
}
