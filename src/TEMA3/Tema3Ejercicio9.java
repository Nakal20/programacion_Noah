package TEMA3;

import java.util.Scanner;

public class Tema3Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el caracter que quieres");
        char caracter = sc.next().charAt(0);
        System.out.println("Dime cuantas lineas tiene");
        int lineas = sc.nextInt();
        piramides(caracter, lineas);

    }

    public static void piramides(char caracter, int lineas) {

        for (int i = 1; i <= lineas; i++) {
            for (int j = i; j < lineas; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
