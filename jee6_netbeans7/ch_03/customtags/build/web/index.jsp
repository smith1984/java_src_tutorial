<%-- 
    Document   : index
    Created on : Oct 2, 2017, 3:21:43 PM
    Author     : ito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="ct" tagdir="/WEB-INF/tags/" %>
<%@ page import="ru.smith.AddressBean" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%
    AddressBean addressBean = new AddressBean();

    addressBean.setAddressType("home");
    addressBean.setLine1("123 Tennis Ct");
    addressBean.setCity("Phoenix");
    addressBean.setState("AZ");
    addressBean.setZip("85001");

    session.setAttribute("addressBean", addressBean);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP-страница</title>
    </head>
    <body>
        <form>
            <ct:address addressType="home"/>
            <table cellpadding="0" cellspacing="0" border="0">
                <tr>
                    <td style="width:65px;"></td>
                    <td>
                        <input type="submit" value="Отправить"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
