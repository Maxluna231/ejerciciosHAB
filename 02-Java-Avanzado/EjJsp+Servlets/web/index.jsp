<%-- 
    Document   : index
    Created on : 13 ene. 2025, 18:12:13
    Author     : lunad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos del Empleado</h1>
        <form action="pruebaSv" method="POST">
            <p><label> Nombre: </label><input  type="text" name="nombre"></p>
            <p><label> Apellido: </label><input  type="text" name="apellido"></p>
            <p><label> Domicilio: </label><input  type="text" name="domicilio"></p>
            <p><label> Teléfono: </label><input  type="text" name="telefono"></p>
            <button type="submit"> Enviar </button>
        </form>
        
        <h1>Ver Empleados</h1>
        <form action="pruebaSv" method="GET">
            <button type="submit"> Ver Empleados </button>
        </form>
    </body>
</html>
