package hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@Repository
@Transactional
public class SituationDangereuseDaoImpl implements SituationDangereuseDao {

    public boolean ajouterSituationDangereuse(SituationDangereuse sd) throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        String date=""+(sd.getDate().getYear()+1900)+"_"+(sd.getDate().getMonth()+1)+"_"+sd.getDate().getDate();
        System.out.println(date);
        StringURL url = new StringURL("http://82.223.14.220/ewp2486/ajouterSD.php?date="+date+"&chantier="+sd.getChantier()+"&description="+sd.getDescription()+"&action="+sd.getActionImmediate()+"&latitude="+sd.getLatitude()+"&longitude="+sd.getLongitude());
        boolean res=mapper.readValue(new URL(url.getString()),boolean.class);
        return res;
    }


    public List<SituationDangereuse> getSituationsDangereuses() throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        final DateFormat df =new SimpleDateFormat("yyyy-MM-dd");
        mapper.setDateFormat(df);
        List<SituationDangereuse> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/listeSD.php"), List.class);
        return res;
    }
}
