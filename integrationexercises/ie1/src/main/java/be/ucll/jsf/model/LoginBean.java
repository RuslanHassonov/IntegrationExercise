package be.ucll.jsf.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LoginBean {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String validateLogin() {
        String navResult = "";
        if (this.username.equalsIgnoreCase("test") && this.password.equalsIgnoreCase("test")) {
            navResult = "success";
            username = "";
            password = "";
        } else {
            navResult = "failure";
            username = "";
            password = "";
        }
        return navResult;
    }

    public String displayDetails() {

        return "to_detail";
    }

    public String logOut() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "to_login";
    }
}
