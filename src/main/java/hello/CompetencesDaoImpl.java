package hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@Repository
@Transactional
public class CompetencesDaoImpl implements CompetencesDao {

    @Override
    public List<Competences> listeCompetences(String login) throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        final DateFormat df =new SimpleDateFormat("dd/MM/yyyy");
        mapper.setDateFormat(df);
        List<Competences> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/livretPSS.php?login="+login), List.class);
        return res;
    };


}
