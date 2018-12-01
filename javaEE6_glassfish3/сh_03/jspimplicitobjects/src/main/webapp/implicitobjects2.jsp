<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.Enumeration"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Санитарная обработка</title>
</head>
<body>
<p>Эта страница подтверждает что мы в состоянии извлечь атрибуты application, session и request, установленные на предыдущей странице.<br />
</p>
<p>значением applicationAttribute является: <%=application.getAttribute("applicationAttribute")%>
<br />
значением sessionAttribute является: <%=session.getAttribute("sessionAttribute")%>
<br />
значением requestAttribute является: <%=request.getAttribute("requestAttribute")%>
<br />
</p>
<p>

В контексте application, были найдены следующие атрибуты:<br/><br/>
<%
          Enumeration applicationAttributeNames = pageContext
          .getAttributeNamesInScope(pageContext.APPLICATION_SCOPE);

      while (applicationAttributeNames.hasMoreElements())
      {
        out.println(applicationAttributeNames.nextElement() + "<br/>");
      }
%>
</p>
<p><a href="buggy.jsp">Эта гиперссылка указывает на JSP-страницу, которая вызывает ислючение.</a></p>
</body>
</html>
