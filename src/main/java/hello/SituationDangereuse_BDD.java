package hello;

import java.util.Date;

/**
 * Created by nicol on 07/12/2016.
 */
public class SituationDangereuse_BDD {

    private int id;
    private String chantier;
    private String description;
    private String actionImmediate;
    private String latitude;
    private String longitude;
    private Date date;
    private String nni;

    public SituationDangereuse_BDD(SituationDangereuse sd){
        this.id=sd.getId();
        this.chantier=sd.getChantier();
        this.description=sd.getDescription();
        this.actionImmediate=sd.getActionImmediate();
        this.latitude=sd.getLatitude();
        this.longitude=sd.getLongitude();
        this.date=sd.getDate();
        this.nni=sd.getNni();


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChantier() {
        return chantier;
    }

    public void setChantier(String chantier) {
        this.chantier = chantier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActionImmediate() {
        return actionImmediate;
    }

    public void setActionImmediate(String actionImmediate) {
        this.actionImmediate = actionImmediate;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
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
