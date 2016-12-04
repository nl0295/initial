package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@CrossOrigin(origins= "http://localhost:8100")
@Controller
public class LoginController {

    @Autowired
    LoginDao loginDao;


    @RequestMapping("/login")
    public @ResponseBody boolean login(@RequestBody @Valid final User user, @Context final HttpServletRequest request){
        User foundUser = user;
        System.out.println("Avant if: " + foundUser.getLogin());
        System.out.println("Avant if: " + foundUser.getPassword());

        boolean a = false;
        try {

            a = loginDao.checkPassword(foundUser.getLogin(), foundUser.getPassword());
        }catch (Exception e){
            e.printStackTrace();
        }

        return a;
    }

}
