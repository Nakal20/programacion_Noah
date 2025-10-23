package TEMA2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio28 {
    public static void main(String[] args) {
        System.out.println("Dime un numero");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        Random random = new Random();
        int randomInt = random.nextInt(99999);
        System.out.println(randomInt);

        //cambia mirando bien el enunciado y quitando el if vacío
        for (int i = 0; i < 5; i++) {
                if (num == randomInt) {
                    System.out.println("has acertado");
                    i=5;
                } else {
                    System.out.println("has fallado");
                    System.out.println("Dime otro");
                    num = in.nextInt();
                }

        }
    }
}
