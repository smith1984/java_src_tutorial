<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<jsp:useBean id="customer"
  class="net.ensode.glassfishbook.javabeanproperties.CustomerBean"
  scope="page"></jsp:useBean>
<jsp:setProperty name="customer" property="*"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>�������� JavaBean</title>
</head>
<body>
<form>
<table cellpadding="0" cellspacing="0" border="0">
  <tr>
    <td align="right">���:&nbsp;</td>
    <td><input type="text" name="firstName"
      value='<jsp:getProperty name="customer" property="firstName"/>'>
    </td>
  </tr>
  <tr>
    <td align="right">�������:&nbsp;</td>
    <td><input type="text" name="lastName"
      value='<jsp:getProperty name="customer" property="lastName"/>'>
    </td>
  </tr>
  <tr>
    <td></td>
    <td><input type="submit" value="���������"></td>
  </tr>
</table>
</form>
</body>
</html>
