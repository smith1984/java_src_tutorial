package net.ensode.glassfishbook;

import javax.ejb.EJB;

public class Client
{
  @EJB
  private static CustomerDao customerDao;

  public static void main(String[] args)
  {
    Long newCustomerId;

    Customer customer = new Customer();
    customer.setFirstName("Mark");
    customer.setLastName("Butcher");
    customer.setEmail("butcher@phony.org");

    System.out.println("Сохранение нового заказчика...");
    newCustomerId = customerDao.saveNewCustomer(customer);

    System.out.println("Извлечение заказчика...");
    customer = customerDao.getCustomer(newCustomerId);
    System.out.println(customer);
  }
}
