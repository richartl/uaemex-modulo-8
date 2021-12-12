/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.actions;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 *
 * @author richartl
 */

@Results({
    @Result (name="success", location="/WEB-INF/content/welcome.jsp"),
    @Result (name="input", location="login", type="redirectAction")
})
public class ValidateAction extends ActionSupport {
    ValueStack stack = ActionContext.getContext().getValueStack();
    User userLogged = new User();
    String user;
    String password;

    @Action("validate")
    public String execute() {
        
        if("admin".equals(this.user) && "1234".equals(this.password)){
          userLogged.setUser(this.user);
          userLogged.setPassword(this.password);
          userLogged.setTestParam("testFromAction");
          stack.push(userLogged);
          return SUCCESS;
        }else{
           return INPUT;
        }
       
    }
    
    @Override
    public void validate() {
        if (this.user == null || "".equals(this.user.trim())) {
            addFieldError("user", getText("val.user"));
        } else if (!validUser()) {
            addActionError(getText("user.invalid"));
        }

        if (this.password == null || "".equals(this.password.trim())) {
            addFieldError("password", getText("val.password"));
        } else if (this.password.length() < 3) {
            addFieldError("password", getText("val.pass.min.length"));
        }
    }
    
    private boolean validUser(){
       return "admin".equals(this.user);
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
      
}
