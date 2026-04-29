package TEMA8;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Operaciones {

    public List<Asignatura> obtenerAsignaturas() {

        List<Asignatura> listaAsignaturas = new ArrayList<>();

        String sql = "SELECT * FROM Asignatura";

        try (Connection con = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Asignatura asignatura = new Asignatura();
                asignatura.setIdAsignatura(rs.getInt("id_asignatura"));
                asignatura.setNombre(rs.getString("nombre"));
                asignatura.setAula(rs.getString("aula"));

                listaAsignaturas.add(asignatura);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaAsignaturas;
    }

    public String estudiantesPorCasa(String casa) {

        String sentencia2 = "SELECT Estudiante.nombre, Estudiante.apellido, Casa.nombre AS nombre_casa FROM Estudiante JOIN Casa ON Estudiante.id_casa = Casa.id_casa WHERE Casa.nombre = '" + casa + "'";

        try(Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
            PreparedStatement sentencia = con2.prepareStatement(sentencia2)){

            ResultSet resultados = sentencia.executeQuery();

            while(resultados.next()){
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String nombre_casa = resultados.getString("nombre_casa");
                System.out.println("Estudiantes: " + nombre + ", " + apellido + ", " + nombre_casa);
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return sentencia2;
    }

    public void mascotaDeUnEstudianteEspecífico() {

        String sentencia3 = "SELECT Estudiante.nombre, Estudiante.apellido, Casa.nombre AS nombre_casa FROM Estudiante JOIN Casa ON Estudiante.id_casa = Casa.id_casa WHERE Casa.nombre = 'Gryffindor'";

        try(Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
            PreparedStatement sentencia = con2.prepareStatement(sentencia3)){

            ResultSet resultados = sentencia.executeQuery();

            while(resultados.next()){
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String nombre_casa = resultados.getString("nombre_casa");
                System.out.println("Estudiantes: " + nombre + ", " + apellido + ", " + nombre_casa);
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void estudiantesPorCasa() {

        String sentencia3 = "SELECT Estudiante.nombre, Estudiante.apellido, Casa.nombre AS nombre_casa FROM Estudiante JOIN Casa ON Estudiante.id_casa = Casa.id_casa WHERE Casa.nombre = 'Gryffindor'";

        try(Connection con2 = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/hogwarts",
                "postgres",
                "12345678");
            PreparedStatement sentencia = con2.prepareStatement(sentencia3)){

            ResultSet resultados = sentencia.executeQuery();

            while(resultados.next()){
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String nombre_casa = resultados.getString("nombre_casa");
                System.out.println("Estudiantes: " + nombre + ", " + apellido + ", " + nombre_casa);
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
