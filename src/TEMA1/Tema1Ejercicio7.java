package TEMA1;

import java.util.Scanner;

public class Tema1Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("introduce un numero");
        Scanner in = new Scanner(System.in);
        int Numero = in.nextInt();
        if (Numero > 6 || Numero < 1) {
            System.out.println("usa otro numero");
        } else {
            Numero = 7 - Numero;
        System.out.println(Numero);
        }
    }
}
