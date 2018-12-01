<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:useBean scope="page" id="customer6"
	class="net.ensode.glassfishbook.unifiedexprlang.CustomerBean" />

<jsp:setProperty name="customer6" property="firstName" value="David" />
<jsp:setProperty name="customer6" property="lastName"
	value="Heffelfinger" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Демонстрация Унифицированного языка выражений</title>
</head>
<body>
Пользователь подключен к контексту application: ${applicationScope.customer1}
<br />
<br />
Пользователь подключен к контексту session:
${sessionScope.customer2.firstName} ${sessionScope.customer2.lastName}
<br />
<br />
Пользователь подключен к контексту request: ${requestScope.customer3}
<br />
<br />
Пользователь подключен к контексту page: ${pageScope.customer6}
<br />
<br />

Список пользователей, подключенных к сеансу (session):
<br />
${sessionScope.customerList[0]}
<br />
${sessionScope.customerList[1].firstName}
${sessionScope.customerList[1].lastName}
<br />
<br />
</body>
</html>
