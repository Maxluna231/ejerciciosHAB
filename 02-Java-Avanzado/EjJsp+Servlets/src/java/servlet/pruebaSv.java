
package servlet;


import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.ControladoraLogica;
import logica.Empleado;



@WebServlet(name = "pruebaSv", urlPatterns = {"/pruebaSv"})
public class pruebaSv extends HttpServlet {
    
ControladoraLogica control = new ControladoraLogica();
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
        List<Empleado> listaEmpleados = control.traerEmpleados();
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaEmpleados", listaEmpleados);
        
        response.sendRedirect("mostrarEmpleado.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String domicilio = request.getParameter("domicilio");
        String telefono = request.getParameter("telefono");
        
                
        control.crearEmpleado(nombre, apellido, domicilio, telefono);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
