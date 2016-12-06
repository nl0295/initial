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
public class SituationDangereuseDaoImpl implements SituationDangereuseDao {

    // Ajoute une SD dans la base de données
    public int ajouterSituationDangereuse(SituationDangereuse sd) throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        String date=""+(sd.getDate().getYear()+1900)+"_"+(sd.getDate().getMonth()+1)+"_"+sd.getDate().getDate();
        System.out.println(date);
        StringURL url = new StringURL("http://82.223.14.220/ewp2486/ajouterSD.php?date="+date+"&chantier="+sd.getChantier()+"&description="+sd.getDescription()+"&action="+sd.getActionImmediate()+"&latitude="+sd.getLatitude()+"&longitude="+sd.getLongitude()+"&nni="+sd.getNni());
        int res=mapper.readValue(new URL(url.getString()),Integer.class);
        return res;
    }

    // Renvoie la liste de toutes les SD
    public List<SituationDangereuse> getSituationsDangereuses() throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        final DateFormat df =new SimpleDateFormat("yyyy-MM-dd");
        mapper.setDateFormat(df);
        List<SituationDangereuse> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/listeSD.php"), List.class);
        return res;
    }

    // Renvoie la liste de toutes les SD d'un employe en fonction de son nni/login
    public List<SituationDangereuse> getSituationsDangereusesPSS(String login) throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        final DateFormat df =new SimpleDateFormat("yyyy-MM-dd");
        mapper.setDateFormat(df);
        List<SituationDangereuse> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/situationD.php?login="+login), List.class);
        return res;
    }
}
