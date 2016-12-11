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
    public int ajouterVPS(VPS vps) throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        String date=""+(vps.getDateVPS().getDate())+"/"+(vps.getDateVPS().getMonth()+1)+"/"+(vps.getDateVPS().getYear()+1900);
        System.out.println(date);
        StringURL url = new StringURL("http://82.223.14.220/ewp2486/ajouterVPS.php?date="+date+"&chantier="+vps.getChantierVPS()+"&visiteur="+vps.getVisiteurVPS()+"&ptFaible1="+vps.getPtFaible1()+"&ptFaible2="+vps.getPtFaible2()+"&ptFaible3="+vps.getPtFaible3()+"&resp1="+vps.getResp1()+"&resp2="+vps.getResp2()+"&resp3="+vps.getResp3());
        int res=mapper.readValue(new URL(url.getString()),Integer.class);
        return res;
    }

    @Override
    public List<VPS_BDD> getListeVPS() throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        List<VPS_BDD> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/listeVPS.php"), List.class);
        return res;
    }

    @Override
    public List<VPS_BDD> getListeVPS(String login) throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        List<VPS_BDD> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/vpsPSS.php?login="+login), List.class);
        return res;
    }
}
