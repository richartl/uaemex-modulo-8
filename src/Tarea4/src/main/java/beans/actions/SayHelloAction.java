/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author richartl
 */
public class SayHelloAction {
    //Logger log = LogManager.getLogger(SayHelloAction.class);
    String greetingAtr;

    public String execute(){
     //log.info("ejecutando");
     this.greetingAtr = "Greetings with conventions";
     return "success";
    }

    public String getGreetingAtr() {
        return greetingAtr;
    }

    public void setGreetingAtr(String saludoAtr) {
        this.greetingAtr = saludoAtr;
    }
}
