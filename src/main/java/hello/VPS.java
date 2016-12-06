package hello;

import javax.persistence.*;
import java.util.Date;


public class VPS {

    private int id;
    private Date dateVPS;
    private String chantierVPS;
    private String dureeVPS;
    private String visiteurVPS;
    private String chargeTravauxVPS;
    private int nbAgentVPS;
    private String nomAgentVPS1;
    private String nomAgentVPS2;
    private String nomAgentVPS3;
    private String nomAgentVPS4;
    private String nomAgentVPS5;
    private String nomAgentVPS6;
    private String activiteVPS;
    private String activiteAutre;
    private String designationInterv;
    private String typeE;
    private String methodeTvx;
    private String remarqueVps;
    private boolean topFait;
    private boolean topTrace;
    private String risqueSignale;
    private String autreRisqueResponsable;
    private String respectCPP;
    private String epi;
    private String trxEngin;
    private String autresRisques;
    private String organisationIntervention;
    private String propreteQualite;
    private String delaisTemps;
    private String etatOutillage;
    private String autreObservation;
    private String observationVisiteur;
    private String observationVisite;
    private int nbPtFort;
    private String ptFort1;
    private String ptFort2;
    private String ptFort3;
    private int nbPtFaible;
    private String ptFaible1;
    private String ptFaible2;
    private String ptFaible3;
    private String resp1;
    private String resp2;
    private String resp3;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateVPS() {
        return dateVPS;
    }

    public void setDateVPS(Date dateVPS) {
        this.dateVPS = dateVPS;
    }

    public String getChantierVPS() {
        return chantierVPS;
    }

    public void setChantierVPS(String chantierVPS) {
        this.chantierVPS = chantierVPS;
    }

    public String getDureeVPS() {
        return dureeVPS;
    }

    public void setDureeVPS(String dureeVPS) {
        this.dureeVPS = dureeVPS;
    }

    public String getVisiteurVPS() {
        return visiteurVPS;
    }

    public void setVisiteurVPS(String visiteurVPS) {
        this.visiteurVPS = visiteurVPS;
    }

    public String getChargeTravauxVPS() {
        return chargeTravauxVPS;
    }

    public void setChargeTravauxVPS(String chargeTravauxVPS) {
        this.chargeTravauxVPS = chargeTravauxVPS;
    }

    public int getNbAgentVPS() {
        return nbAgentVPS;
    }

    public void setNbAgentVPS(int nbAgentVPS) {
        this.nbAgentVPS = nbAgentVPS;
    }

    public String getNomAgentVPS1() {
        return nomAgentVPS1;
    }

    public void setNomAgentVPS1(String nomAgentVPS1) {
        this.nomAgentVPS1 = nomAgentVPS1;
    }

    public String getNomAgentVPS2() {
        return nomAgentVPS2;
    }

    public void setNomAgentVPS2(String nomAgentVPS2) {
        this.nomAgentVPS2 = nomAgentVPS2;
    }

    public String getNomAgentVPS3() {
        return nomAgentVPS3;
    }

    public void setNomAgentVPS3(String nomAgentVPS3) {
        this.nomAgentVPS3 = nomAgentVPS3;
    }

    public String getNomAgentVPS4() {
        return nomAgentVPS4;
    }

    public void setNomAgentVPS4(String nomAgentVPS4) {
        this.nomAgentVPS4 = nomAgentVPS4;
    }

    public String getNomAgentVPS5() {
        return nomAgentVPS5;
    }

    public void setNomAgentVPS5(String nomAgentVPS5) {
        this.nomAgentVPS5 = nomAgentVPS5;
    }

    public String getNomAgentVPS6() {
        return nomAgentVPS6;
    }

    public void setNomAgentVPS6(String nomAgentVPS6) {
        this.nomAgentVPS6 = nomAgentVPS6;
    }

    public String getActiviteVPS() {
        return activiteVPS;
    }

    public void setActiviteVPS(String activiteVPS) {
        this.activiteVPS = activiteVPS;
    }

    public String getActiviteAutre() {
        return activiteAutre;
    }

    public void setActiviteAutre(String activiteAutre) {
        this.activiteAutre = activiteAutre;
    }

    public String getMethodeTvx() {
        return methodeTvx;
    }

    public void setMethodeTvx(String methodeTvx) {
        this.methodeTvx = methodeTvx;
    }

    public String getTypeE() {
        return typeE;
    }

    public void setTypeE(String typeE) {
        this.typeE = typeE;
    }

    public String getDesignationInterv() {
        return designationInterv;
    }

    public void setDesignationInterv(String designationInterv) {
        this.designationInterv = designationInterv;
    }

    public String getRemarqueVps() {
        return remarqueVps;
    }

    public void setRemarqueVps(String remarqueVps) {
        this.remarqueVps = remarqueVps;
    }

    public boolean isTopFait() {
        return topFait;
    }

    public void setTopFait(boolean topFait) {
        this.topFait = topFait;
    }

    public boolean isTopTrace() {
        return topTrace;
    }

    public void setTopTrace(boolean topTrace) {
        this.topTrace = topTrace;
    }

    public String getRisqueSignale() {
        return risqueSignale;
    }

    public void setRisqueSignale(String risqueSignale) {
        this.risqueSignale = risqueSignale;
    }

    public String getAutreRisqueResponsable() {
        return autreRisqueResponsable;
    }

    public void setAutreRisqueResponsable(String autreRisqueResponsable) {
        this.autreRisqueResponsable = autreRisqueResponsable;
    }

    public String getRespectCPP() {
        return respectCPP;
    }

    public void setRespectCPP(String respectCPP) {
        this.respectCPP = respectCPP;
    }

    public String getEpi() {
        return epi;
    }

    public void setEpi(String epi) {
        this.epi = epi;
    }

    public String getTrxEngin() {
        return trxEngin;
    }

    public void setTrxEngin(String trxEngin) {
        this.trxEngin = trxEngin;
    }

    public String getAutresRisques() {
        return autresRisques;
    }

    public void setAutresRisques(String autresRisques) {
        this.autresRisques = autresRisques;
    }

    public String getOrganisationIntervention() {
        return organisationIntervention;
    }

    public void setOrganisationIntervention(String organisationIntervention) {
        this.organisationIntervention = organisationIntervention;
    }

    public String getPropreteQualite() {
        return propreteQualite;
    }

    public void setPropreteQualite(String propreteQualite) {
        this.propreteQualite = propreteQualite;
    }

    public String getDelaisTemps() {
        return delaisTemps;
    }

    public void setDelaisTemps(String delaisTemps) {
        this.delaisTemps = delaisTemps;
    }

    public String getEtatOutillage() {
        return etatOutillage;
    }

    public void setEtatOutillage(String etatOutillage) {
        this.etatOutillage = etatOutillage;
    }

    public String getAutreObservation() {
        return autreObservation;
    }

    public void setAutreObservation(String autreObservation) {
        this.autreObservation = autreObservation;
    }

    public String getObservationVisiteur() {
        return observationVisiteur;
    }

    public void setObservationVisiteur(String observationVisiteur) {
        this.observationVisiteur = observationVisiteur;
    }

    public String getObservationVisite() {
        return observationVisite;
    }

    public void setObservationVisite(String observationVisite) {
        this.observationVisite = observationVisite;
    }

    public int getNbPtFort() {
        return nbPtFort;
    }

    public void setNbPtFort(int nbPtFort) {
        this.nbPtFort = nbPtFort;
    }

    public String getPtFort1() {
        return ptFort1;
    }

    public void setPtFort1(String ptFort1) {
        this.ptFort1 = ptFort1;
    }

    public String getPtFort2() {
        return ptFort2;
    }

    public void setPtFort2(String ptFort2) {
        this.ptFort2 = ptFort2;
    }

    public String getPtFort3() {
        return ptFort3;
    }

    public void setPtFort3(String ptFort3) {
        this.ptFort3 = ptFort3;
    }

    public int getNbPtFaible() {
        return nbPtFaible;
    }

    public void setNbPtFaible(int nbPtFaible) {
        this.nbPtFaible = nbPtFaible;
    }

    public String getPtFaible1() {
        return ptFaible1;
    }

    public void setPtFaible1(String ptFaible1) {
        this.ptFaible1 = ptFaible1;
    }

    public String getPtFaible3() {
        return ptFaible3;
    }

    public void setPtFaible3(String ptFaible3) {
        this.ptFaible3 = ptFaible3;
    }

    public String getPtFaible2() {
        return ptFaible2;
    }

    public void setPtFaible2(String ptFaible2) {
        this.ptFaible2 = ptFaible2;
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


    public VPS_BDD getVPS_BDD (){
        return new VPS_BDD(this);
    }
}
