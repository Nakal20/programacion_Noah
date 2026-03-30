package TEMA7.EjerciciosFichero;

import java.io.File;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("dime la edad: ");
        int edad = sc.nextInt();

        Persona persona = new Persona(nombre, edad);
        Path dir = Paths.get("/home/noabertau/IdeaProjects/programacion/src/TEMA7/EjerciciosFichero");

        try{
            File archivo1 = new File(dir.toFile(),"Persona.dat");

            Files.write(
                    archivo1.toPath(),
                    (persona + "\n").getBytes(),
                    StandardOpenOption.APPEND
            );
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
