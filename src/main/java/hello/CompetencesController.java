package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins= "http://localhost:8100")
@Controller
public class CompetencesController {

    @Autowired
    CompetencesDao competencesDao;

    @RequestMapping("/competences")
    public @ResponseBody
    List<Competences> lister() throws IOException {
        return competencesDao.listeCompetences();
    }

}
