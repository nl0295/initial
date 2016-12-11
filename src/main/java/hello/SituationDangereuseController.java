package hello;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.ws.rs.core.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by nicol on 17/11/2016.
 */
@CrossOrigin(origins= "*")
@Controller
public class SituationDangereuseController{

    public static final String DEST = "/PDF/SD/situationDangereuse";
    @Autowired
    SituationDangereuseDao situationDangereuseDao;


    @RequestMapping("/situationDangereuse")
    public @ResponseBody boolean ajouter(@RequestBody @Valid final SituationDangereuse sd, @Context final HttpServletRequest request) throws DocumentException, IOException {

        SituationDangereuse foundSd=sd;
        System.out.println("Chantier :" + sd.getChantier());
        System.out.println("Description :" + sd.getDescription());
        System.out.println("Action :" + sd.getActionImmediate());

        int id=situationDangereuseDao.ajouterSituationDangereuse(foundSd.getSDBDD());

        // Creation PDF
        PDFSituationDangereuse pdfSD = new PDFSituationDangereuse(foundSd);
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(DEST+id+".pdf"));
        document.open();
        pdfSD.addMetaData(document);
        pdfSD.addContent(document);
        document.close();

        //Ajout BDD
        return true;
    }

    @RequestMapping("/situationDangereuseVisu")
    public @ResponseBody
    List<SituationDangereuse_BDD> lister() throws IOException {
        return situationDangereuseDao.getSituationsDangereuses();
    }

    @RequestMapping("/situationD")
    public @ResponseBody
    List<SituationDangereuse_BDD> listerSD(@RequestBody @Valid final String login, @Context final HttpServletRequest request) throws IOException {
        return situationDangereuseDao.getSituationsDangereusesPSS(login);
    }

    @RequestMapping(value = "/getPDF", method = RequestMethod.GET)
    public @ResponseBody byte[] getOpenedEventsInPdf(HttpServletResponse response) {
        return null;
    }


}
