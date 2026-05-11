package TEMA8.AADD;

import TEMA8.Asignatura;

import java.util.List;
import java.util.Scanner;

public class MainPiloto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 9;

        int id;
        String code;
        String nombre;
        String apellido;
        String dob;
        String nationality;
        int constructorid;
        while (opcion != 0) {
            System.out.println("\n que quieres hacer?");
            System.out.println("0. salir \n1.Añadir piloto \n2.Buscar piloto \n3.Mostrar todos los pilotos \n4.Actualizar piloto \n5.Borrar piloto \n6.Mostrar calificacion de pilotos \n7.Mostrar calificacion de equipos");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    PilotosCRUD a = new PilotosCRUD();
                    System.out.println("id del piloto");
                    id = sc.nextInt();
                    System.out.println("codigo del piloto");
                    code = sc.next();
                    System.out.println("nombre del piloto");
                    nombre = sc.next();
                    sc.nextLine();
                    System.out.println("apellido del piloto");
                    apellido = sc.nextLine();
                    System.out.println("fecha de nachimiento del piloto");
                    dob = sc.next();
                    System.out.println("nacionalidad del piloto");
                    nationality = sc.next();
                    System.out.println("id del constructor");
                    constructorid = sc.nextInt();
                    a.CreatePilot(id,code, nombre, apellido, dob, nationality, constructorid);

                    break;
                case 2:
                    PilotosCRUD b = new PilotosCRUD();
                    System.out.println("pon el codigo del piloto");
                    int driverid = sc.nextInt();
                    b.ReadPilot(driverid);
                    break;
                case 3:
                    PilotosCRUD c = new PilotosCRUD();
                    List<Piloto2> listaPilotos = c.ReadPilots();

                    for (int i = 0; i < listaPilotos.size(); i++) {
                        System.out.println(listaPilotos.get(i));
                    }

                    break;
                case 4:
                    PilotosCRUD d = new PilotosCRUD();
                    System.out.println("id del piloto");
                    id = sc.nextInt();
                    System.out.println("codigo del piloto");
                    code = sc.next();
                    System.out.println("nombre del piloto");
                    nombre = sc.next();
                    sc.nextLine();
                    System.out.println("apellido del piloto");
                    apellido = sc.nextLine();
                    System.out.println("fecha de nachimiento del piloto");
                    dob = sc.next();
                    System.out.println("nacionalidad del piloto");
                    nationality = sc.next();
                    System.out.println("id del constructor");
                    constructorid = sc.nextInt();
                    d.UpdatePilot(id,code, nombre, apellido, dob, nationality, constructorid);
                    break;
                case 5:
                    PilotosCRUD e = new PilotosCRUD();
                    System.out.println("id del piloto");
                    id = sc.nextInt();
                    e.DeletePilot(id);
                    break;
                case 6:
                    PilotosCRUD f = new PilotosCRUD();
                    f.ShowPilotClassification();
                    break;
                case 7:
                    PilotosCRUD g = new PilotosCRUD();
                    g.ShowBuildersClassification();
                    break;

            }
        }
        System.out.println("Adios");
    }
}
