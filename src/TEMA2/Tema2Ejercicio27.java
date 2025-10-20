package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio27 {
    public static void main(String[] args) {
        int num = 2;

        for (int i = 1; i < 72 ; i++) {
            if (num == 2 || num == 3 || num == 5){
                System.out.println(num);
            }
            else if (num % 4 == 0 || num % 6 == 0 || num % 15 == 0){

            }
            else if (num % 2 != 0 ) {
                System.out.println(num);
            }
            num++;
        }
    }
}
