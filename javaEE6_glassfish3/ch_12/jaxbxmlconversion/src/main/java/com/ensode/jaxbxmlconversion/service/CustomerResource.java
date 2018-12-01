package com.ensode.jaxbxmlconversion.service;

import com.ensode.jaxbxmlconversion.entity.Customer;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author David R. Heffelfinger <dheffelfinger@ensode.com>
 */
@Path("customer")
public class CustomerResource {

  private Customer customer;

  public CustomerResource() {
    customer = new Customer(1L, "David",
        "Raymond", "Heffelfinger");
  }

  @GET
  @Produces("text/xml")
  public Customer getCustomer(Long customerId) {
    //в реальном RESTful веб-сервисе, мы будем извлекать данные из базы данных
    //затем возвратим XML-представление этих данных

    System.out.println("--- " + this.getClass().getCanonicalName()
        + "вызван метод .getCustomer()");

    return customer;
  }

  @POST
  @Consumes("text/xml")
  public void updateCustomer(Customer customer) {
    //в реальном RESTful веб-сервисе, мы будем разбирать XML
    //в XML-параметре customer, затем обновим
    //строку в базе данных

    System.out.println("--- " + this.getClass().getCanonicalName()
        + "вызван метод .updateCustomer()");


    System.out.println("---- получили следующего customer: "
        + customer);
  }

  @PUT
  @Consumes("text/xml")
  public void createCustomer(Customer customer) {
    //в реальном RESTful веб-сервисе, мы будем вставлять
    //новую строку в базу данных содержащую данные
    //из параметра customer

    System.out.println("--- " + this.getClass().getCanonicalName()
        + "вызван метод .createCustomer()");

    System.out.println("customer = " + customer);

  }

  @DELETE
  @Consumes("text/xml")
  public void deleteCustomer(Customer customer) {
    //в реальном RESTful веб-сервисе, мы будем удалять строку
    //из базы данных, соответствующую параметру customer
    System.out.println("--- " + this.getClass().getCanonicalName()
        + "вызван метод .deleteCustomer()");

    System.out.println("customer = " + customer);
  }
}
