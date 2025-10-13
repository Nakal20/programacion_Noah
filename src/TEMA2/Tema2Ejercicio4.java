package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Dime un numero");
        Scanner in = new Scanner(System.in);
        int numero1 = in.nextInt();
        System.out.println("Dime otro");
        int numero2 = in.nextInt();
        System.out.println("Dime otro");
        int numero3 = in.nextInt();

        if (numero1>numero2 && numero1>numero3){
            System.out.println(numero1 + " es el numero mas grande");
        }
        else if (numero2>numero3 && numero2>numero1){
            System.out.println(numero2 + " es el numero mas grande");
        } else if (numero3>numero2 && numero3>numero1) {
            System.out.println(numero3 + " es el numero mas grande");
        }
        else {
            System.out.println("hay varios numero igual de grandes");
        }
    }
}
