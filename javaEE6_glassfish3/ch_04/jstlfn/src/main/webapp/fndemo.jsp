<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Демонстрация функций JSTL</title>
</head>
<body>
<c:set var="nameArr"
  value="${fn:split('Kevin,Danielle,Alex,Beatrice',',')}" />

У нас имеется список имён ${fn:length(nameArr)}, вот они:
<br />
<ol>
  <c:forEach var="currentName" items="${nameArr}">
    <li />${fn:toUpperCase(currentName)} <br />
  </c:forEach>
</ol>
</body>
</html>
