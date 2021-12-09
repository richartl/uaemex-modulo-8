/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author richartl
 */
public class LoginAction extends ActionSupport {
    String user;
    String password;
    
    public String execute() {
        if("admin".equals(this.user) && "1234".equals(this.password)){
          return SUCCESS;
        }else{
           return INPUT;
        }
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getTitle() {

        return getText("login.title");
    }

    public String getResults() {

        return getText("login.results");
    }

    public String getButton() {

        return getText("login.button");
    }

}
