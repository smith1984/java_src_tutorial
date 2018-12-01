<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@taglib prefix="d" uri="DemoTagLibrary"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Демонстрация пользовательских тегов</title>
</head>
<body>
<form>
<table>
  <d:labeledTextField label="Улица 1" name="line1" value="Где эта улица, где этот дом"></d:labeledTextField>
  <d:labeledTextField label="Улица 2" name="line2"></d:labeledTextField>
  <d:labeledTextField label="Город" name="city"></d:labeledTextField>
  <d:labeledTextField label="Штат" name="state"></d:labeledTextField>
  <d:labeledTextField label="Zip-код" name="zip"></d:labeledTextField>
  <tr>
    <td></td>
    <td><input type="submit" value="Отправить"></td>
  </tr>
</table>
</form>
</body>
</html>
