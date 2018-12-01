<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- 
    Документ   : index
    Создан     : Aug 28, 2010, 7:52:34 PM
    Автор      : heffel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP-страница</title>
    </head>
    <body>
        <h2>Привет, мир!</h2>
        <sql:query var="allRows" dataSource="jdbc/sample">
            SELECT * FROM APP.CUSTOMER FETCH FIRST 100 ROWS ONLY
        </sql:query>
        <table border="1">
            <thead>
                <tr>
                    <th>Имя</th>
                    <th>Расположение</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="currentRow"
                       items="${allRows.rows}">
                <tr>
                    <td>${currentRow.name}</td>
                    <td>${currentRow.city},
                        ${currentRow.state}
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>