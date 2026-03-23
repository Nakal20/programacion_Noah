package TEMA7.EjerciciosB.B6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio_B6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        String numero = sc.nextLine();

        try {
            //buscamos el archivo para leer (poner ruta complenta, cambiar en clase a la correcta)
            String pi = Files.readString(Paths.get("/home/noabertau/IdeaProjects/programacion/src/TEMA7/EjerciciosB/Archivos/pi-million.txt"));

            boolean encontrado = buscar(pi, numero);

            if (encontrado) {
                System.out.println("El número SÍ aparece en PI");
            } else {
                System.out.println("El número NO aparece en PI");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean buscar (String texto, String patron){

        int n = texto.length();
        int m = patron.length();

        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            // compara todos los caracteres
            while (j < m && texto.charAt(i + j) == patron.charAt(j)) {
                j++;
            }

            if (j == m) {
                return true;
            }
        }
        return false;
    }
}
