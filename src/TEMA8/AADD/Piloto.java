package TEMA8.AADD;

import java.sql.*;

public class Piloto {
    public static void main(String[] args) {

        String sentenciaSQL = "SELECT * FROM drivers";

        try (Connection con = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/f12006",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {

            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String forename = resultados.getString("forename");
                String surname = resultados.getString("surname");
                System.out.println("piloto: " + forename   + " " + surname);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
