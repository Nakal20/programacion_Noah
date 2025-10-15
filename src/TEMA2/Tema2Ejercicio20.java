package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el numero A");
        int a = in.nextInt();
        System.out.println("Dime el numero B");
        int b = in.nextInt();

        if (b > a) {
            if (a % 2 == 0) {
                a++;
                for (int i = a; i <= b; i = i+2) {
                    System.out.println(i);
                }
            }
            for (int i = a; i <= b; i = i+2) {
                System.out.println(i);
            }
        }
    }
}
