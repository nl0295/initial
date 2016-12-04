package hello;


import com.itextpdf.text.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PDFPAP {

    private PAP pap;

    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static Font titreFont = new Font(Font.FontFamily.TIMES_ROMAN, 14,
            Font.BOLD);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.UNDERLINE);
    private static Font smallFont = new Font(Font.FontFamily.TIMES_ROMAN, 10,
            Font.NORMAL);
    public PDFPAP(PAP pap){
        this.pap = pap;
    }

    public void addMetaData(Document document) {
        document.addTitle("PAP");
        //document.addSubject("Using iText");
        document.addKeywords("datePAP, pointFort1, pointFort2");
        document.addAuthor("elivret");
        document.addCreator("elivret");
    }

    public void addContent(Document document)
            throws DocumentException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String titre = "Compte-rendu PAP - "+dateFormat.format(pap.getDatePAP());
        String titre1 = "Retour sur l'année dernière";
        String titre2 = "Thème de la prévention et Libellé Action";
        String soustitre1 = "Points forts";
        String soustitre2 = "Points à améliorer";
        String soustitre3 = "Risques généraux";
        String soustitre4 = "MRE";
        String soustitre5 = "Risques routiers";
        String soustitre6 = "Réglementaire";
        String soustitre7 = "Comportemental";
        String soustitre8 = "Livret de prévention";
        String soustitre9 = "Journée métier";

        String pointFort1 = "1er point fort : "+pap.getPointFort1();
        String pointFort2 = "2ème point fort : "+pap.getPointFort2();
        String pointFort3 = "3ème point fort : "+pap.getPointFort3();
        String pointFaible1 = "1er point à améliorer : "+pap.getPointFaible1();
        String pointFaible2 = "2ème point à améliorer : "+pap.getPointFaible2();
        String pointFaible3 = "3ème point à améliorer : "+pap.getPointFaible3();

        String rg1 = "a) "+pap.getPointRisques1();
        String rg2 = "b) "+pap.getPointRisques2();
        String rg3 = "c) "+pap.getPointRisques3();
        String rg4 = "d) "+pap.getPointRisques4();
        String rg5 = "e) "+pap.getPointRisques5();
        String rg6 = "f) "+pap.getPointRisques6();
        String mre1 = "a) "+pap.getPointMRE1();
        String mre2 = "b) "+pap.getPointMRE2();
        String mre3 = "c) "+pap.getPointMRE3();
        String mre4 = "d) "+pap.getPointMRE4();
        String mre5 = "e) "+pap.getPointMRE5();
        String mre6 = "f) "+pap.getPointMRE6();




        Paragraph preface = new Paragraph();

        //titre
        addEmptyLine(preface, 1);
        Paragraph paraTitre = new Paragraph(titre,catFont);
        paraTitre.setAlignment(Element.ALIGN_CENTER);
        preface.add(paraTitre);
        addEmptyLine(preface, 2);

        //retour sur l'année
        preface.add(new Paragraph(titre1,titreFont));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph(soustitre1,subFont));
        if (pap.getPointFort1()!=null&&pap.getPointFort1()!="") preface.add(new Paragraph(pointFort1,smallFont));
        if (pap.getPointFort2()!=null&&pap.getPointFort2()!="") preface.add(new Paragraph(pointFort2,smallFont));
        if (pap.getPointFort3()!=null&&pap.getPointFort3()!="") preface.add(new Paragraph(pointFort3,smallFont));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph(soustitre2,subFont));
        if (pap.getPointFaible1()!=null&&pap.getPointFaible1()!="") preface.add(new Paragraph(pointFaible1,smallFont));
        if (pap.getPointFaible2()!=null&&pap.getPointFaible2()!="") preface.add(new Paragraph(pointFaible2,smallFont));
        if (pap.getPointFaible3()!=null&&pap.getPointFaible3()!="") preface.add(new Paragraph(pointFaible3,smallFont));
        addEmptyLine(preface, 1);


        //theme
        preface.add(new Paragraph(titre2,titreFont));
        addEmptyLine(preface, 1);
        //risques generaux
        preface.add(new Paragraph(soustitre3,subFont));
        addPoint(preface,pap.getPointRisques1(),pap.getDateRisque1(),1);
        addPoint(preface,pap.getPointRisques2(),pap.getDateRisque2(),2);
        addPoint(preface,pap.getPointRisques3(),pap.getDateRisque3(),3);
        addPoint(preface,pap.getPointRisques4(),pap.getDateRisque4(),4);
        addPoint(preface,pap.getPointRisques5(),pap.getDateRisque5(),5);
        addPoint(preface,pap.getPointRisques6(),pap.getDateRisque6(),6);
        addEmptyLine(preface, 1);

        //MRE
        preface.add(new Paragraph(soustitre4,subFont));
        addPoint(preface,pap.getPointMRE1(),pap.getDateMRE1(),1);
        addPoint(preface,pap.getPointMRE2(),pap.getDateMRE2(),2);
        addPoint(preface,pap.getPointMRE3(),pap.getDateMRE3(),3);
        addPoint(preface,pap.getPointMRE4(),pap.getDateMRE4(),4);
        addPoint(preface,pap.getPointMRE5(),pap.getDateMRE5(),5);
        addPoint(preface,pap.getPointMRE6(),pap.getDateMRE6(),6);
        addEmptyLine(preface, 1);

        //Risques routiers
        preface.add(new Paragraph(soustitre5,subFont));
        addPoint(preface,pap.getPointRisqueRoutier1(),pap.getDateRisqueRoutier1(),1);
        addPoint(preface,pap.getPointRisqueRoutier2(),pap.getDateRisqueRoutier2(),2);
        addPoint(preface,pap.getPointRisqueRoutier3(),pap.getDateRisqueRoutier3(),3);
        addPoint(preface,pap.getPointRisqueRoutier4(),pap.getDateRisqueRoutier4(),4);
        addPoint(preface,pap.getPointRisqueRoutier5(),pap.getDateRisqueRoutier5(),5);
        addPoint(preface,pap.getPointRisqueRoutier6(),pap.getDateRisqueRoutier6(),6);
        addEmptyLine(preface, 1);

        //Réglementaire
        preface.add(new Paragraph(soustitre6,subFont));
        addPoint(preface,pap.getPointReglementaire1(),pap.getDateReglementaire1(),1);
        addPoint(preface,pap.getPointReglementaire2(),pap.getDateReglementaire2(),2);
        addPoint(preface,pap.getPointReglementaire3(),pap.getDateReglementaire3(),3);
        addPoint(preface,pap.getPointReglementaire4(),pap.getDateReglementaire4(),4);
        addPoint(preface,pap.getPointReglementaire5(),pap.getDateReglementaire5(),5);
        addPoint(preface,pap.getPointReglementaire6(),pap.getDateReglementaire6(),6);
        addEmptyLine(preface, 1);

        //Comportemental
        preface.add(new Paragraph(soustitre7,subFont));
        addPoint(preface,pap.getPointComportemental1(),pap.getDateComportemental1(),1);
        addPoint(preface,pap.getPointComportemental2(),pap.getDateComportemental2(),2);
        addPoint(preface,pap.getPointComportemental3(),pap.getDateComportemental3(),3);
        addPoint(preface,pap.getPointComportemental4(),pap.getDateComportemental4(),4);
        addPoint(preface,pap.getPointComportemental5(),pap.getDateComportemental5(),5);
        addPoint(preface,pap.getPointComportemental6(),pap.getDateComportemental6(),6);
        addEmptyLine(preface, 1);

        //Livret de prévention
        preface.add(new Paragraph(soustitre8,subFont));
        addPoint(preface,pap.getPointLivretPrevention1(),pap.getDateLivretPrevention1(),1);
        addPoint(preface,pap.getPointLivretPrevention2(),pap.getDateLivretPrevention2(),2);
        addPoint(preface,pap.getPointLivretPrevention3(),pap.getDateLivretPrevention3(),3);
        addPoint(preface,pap.getPointLivretPrevention4(),pap.getDateLivretPrevention4(),4);
        addPoint(preface,pap.getPointLivretPrevention5(),pap.getDateLivretPrevention5(),5);
        addPoint(preface,pap.getPointLivretPrevention6(),pap.getDateLivretPrevention6(),6);
        addEmptyLine(preface, 1);

        //Journée métier
        preface.add(new Paragraph(soustitre9,subFont));
        addPoint(preface,pap.getPointJourneeMetier1(),pap.getDateJourneeMetier1(),1);
        addPoint(preface,pap.getPointJourneeMetier2(),pap.getDateJourneeMetier2(),2);
        addPoint(preface,pap.getPointJourneeMetier3(),pap.getDateJourneeMetier3(),3);
        addPoint(preface,pap.getPointJourneeMetier4(),pap.getDateJourneeMetier4(),4);
        addPoint(preface,pap.getPointJourneeMetier5(),pap.getDateJourneeMetier5(),5);
        addPoint(preface,pap.getPointJourneeMetier6(),pap.getDateJourneeMetier6(),6);




        document.add(preface);

    }

    private void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" ",smallFont));
        }
    }

    private void addPoint(Paragraph paragraph, String point, Date date, int i){
        if (point!=null&&point!="") {
            String resPoint = i+") "+point;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String resDate = "Date de réalisation : "+dateFormat.format(date);
            paragraph.add(new Paragraph(resPoint, smallFont));
            paragraph.add(new Paragraph(resDate, smallFont));
        }

    }
}
