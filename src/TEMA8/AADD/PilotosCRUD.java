package TEMA8.AADD;

import java.sql.*;

public class PilotosCRUD {

    public void CreatePilot(){

    }

    public void ReadPilot(int driverid){

        String sentencia = "SELECT * FROM drivers WHERE driverid = '"+driverid+"'";

        try (Connection con = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/f12006",
                "postgres",
                "12345678");
             PreparedStatement sentencia2 = con.prepareStatement(sentencia)) {

            ResultSet resultados = sentencia2.executeQuery();

            while (resultados.next()) {
                String forename = resultados.getString("forename");
                String surname = resultados.getString("surname");
                System.out.println("piloto: " + forename  + " " + surname);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void ReadPilots(){

    }

    public void UpdatePilot(){

    }

    public void DeletePilot(){

    }

    public void ShowPilotClassification(){

    }

    public void ShowBuildersClassification(){

        String sentencia7 = "SELECT sum(results.points), results.driverid, drivers.driverid, constructors.constructorid, drivers.constructorid, constructors.name  FROM results JOIN drivers ON results.driverid = drivers.driverid JOIN constructors ON constructors.constructorid = drivers.constructorid GROUP BY constructors.name ORDER BY points DESC";

        try (Connection con = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/f12006",
                "postgres",
                "12345678");
             PreparedStatement sentencia2 = con.prepareStatement(sentencia7)) {

            ResultSet resultados = sentencia2.executeQuery();

            while (resultados.next()) {
                String name = resultados.getString("name");
                int puntos = resultados.getInt("points");
                System.out.println("piloto: " + name + " " + puntos);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
