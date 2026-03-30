package TEMA7.EjerciciosFichero;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("dime la edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("dime donde guardar: ");
        String archivo = sc.nextLine();
        Path dir = Paths.get("/home/noabertau/IdeaProjects/programacion/src/TEMA7/EjerciciosFichero");


        try{

            File archivo1 = new File( dir.toFile(), archivo + ".txt");

            Files.write(
                    archivo1.toPath(),
                    ("Nombre: " + nombre + "\n" + "edad: "+ edad + "\n").getBytes(),
                    StandardOpenOption.APPEND
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
