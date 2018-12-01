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
        <p>
            <c:choose>
                <c:when
                    test="${param.displayConditionalText == '1'}">
                    этот параграф будет отображатся, если параметр запроса (request)
                    именуемый "displayConditionalText" будет иметь значение "1".
                </c:when>
                <c:when
                    test="${param.displayConditionalText == '2'}">
                    этот параграф будет отображатся, если параметр запроса (request)
                    именуемый "displayConditionalText" будет иметь значение "2".
                </c:when>
                <c:otherwise>
                    этот параграф будет отображатся только в том случае, если параметр запроса (request)
                    именуемый "displayConditionalText" либо отсутствует, либо имеет значение,
                    отличное от "1" или "2".
                </c:otherwise>
            </c:choose>
        </p>
        <p>
            Этот параграф также будет отображатся всегда.
        </p>
    </body>
</html>
