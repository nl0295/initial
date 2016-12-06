package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.ws.rs.core.Context;
import java.io.IOException;
import java.util.List;

@CrossOrigin(origins= "*")
@Controller
public class SecouristeController {

    @Autowired
    SecouristeDao secouristeDao;

    @RequestMapping("/secouriste")
    public @ResponseBody
    List<Secouriste> lister(@RequestBody @Valid final String login, @Context final HttpServletRequest request) throws IOException {
        return secouristeDao.getSecouriste(login);
    }
}
