package net.ensode.glassfishbook;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class ExampleMessageListener implements MessageListener {

  @Override
  public void onMessage(Message message) {
    TextMessage textMessage = (TextMessage) message;

    try {
      System.out.print("Принято следующее сообщение: ");
      System.out.println(textMessage.getText());
      System.out.println();
    } catch (JMSException e) {
      e.printStackTrace();
    }
  }
}
