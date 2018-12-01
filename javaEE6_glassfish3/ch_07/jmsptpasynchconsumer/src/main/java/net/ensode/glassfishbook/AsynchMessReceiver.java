package net.ensode.glassfishbook;

import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Queue;
import javax.jms.Session;

public class AsynchMessReceiver {

  @Resource(mappedName = "jms/GlassFishBookConnectionFactory")
  private static ConnectionFactory connectionFactory;
  @Resource(mappedName = "jms/GlassFishBookQueue")
  private static Queue queue;

  public void getMessages() {
    Connection connection;
    MessageConsumer messageConsumer;

    try {
      connection = connectionFactory.createConnection();
      Session session = connection.createSession(false,
          Session.AUTO_ACKNOWLEDGE);
      messageConsumer = session.createConsumer(queue);
      messageConsumer.setMessageListener(
          new ExampleMessageListener());
      connection.start();

      System.out.println("Строка выше позволяет нам " +
          "реализовать MessageListener для"
          + "приема и обработки сообщений из очереди сообщений.");
      Thread.sleep(1000);
      System.out.println("Наш код не блокируется "
          + "пока осуществляется приём сообщения.");
      Thread.sleep(1000);
      System.out.println("Он может делать что-то ещё "
          + "(возможно более полезное, чем "
          + "тупой выод на консоль. :)");
      Thread.sleep(1000);

      messageConsumer.close();
      session.close();
      connection.close();

    } catch (JMSException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    new AsynchMessReceiver().getMessages();
  }
}
