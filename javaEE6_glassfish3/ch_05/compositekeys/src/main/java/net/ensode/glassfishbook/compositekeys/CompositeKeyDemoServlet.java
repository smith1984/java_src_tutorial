package net.ensode.glassfishbook.compositekeys;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CompositeKeyDemoServlet extends HttpServlet
{
  @PersistenceUnit(unitName = "customerPersistenceUnit")
  private EntityManagerFactory entityManagerFactory;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException
  {
    PrintWriter printWriter = response.getWriter();
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    OrderItem orderItem;

    orderItem = entityManager.find(OrderItem.class, new OrderItemPK(1L, 2L));

    response.setContentType("text/html");

    if (orderItem != null)
    {
      printWriter
          .println("Найден экземпляр товара заказа, для предоставленного первичного ключа:<br/>");
      printWriter.println("Идентификатор заказа OrderItem: " + orderItem.getOrderId()
          + "<br/>");
      printWriter.println("Идентификатор экземпляра товара заказа OrderItem: " + orderItem.getItemId()
          + "<br/>");
    }
    else
    {
      printWriter.println("Для предоставленного первичного ключа не найдено экземпляров OrderItem.");
    }
  }
}
