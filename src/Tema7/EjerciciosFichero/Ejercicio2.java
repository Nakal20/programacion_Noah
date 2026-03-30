package TEMA7.EjerciciosFichero;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio2 {
    static void main() {
        try (BufferedReader br = new BufferedReader(new FileReader("/home/noabertau/IdeaProjects/programacion/src/TEMA7/EjerciciosFichero/usuario.txt"))){
            String linea;
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
