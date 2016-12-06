package hello;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

@Repository
@Transactional
public interface PAPDao {

    int ajouterPAP(PAP pap) throws IOException;

    List<PAP_BDD> getPAP() throws IOException;

    PAP_BDD getPAPEnCours() throws IOException;

    boolean modifierPAP(PAP_BDD pap) throws IOException;
}