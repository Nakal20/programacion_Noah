package Tema7.ejerciciosB.EjerciciosFichero;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Dime la edad: ");
        int edad = sc.nextInt();

        Persona persona = new Persona(nombre, edad);

        Path ruta = Paths.get("C:\\Users\\noah\\IdeaProjects\\Pruebas\\src\\Tema7\\ejerciciosB\\EjerciciosFichero\\persona.dat");


        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(ruta.toFile()))) {

            oos.writeObject(persona);
            System.out.println("Objeto guardado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
