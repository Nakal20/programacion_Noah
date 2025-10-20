package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio25 {
    public static void main(String[] args) {
        System.out.println("Dime un numero");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num ; i++) {
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
}
