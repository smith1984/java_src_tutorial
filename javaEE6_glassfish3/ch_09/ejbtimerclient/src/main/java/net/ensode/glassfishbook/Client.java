package net.ensode.glassfishbook;

import javax.ejb.EJB;

public class Client
{
  @EJB
  private static EjbTimerExample ejbTimerExample;

  public static void main(String[] args)
  {
    try
    {
      System.out.println("Запуск таймера 1...");
      ejbTimerExample.startTimer("Timer 1");
      System.out.println("Задержка на 2 секунды...");
      Thread.sleep(2000);
      System.out.println("Запуск таймера 2...");
      ejbTimerExample.startTimer("Timer 2");
      System.out.println("Задержка на 30 секунд...");
      Thread.sleep(30000);
      System.out.println("Остановка таймера 1...");
      ejbTimerExample.stopTimer("Timer 1");
      System.out.println("Остановка таймера 2...");
      ejbTimerExample.stopTimer("Timer 2");
      System.out.println("Завершено.");
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }

}
