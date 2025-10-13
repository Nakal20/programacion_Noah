package TEMA1;

import java.util.Scanner;

public class Tema1Ejercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("escribe dos numeros");

        int Numero1 = in.nextInt();
        int Numero2 = in.nextInt();

        if (Numero1 > Numero2) {
            System.out.println(Numero1 + " es mayor que " + Numero2);
        } else if (Numero1 < Numero2) {
            System.out.println(Numero1 + " es menor que " + Numero2);
        } else if (Numero1 == Numero2){
            System.out.println(Numero1 + " es igual que " + Numero2);
        }
    }
}
