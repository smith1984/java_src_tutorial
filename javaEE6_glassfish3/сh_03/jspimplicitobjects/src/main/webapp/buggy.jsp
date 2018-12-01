<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP-страница ошибки</title>
</head>
<body>
<p>
Этот текст никогда не будет видно в обозревателе так как исключение возникает до того как страница будет отображена.
<%
Object o = null;

out.println(o.toString()); // исключение NullPointerException возникает здесь.
%>
</p>
</body>
</html>