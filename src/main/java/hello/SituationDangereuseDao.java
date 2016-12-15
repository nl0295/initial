package hello;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Repository
@Transactional
public interface SituationDangereuseDao {

    int ajouterSituationDangereuse(SituationDangereuse sd) throws IOException;

    List<SituationDangereuse> getSituationsDangereuses() throws IOException;

    List<SituationDangereuse> getSituationsDangereusesPSS(String login) throws IOException;

}