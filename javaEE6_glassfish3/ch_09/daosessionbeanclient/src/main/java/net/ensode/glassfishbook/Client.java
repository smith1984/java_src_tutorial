package net.ensode.glassfishbook;

import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

public class Client
{
  @EJB
  private static CustomerDaoBean customerDao;

  public static void main(String[] args)
  {
    UserTransaction userTransaction;
    Customer customer;

    customer = new Customer();
    customer.setFirstName("David");
    customer.setLastName("Geary");
    customer.setEmail("clarity.training@gmail.com");

    try
    {
      InitialContext initialContext = new InitialContext();
      userTransaction = (UserTransaction)initialContext.lookup("java:comp/UserTransaction");
      
      userTransaction.begin();
      customerDao.saveCustomer(customer);
      userTransaction.commit();
    }
    catch (NotSupportedException e)
    {
      // Автоматически сгенерированный блок catch
      e.printStackTrace();
    }
    catch (SystemException e)
    {
      // Автоматически сгенерированный блок catch
      e.printStackTrace();
    }
    catch (NamingException e)
    {
      // Автоматически сгенерированный блок catch
      e.printStackTrace();
    }
    catch (SecurityException e)
    {
      // Автоматически сгенерированный блок catch
      e.printStackTrace();
    }
    catch (IllegalStateException e)
    {
      // Автоматически сгенерированный блок catch
      e.printStackTrace();
    }
    catch (RollbackException e)
    {
      // Автоматически сгенерированный блок catch
      e.printStackTrace();
    }
    catch (HeuristicMixedException e)
    {
      // Автоматически сгенерированный блок catch
      e.printStackTrace();
    }
    catch (HeuristicRollbackException e)
    {
      // Автоматически сгенерированный блок catch
      e.printStackTrace();
    }
   
  }
}
