package com.corejsf;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.inject.Named; 
import javax.enterprise.context.RequestScoped; 
import javax.sql.rowset.CachedRowSet;


@Named // or @ManagedBean
@RequestScoped
public class CustomerBean {
    private static final String url = "jdbc:mysql://localhost:3306/mybd";
    private static final String user = "root";
    private static final String password = "DRFT97ijh";
    private static Connection conn;
   
   public ResultSet getAll() throws SQLException {
       Driver drv = new Driver();
       DriverManager.registerDriver(drv);
       conn = DriverManager.getConnection(url, user, password);
      try {
         Statement stmt = conn.createStatement();        
         ResultSet result = stmt.executeQuery("SELECT * FROM Customers");         
         // return ResultSupport.toResult(result);
         CachedRowSet crs = new com.sun.rowset.CachedRowSetImpl();         
            // or use an implementation from your database vendor
         crs.populate(result);
         return crs;
      } finally {
         conn.close();
      }
   }
}