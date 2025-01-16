

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Tabla de multiplicar</h1>
        
        <% for(int i = 1; i<=10; i++){
        int multiplicacion = 5*i;
        
        %>
        <p>5 x <%= i %> = <%= multiplicacion %></p>
        <%}%>
        
    </body>
</html>
