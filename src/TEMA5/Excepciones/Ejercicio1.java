package TEMA5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        try {
            System.out.print("Introduce un número entero: ");
            n = sc.nextInt();
            System.out.println("Valor introducido: " + n);
        } catch (InputMismatchException e) {
            System.err.println("Valor introducido incorrecto");
        }
    }
}
