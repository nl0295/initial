package hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.net.URL;
import java.util.List;

@Repository
@Transactional
public class EmployeDaoImpl implements EmployeDao {

    @Override
    public Employe getEmploye(String login) throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        Employe res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/employe.php?login="+login), Employe.class);
        return res;
    };

    @Override
    public List<Employe> getEmployeVPS() throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        List<Employe> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/employeVPS.php"), List.class);
        return res;
    };

    @Override
    public List<Employe> getAgentVPS() throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        List<Employe> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/agentVPS.php"), List.class);
        return res;
    };

}
