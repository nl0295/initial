package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.ws.rs.core.Context;
import java.io.IOException;
import java.util.List;

@CrossOrigin(origins= "http://localhost:8100")
@Controller
public class AlerteController {

    @Autowired
    AlerteDao alerteDao;


    @RequestMapping("/flashInfo")
    public @ResponseBody boolean ajouter(@RequestBody @Valid final Alerte alerte, @Context final HttpServletRequest request) throws IOException {

        Alerte foundAlerte = alerte;
        System.out.println(foundAlerte.getDate());
        System.out.println(foundAlerte.getDescription());
        return alerteDao.ajouterAlerte(foundAlerte);
    }

    @RequestMapping("/flashInfoV")
    public @ResponseBody List<Alerte> lister() throws IOException {
        return alerteDao.getAlertes();
    }


}
