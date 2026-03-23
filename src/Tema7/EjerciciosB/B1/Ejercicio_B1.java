package TEMA7.EjerciciosB.B1;

import java.io.BufferedReader;
import java.io.FileReader;


public class Ejercicio_B1 {
    static void main() {
        int max = 0;
        int min = 1000000;

        try (BufferedReader br = new BufferedReader(new FileReader("/home/noabertau/IdeaProjects/programacion/src/TEMA7/EjerciciosB/Archivos/numeros.txt"))){
            String linea;
            while ((linea = br.readLine()) != null){
                if (Integer.parseInt(linea) > max){
                    max = Integer.parseInt(linea);
                } else if (Integer.parseInt(linea) < min){
                    min = Integer.parseInt(linea);
                }
            }
            System.out.println("El maximo es: " + max + "\nEl minimo es: " + min);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
