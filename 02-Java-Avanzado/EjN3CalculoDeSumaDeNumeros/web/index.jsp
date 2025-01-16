
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Cálculo de la Suma de los Números del 1 al 10</h1>
    <%
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
    %>
    <h1>La suma de los números del 1 al 10 es: <%= suma %></h1>
    </body>
</html>
