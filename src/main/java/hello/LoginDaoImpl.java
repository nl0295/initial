package hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.IOException;
import java.net.URL;

@Repository
@Transactional
public class LoginDaoImpl implements LoginDao{

    public boolean checkPassword(String login, String password) throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        Connection connec = mapper.readValue(new URL("http://82.223.14.220/ewp2486/loginTaco.php?login="+login+"&mdp="+password), Connection.class);
        return connec.isConnection();
    }


}
