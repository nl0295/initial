package hello;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Repository
@Transactional
public interface AlerteDao {

    boolean ajouterAlerte(Alerte a) throws IOException;

    List<Alerte> getAlertes() throws IOException;

}
