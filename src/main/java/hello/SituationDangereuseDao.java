package hello;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

@Repository
@Transactional
public interface SituationDangereuseDao {

    boolean ajouterSituationDangereuse(SituationDangereuse sd) throws IOException;

    List<SituationDangereuse> getSituationsDangereuses() throws IOException;

}
