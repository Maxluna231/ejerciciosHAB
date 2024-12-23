package estudiantesjdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GestorEstudiantes {
    
    private Connection conexion;

    public GestorEstudiantes(Connection conexion) {
        this.conexion = conexion;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        String sql = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES (?, ?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, estudiante.getNombre());
            statement.setInt(2, estudiante.getEdad());
            statement.setDouble(3, estudiante.getCalificacion());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Estudiante> obtenerEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        String sql = "SELECT id, nombre, edad, calificacion FROM estudiantes";
        try (PreparedStatement statement = conexion.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");
                double calificacion = resultSet.getDouble("calificacion");
                estudiantes.add(new Estudiante(id, nombre, edad, calificacion));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }
    
}
