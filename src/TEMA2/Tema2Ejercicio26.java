package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio26 {
    public static void main(String[] args) {
        System.out.println("Dime un numero");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num <= 1) {
            System.out.println("no es primo");
        } else {
            for (int i = 4; i < 5; i++) {
                if (num % i == 0){
                    System.out.println("no es primo");

                }
                else{
                    System.out.println("es primo");

                }
            }
        }

    }
}
