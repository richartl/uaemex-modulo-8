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
public class SaludoAction {
    //Logger log = LogManager.getLogger(SaludoAction.class);
    String saludoAtr;

    public String execute(){
     //log.info("ejecutando");
     this.saludoAtr = "Saludo Struts con convenciones";
     return "exito";
    }

    public String getSaludoAtr() {
        return saludoAtr;
    }

    public void setSaludoAtr(String saludoAtr) {
        this.saludoAtr = saludoAtr;
    }
}
