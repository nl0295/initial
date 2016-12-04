package hello;

import javax.persistence.*;
import java.util.Date;

public class PAP {


    private int id;
    private Date datePAP;
    private String pointFort1;
    private String pointFort2;
    private String pointFort3;
    private String pointFaible1;
    private String pointFaible2;
    private String pointFaible3;
    private String pointRisques1;
    private String pointRisques2;
    private String pointRisques3;
    private String pointRisques4;
    private String pointRisques5;
    private String pointRisques6;
    private String pointMRE1;
    private String pointMRE2;
    private String pointMRE3;
    private String pointMRE4;
    private String pointMRE5;
    private String pointMRE6;
    private String pointRisqueRoutier1;
    private String pointRisqueRoutier2;
    private String pointRisqueRoutier3;
    private String pointRisqueRoutier4;
    private String pointRisqueRoutier5;
    private String pointRisqueRoutier6;
    private String pointReglementaire1;
    private String pointReglementaire2;
    private String pointReglementaire3;
    private String pointReglementaire4;
    private String pointReglementaire5;
    private String pointReglementaire6;
    private String pointComportemental1;
    private String pointComportemental2;
    private String pointComportemental3;
    private String pointComportemental4;
    private String pointComportemental5;
    private String pointComportemental6;
    private String pointLivretPrevention1;
    private String pointLivretPrevention2;
    private String pointLivretPrevention3;
    private String pointLivretPrevention4;
    private String pointLivretPrevention5;
    private String pointLivretPrevention6;
    private String pointJourneeMetier1;
    private String pointJourneeMetier2;
    private String pointJourneeMetier3;
    private String pointJourneeMetier4;
    private String pointJourneeMetier5;
    private String pointJourneeMetier6;
    private Date dateRisque1;
    private Date dateRisque2;
    private Date dateRisque3;
    private Date dateRisque4;
    private Date dateRisque5;
    private Date dateRisque6;
    private Date dateRisquModif1;
    private Date dateRisquModif2;
    private Date dateRisquModif3;
    private Date dateRisquModif4;
    private Date dateRisquModif5;
    private Date dateRisquModif6;
    private Date dateMRE1;
    private Date dateMRE2;
    private Date dateMRE3;
    private Date dateMRE4;
    private Date dateMRE5;
    private Date dateMRE6;
    private Date dateMREModif1;
    private Date dateMREModif2;
    private Date dateMREModif3;
    private Date dateMREModif4;
    private Date dateMREModif5;
    private Date dateMREModif6;
    private Date dateRisqueRoutier1;
    private Date dateRisqueRoutier2;
    private Date dateRisqueRoutier3;
    private Date dateRisqueRoutier4;
    private Date dateRisqueRoutier5;
    private Date dateRisqueRoutier6;
    private Date dateRisqueRoutierModif1;
    private Date dateRisqueRoutierModif2;
    private Date dateRisqueRoutierModif3;
    private Date dateRisqueRoutierModif4;
    private Date dateRisqueRoutierModif5;
    private Date dateRisqueRoutierModif6;
    private Date dateReglementaire1;
    private Date dateReglementaire2;
    private Date dateReglementaire3;
    private Date dateReglementaire4;
    private Date dateReglementaire5;
    private Date dateReglementaire6;
    private Date dateReglementaireModif1;
    private Date dateReglementaireModif2;
    private Date dateReglementaireModif3;
    private Date dateReglementaireModif4;
    private Date dateReglementaireModif5;
    private Date dateReglementaireModif6;
    private Date dateComportemental1;
    private Date dateComportemental2;
    private Date dateComportemental3;
    private Date dateComportemental4;
    private Date dateComportemental5;
    private Date dateComportemental6;
    private Date dateComportementalModif1;
    private Date dateComportementalModif2;
    private Date dateComportementalModif3;
    private Date dateComportementalModif4;
    private Date dateComportementalModif5;
    private Date dateComportementalModif6;
    private Date dateLivretPrevention1;
    private Date dateLivretPrevention2;
    private Date dateLivretPrevention3;
    private Date dateLivretPrevention4;
    private Date dateLivretPrevention5;
    private Date dateLivretPrevention6;
    private Date dateLivretPreventionModif1;
    private Date dateLivretPreventionModif2;
    private Date dateLivretPreventionModif3;
    private Date dateLivretPreventionModif4;
    private Date dateLivretPreventionModif5;
    private Date dateLivretPreventionModif6;
    private Date dateJourneeMetier1;
    private Date dateJourneeMetier2;
    private Date dateJourneeMetier3;
    private Date dateJourneeMetier4;
    private Date dateJourneeMetier5;
    private Date dateJourneeMetier6;
    private Date dateJourneeMetierModif1;
    private Date dateJourneeMetierModif2;
    private Date dateJourneeMetierModif3;
    private Date dateJourneeMetierModif4;
    private Date dateJourneeMetierModif5;
    private Date dateJourneeMetierModif6;

    public int getId() {
        return id;
    }

    public Date getDatePAP() {
        return datePAP;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDatePAP(Date datePAP) {
        this.datePAP = datePAP;
    }

    public String getPointFort1() {
        return pointFort1;
    }

    public String getPointFort2() {
        return pointFort2;
    }

    public String getPointFort3() {
        return pointFort3;
    }

    public String getPointFaible1() {
        return pointFaible1;
    }

    public String getPointFaible2() {
        return pointFaible2;
    }

    public String getPointFaible3() {
        return pointFaible3;
    }

    public String getPointRisques1() {
        return pointRisques1;
    }

    public String getPointRisques2() {
        return pointRisques2;
    }

    public String getPointRisques3() {
        return pointRisques3;
    }

    public String getPointRisques4() {
        return pointRisques4;
    }

    public String getPointRisques5() {
        return pointRisques5;
    }

    public String getPointRisques6() {
        return pointRisques6;
    }

    public String getPointMRE1() {
        return pointMRE1;
    }

    public String getPointMRE2() {
        return pointMRE2;
    }

    public String getPointMRE3() {
        return pointMRE3;
    }

    public String getPointMRE4() {
        return pointMRE4;
    }

    public String getPointMRE5() {
        return pointMRE5;
    }

    public String getPointMRE6() {
        return pointMRE6;
    }

    public String getPointRisqueRoutier1() {
        return pointRisqueRoutier1;
    }

    public String getPointRisqueRoutier2() {
        return pointRisqueRoutier2;
    }

    public String getPointRisqueRoutier3() {
        return pointRisqueRoutier3;
    }

    public String getPointRisqueRoutier4() {
        return pointRisqueRoutier4;
    }

    public String getPointRisqueRoutier5() {
        return pointRisqueRoutier5;
    }

    public String getPointRisqueRoutier6() {
        return pointRisqueRoutier6;
    }

    public String getPointReglementaire1() {
        return pointReglementaire1;
    }

    public String getPointReglementaire2() {
        return pointReglementaire2;
    }

    public String getPointReglementaire3() {
        return pointReglementaire3;
    }

    public String getPointReglementaire4() {
        return pointReglementaire4;
    }

    public String getPointReglementaire5() {
        return pointReglementaire5;
    }

    public String getPointReglementaire6() {
        return pointReglementaire6;
    }

    public String getPointComportemental1() {
        return pointComportemental1;
    }

    public String getPointComportemental2() {
        return pointComportemental2;
    }

    public String getPointComportemental3() {
        return pointComportemental3;
    }

    public String getPointComportemental4() {
        return pointComportemental4;
    }

    public String getPointComportemental5() {
        return pointComportemental5;
    }

    public String getPointComportemental6() {
        return pointComportemental6;
    }

    public String getPointLivretPrevention1() {
        return pointLivretPrevention1;
    }

    public String getPointLivretPrevention2() {
        return pointLivretPrevention2;
    }

    public String getPointLivretPrevention3() {
        return pointLivretPrevention3;
    }

    public String getPointLivretPrevention4() {
        return pointLivretPrevention4;
    }

    public String getPointLivretPrevention5() {
        return pointLivretPrevention5;
    }

    public String getPointLivretPrevention6() {
        return pointLivretPrevention6;
    }

    public String getPointJourneeMetier1() {
        return pointJourneeMetier1;
    }

    public String getPointJourneeMetier2() {
        return pointJourneeMetier2;
    }

    public String getPointJourneeMetier3() {
        return pointJourneeMetier3;
    }

    public String getPointJourneeMetier4() {
        return pointJourneeMetier4;
    }

    public String getPointJourneeMetier5() {
        return pointJourneeMetier5;
    }

    public String getPointJourneeMetier6() {
        return pointJourneeMetier6;
    }

    public Date getDateRisque1() {
        return dateRisque1;
    }

    public Date getDateRisque2() {
        return dateRisque2;
    }

    public Date getDateRisque3() {
        return dateRisque3;
    }

    public Date getDateRisque4() {
        return dateRisque4;
    }

    public Date getDateRisque5() {
        return dateRisque5;
    }

    public Date getDateRisque6() {
        return dateRisque6;
    }

    public Date getDateMRE1() {
        return dateMRE1;
    }

    public Date getDateMRE2() {
        return dateMRE2;
    }

    public Date getDateMRE3() {
        return dateMRE3;
    }

    public Date getDateMRE4() {
        return dateMRE4;
    }

    public Date getDateMRE5() {
        return dateMRE5;
    }

    public Date getDateMRE6() {
        return dateMRE6;
    }

    public Date getDateRisqueRoutier1() {
        return dateRisqueRoutier1;
    }

    public Date getDateRisqueRoutier2() {
        return dateRisqueRoutier2;
    }

    public Date getDateRisqueRoutier3() {
        return dateRisqueRoutier3;
    }

    public Date getDateRisqueRoutier4() {
        return dateRisqueRoutier4;
    }

    public Date getDateRisqueRoutier5() {
        return dateRisqueRoutier5;
    }

    public Date getDateRisqueRoutier6() {
        return dateRisqueRoutier6;
    }

    public Date getDateReglementaire1() {
        return dateReglementaire1;
    }

    public Date getDateReglementaire2() {
        return dateReglementaire2;
    }

    public Date getDateReglementaire3() {
        return dateReglementaire3;
    }

    public Date getDateReglementaire4() {
        return dateReglementaire4;
    }

    public Date getDateReglementaire5() {
        return dateReglementaire5;
    }

    public Date getDateReglementaire6() {
        return dateReglementaire6;
    }

    public Date getDateComportemental1() {
        return dateComportemental1;
    }

    public Date getDateComportemental2() {
        return dateComportemental2;
    }

    public Date getDateComportemental3() {
        return dateComportemental3;
    }

    public Date getDateComportemental4() {
        return dateComportemental4;
    }

    public Date getDateComportemental5() {
        return dateComportemental5;
    }

    public Date getDateComportemental6() {
        return dateComportemental6;
    }

    public Date getDateLivretPrevention1() {
        return dateLivretPrevention1;
    }

    public Date getDateLivretPrevention2() {
        return dateLivretPrevention2;
    }

    public Date getDateLivretPrevention3() {
        return dateLivretPrevention3;
    }

    public Date getDateLivretPrevention4() {
        return dateLivretPrevention4;
    }

    public Date getDateLivretPrevention5() {
        return dateLivretPrevention5;
    }

    public Date getDateLivretPrevention6() {
        return dateLivretPrevention6;
    }

    public Date getDateJourneeMetier1() {
        return dateJourneeMetier1;
    }

    public Date getDateJourneeMetier2() {
        return dateJourneeMetier2;
    }

    public Date getDateJourneeMetier3() {
        return dateJourneeMetier3;
    }

    public Date getDateJourneeMetier4() {
        return dateJourneeMetier4;
    }

    public Date getDateJourneeMetier5() {
        return dateJourneeMetier5;
    }

    public Date getDateJourneeMetier6() {
        return dateJourneeMetier6;
    }

    public void setPointFort1(String pointFort1) {
        this.pointFort1 = pointFort1;
    }

    public void setPointFort2(String pointFort2) {
        this.pointFort2 = pointFort2;
    }

    public void setPointFort3(String pointFort3) {
        this.pointFort3 = pointFort3;
    }

    public void setPointFaible1(String pointFaible1) {
        this.pointFaible1 = pointFaible1;
    }

    public void setPointFaible2(String pointFaible2) {
        this.pointFaible2 = pointFaible2;
    }

    public void setPointFaible3(String pointFaible3) {
        this.pointFaible3 = pointFaible3;
    }

    public void setPointRisques1(String pointRisques1) {
        this.pointRisques1 = pointRisques1;
    }

    public void setPointRisques2(String pointRisques2) {
        this.pointRisques2 = pointRisques2;
    }

    public void setPointRisques3(String pointRisques3) {
        this.pointRisques3 = pointRisques3;
    }

    public void setPointRisques4(String pointRisques4) {
        this.pointRisques4 = pointRisques4;
    }

    public void setPointRisques5(String pointRisques5) {
        this.pointRisques5 = pointRisques5;
    }

    public void setPointRisques6(String pointRisques6) {
        this.pointRisques6 = pointRisques6;
    }

    public void setPointMRE1(String pointMRE1) {
        this.pointMRE1 = pointMRE1;
    }

    public void setPointMRE2(String pointMRE2) {
        this.pointMRE2 = pointMRE2;
    }

    public void setPointMRE3(String pointMRE3) {
        this.pointMRE3 = pointMRE3;
    }

    public void setPointMRE4(String pointMRE4) {
        this.pointMRE4 = pointMRE4;
    }

    public void setPointMRE5(String pointMRE5) {
        this.pointMRE5 = pointMRE5;
    }

    public void setPointMRE6(String pointMRE6) {
        this.pointMRE6 = pointMRE6;
    }

    public void setPointRisqueRoutier1(String pointRisqueRoutier1) {
        this.pointRisqueRoutier1 = pointRisqueRoutier1;
    }

    public void setPointRisqueRoutier2(String pointRisqueRoutier2) {
        this.pointRisqueRoutier2 = pointRisqueRoutier2;
    }

    public void setPointRisqueRoutier3(String pointRisqueRoutier3) {
        this.pointRisqueRoutier3 = pointRisqueRoutier3;
    }

    public void setPointRisqueRoutier4(String pointRisqueRoutier4) {
        this.pointRisqueRoutier4 = pointRisqueRoutier4;
    }

    public void setPointRisqueRoutier5(String pointRisqueRoutier5) {
        this.pointRisqueRoutier5 = pointRisqueRoutier5;
    }

    public void setPointRisqueRoutier6(String pointRisqueRoutier6) {
        this.pointRisqueRoutier6 = pointRisqueRoutier6;
    }

    public void setPointReglementaire1(String pointReglementaire1) {
        this.pointReglementaire1 = pointReglementaire1;
    }

    public void setPointReglementaire2(String pointReglementaire2) {
        this.pointReglementaire2 = pointReglementaire2;
    }

    public void setPointReglementaire3(String pointReglementaire3) {
        this.pointReglementaire3 = pointReglementaire3;
    }

    public void setPointReglementaire4(String pointReglementaire4) {
        this.pointReglementaire4 = pointReglementaire4;
    }

    public void setPointReglementaire5(String pointReglementaire5) {
        this.pointReglementaire5 = pointReglementaire5;
    }

    public void setPointReglementaire6(String pointReglementaire6) {
        this.pointReglementaire6 = pointReglementaire6;
    }

    public void setPointComportemental1(String pointComportemental1) {
        this.pointComportemental1 = pointComportemental1;
    }

    public void setPointComportemental2(String pointComportemental2) {
        this.pointComportemental2 = pointComportemental2;
    }

    public void setPointComportemental3(String pointComportemental3) {
        this.pointComportemental3 = pointComportemental3;
    }

    public void setPointComportemental4(String pointComportemental4) {
        this.pointComportemental4 = pointComportemental4;
    }

    public void setPointComportemental5(String pointComportemental5) {
        this.pointComportemental5 = pointComportemental5;
    }

    public void setPointComportemental6(String pointComportemental6) {
        this.pointComportemental6 = pointComportemental6;
    }

    public void setPointLivretPrevention1(String pointLivretPrevention1) {
        this.pointLivretPrevention1 = pointLivretPrevention1;
    }

    public void setPointLivretPrevention2(String pointLivretPrevention2) {
        this.pointLivretPrevention2 = pointLivretPrevention2;
    }

    public void setPointLivretPrevention3(String pointLivretPrevention3) {
        this.pointLivretPrevention3 = pointLivretPrevention3;
    }

    public void setPointLivretPrevention4(String pointLivretPrevention4) {
        this.pointLivretPrevention4 = pointLivretPrevention4;
    }

    public void setPointLivretPrevention5(String pointLivretPrevention5) {
        this.pointLivretPrevention5 = pointLivretPrevention5;
    }

    public void setPointLivretPrevention6(String pointLivretPrevention6) {
        this.pointLivretPrevention6 = pointLivretPrevention6;
    }

    public void setPointJourneeMetier1(String pointJourneeMetier1) {
        this.pointJourneeMetier1 = pointJourneeMetier1;
    }

    public void setPointJourneeMetier2(String pointJourneeMetier2) {
        this.pointJourneeMetier2 = pointJourneeMetier2;
    }

    public void setPointJourneeMetier3(String pointJourneeMetier3) {
        this.pointJourneeMetier3 = pointJourneeMetier3;
    }

    public void setPointJourneeMetier4(String pointJourneeMetier4) {
        this.pointJourneeMetier4 = pointJourneeMetier4;
    }

    public void setPointJourneeMetier5(String pointJourneeMetier5) {
        this.pointJourneeMetier5 = pointJourneeMetier5;
    }

    public void setPointJourneeMetier6(String pointJourneeMetier6) {
        this.pointJourneeMetier6 = pointJourneeMetier6;
    }

    public void setDateRisque1(Date dateRisque1) {
        this.dateRisque1 = dateRisque1;
    }

    public void setDateRisque2(Date dateRisque2) {
        this.dateRisque2 = dateRisque2;
    }

    public void setDateRisque3(Date dateRisque3) {
        this.dateRisque3 = dateRisque3;
    }

    public void setDateRisque4(Date dateRisque4) {
        this.dateRisque4 = dateRisque4;
    }

    public void setDateRisque5(Date dateRisque5) {
        this.dateRisque5 = dateRisque5;
    }

    public void setDateRisque6(Date dateRisque6) {
        this.dateRisque6 = dateRisque6;
    }

    public void setDateMRE1(Date dateMRE1) {
        this.dateMRE1 = dateMRE1;
    }

    public void setDateMRE2(Date dateMRE2) {
        this.dateMRE2 = dateMRE2;
    }

    public void setDateMRE3(Date dateMRE3) {
        this.dateMRE3 = dateMRE3;
    }

    public void setDateMRE4(Date dateMRE4) {
        this.dateMRE4 = dateMRE4;
    }

    public void setDateMRE5(Date dateMRE5) {
        this.dateMRE5 = dateMRE5;
    }

    public void setDateMRE6(Date dateMRE6) {
        this.dateMRE6 = dateMRE6;
    }

    public void setDateRisqueRoutier1(Date dateRisqueRoutier1) {
        this.dateRisqueRoutier1 = dateRisqueRoutier1;
    }

    public void setDateRisqueRoutier2(Date dateRisqueRoutier2) {
        this.dateRisqueRoutier2 = dateRisqueRoutier2;
    }

    public void setDateRisqueRoutier3(Date dateRisqueRoutier3) {
        this.dateRisqueRoutier3 = dateRisqueRoutier3;
    }

    public void setDateRisqueRoutier4(Date dateRisqueRoutier4) {
        this.dateRisqueRoutier4 = dateRisqueRoutier4;
    }

    public void setDateRisqueRoutier5(Date dateRisqueRoutier5) {
        this.dateRisqueRoutier5 = dateRisqueRoutier5;
    }

    public void setDateRisqueRoutier6(Date dateRisqueRoutier6) {
        this.dateRisqueRoutier6 = dateRisqueRoutier6;
    }

    public void setDateReglementaire1(Date dateReglementaire1) {
        this.dateReglementaire1 = dateReglementaire1;
    }

    public void setDateReglementaire2(Date dateReglementaire2) {
        this.dateReglementaire2 = dateReglementaire2;
    }

    public void setDateReglementaire3(Date dateReglementaire3) {
        this.dateReglementaire3 = dateReglementaire3;
    }

    public void setDateReglementaire4(Date dateReglementaire4) {
        this.dateReglementaire4 = dateReglementaire4;
    }

    public void setDateReglementaire5(Date dateReglementaire5) {
        this.dateReglementaire5 = dateReglementaire5;
    }

    public void setDateReglementaire6(Date dateReglementaire6) {
        this.dateReglementaire6 = dateReglementaire6;
    }

    public void setDateComportemental1(Date dateComportemental1) {
        this.dateComportemental1 = dateComportemental1;
    }

    public void setDateComportemental2(Date dateComportemental2) {
        this.dateComportemental2 = dateComportemental2;
    }

    public void setDateComportemental3(Date dateComportemental3) {
        this.dateComportemental3 = dateComportemental3;
    }

    public void setDateComportemental4(Date dateComportemental4) {
        this.dateComportemental4 = dateComportemental4;
    }

    public void setDateComportemental5(Date dateComportemental5) {
        this.dateComportemental5 = dateComportemental5;
    }

    public void setDateComportemental6(Date dateComportemental6) {
        this.dateComportemental6 = dateComportemental6;
    }

    public void setDateLivretPrevention1(Date dateLivretPrevention1) {
        this.dateLivretPrevention1 = dateLivretPrevention1;
    }

    public void setDateLivretPrevention2(Date dateLivretPrevention2) {
        this.dateLivretPrevention2 = dateLivretPrevention2;
    }

    public void setDateLivretPrevention3(Date dateLivretPrevention3) {
        this.dateLivretPrevention3 = dateLivretPrevention3;
    }

    public void setDateLivretPrevention4(Date dateLivretPrevention4) {
        this.dateLivretPrevention4 = dateLivretPrevention4;
    }

    public void setDateLivretPrevention5(Date dateLivretPrevention5) {
        this.dateLivretPrevention5 = dateLivretPrevention5;
    }

    public void setDateLivretPrevention6(Date dateLivretPrevention6) {
        this.dateLivretPrevention6 = dateLivretPrevention6;
    }

    public void setDateJourneeMetier1(Date dateJourneeMetier1) {
        this.dateJourneeMetier1 = dateJourneeMetier1;
    }

    public void setDateJourneeMetier2(Date dateJourneeMetier2) {
        this.dateJourneeMetier2 = dateJourneeMetier2;
    }

    public void setDateJourneeMetier3(Date dateJourneeMetier3) {
        this.dateJourneeMetier3 = dateJourneeMetier3;
    }

    public void setDateJourneeMetier4(Date dateJourneeMetier4) {
        this.dateJourneeMetier4 = dateJourneeMetier4;
    }

    public void setDateJourneeMetier5(Date dateJourneeMetier5) {
        this.dateJourneeMetier5 = dateJourneeMetier5;
    }

    public void setDateJourneeMetier6(Date dateJourneeMetier6) {
        this.dateJourneeMetier6 = dateJourneeMetier6;
    }

    public Date getDateRisquModif1() {
        return dateRisquModif1;
    }

    public void setDateRisquModif1(Date dateRisquModif1) {
        this.dateRisquModif1 = dateRisquModif1;
    }

    public Date getDateRisquModif2() {
        return dateRisquModif2;
    }

    public void setDateRisquModif2(Date dateRisquModif2) {
        this.dateRisquModif2 = dateRisquModif2;
    }

    public Date getDateRisquModif3() {
        return dateRisquModif3;
    }

    public void setDateRisquModif3(Date dateRisquModif3) {
        this.dateRisquModif3 = dateRisquModif3;
    }

    public Date getDateRisquModif4() {
        return dateRisquModif4;
    }

    public void setDateRisquModif4(Date dateRisquModif4) {
        this.dateRisquModif4 = dateRisquModif4;
    }

    public Date getDateRisquModif5() {
        return dateRisquModif5;
    }

    public void setDateRisquModif5(Date dateRisquModif5) {
        this.dateRisquModif5 = dateRisquModif5;
    }

    public Date getDateRisquModif6() {
        return dateRisquModif6;
    }

    public void setDateRisquModif6(Date dateRisquModif6) {
        this.dateRisquModif6 = dateRisquModif6;
    }

    public Date getDateMREModif1() {
        return dateMREModif1;
    }

    public void setDateMREModif1(Date dateMREModif1) {
        this.dateMREModif1 = dateMREModif1;
    }

    public Date getDateMREModif2() {
        return dateMREModif2;
    }

    public void setDateMREModif2(Date dateMREModif2) {
        this.dateMREModif2 = dateMREModif2;
    }

    public Date getDateMREModif3() {
        return dateMREModif3;
    }

    public void setDateMREModif3(Date dateMREModif3) {
        this.dateMREModif3 = dateMREModif3;
    }

    public Date getDateMREModif4() {
        return dateMREModif4;
    }

    public void setDateMREModif4(Date dateMREModif4) {
        this.dateMREModif4 = dateMREModif4;
    }

    public Date getDateMREModif5() {
        return dateMREModif5;
    }

    public void setDateMREModif5(Date dateMREModif5) {
        this.dateMREModif5 = dateMREModif5;
    }

    public Date getDateMREModif6() {
        return dateMREModif6;
    }

    public void setDateMREModif6(Date dateMREModif6) {
        this.dateMREModif6 = dateMREModif6;
    }

    public Date getDateRisqueRoutierModif1() {
        return dateRisqueRoutierModif1;
    }

    public void setDateRisqueRoutierModif1(Date dateRisqueRoutierModif1) {
        this.dateRisqueRoutierModif1 = dateRisqueRoutierModif1;
    }

    public Date getDateRisqueRoutierModif2() {
        return dateRisqueRoutierModif2;
    }

    public void setDateRisqueRoutierModif2(Date dateRisqueRoutierModif2) {
        this.dateRisqueRoutierModif2 = dateRisqueRoutierModif2;
    }

    public Date getDateRisqueRoutierModif3() {
        return dateRisqueRoutierModif3;
    }

    public void setDateRisqueRoutierModif3(Date dateRisqueRoutierModif3) {
        this.dateRisqueRoutierModif3 = dateRisqueRoutierModif3;
    }

    public Date getDateRisqueRoutierModif4() {
        return dateRisqueRoutierModif4;
    }

    public void setDateRisqueRoutierModif4(Date dateRisqueRoutierModif4) {
        this.dateRisqueRoutierModif4 = dateRisqueRoutierModif4;
    }

    public Date getDateRisqueRoutierModif5() {
        return dateRisqueRoutierModif5;
    }

    public void setDateRisqueRoutierModif5(Date dateRisqueRoutierModif5) {
        this.dateRisqueRoutierModif5 = dateRisqueRoutierModif5;
    }

    public Date getDateRisqueRoutierModif6() {
        return dateRisqueRoutierModif6;
    }

    public void setDateRisqueRoutierModif6(Date dateRisqueRoutierModif6) {
        this.dateRisqueRoutierModif6 = dateRisqueRoutierModif6;
    }

    public Date getDateReglementaireModif1() {
        return dateReglementaireModif1;
    }

    public void setDateReglementaireModif1(Date dateReglementaireModif1) {
        this.dateReglementaireModif1 = dateReglementaireModif1;
    }

    public Date getDateReglementaireModif2() {
        return dateReglementaireModif2;
    }

    public void setDateReglementaireModif2(Date dateReglementaireModif2) {
        this.dateReglementaireModif2 = dateReglementaireModif2;
    }

    public Date getDateReglementaireModif3() {
        return dateReglementaireModif3;
    }

    public void setDateReglementaireModif3(Date dateReglementaireModif3) {
        this.dateReglementaireModif3 = dateReglementaireModif3;
    }

    public Date getDateReglementaireModif4() {
        return dateReglementaireModif4;
    }

    public void setDateReglementaireModif4(Date dateReglementaireModif4) {
        this.dateReglementaireModif4 = dateReglementaireModif4;
    }

    public Date getDateReglementaireModif5() {
        return dateReglementaireModif5;
    }

    public void setDateReglementaireModif5(Date dateReglementaireModif5) {
        this.dateReglementaireModif5 = dateReglementaireModif5;
    }

    public Date getDateReglementaireModif6() {
        return dateReglementaireModif6;
    }

    public void setDateReglementaireModif6(Date dateReglementaireModif6) {
        this.dateReglementaireModif6 = dateReglementaireModif6;
    }

    public Date getDateComportementalModif1() {
        return dateComportementalModif1;
    }

    public void setDateComportementalModif1(Date dateComportementalModif1) {
        this.dateComportementalModif1 = dateComportementalModif1;
    }

    public Date getDateComportementalModif2() {
        return dateComportementalModif2;
    }

    public void setDateComportementalModif2(Date dateComportementalModif2) {
        this.dateComportementalModif2 = dateComportementalModif2;
    }

    public Date getDateComportementalModif3() {
        return dateComportementalModif3;
    }

    public void setDateComportementalModif3(Date dateComportementalModif3) {
        this.dateComportementalModif3 = dateComportementalModif3;
    }

    public Date getDateComportementalModif4() {
        return dateComportementalModif4;
    }

    public void setDateComportementalModif4(Date dateComportementalModif4) {
        this.dateComportementalModif4 = dateComportementalModif4;
    }

    public Date getDateComportementalModif5() {
        return dateComportementalModif5;
    }

    public void setDateComportementalModif5(Date dateComportementalModif5) {
        this.dateComportementalModif5 = dateComportementalModif5;
    }

    public Date getDateComportementalModif6() {
        return dateComportementalModif6;
    }

    public void setDateComportementalModif6(Date dateComportementalModif6) {
        this.dateComportementalModif6 = dateComportementalModif6;
    }

    public Date getDateLivretPreventionModif1() {
        return dateLivretPreventionModif1;
    }

    public void setDateLivretPreventionModif1(Date dateLivretPreventionModif1) {
        this.dateLivretPreventionModif1 = dateLivretPreventionModif1;
    }

    public Date getDateLivretPreventionModif2() {
        return dateLivretPreventionModif2;
    }

    public void setDateLivretPreventionModif2(Date dateLivretPreventionModif2) {
        this.dateLivretPreventionModif2 = dateLivretPreventionModif2;
    }

    public Date getDateLivretPreventionModif3() {
        return dateLivretPreventionModif3;
    }

    public void setDateLivretPreventionModif3(Date dateLivretPreventionModif3) {
        this.dateLivretPreventionModif3 = dateLivretPreventionModif3;
    }

    public Date getDateLivretPreventionModif4() {
        return dateLivretPreventionModif4;
    }

    public void setDateLivretPreventionModif4(Date dateLivretPreventionModif4) {
        this.dateLivretPreventionModif4 = dateLivretPreventionModif4;
    }

    public Date getDateLivretPreventionModif5() {
        return dateLivretPreventionModif5;
    }

    public void setDateLivretPreventionModif5(Date dateLivretPreventionModif5) {
        this.dateLivretPreventionModif5 = dateLivretPreventionModif5;
    }

    public Date getDateLivretPreventionModif6() {
        return dateLivretPreventionModif6;
    }

    public void setDateLivretPreventionModif6(Date dateLivretPreventionModif6) {
        this.dateLivretPreventionModif6 = dateLivretPreventionModif6;
    }

    public Date getDateJourneeMetierModif1() {
        return dateJourneeMetierModif1;
    }

    public void setDateJourneeMetierModif1(Date dateJourneeMetierModif1) {
        this.dateJourneeMetierModif1 = dateJourneeMetierModif1;
    }

    public Date getDateJourneeMetierModif2() {
        return dateJourneeMetierModif2;
    }

    public void setDateJourneeMetierModif2(Date dateJourneeMetierModif2) {
        this.dateJourneeMetierModif2 = dateJourneeMetierModif2;
    }

    public Date getDateJourneeMetierModif3() {
        return dateJourneeMetierModif3;
    }

    public void setDateJourneeMetierModif3(Date dateJourneeMetierModif3) {
        this.dateJourneeMetierModif3 = dateJourneeMetierModif3;
    }

    public Date getDateJourneeMetierModif4() {
        return dateJourneeMetierModif4;
    }

    public void setDateJourneeMetierModif4(Date dateJourneeMetierModif4) {
        this.dateJourneeMetierModif4 = dateJourneeMetierModif4;
    }

    public Date getDateJourneeMetierModif5() {
        return dateJourneeMetierModif5;
    }

    public void setDateJourneeMetierModif5(Date dateJourneeMetierModif5) {
        this.dateJourneeMetierModif5 = dateJourneeMetierModif5;
    }

    public Date getDateJourneeMetierModif6() {
        return dateJourneeMetierModif6;
    }

    public void setDateJourneeMetierModif6(Date dateJourneeMetierModif6) {
        this.dateJourneeMetierModif6 = dateJourneeMetierModif6;
    }
}
