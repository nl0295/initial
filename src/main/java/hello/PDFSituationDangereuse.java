package hello;


import java.io.IOException;
import java.util.Date;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Creation PDF Situation Dangereuse.
 */
public class PDFSituationDangereuse {

    private SituationDangereuse situationDangereuse;

    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
            Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL, BaseColor.RED);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);

    public PDFSituationDangereuse(SituationDangereuse situationDangereuse){
        this.situationDangereuse=situationDangereuse;
    }

    public void addMetaData(Document document) {
        document.addTitle("SituationDangereuse");
        //document.addSubject("Using iText");
        document.addKeywords("situation dangereuse, sd, elivret");
        document.addAuthor("elivret");
        document.addCreator("elivret");
    }

    public void addContent(Document document)
            throws DocumentException, IOException {

        String dateF=""+(situationDangereuse.getDate().getDate())+"/"+(situationDangereuse.getDate().getMonth()+1)+"/"+(situationDangereuse.getDate().getYear()+1900);

        String titre = "[Situation Dangereuse]";
        String chantier = "Chantier : "+situationDangereuse.getChantier();
        String description = "Description : "+situationDangereuse.getDescription();
        String action = "Action Immediate : "+situationDangereuse.getActionImmediate();
        String latitude = "Latitude : "+situationDangereuse.getLatitude();
        String longitude= "Longitude : "+situationDangereuse.getLongitude();
        String date = "Date : "+dateF;


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

        preface.add(new Paragraph(latitude));
        preface.add(new Paragraph(longitude));
        preface.add(new Paragraph(date));
        addEmptyLine(preface, 2);

        document.add(preface);

        if (situationDangereuse.getImgURI()!=null&&situationDangereuse.getImgURI()!="") {
            Image img = Image.getInstance(situationDangereuse.getImgURI());
            document.add(img);
            addEmptyLine(preface, 2);
        }

        if (situationDangereuse.getImgURI2()!=null&&situationDangereuse.getImgURI2()!="") {
            Image img2 = Image.getInstance(situationDangereuse.getImgURI2());
            document.add(img2);
        }


    }

    private void createTable(Section subCatPart)
            throws BadElementException {
        PdfPTable table = new PdfPTable(3);

        // t.setBorderColor(BaseColor.GRAY);
        // t.setPadding(4);
        // t.setSpacing(4);
        // t.setBorderWidth(1);

        PdfPCell c1 = new PdfPCell(new Phrase("Table Header 1"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Table Header 2"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Table Header 3"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        table.setHeaderRows(1);

        table.addCell("1.0");
        table.addCell("1.1");
        table.addCell("1.2");
        table.addCell("2.1");
        table.addCell("2.2");
        table.addCell("2.3");

        subCatPart.add(table);

    }

    private void createList(Section subCatPart) {
        List list = new List(true, false, 10);
        list.add(new ListItem("First point"));
        list.add(new ListItem("Second point"));
        list.add(new ListItem("Third point"));
        subCatPart.add(list);
    }

    private void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }









}
