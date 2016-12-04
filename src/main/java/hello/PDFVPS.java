package hello;

import com.itextpdf.text.*;

import java.text.SimpleDateFormat;

/**
 * Created by nicol on 23/11/2016.
 */
public class PDFVPS {

    private VPS vps;

    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static Font titreFont = new Font(Font.FontFamily.TIMES_ROMAN, 14,
            Font.BOLD);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.UNDERLINE);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 10,
            Font.NORMAL);

    public PDFVPS(VPS vps){
        this.vps=vps;
    }

    public void addMetaData(Document document) {
        document.addTitle("VPS");
        //document.addSubject("Using iText");
        document.addKeywords("visite, chantier, vps, elivret");
        document.addAuthor("elivret");
        document.addCreator("elivret");
    }

    public void addContent(Document document)
            throws DocumentException {

        String titre = "Compte-Rendu VPS";
        String titre1 ="Informations complémentaires";
        String titre2 ="Maîtrise des Risques";
        String titre3 ="Professionnalisme et Organisation de l'équipe";
        String titre4 ="Observations émises par le visiteur ou par le visité";
        String titre5 ="Bilan";
        String soustitre1 = "Préparation du travail";
        String soustitre2 = "Gestion des risques par l'équipe de travail";
        String soustitre3 = "Points Forts";
        String soustitre4 = "Points à améliorer";

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String date = "Date : " + dateFormat.format(vps.getDateVPS());
        String chantier = "Chantier : "+vps.getChantierVPS();
        String duree = "Durée de la visite : "+vps.getDureeVPS();
        String visiteur = "Conduite par : "+vps.getVisiteurVPS();
        String chargesTrv = "Chargés de travaux : "+vps.getChargeTravauxVPS();

        if(vps.getNomAgentVPS1()!=null&&vps.getNomAgentVPS1()!="") chargesTrv+=", "+vps.getNomAgentVPS1();
        if(vps.getNomAgentVPS2()!=null&&vps.getNomAgentVPS2()!="") chargesTrv+=", "+vps.getNomAgentVPS2();
        if(vps.getNomAgentVPS3()!=null&&vps.getNomAgentVPS3()!="") chargesTrv+=", "+vps.getNomAgentVPS3();
        if(vps.getNomAgentVPS4()!=null&&vps.getNomAgentVPS4()!="") chargesTrv+=", "+vps.getNomAgentVPS4();
        if(vps.getNomAgentVPS5()!=null&&vps.getNomAgentVPS5()!="") chargesTrv+=", "+vps.getNomAgentVPS5();
        if(vps.getNomAgentVPS6()!=null&&vps.getNomAgentVPS6()!="") chargesTrv+=", "+vps.getNomAgentVPS6();



        String branche ="Branche d'activité : "+vps.getActiviteVPS();
        String designation ="Désignation de l'intervention : "+vps.getDesignationInterv();
        String typeE ="Type d'énergie : "+vps.getTypeE();
        String methode ="Méthode de travail : "+vps.getMethodeTvx();
        String remarque ="Remarque(s) supplémentaire(s) : "+vps.getRemarqueVps();

        String risquesBon ="Risques signalés sur le Bon du travail : "+vps.getRisqueSignale();
        String top ="TOP : ";
        String autresRisquesResp ="Autres risques pris en compte par le responsable de l'équipe avant intervention : "+vps.getAutreRisqueResponsable();
        String respectCpp ="Respect des CPP - Consignes - Instructions : "+vps.getRespectCPP();
        String epi ="EP individuelles et collectives : "+vps.getEpi();
        String hauteurBalisage ="Travaux en hauteur - Engins - Balisages : "+vps.getTrxEngin();
        String autresRisques ="Autres risques : "+vps.getAutresRisques();

        String organisation ="Organisation de l'intervention et répartition des tâches : "+vps.getOrganisationIntervention();
        String proprete ="Propreté et qualité du travail : "+vps.getPropreteQualite();
        String respectDelais ="Respect des délais et du temps: "+vps.getDelaisTemps();
        String etatOutillage ="Etat de l'outillage et des véhicules : "+vps.getEtatOutillage();
        String autresObs ="Autre(s) observation(s) : "+vps.getAutreObservation();

        String obsVisiteur ="Observations émises par le visiteur : "+vps.getObservationVisiteur();
        String obsVisite ="Observations émises par le visité : "+vps.getObservationVisite();

        String pointFort1 ="1er point fort : "+vps.getPtFort1();
        String pointFort2 ="2ème point fort : "+vps.getPtFort2();
        String pointFort3 ="3ème point fort : "+vps.getPtFort3();

        String pointAmelio1 ="1er point à améliorer : "+vps.getPtFaible1();
        String pointAmelio2 ="2ème point à améliorer : "+vps.getPtFaible2();
        String pointAmelio3 ="3ème point à améliorer : "+vps.getPtFaible3();
        String resp1 ="Responsable : "+vps.getResp1();
        String resp2 ="Responsable : "+vps.getResp2();
        String resp3 ="Responsable : "+vps.getResp3();




        Paragraph preface = new Paragraph();

        //titre
        addEmptyLine(preface, 1);
        Paragraph paraTitre = new Paragraph(titre,catFont);
        paraTitre.setAlignment(Element.ALIGN_CENTER);
        preface.add(paraTitre);
        addEmptyLine(preface, 2);

        //infos
        preface.add(new Paragraph(date,smallBold));
        preface.add(new Paragraph(chantier,smallBold));
        preface.add(new Paragraph(duree,smallBold));
        preface.add(new Paragraph(visiteur,smallBold));
        preface.add(new Paragraph(chargesTrv,smallBold));
        addEmptyLine(preface, 1);

        //infos complementaires
        preface.add(new Paragraph(titre1,titreFont));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph(branche,smallBold));
        preface.add(new Paragraph(designation,smallBold));
        preface.add(new Paragraph(typeE,smallBold));
        preface.add(new Paragraph(methode,smallBold));
        preface.add(new Paragraph(remarque,smallBold));
        addEmptyLine(preface, 1);

        //maitrise des risques
        preface.add(new Paragraph(titre2,titreFont));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph(soustitre1,subFont));
        preface.add(new Paragraph(risquesBon,smallBold));
        preface.add(new Paragraph(top,smallBold));
        preface.add(new Paragraph(autresRisquesResp,smallBold));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph(soustitre2,subFont));
        preface.add(new Paragraph(respectCpp,smallBold));
        preface.add(new Paragraph(epi,smallBold));
        preface.add(new Paragraph(hauteurBalisage,smallBold));
        preface.add(new Paragraph(autresRisques,smallBold));
        addEmptyLine(preface, 1);

        //professionnalisme
        preface.add(new Paragraph(titre3,titreFont));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph(organisation,smallBold));
        preface.add(new Paragraph(proprete,smallBold));
        preface.add(new Paragraph(respectDelais,smallBold));
        preface.add(new Paragraph(etatOutillage,smallBold));
        preface.add(new Paragraph(autresObs,smallBold));
        addEmptyLine(preface, 1);

        //observations
        preface.add(new Paragraph(titre4,titreFont));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph(obsVisiteur,smallBold));
        preface.add(new Paragraph(obsVisite,smallBold));
        addEmptyLine(preface, 1);

        //bilan
        preface.add(new Paragraph(titre5,titreFont));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph(soustitre3,subFont));
        preface.add(new Paragraph(pointFort1,smallBold));
        preface.add(new Paragraph(pointFort2,smallBold));
        preface.add(new Paragraph(pointFort3,smallBold));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph(soustitre4,subFont));
        preface.add(new Paragraph(pointAmelio1,smallBold));
        preface.add(new Paragraph(resp1,smallBold));
        preface.add(new Paragraph(pointAmelio2,smallBold));
        preface.add(new Paragraph(resp2,smallBold));
        preface.add(new Paragraph(pointAmelio3,smallBold));
        preface.add(new Paragraph(resp3,smallBold));



        document.add(preface);

    }

    private void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" ",smallBold));
        }
    }
}
