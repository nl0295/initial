package hello;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.ws.rs.core.Context;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@CrossOrigin(origins= "*")
@Controller
public class AnomalieVehiculeController {

    public static final String DEST = "/PDF/AV/anomalieVehicule";
    @Autowired
    AnomalieVehiculeDao anomalieVehiculeDao;




    @RequestMapping("/anomalieVehicule")
    public @ResponseBody
    boolean ajouter(@RequestBody @Valid final AnomalieVehicule av, @Context final HttpServletRequest request) throws DocumentException, IOException {

        AnomalieVehicule foundAv=av;
        System.out.println("Titre :" + av.getTitre());
        System.out.println("Immatriculation :" + av.getImmatriculation());
        System.out.println("Detail :" + av.getDetail());

        int id=anomalieVehiculeDao.ajouterAnomalieVehicule(foundAv);

        // Creation PDF
        PDFAnomalieVehicule pdfSD = new PDFAnomalieVehicule(foundAv);
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(DEST+id+".pdf"));
        document.open();
        pdfSD.addMetaData(document);
        pdfSD.addContent(document);
        document.close();

        // Ajout BDD
        return true;
    }

    @RequestMapping("/anomalieVehiculeVisu")
    public @ResponseBody List<AnomalieVehicule> lister() throws IOException {
        return anomalieVehiculeDao.getAnomaliesVehicules();
    }



}
