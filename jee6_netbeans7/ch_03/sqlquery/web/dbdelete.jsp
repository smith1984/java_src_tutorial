<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Документ   : dbdelete
    Создан     : Aug 29, 2010, 9:14:03 AM
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
        <sql:update var="deletedRows" dataSource="jdbc/sample">
            DELETE FROM customer
            WHERE name like ?
            <sql:param value="Ensode%"/>
        </sql:update>

        <sql:query var="result" dataSource="jdbc/sample">
            SELECT customer_id, name, discount_code, zip FROM 
            customer where name like ?
            <sql:param value="Ensode%"/>
        </sql:query>

        <table border="1">
            <!-- column headers -->
            <tr>
                <c:forEach var="columnName" items="${result.columnNames}">
                    <th><c:out value="${columnName}"/></th>
                </c:forEach>
            </tr>
            <!-- column data -->
            <c:forEach var="row" items="${result.rowsByIndex}">
                <tr>
                    <c:forEach var="column" items="${row}">
                        <td><c:out value="${column}"/></td>
                    </c:forEach>
                </tr>
            </c:forEach>
        </table> 
    </body>
</html>
