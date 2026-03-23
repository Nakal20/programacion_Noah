package TEMA7.EjerciciosB.B3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_B3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce archivo de lectura: ");
        String archivoA = sc.nextLine();//escribe la ruta completa (/home/noabertau/IdeaProjects/programacion/src/TEMA7/EjerciciosB/Archivos/usa_personas.txt)

        System.out.print("Introduce archivo de escritura: ");
        String archivoB = sc.nextLine();

        List<String> lineas = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(archivoA))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }

            Collections.sort(lineas);

            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoB));

            for (String l : lineas) {
                bw.write(l);
                bw.newLine();
            }

            bw.close();

            FileReader fReader=new FileReader(archivoB);
            int valor=fReader.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fReader.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}