<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.Enumeration"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Демонстрация неявных объектов</title>
</head>
<body>
<p>Эта страница использует неявные объекты JSP для присоединения объектов
к контекстам: request, session и application.<br />
Она также извлекает некоторые параметры инициализации находящиеся в конфигурационном 
файле web.xml.<br />
Третье, что она делает, это получает величину размера буфера из неявного объекта отклика.<br />
</p>
<p>
<%
          application.setAttribute("applicationAttribute", new String(
          "Эта строка доступна для всех сеансов"));
      session.setAttribute("sessionAttribute", new String(
          "Эта строка доступна для всех запросов"));
      request.setAttribute("requestAttribute", new String(
          "Эта строка доступна для одного запроса"));

      Enumeration initParameterNames = config.getInitParameterNames();

      out.println("Инициализация параметров, полученных из неявного <br/>");
      out.println("объекта конфигурации:<br/><br/>");
      while (initParameterNames.hasMoreElements())
      {
        String parameterName = (String) initParameterNames.nextElement();
        out.print(parameterName + " = ");
        out.print(config.getInitParameter((String) parameterName));
        out.print("<br/>");
      }

      out.println("<br/>");

      out.println("Неявный объект <b>page</b> имеет тип "
          + page.getClass().getName() + "<br/><br/>");

      out.println("Размер буфера: " + response.getBufferSize() + " байт");
%>
</p>
<p><a href="implicitobjects2.jsp">Для продолжения щёлкните здесь</a></p>
</body>
</html>
