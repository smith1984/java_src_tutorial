package ru.smith;

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

  @GET
  @Produces("text/xml")
  public String getCustomer() {
    //в реальном RESTful веб-сервисе, мы будем извлекать данные из базы данных
    //затем возвратим XML представление этих данных.

    System.out.println("--- " + this.getClass().getCanonicalName()
        + "вызван метод .getCustomer()");

    return "<customer>\n"
        + "<id>123</id>\n"
        + "<firstName>Joseph</firstName>\n"
        + "<middleName>William</middleName>\n"
        + "<lastName>Graystone</lastName>\n"
        + "</customer>\n";
  }

  /**
   * Создаем нового customer
   * @param customer создает XML-представление customer
   */
  @PUT
  @Consumes("text/xml")
  public void createCustomer(String customerXML) {
    //в реальном RESTful веб-сервисе, мы будем разбирать XML-код
    //полученный в XML-параметре customer, затем вставим
    //новую строку в базу данных.

    System.out.println("--- " + this.getClass().getCanonicalName()
        + "вызван метод .createCustomer()");

    System.out.println("customerXML = " + customerXML);
  }

  @POST
  @Consumes("text/xml")
  public void updateCustomer(String customerXML) {
    //в реальном RESTful веб-сервисе, мы будем разбирать XML-код
    //полученный в XML-параметре customer, затем обновим
    //строку в базе данных.

    System.out.println("--- " + this.getClass().getCanonicalName()
        + "вызван метод .updateCustomer()");

    System.out.println("customerXML = " + customerXML);
  }

  @DELETE
  @Consumes("text/xml")
  public void deleteCustomer(String customerXML) {
    //в реальном RESTful веб-сервисе, мы будем разбирать XML-код
    //полученый в XML-параметре customer, затем удалим
    //строку в базе данных.

    System.out.println("--- " + this.getClass().getCanonicalName()
        + "вызван метод .deleteCustomer()");

    System.out.println("customerXML = " + customerXML);
  }
}
