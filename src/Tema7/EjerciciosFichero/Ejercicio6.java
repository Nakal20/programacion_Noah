package Tema7.ejerciciosB.EjerciciosFichero;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> lista = new ArrayList<>();

        String opcion;

        do {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            lista.add(new Persona(nombre, edad));

            System.out.print("¿Quieres añadir otra persona? (s/n): ");
            opcion = sc.nextLine();

        } while (opcion.equalsIgnoreCase("s"));

        Path ruta = Paths.get("C:\\Users\\noah\\IdeaProjects\\Pruebas\\src\\Tema7\\ejerciciosB\\EjerciciosFichero\\persona.dat");

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(ruta.toFile()))) {

            oos.writeObject(lista);
            System.out.println("Lista guardada correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
