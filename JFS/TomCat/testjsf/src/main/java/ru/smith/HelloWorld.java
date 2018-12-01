package ru.smith;

import javax.faces.bean.ManagedBean;

/**
 * Managed bean for home.xhtml page
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {
    public HelloWorld() {
        System.out.println("HelloWorld started!");
    }

    public String getMessage() {
        return "Hello World!";
    }
}