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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by nicol on 17/11/2016.
 */
@CrossOrigin(origins= "http://localhost:8100")
@Controller
public class SituationDangereuseController{

    public static final String DEST = "situationDangereuse.pdf";
    @Autowired
    SituationDangereuseDao situationDangereuseDao;


    @RequestMapping("/situationDangereuse")
    public @ResponseBody boolean ajouter(@RequestBody @Valid final SituationDangereuse sd, @Context final HttpServletRequest request) throws DocumentException, IOException {

        SituationDangereuse foundSd=sd;
        System.out.println("Chantier :" + sd.getChantier());
        System.out.println("Description :" + sd.getDescription());
        System.out.println("Action :" + sd.getActionImmediate());

        //Ajout BDD
        ;

        // Creation PDF
        PDFSituationDangereuse pdfSD = new PDFSituationDangereuse(foundSd);
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(DEST));
        document.open();
        pdfSD.addMetaData(document);
        pdfSD.addContent(document);
        document.close();

        return situationDangereuseDao.ajouterSituationDangereuse(foundSd);
    }

    @RequestMapping("/situationDangereuseVisu")
    public @ResponseBody
    List<SituationDangereuse> lister() throws IOException {
        return situationDangereuseDao.getSituationsDangereuses();
    }



}
