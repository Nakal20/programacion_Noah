package Tema7.ejerciciosB.B7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class B7 {

    public static void main(String[] args) {

        String ruta = "C:\\Users\\noah\\IdeaProjects\\Pruebas\\src\\Tema7\\ejerciciosB\\Libros\\quijote_cervantes.txt";

        int numLineas = 0;
        int numPalabras = 0;
        int numCaracteres = 0;

        Map<String, Integer> contador = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String line;

            while ((line = br.readLine()) != null) {

                numLineas++;

                numCaracteres += line.length();

                String[] palabras = line.toLowerCase().split("\\W+");

                for (String palabra : palabras) {

                    if (palabra.isEmpty()) continue;

                    numPalabras++;

                    contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Líneas: " + numLineas);
        System.out.println("Palabras: " + numPalabras);
        System.out.println("Caracteres: " + numCaracteres);

        List<Map.Entry<String, Integer>> lista = new ArrayList<>(contador.entrySet());

        lista.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("\nTop 10 palabras:");
        for (int i = 0; i < Math.min(10, lista.size()); i++) {
            System.out.println(lista.get(i).getKey() + " → " + lista.get(i).getValue());
        }
    }
}