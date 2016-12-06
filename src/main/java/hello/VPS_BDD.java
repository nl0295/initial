package hello;

import javax.persistence.*;
import java.util.Date;

public class VPS_BDD {

    private int id;
    private Date dateVPS;
    private String chantierVPS;
    private String visiteurVPS;
    private String ptFaible1;
    private String ptFaible2;
    private String ptFaible3;
    private String resp1;
    private String resp2;
    private String resp3;

    public VPS_BDD(VPS vps){
        this.dateVPS=vps.getDateVPS();
        this.chantierVPS=vps.getChantierVPS();
        this.visiteurVPS=vps.getVisiteurVPS();
        this.ptFaible1=vps.getPtFaible1();
        this.ptFaible2=vps.getPtFaible2();
        this.ptFaible3=vps.getPtFaible3();
        this.resp1=vps.getResp1();
        this.resp2=vps.getResp2();
        this.resp3=vps.getResp3();
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

    public String getPtFaible1() {
        return ptFaible1;
    }

    public void setPtFaible1(String ptFaible1) {
        this.ptFaible1 = ptFaible1;
    }

    public String getPtFaible2() {
        return ptFaible2;
    }

    public void setPtFaible2(String ptFaible2) {
        this.ptFaible2 = ptFaible2;
    }

    public String getPtFaible3() {
        return ptFaible3;
    }

    public void setPtFaible3(String ptFaible3) {
        this.ptFaible3 = ptFaible3;
    }

    public String getResp1() {
        return resp1;
    }

    public void setResp1(String resp1) {
        this.resp1 = resp1;
    }

    public String getResp2() {
        return resp2;
    }

    public void setResp2(String resp2) {
        this.resp2 = resp2;
    }

    public String getResp3() {
        return resp3;
    }

    public void setResp3(String resp3) {
        this.resp3 = resp3;
    }
}
