<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ошибка входа в систему</title>
    </head>
    <body>
        При входе в систему возникла ошибка. Пожалуйста, попробуйте ещё раз.
        <br />
        <form method="POST" action="j_security_check">
            <table cellpadding="0" cellspacing="0" border="0">
                <tr>
                    <td align="right">Имя:&nbsp;</td>
                    <td><input type="text" name="j_username"></td>
                </tr>
                <tr>
                    <td align="right">Пароль:&nbsp;</td>
                    <td><input type="password" name="j_password"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Войти"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
