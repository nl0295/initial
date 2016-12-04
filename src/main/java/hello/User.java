package hello;

/**
 * Created by nicol on 02/11/2016.
 */
public class User {

    private String login;
    private String password;

    public User(){

    }

    public User(String pLogin, String pPasseword){
        login=pLogin;
        password=pPasseword;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setMdp(String pPassword) {
        this.password = pPassword;
    }

}

