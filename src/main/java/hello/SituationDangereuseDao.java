package hello;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Repository
@Transactional
public interface SituationDangereuseDao {

    int ajouterSituationDangereuse(SituationDangereuse sd) throws IOException;

    List<SituationDangereuse_BDD> getSituationsDangereuses() throws IOException;

    List<SituationDangereuse_BDD> getSituationsDangereusesPSS(String login) throws IOException;

}