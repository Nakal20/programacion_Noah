package TEMA1;

import java.util.Scanner;

public class Tema1Ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("escribe dos numeros reales");

        int Numero1 = in.nextInt();
        int Numero2 = in.nextInt();

        if (Numero1 < 1 || Numero2 < 1) {
            System.out.println("ese no es un numero real");
        } else {

            System.out.println(Numero1 + Numero2);

            System.out.println(Numero1 * Numero2);

            System.out.println(Numero1 - Numero2);

            System.out.println(Numero1 % Numero2);

            System.out.println(Numero1 / Numero2);
        }
    }
}
