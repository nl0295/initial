package hello;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Repository
@Transactional
public interface AnomalieVehiculeDao {

    int ajouterAnomalieVehicule(AnomalieVehicule av) throws IOException;

    List<AnomalieVehicule> getAnomaliesVehicules() throws IOException;

}
