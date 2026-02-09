package TEMA5.Excepciones;

import java.util.InputMismatchException;

public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            int vector[] = new int[5];
            System.out.println("introduce la posicion 0");

            for (int i = 0; i < vector.length; i++) {
                System.out.println(vector[i]);
                vector[i] = i + 1;
            }
        }catch (InputMismatchException e) {
            System.err.println("Valor introducido incorrecto");
        }
    }
}
