package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins= "*")
@Controller
public class BibliothequeController {

    @Autowired
    BibliothequeDao bibliothequeDao;

    @RequestMapping("/bibliotheque")
    public @ResponseBody List<Bibliotheque> getPDF() throws IOException {
        return bibliothequeDao.getDocuments();
    }


}
