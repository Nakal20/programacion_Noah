package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio26 {
    public static void main(String[] args) {
        System.out.println("Dime un numero");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int contador = 0;

        if (num <= 1) {
            System.out.println("no es primo");
        } else {
            //cambiar el for
            for (int i = 2; i < num -1 ; i++) {

                if (num % i == 0){
                    contador++;
                }
            }
        }
        if (contador == 0){
            System.out.println("es primo");
        }else {
            System.out.println("No es primo");
        }

    }
}
