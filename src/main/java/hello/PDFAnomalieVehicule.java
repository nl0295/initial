package hello;

import com.itextpdf.text.*;

/**
 * Created by nicol on 22/11/2016.
 */
public class PDFAnomalieVehicule {

    private AnomalieVehicule anomalieVehicule;

    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
            Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL, BaseColor.RED);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);

    public PDFAnomalieVehicule(AnomalieVehicule anomalieVehicule){
        this.anomalieVehicule=anomalieVehicule;
    }

    public void addMetaData(Document document) {
        document.addTitle("Anomalie Véhicule");
        //document.addSubject("Using iText");
        document.addKeywords("anomalie, vehicule, av, elivret");
        document.addAuthor("elivret");
        document.addCreator("elivret");
    }

    public void addContent(Document document)
            throws DocumentException {

        String titre = "[Anomalie Véhicule]";
        String chantier = "Immatriculation : "+anomalieVehicule.getImmatriculation();
        String description = "Titre : "+anomalieVehicule.getTitre();
        String action = "Détails : "+anomalieVehicule.getDetail();

        Paragraph preface = new Paragraph();
        // We add one empty line
        addEmptyLine(preface, 1);
        // Big header

        preface.add(new Paragraph(titre,catFont));
        addEmptyLine(preface, 2);

        preface.add(new Paragraph(chantier));
        preface.add(new Paragraph(description));
        preface.add(new Paragraph(action));
        addEmptyLine(preface, 1);

        document.add(preface);

    }

    private void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }


}
