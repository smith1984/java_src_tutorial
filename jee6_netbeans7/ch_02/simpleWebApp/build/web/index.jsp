<%-- 
    Document   : index
    Created on : Sep 29, 2017, 3:06:12 PM
    Author     : ito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Опрос разработчика</title>
    </head>
    <body>
        <h1>Добро пожаловать на страницу опроса разработчика</h1>
        <p>Пожалуйста укажите с какими языками программирования вы знакомы</p>
        <form action="output.jsp">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Полное название:</td>
                        <td><input type="text"  name="fullName" value="" /></td>
                    </tr>
                    <tr>
                        <td>Java</td>
                        <td><input type="checkbox" name="progLang" value="Java" /></td>
                    </tr>
                    <tr>
                        <td>Groovy</td>
                        <td><input type="checkbox" name="progLang" value="Groovy" /></td>
                    </tr>
                    <tr>
                        <td>Scala</td>
                        <td><input type="checkbox" name="progLang" value="Scala" /></td>
                    </tr>
                    <tr>
                        <td>C#</td>
                        <td><input type="checkbox" name="progLang" value="C#" /></td>
                    </tr>
                    <tr>
                        <td>Ruby</td>
                        <td><input type="checkbox" name="progLang" value="Ruby" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Отправить" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
