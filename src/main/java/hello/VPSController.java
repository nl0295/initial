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

/**
 * Created by nicol on 22/11/2016.
 */

@CrossOrigin(origins= "*")
@Controller
public class VPSController {

    public static final String DEST = "/PDF/VPS/vps";

    @Autowired
    VPSDao vpsDao;

    @RequestMapping("/bilan")
    public @ResponseBody boolean ajouter(@RequestBody @Valid final VPS vps, @Context final HttpServletRequest request) throws DocumentException, IOException {

        VPS foundVPS=vps;
        System.out.println("Chantier :" + vps.getChantierVPS());
        System.out.println("Visiteur :" + vps.getVisiteurVPS());
        System.out.println("Date :" + vps.getDateVPS());

        int id=vpsDao.ajouterVPS(foundVPS);

        // Creation PDF
        PDFVPS pdfVPS = new PDFVPS(vps);
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(DEST+id+".pdf"));
        document.open();
        pdfVPS.addMetaData(document);
        pdfVPS.addContent(document);
        document.close();

        //Ajout BDD
        return true;
    }



    @RequestMapping("/vpsVisu")
    public @ResponseBody List<VPS_BDD> lister() throws IOException {
        return vpsDao.getListeVPS();
    }

    @RequestMapping("/vpsPSS")
    public @ResponseBody List<VPS_BDD> ajouter(@RequestBody @Valid final String login, @Context final HttpServletRequest request) throws IOException {
        return vpsDao.getListeVPS(login);
    }

}
