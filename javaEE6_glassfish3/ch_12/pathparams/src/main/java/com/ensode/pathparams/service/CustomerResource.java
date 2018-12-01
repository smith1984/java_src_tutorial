package com.ensode.pathparams.service;

import com.ensode.pathparams.entity.Customer;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/customer/")
public class CustomerResource {

  private Customer customer;

  public CustomerResource() {
    customer = new Customer(1L, "William",
        "Daniel", "Graystone");
  }

  @GET
  @Produces("text/xml")
  @Path("{id}/")
  public Customer getCustomer(@PathParam("id") Long id) {
    //в реальном RESTful веб-сервисе, мы будем извлекать данные из базы
    //используя предоставленный id.

    System.out.println("--- " + this.getClass().getCanonicalName()
        + "вызван метод .getCustomer(), id = ");

    return customer;
  }

  /**
   * Создаем нового customer
   * @param customer создает XML-представление customer
   */
  @PUT
  @Consumes("text/xml")
  public void createCustomer(Customer customer) {
    //в реальном RESTful веб-сервисе, мы будем разбирать XML-код
    //полученный в XML-параметре customer, затем вставим
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
  @Path("{id}/")
  public void deleteCustomer(@PathParam("id") Long id) {
    //в реальном RESTful веб-сервисе, мы будем вызывать
    //DAO и удалять строку в базе данных,
    //первичный ключ которой совпадает с параметром "id".

    System.out.println("--- " + this.getClass().getCanonicalName()
        + "вызван метод .deleteCustomer(), id = " + id);

    System.out.println("customer = " + customer);
  }
}
