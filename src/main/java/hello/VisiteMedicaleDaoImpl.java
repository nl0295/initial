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
public class VisiteMedicaleDaoImpl implements VisiteMedicaleDao {

    @Override
    public List<VisiteMedicale> getVisiteMedicale(String login) throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        final DateFormat df =new SimpleDateFormat("yyyy-MM-dd");
        mapper.setDateFormat(df);
        List<VisiteMedicale> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/visiteMedicale.php?login="+login), List.class);
        return res;
    }
}

