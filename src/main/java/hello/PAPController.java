package hello;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.commons.net.ftp.FTPClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.ws.rs.core.Context;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@CrossOrigin(origins= "http://localhost:8100")
@Controller
public class PAPController {

    public static final String DEST = "pap.pdf";

    @Autowired
    PAPDao papDao;

    @RequestMapping("/papSaisie")
    public @ResponseBody
    boolean ajouter(@RequestBody @Valid final PAP pap, @Context final HttpServletRequest request) throws DocumentException, IOException {

        PAP foundPAP = pap;
        System.out.println(foundPAP.getDatePAP());
        System.out.println(foundPAP.getPointFort1());
        System.out.println(foundPAP.getPointFort2());
        System.out.println(foundPAP.getPointFort3());
        System.out.println(foundPAP.getPointFaible1());
        System.out.println(foundPAP.getPointFaible2());
        System.out.println(foundPAP.getPointFaible3());
        System.out.println(foundPAP.getPointRisques1());



        //Création d'un PDF
        PDFPAP pdfPAP = new PDFPAP(foundPAP);
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(DEST));
        document.open();
        pdfPAP.addMetaData(document);
        pdfPAP.addContent(document);
        document.close();

//        FTPClient client_ftp = new FTPClient();
//        FileInputStream f_stream = null;
//        client_ftp.connect("82.223.14.220"); // Adresse du serveur
//        client_ftp.login("root", "Ar7IwaJk5f");  // Nom d'utilisateur et mot de passe
//
//        f_stream = new FileInputStream(DEST);
//
//        // Envoyer le fichier
//        client_ftp.storeFile(DEST, f_stream);
//
//        // Déconnexion et fermeture du stream
//        client_ftp.logout();
//        f_stream.close();

        //Ajout dans la BDD
        return papDao.ajouterPAP(foundPAP);
    }

    @RequestMapping("/papEnCours")
    public @ResponseBody
    PAP_BDD recupPAPEnCours() throws IOException {
        return papDao.getPAPEnCours();
    }



    @RequestMapping("/papV")
    public @ResponseBody
    List<PAP_BDD> lister() throws IOException {
        return papDao.getPAP();
    }


}
