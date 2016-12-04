package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

/**
 * Created by nicol on 04/12/2016.
 */
@CrossOrigin(origins= "http://localhost:8100")
@Controller
public class EmployeController {

    @Autowired
    EmployeDao employeDao;

    @RequestMapping("/employe")
    public @ResponseBody
    List<Employe> lister() throws IOException {
        return employeDao.getEmploye();
    }

    @RequestMapping("/employeVPS")
    public @ResponseBody
    List<Employe> listerEmployeVPS() throws IOException {
        return employeDao.getEmployeVPS();
    }

    @RequestMapping("/agentVPS")
    public @ResponseBody
    List<Employe> listerAgentVPS() throws IOException {
        return employeDao.getAgentVPS();
    }

}
