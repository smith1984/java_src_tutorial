package net.ensode.glassfishbook.asynchronousmethodsclient;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import net.ensode.glassfishbook.asynchronousmethods.AsynchronousSessionBeanRemote;

public class App {

  @EJB
  private static AsynchronousSessionBeanRemote async;

  public void invokeEjbMethods() {
    long startTime = System.currentTimeMillis();
    long endTime;

    async.slowMethod();
    endTime = System.currentTimeMillis();

    System.out.println("вызов медленного метода возвращает за "
        + (endTime - startTime) + " миллисекунд");
    Future<Long> retVal =
        async.slowMethodWithReturnValue();

    if (!retVal.isDone()) {
      System.out.println("Отмена вызова второго метода");
      retVal.cancel(true);
    } else {
      try {
        System.out.println("вызов второго метода завершен, "
            + "возвращаемое значение: " + retVal.get());
      } catch (InterruptedException ex) {
        Logger.getLogger(App.class.getName()).
            log(Level.SEVERE, null, ex);
      } catch (ExecutionException ex) {
        Logger.getLogger(App.class.getName()).
            log(Level.SEVERE, null, ex);
      }
    }
  }

  public static void main(String[] args) {
    new App().invokeEjbMethods();
  }
}
