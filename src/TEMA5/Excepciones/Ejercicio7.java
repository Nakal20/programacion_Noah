package Tema5.Excepciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Gato> listaGatos = new ArrayList<>();

        while (listaGatos.size() < 5) {
            try {
                System.out.println("\nIntroduce datos del gato " + (listaGatos.size() + 1));
                Gato g = new Gato();
                System.out.print("Nombre: ");
                g.setNombre(sc.next());

                System.out.print("Edad: ");
                g.setEdad(sc.nextInt());

                listaGatos.add(g);

                System.out.println("Gato añadido correctamente.");

            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
                System.out.println("Vuelve a introducir los datos.");
            }
        }

        System.out.println("\n--- LISTA DE GATOS ---");
        for (Gato g : listaGatos) {
            g.imprimir();
        }

    }
}
