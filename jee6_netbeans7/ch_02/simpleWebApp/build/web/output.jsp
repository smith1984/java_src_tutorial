<%-- 
    Document   : output
    Created on : Sep 29, 2017, 3:46:23 PM
    Author     : ito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Спасибо!</title>
    </head>
    <body>
        <h2>Спасибо за участие в нашем опросе</h2>
        <p>
            <%request.setCharacterEncoding("UTF-8");%>
            <%= request.getParameter("fullName")%>,
            вы указали, что знакомы со следующими
            языками программирования:</p>
        <ul>
            <%
                        String[] selectedLanguages =
                                request.getParameterValues("progLang");
                        if (selectedLanguages != null) {
                            for (int i = 0; i < selectedLanguages.length;
                                    i++) {
            %>

            <li>
                <%= selectedLanguages[i]%>
            </li>

            <%}
                        }
            %>
        </ul>
    </body>
</html>
