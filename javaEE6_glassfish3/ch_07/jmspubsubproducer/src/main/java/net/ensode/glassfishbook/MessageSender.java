package net.ensode.glassfishbook;

import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

public class MessageSender {

  @Resource(mappedName = "jms/GlassFishBookConnectionFactory")
  private static ConnectionFactory connectionFactory;
  @Resource(mappedName = "jms/GlassFishBookTopic")
  private static Topic topic;

  public void produceMessages() {
    MessageProducer messageProducer;
    TextMessage textMessage;
    try {
      Connection connection =
          connectionFactory.createConnection();
      Session session = connection.createSession(false,
          Session.AUTO_ACKNOWLEDGE);
      messageProducer = session.createProducer(topic);

      textMessage = session.createTextMessage();

      textMessage.setText("Проверка, 1, 2, 3. Меня слышно?");
      System.out.println("Отправлено следующее сообщение: "
          + textMessage.getText());
      messageProducer.send(textMessage);

      textMessage.setText("Скопировал?");
      System.out.println("Отправлено следующее сообщение: "
          + textMessage.getText());
      messageProducer.send(textMessage);

      textMessage.setText("Досвидания!");
      System.out.println("Отправлено следующее сообщение: "
          + textMessage.getText());
      messageProducer.send(textMessage);

      messageProducer.close();
      session.close();
      connection.close();
    } catch (JMSException e) {
      e.printStackTrace();
    }

  }

  public static void main(String[] args) {
    new MessageSender().produceMessages();
  }
}
