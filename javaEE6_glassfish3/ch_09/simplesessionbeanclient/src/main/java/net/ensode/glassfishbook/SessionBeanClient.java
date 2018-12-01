package net.ensode.glassfishbook;

import java.util.HashMap;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;

public class SessionBeanClient {

    private static SimpleSessionBean simpleSession;
    private EJBContainer ejbContainer;

    private void init() throws NamingException {
        Map propertyMap = new HashMap();
        propertyMap.put("org.glassfish.ejb.embedded.glassfish.installation.root",
                "/home/heffel/sges-v3/glassfish"); // включает конечный "/glassfish"
        ejbContainer = EJBContainer.createEJBContainer(propertyMap);
        simpleSession = (SimpleSessionBean) ejbContainer.getContext().
                lookup("java:global/classes/SimpleSessionBean");

    }

    private void invokeSessionBeanMethods() throws NamingException {
        init();

        System.out.println(simpleSession.getMessage());

        System.out.println("\nSimpleSession имеет тип: "
                + simpleSession.getClass().getName());
    }

    public static void main(String[] args) throws NamingException {
        new SessionBeanClient().invokeSessionBeanMethods();
    }
}
