<%-- 
    Document   : index
    Created on : Oct 2, 2017, 11:34:10 AM
    Author     : ito
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP-страница</title>
    </head>
    <body>
        <h2>Привет, мир!</h2>
        <p>
            Этот параграф будет отображатся всегда.
        </p>
        <c:if test="${param.displayConditionalText == 'true'}" var="textDisplayed" scope="session">
            <p>
                Этот параграф будет отображет только если параметр запроса (request) именуемый "displayConditionalText" будет иметь значение "true".
            </p>
        </c:if>
        <p>
            Этот параграф также будет отображатся всегда.
        </p>
    </body>
</html>
