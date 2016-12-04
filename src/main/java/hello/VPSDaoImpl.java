package hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.net.URL;
import java.util.List;

@Repository
@Transactional
public class VPSDaoImpl implements VPSDao{

    @Override
    public boolean ajouterVPS(VPS vps) throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        String date=""+(vps.getDateVPS().getYear()+1900)+"_"+(vps.getDateVPS().getMonth()+1)+"_"+vps.getDateVPS().getDate();
        System.out.println(date);
        StringURL url = new StringURL("http://82.223.14.220/ewp2486/ajouterVPS.php?date="+date+"&chantier="+vps.getChantierVPS()+"&visiteur="+vps.getVisiteurVPS());
        boolean res=mapper.readValue(new URL(url.getString()),boolean.class);
        return res;
    }

    @Override
    public List<VPS_BDD> getListeVPS() throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        List<VPS_BDD> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/listeVPS.php"), List.class);
        return res;
    }
}
