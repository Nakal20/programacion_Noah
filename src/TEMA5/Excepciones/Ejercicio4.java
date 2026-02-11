package Tema5.Excepciones;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Ejercicio4 {

        public static void main(String[] args) {
            Random rand = new Random();
            Scanner sc = new Scanner(System.in);

            int n = rand.nextInt(100) + 1;
            int[] vector = new int[n];
            int posicion = 0;

            for (int i = 0; i < vector.length; i++) {
                vector[i] = rand.nextInt(10) + 1;
            }

            System.out.println("Vector creado con tamaño: " + n);

            while(posicion >= 0) {
                try {
                    System.out.print("Introduce una posición (negativo para salir): ");
                    posicion = sc.nextInt();
                    System.out.println("Valor en la posición " + posicion + ": " + vector[posicion]);

                } catch (ArrayIndexOutOfBoundsException ex) {
                    System.err.println("Error: posición fuera del rango del vector.");
                } catch (InputMismatchException ex) {
                    System.err.println("Error: debes introducir un número entero.");
                    sc.nextLine();
                }
            }
            System.out.println("Programa finalizado.");

        }
    }
