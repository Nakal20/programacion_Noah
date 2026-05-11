package TEMA8.AADD;

import TEMA8.Asignatura;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PilotosCRUD {

    public void CreatePilot(int driverid, String code, String forename, String surname, String dob, String nationality, int constructorid){
        String sentencia2 = "INSERT INTO drivers (driverid, code, forename, surname, dob, nationality, constructorid) VALUES ('" + driverid + "', '" + code + "', '" + forename + "', '" + surname + "', '" + dob + "', '" + nationality + "', '" + constructorid + "')";
        try (Connection con = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/f12006",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con.prepareStatement(sentencia2)) {

            int resultados = sentencia.executeUpdate();

            if (resultados > 0) {
                System.out.println("Piloto insertado exitosamente");
            } else {
                System.out.println("Piloto insertado no exitosamente");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void ReadPilot(int driverid){

        String sentencia2 = "SELECT * FROM drivers WHERE driverid = '"+driverid+"'";

        try (Connection con = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/f12006",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con.prepareStatement(sentencia2)) {

            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String forename = resultados.getString("forename");
                String surname = resultados.getString("surname");
                System.out.println("piloto: " + forename  + " " + surname);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Piloto2> ReadPilots(){
        List<Piloto2> listaPilotos = new ArrayList<>();

        String sql = "SELECT * FROM drivers";

        try (Connection con = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/f12006",
                "postgres",
                "12345678");
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Piloto2 piloto2 = new Piloto2();
                piloto2.setDriverid(rs.getInt("driverid"));
                piloto2.setCode(rs.getString("code"));
                piloto2.setForename(rs.getString("forename"));
                piloto2.setSurname(rs.getString("surname"));
                piloto2.setDob(rs.getString("dob"));
                piloto2.setNationality(rs.getString("nationality"));
                piloto2.setConstructorid(rs.getInt("constructorid"));
                piloto2.setUrl(rs.getString("url"));

                listaPilotos.add(piloto2);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaPilotos;
    }

    public void UpdatePilot(int driverid, String code, String forename, String surname, String dob, String nationality, int constructorid){

        String sentencia4 = "UPDATE drivers  SET code = '" + code + "', forename = '" + forename + "', surname = '" + surname + "', dob = '" + dob + "', nationality = '" + nationality + "', constructorid = '"  + constructorid + "' WHERE driverid = '" + driverid + "'";

        try (Connection con = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/f12006",
                "postgres",
                "12345678");
             PreparedStatement sentencia = con.prepareStatement(sentencia4)) {

            int resultados = sentencia.executeUpdate();

            if (resultados > 0) {
                System.out.println("Asignatura actualizada exitosamente");
            } else {
                System.out.println("Asignatura actualizada no exitosamente");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void DeletePilot(int id){

        String sentencia5 = "DELETE FROM drivers where driverid = '" + id + "'";
        try (Connection con = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/f12006",
                "postgres",
                "12345678");
             PreparedStatement sentenciaSQL1 = con.prepareStatement(sentencia5)) {
            int resultados = sentenciaSQL1.executeUpdate();
            if (resultados > 0) {
                System.out.println("Asignatura borrada con éxito");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void ShowPilotClassification(){

        String sentencia6 = "SELECT SUM(results.points) AS total_points, drivers.forename FROM results JOIN drivers ON results.driverid = drivers.driverid GROUP BY drivers.forename ORDER BY total_points DESC";

        try (Connection con = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/f12006",
                "postgres",
                "12345678");
             PreparedStatement sentencia2 = con.prepareStatement(sentencia6)) {

            ResultSet resultados = sentencia2.executeQuery();

            while (resultados.next()) {
                String forename = resultados.getString("forename");
                int puntos = resultados.getInt("total_points");
                System.out.println("piloto: " + forename + " Puntos: " + puntos);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void ShowBuildersClassification(){

        String sentencia7 = "SELECT sum(results.points) AS total_points, constructors.name  FROM results JOIN drivers ON results.driverid = drivers.driverid JOIN constructors ON constructors.constructorid = drivers.constructorid GROUP BY constructors.name ORDER BY total_points DESC";

        try (Connection con = DriverManager.getConnection(
                "jdbc:postgresql://ad-postgres.ckapai37ljqr.us-east-1.rds.amazonaws.com:5432/f12006",
                "postgres",
                "12345678");
             PreparedStatement sentencia2 = con.prepareStatement(sentencia7)) {

            ResultSet resultados = sentencia2.executeQuery();

            while (resultados.next()) {
                String name = resultados.getString("name");
                int puntos = resultados.getInt("total_points");
                System.out.println("Piloto2: " + name + " Puntos: " + puntos);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
