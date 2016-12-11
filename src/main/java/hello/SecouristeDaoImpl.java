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
public class SecouristeDaoImpl implements SecouristeDao{

    @Override
    public List<Secouriste> getSecouriste(String login) throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        final DateFormat df =new SimpleDateFormat("dd/MM/yyyy");
        mapper.setDateFormat(df);
        List<Secouriste> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/secouriste.php?login="+login), List.class);
        System.out.println(res.size());
        return res;
    }
}
