package hello;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PAP_BDD {

    private int id;
    private Date datePAP;
    private String pointFort1;
    private String pointFort2;
    private String pointFort3;
    private String pointFaible1;
    private String pointFaible2;
    private String pointFaible3;

    private List<Reunion> risque;
    private List<Reunion> mre;
    private List<Reunion> risqueRoutier;
    private List<Reunion> reglementaire;
    private List<Reunion> comportemental;
    private List<Reunion> livretPrevention;
    private List<Reunion> journeeMetier;

    public PAP_BDD(){}

    public PAP_BDD(PAP pap){
        risque = new ArrayList<Reunion>();
        mre = new ArrayList<Reunion>();
        risqueRoutier = new ArrayList<Reunion>();
        reglementaire = new ArrayList<Reunion>();
        comportemental = new ArrayList<Reunion>();
        livretPrevention = new ArrayList<Reunion>();
        journeeMetier = new ArrayList<Reunion>();

        this.id=pap.getId();
        this.pointFort1=pap.getPointFort1();
        this.pointFort2=pap.getPointFort2();
        this.pointFort3=pap.getPointFort3();
        this.pointFaible1=pap.getPointFaible1();
        this.pointFaible2=pap.getPointFaible2();
        this.pointFaible3=pap.getPointFaible3();

        if(pap.getPointRisques1()!=null&&pap.getPointRisques1()!="") risque.add(new Reunion(pap.getPointRisques1(),pap.getDateRisque1()));
        if(pap.getPointRisques2()!=null&&pap.getPointRisques2()!="") risque.add(new Reunion(pap.getPointRisques2(),pap.getDateRisque2()));
        if(pap.getPointRisques3()!=null&&pap.getPointRisques3()!="") risque.add(new Reunion(pap.getPointRisques3(),pap.getDateRisque3()));
        if(pap.getPointRisques4()!=null&&pap.getPointRisques4()!="") risque.add(new Reunion(pap.getPointRisques4(),pap.getDateRisque4()));
        if(pap.getPointRisques5()!=null&&pap.getPointRisques5()!="") risque.add(new Reunion(pap.getPointRisques5(),pap.getDateRisque5()));
        if(pap.getPointRisques6()!=null&&pap.getPointRisques6()!="") risque.add(new Reunion(pap.getPointRisques6(),pap.getDateRisque6()));

        if(pap.getPointMRE1()!=null&&pap.getPointMRE1()!="") mre.add(new Reunion(pap.getPointMRE1(),pap.getDateMRE1()));
        if(pap.getPointMRE2()!=null&&pap.getPointMRE2()!="") mre.add(new Reunion(pap.getPointMRE2(),pap.getDateMRE2()));
        if(pap.getPointMRE3()!=null&&pap.getPointMRE3()!="") mre.add(new Reunion(pap.getPointMRE3(),pap.getDateMRE3()));
        if(pap.getPointMRE4()!=null&&pap.getPointMRE4()!="") mre.add(new Reunion(pap.getPointMRE4(),pap.getDateMRE4()));
        if(pap.getPointMRE5()!=null&&pap.getPointMRE5()!="") mre.add(new Reunion(pap.getPointMRE5(),pap.getDateMRE5()));
        if(pap.getPointMRE6()!=null&&pap.getPointMRE6()!="") mre.add(new Reunion(pap.getPointMRE6(),pap.getDateMRE6()));

        if(pap.getPointRisqueRoutier1()!=null&&pap.getPointRisqueRoutier1()!="") risqueRoutier.add(new Reunion(pap.getPointRisqueRoutier1(),pap.getDateRisqueRoutier1()));
        if(pap.getPointRisqueRoutier2()!=null&&pap.getPointRisqueRoutier2()!="") risqueRoutier.add(new Reunion(pap.getPointRisqueRoutier2(),pap.getDateRisqueRoutier2()));
        if(pap.getPointRisqueRoutier3()!=null&&pap.getPointRisqueRoutier3()!="") risqueRoutier.add(new Reunion(pap.getPointRisqueRoutier3(),pap.getDateRisqueRoutier3()));
        if(pap.getPointRisqueRoutier4()!=null&&pap.getPointRisqueRoutier4()!="") risqueRoutier.add(new Reunion(pap.getPointRisqueRoutier4(),pap.getDateRisqueRoutier4()));
        if(pap.getPointRisqueRoutier5()!=null&&pap.getPointRisqueRoutier5()!="") risqueRoutier.add(new Reunion(pap.getPointRisqueRoutier5(),pap.getDateRisqueRoutier5()));
        if(pap.getPointRisqueRoutier6()!=null&&pap.getPointRisqueRoutier6()!="") risqueRoutier.add(new Reunion(pap.getPointRisqueRoutier6(),pap.getDateRisqueRoutier6()));

        if(pap.getPointReglementaire1()!=null&&pap.getPointReglementaire1()!="") reglementaire.add(new Reunion(pap.getPointReglementaire1(),pap.getDateReglementaire1()));
        if(pap.getPointReglementaire2()!=null&&pap.getPointReglementaire2()!="") reglementaire.add(new Reunion(pap.getPointReglementaire2(),pap.getDateReglementaire2()));
        if(pap.getPointReglementaire3()!=null&&pap.getPointReglementaire3()!="") reglementaire.add(new Reunion(pap.getPointReglementaire3(),pap.getDateReglementaire3()));
        if(pap.getPointReglementaire4()!=null&&pap.getPointReglementaire4()!="") reglementaire.add(new Reunion(pap.getPointReglementaire4(),pap.getDateReglementaire4()));
        if(pap.getPointReglementaire5()!=null&&pap.getPointReglementaire5()!="") reglementaire.add(new Reunion(pap.getPointReglementaire5(),pap.getDateReglementaire5()));
        if(pap.getPointReglementaire6()!=null&&pap.getPointReglementaire6()!="") reglementaire.add(new Reunion(pap.getPointReglementaire6(),pap.getDateReglementaire6()));

        if(pap.getPointComportemental1()!=null&&pap.getPointComportemental1()!="") comportemental.add(new Reunion(pap.getPointComportemental1(),pap.getDateComportemental1()));
        if(pap.getPointComportemental2()!=null&&pap.getPointComportemental2()!="") comportemental.add(new Reunion(pap.getPointComportemental2(),pap.getDateComportemental2()));
        if(pap.getPointComportemental3()!=null&&pap.getPointComportemental3()!="") comportemental.add(new Reunion(pap.getPointComportemental3(),pap.getDateComportemental3()));
        if(pap.getPointComportemental4()!=null&&pap.getPointComportemental4()!="") comportemental.add(new Reunion(pap.getPointComportemental4(),pap.getDateComportemental4()));
        if(pap.getPointComportemental5()!=null&&pap.getPointComportemental5()!="") comportemental.add(new Reunion(pap.getPointComportemental5(),pap.getDateComportemental5()));
        if(pap.getPointComportemental6()!=null&&pap.getPointComportemental6()!="") comportemental.add(new Reunion(pap.getPointComportemental6(),pap.getDateComportemental6()));

        if(pap.getPointLivretPrevention1()!=null&&pap.getPointLivretPrevention1()!="") livretPrevention.add(new Reunion(pap.getPointLivretPrevention1(),pap.getDateLivretPrevention1()));
        if(pap.getPointLivretPrevention2()!=null&&pap.getPointLivretPrevention2()!="") livretPrevention.add(new Reunion(pap.getPointLivretPrevention2(),pap.getDateLivretPrevention2()));
        if(pap.getPointLivretPrevention3()!=null&&pap.getPointLivretPrevention3()!="") livretPrevention.add(new Reunion(pap.getPointLivretPrevention3(),pap.getDateLivretPrevention3()));
        if(pap.getPointLivretPrevention4()!=null&&pap.getPointLivretPrevention4()!="") livretPrevention.add(new Reunion(pap.getPointLivretPrevention4(),pap.getDateLivretPrevention4()));
        if(pap.getPointLivretPrevention5()!=null&&pap.getPointLivretPrevention5()!="") livretPrevention.add(new Reunion(pap.getPointLivretPrevention5(),pap.getDateLivretPrevention5()));
        if(pap.getPointLivretPrevention6()!=null&&pap.getPointLivretPrevention6()!="") livretPrevention.add(new Reunion(pap.getPointLivretPrevention6(),pap.getDateLivretPrevention6()));

        if(pap.getPointJourneeMetier1()!=null&&pap.getPointJourneeMetier1()!="") journeeMetier.add(new Reunion(pap.getPointJourneeMetier1(),pap.getDateJourneeMetier1()));
        if(pap.getPointJourneeMetier2()!=null&&pap.getPointJourneeMetier2()!="") journeeMetier.add(new Reunion(pap.getPointJourneeMetier2(),pap.getDateJourneeMetier2()));
        if(pap.getPointJourneeMetier3()!=null&&pap.getPointJourneeMetier3()!="") journeeMetier.add(new Reunion(pap.getPointJourneeMetier3(),pap.getDateJourneeMetier3()));
        if(pap.getPointJourneeMetier4()!=null&&pap.getPointJourneeMetier4()!="") journeeMetier.add(new Reunion(pap.getPointJourneeMetier4(),pap.getDateJourneeMetier4()));
        if(pap.getPointJourneeMetier5()!=null&&pap.getPointJourneeMetier5()!="") journeeMetier.add(new Reunion(pap.getPointJourneeMetier5(),pap.getDateJourneeMetier5()));
        if(pap.getPointJourneeMetier6()!=null&&pap.getPointJourneeMetier6()!="") journeeMetier.add(new Reunion(pap.getPointJourneeMetier6(),pap.getDateJourneeMetier6()));
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatePAP() {
        return datePAP;
    }

    public void setDatePAP(Date datePAP) {
        this.datePAP = datePAP;
    }

    public String getPointFort1() {
        return pointFort1;
    }

    public void setPointFort1(String pointFort1) {
        this.pointFort1 = pointFort1;
    }

    public String getPointFort2() {
        return pointFort2;
    }

    public void setPointFort2(String pointFort2) {
        this.pointFort2 = pointFort2;
    }

    public String getPointFort3() {
        return pointFort3;
    }

    public void setPointFort3(String pointFort3) {
        this.pointFort3 = pointFort3;
    }

    public String getPointFaible1() {
        return pointFaible1;
    }

    public void setPointFaible1(String pointFaible1) {
        this.pointFaible1 = pointFaible1;
    }

    public String getPointFaible2() {
        return pointFaible2;
    }

    public void setPointFaible2(String pointFaible2) {
        this.pointFaible2 = pointFaible2;
    }

    public String getPointFaible3() {
        return pointFaible3;
    }

    public void setRisque(List<Reunion> risque) {
        this.risque = risque;
    }

    public void setMre(List<Reunion> mre) {
        this.mre = mre;
    }

    public void setRisqueRoutier(List<Reunion> risqueRoutier) {
        this.risqueRoutier = risqueRoutier;
    }

    public void setReglementaire(List<Reunion> reglementaire) {
        this.reglementaire = reglementaire;
    }

    public void setComportemental(List<Reunion> comportemental) {
        this.comportemental = comportemental;
    }

    public void setLivretPrevention(List<Reunion> livretPrevention) {
        this.livretPrevention = livretPrevention;
    }

    public void setJourneeMetier(List<Reunion> journeeMetier) {
        this.journeeMetier = journeeMetier;
    }

    public List<Reunion> getRisque() {
        return risque;
    }

    public List<Reunion> getMre() {
        return mre;
    }

    public List<Reunion> getRisqueRoutier() {
        return risqueRoutier;
    }

    public List<Reunion> getReglementaire() {
        return reglementaire;
    }

    public List<Reunion> getComportemental() {
        return comportemental;
    }

    public List<Reunion> getLivretPrevention() {
        return livretPrevention;
    }

    public List<Reunion> getJourneeMetier() {
        return journeeMetier;
    }
}
