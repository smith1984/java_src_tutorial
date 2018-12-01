package net.ensode.glassfishbook;

import javax.ejb.Stateless;

@Stateless
public class SimpleSessionBean {

    private String message = "Если вы не видите этого, он не работает!";

    public String getMessage() {
        return message;
    }
}
