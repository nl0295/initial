package hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


@Repository
@Transactional
public class BibliothequeDaoImpl implements BibliothequeDao {

    @Override
    public List<Bibliotheque> getDocuments() throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        List<Bibliotheque> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/bibliotheque.php"), List.class);
        return res;
    }
}
