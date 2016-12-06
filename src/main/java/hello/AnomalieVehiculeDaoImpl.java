package hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.net.URL;
import java.util.List;

@Repository
@Transactional
public class AnomalieVehiculeDaoImpl implements AnomalieVehiculeDao{

    @Override
    public int ajouterAnomalieVehicule(AnomalieVehicule av) throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        StringURL url = new StringURL("http://82.223.14.220/ewp2486/ajouterAV.php?titre="+av.getTitre()+"&immat="+av.getImmatriculation()+"&detail="+av.getDetail());
        int res=mapper.readValue(new URL(url.getString()),Integer.class);
        return res;
    }

    @Override
    public List<AnomalieVehicule> getAnomaliesVehicules() throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        List<AnomalieVehicule> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/listeAV.php"), List.class);
        return res;
    }
}
