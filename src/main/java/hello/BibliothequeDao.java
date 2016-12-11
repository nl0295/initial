package hello;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

@Repository
@Transactional
public interface BibliothequeDao {

    List<Bibliotheque> getDocuments () throws IOException;
}
