<%-- 
    Document   : index
    Created on : Oct 2, 2017, 11:34:10 AM
    Author     : ito
--%>
<%@page import="ru.smith.CustomerBean"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
            ArrayList<CustomerBean> customerList = new ArrayList<CustomerBean>();

            customerList.add(new CustomerBean("David", "Heffelfinger"));
            customerList.add(new CustomerBean("Jeff", "Wu"));
            customerList.add(new CustomerBean("Jacqueline", "Smith"));

            session.setAttribute("customerList", customerList);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP-страница</title>
    </head>
<body>
        <h2>Привет, мир!</h2>
        <table border="1" cellpadding="1" cellspacing="0">
            <thead>
                <tr>
                    <th>Имя</th>
                    <th>Фамилия</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="customer"
                           items="${sessionScope.customerList}">
                    <tr>
                        <td>${customer.firstName}</td>
                        <td>${customer.lastName}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
