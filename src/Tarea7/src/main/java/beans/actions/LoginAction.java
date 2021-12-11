/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author richartl
 */
@Result (name="success", location="/WEB-INF/content/login.jsp")
public class LoginAction extends ActionSupport {
    
    @Action("login")
    public String execute() {
       return SUCCESS;
       
    }

}
