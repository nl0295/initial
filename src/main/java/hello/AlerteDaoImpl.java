package hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@Repository
@Transactional
public class AlerteDaoImpl implements AlerteDao {

    public boolean ajouterAlerte(Alerte alerte) throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        String date=""+(alerte.getDate().getYear()+1900)+"_"+(alerte.getDate().getMonth()+1)+"_"+alerte.getDate().getDate();
        System.out.println(date);
        StringURL url = new StringURL("http://82.223.14.220/ewp2486/ajouterAlerte.php?date="+date+"&titre="+alerte.getTitre()+"&description="+alerte.getDescription());
        boolean res=mapper.readValue(new URL(url.getString()),boolean.class);
        return res;
    }

    public List<Alerte> getAlertes() throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        final DateFormat df =new SimpleDateFormat("yyyy-MM-dd");
        mapper.setDateFormat(df);
        List<Alerte> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/listeAlerte.php"), List.class);
        return res;
    }
}
