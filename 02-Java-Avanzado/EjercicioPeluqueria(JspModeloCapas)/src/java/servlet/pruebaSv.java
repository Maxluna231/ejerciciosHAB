
package servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.ControladoraLogica;


@WebServlet(name = "pruevaSv", urlPatterns = {"/pruevaSv"})
public class pruebaSv extends HttpServlet {
 
    ControladoraLogica control = new ControladoraLogica ();
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String codigo_Insumo = request.getParameter("codigo_Insumo");
        String nombre = request.getParameter("nombre");
        String cantidad = request.getParameter("cantidad");
        String fechaCaducidad = request.getParameter("fechaCaducidad");
        
        control.crearStock(codigo_Insumo,nombre,cantidad,fechaCaducidad);
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
