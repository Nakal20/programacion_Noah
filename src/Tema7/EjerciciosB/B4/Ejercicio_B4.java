package TEMA7.EjerciciosB.B4;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce cuantos nombres y apellidos quieres hacer: ");
        int numero = sc.nextInt();//limpiamos escaner sino no le donde lo quieres guardar
        sc.nextLine();
        System.out.println("Introduce donde lo quieres guardar: ");
        //solo funciona si pones la ruta entera (/home/noabertau/IdeaProjects/programacion/src/TEMA7/EjerciciosB/Archivos/usa_personas.txt)
        String nombrea = sc.nextLine();

        Random aleatorio = new Random();


        try {
            String nombreAleatoria = "";
            String apellidoAleatoria = "";
            for(int i = 0; i < numero; i++) {

                List<String> nombres = Files.readAllLines(Paths.get("/home/noabertau/IdeaProjects/programacion/src/TEMA7/EjerciciosB/Archivos/usa_nombres.txt"));

                if (!nombres.isEmpty()) { //si la linea no esta vacia entra en el if
                    nombreAleatoria = nombres.get(aleatorio.nextInt(nombres.size()));
                    System.out.println("Nombre: " + nombreAleatoria);
                }
                //crea un list de todo el archivo
                List<String> apellidos = Files.readAllLines(Paths.get("/home/noabertau/IdeaProjects/programacion/src/TEMA7/EjerciciosB/Archivos/usa_apellidos.txt"));

                if (!apellidos.isEmpty()) {
                    apellidoAleatoria = apellidos.get(aleatorio.nextInt(apellidos.size()));
                    System.out.println("Apellido: " + apellidoAleatoria);
                }

                File archivo = new File(nombrea);
                Files.write(
                        archivo.toPath(),
                        (nombreAleatoria + " " + apellidoAleatoria + "\n").getBytes(),
                        StandardOpenOption.APPEND
                );//escribe la palabra con un salto de linea
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
