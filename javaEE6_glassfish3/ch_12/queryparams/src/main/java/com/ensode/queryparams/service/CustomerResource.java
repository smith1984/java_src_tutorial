package com.ensode.queryparams.service;

import com.ensode.queryparams.entity.Customer;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("customer")
public class CustomerResource {

  private Customer customer;

  public CustomerResource() {
    customer = new Customer(1L, "Samuel",
        "Joseph", "Willow");
  }

  @GET
  @Produces("text/xml")
  public Customer getCustomer(@QueryParam("id") Long id) {
    //в реальном RESTful веб-сервисе, мы будем извлекать данные из базы данных
    //используя предоставленный id.

    System.out.println("--- " + this.getClass().getCanonicalName()
        + "вызван метод .getCustomer(), id = ");

    return customer;
  }

  /**
   * Создаем новый customer
   * @param customer создает XML-представление customer
   */
  @PUT
  @Consumes("text/xml")
  public void createCustomer(Customer customer) {
    //в реальном RESTful веб-сервисе, мы будем разбирать XML-код
    //полученный в XML-параметра customer, замет вставим
    //новую строку в базу данных.

    System.out.println("--- " + this.getClass().getCanonicalName()
        + "вызван метод .createCustomer()");

    System.out.println("customer = " + customer);

  }

  @POST
  @Consumes("text/xml")
  public void updateCustomer(Customer customer) {
    //в реальном RESTful веб-сервисе, мы будем разбирать XML-код
    //полученный в XML-параметре customer, затем обновим
    //строку в базе данных.

    System.out.println("--- " + this.getClass().getCanonicalName()
        + "вызван метод .updateCustomer()");

    System.out.println("customer = " + customer);

    System.out.println("customer= " + customer);
  }

  @DELETE
  @Consumes("text/xml")
  public void deleteCustomer(@QueryParam("id") Long id) {
    //в реальном RESTful веб-сервисе, мы будем вызывать
    //DAO и удалять строку в базе данных
    //с первичным ключем соответсвующем параметру "id".

    System.out.println("--- " + this.getClass().getCanonicalName()
        + "вызван метод .deleteCustomer(), id = " + id);

    System.out.println("customer = " + customer);
  }
}
