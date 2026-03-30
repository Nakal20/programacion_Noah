package TEMA7.EjerciciosFichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
    static void main() {
        String ruta = "/home/noabertau/IdeaProjects/programacion/src/TEMA7/EjerciciosFichero/texto.txt";
        int palabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String line;
            while ((line = br.readLine()) != null) {
                for(String palabra : line.split(" ")) {
                    palabras++;
                }

            }
            System.out.println("Tiene: " + palabras + " palabras");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
