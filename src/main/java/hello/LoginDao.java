package hello;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.net.MalformedURLException;


@Repository
@Transactional
public interface LoginDao {

    boolean checkPassword(String login, String password) throws IOException;
}
