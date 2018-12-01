package net.ensode.glassfishbook;

import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

public class MessageReceiver {

  @Resource(mappedName = "jms/GlassFishBookConnectionFactory")
  private static ConnectionFactory connectionFactory;
  @Resource(mappedName = "jms/GlassFishBookTopic")
  private static Topic topic;

  public void getMessages() {
    Connection connection;
    MessageConsumer messageConsumer;
    TextMessage textMessage;
    boolean goodByeReceived = false;

    try {
      connection = connectionFactory.createConnection();
      Session session = connection.createSession(false,
          Session.AUTO_ACKNOWLEDGE);
      messageConsumer = session.createConsumer(topic);
      connection.start();

      while (!goodByeReceived) {
        System.out.println("Ожидание сообщений...");
        textMessage = (TextMessage) messageConsumer.receive();

        if (textMessage != null) {
          System.out.print("Получено следующее сообщение: ");
          System.out.println(textMessage.getText());
          System.out.println();
        }

        if (textMessage.getText() != null
            && textMessage.getText().equals("Досвидания!")) {
          goodByeReceived = true;
        }
      }

      messageConsumer.close();
      session.close();
      connection.close();
    } catch (JMSException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    new MessageReceiver().getMessages();
  }
}
