package estudiantesjdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public class EstudiantesJDBC {

    public static void main(String[] args) throws SQLException {
        
        try (Connection conexion = ConexionBD.conectar()) {
            if (conexion != null) {
                GestorEstudiantes gestor = new GestorEstudiantes(conexion);

                // Agregar un estudiante
                Estudiante nuevoEstudiante = new Estudiante(1,"Juan Pérez", 20, 8.5);
                gestor.agregarEstudiante(nuevoEstudiante);

                // Obtener la lista de estudiantes y mostrar sus datos
                List<Estudiante> estudiantes = gestor.obtenerEstudiantes();
               
                for (Estudiante estudiante : estudiantes) {
                    System.out.println("ID: " + estudiante.getId());
                    System.out.println("Nombre: " + estudiante.getNombre());
                    System.out.println("Edad: " + estudiante.getEdad());
                    System.out.println("Calificación: " + estudiante.getCalificacion());
                    System.out.println();
                }
            }
        }
        
        
        
    }
    
}
