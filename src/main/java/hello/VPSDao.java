package hello;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Repository
@Transactional
public interface VPSDao {

    int ajouterVPS(VPS vps) throws IOException;

    List<VPS> getListeVPS() throws IOException;

    List<VPS> getListeVPS(String login) throws IOException;

}
