package hello;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Repository
@Transactional
public interface PAPDao {

    boolean ajouterPAP(PAP pap) throws IOException;

    List<PAP_BDD> getPAP() throws IOException;

    PAP_BDD getPAPEnCours() throws IOException;

    void modifierPAP(PAP pap);
}