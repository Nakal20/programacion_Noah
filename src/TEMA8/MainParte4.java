package TEMA8;

import java.util.List;
import java.util.Scanner;

public class MainParte4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n 1");

        Operaciones op = new Operaciones();

        List<Asignatura> asignaturas = op.obtenerAsignaturas();

        for (int i = 0; i < asignaturas.size(); i++) {
            System.out.println(asignaturas.get(i));
        }

        System.out.println("\n 2");

        Operaciones b = new Operaciones();
        System.out.println("De que casa quieres hacer una consulta?");
        String casa = sc.nextLine();
        b.estudiantesPorCasa(casa);

        System.out.println("\n 3");

        Operaciones c = new Operaciones();
        System.out.println("De que persona quieres buscar su mascota?");
        String persona = sc.nextLine();
        b.estudiantesPorCasa(persona);


    }
}
