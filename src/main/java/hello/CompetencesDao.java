package hello;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Repository
@Transactional
public interface CompetencesDao {
    List<Competences> listeCompetences(String login) throws IOException;
}
