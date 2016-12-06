package hello;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Repository
@Transactional
public interface EmployeDao {

    Employe getEmploye(String login) throws IOException;

    List<Employe> getEmployeVPS() throws IOException;

    List<Employe> getAgentVPS() throws IOException;
}
