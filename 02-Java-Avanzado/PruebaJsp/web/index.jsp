
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String nombre = "Max";%>
        <% for(int i=0;i<5;i++) {%>
        <h1>Hola desde JSP!<%=nombre%> </h1>
        <%}%>
    </body>
</html>
