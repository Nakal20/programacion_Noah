package TEMA7.EjerciciosB.B2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio_B2 {
    public static void main(String[] args) {
        double media;
        double suma;
        List<Alumno> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/noabertau/IdeaProjects/programacion/src/TEMA7/EjerciciosB/Archivos/alumnos_notas.txt"))){

            String linea;
            while ((linea = br.readLine()) != null) {
                suma = 0;
                String[] informacion = linea.split(" ");
                String nombre = informacion[0] + " " + informacion[1];
                for (int i = 2; i < informacion.length; i++){
                   suma += Double.parseDouble(informacion[i]);
                }
                media = suma / (informacion.length - 2);
                lista.add(new Alumno(nombre, media));
            }
            lista.sort((a, b) -> Double.compare(b.media, a.media));

            for (Alumno a : lista) {
                System.out.println(a.nombre + " " + a.media);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
