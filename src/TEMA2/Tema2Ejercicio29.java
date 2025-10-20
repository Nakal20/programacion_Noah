package TEMA2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio29 {
    public static void main(String[] args) {
        System.out.println("Dime un numero hasta 100");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        Random random = new Random();
        int randomInt = random.nextInt(100);
        System.out.println(randomInt);

        do {
            if (num > randomInt){
                System.out.println("Has fallado, te has pasado");
                System.out.println("Dime otro");

            }else if (num < randomInt){
                System.out.println("Has fallado, te has quedado corto");
                System.out.println("Dime otro");
            }
            num = in.nextInt();
        }while (num != randomInt);
        System.out.println("has acertado");
    }
}

