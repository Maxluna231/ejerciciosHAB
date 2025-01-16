
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos Insumos</h1>
        
        <form action="pruebaSv" method="POST">
            <p><label>Codigo_Insumo: </label><input type="text" name="codigo_Insumo"></p>
            <p><label>Nombre: </label><input type="text" name="ombre"></p>
            <p><label>Cantidad: </label><input type="text" name="cantidad"></p>
            <p><label>FechaCaducidad: </label><input type="text" name="fechaCaducidad"></p>
            <button type="submit">Enviar </button>
        </form>
    </body>
</html>
