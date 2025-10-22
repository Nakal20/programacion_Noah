package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio27 {
    public static void main(String[] args) {
        int num = 2;
        int contador = 0;
//usar un contadorDePrimos que debe llegar hasta  que encuentre 20 primos
        for (int i = 2; contador < 20; i++) {

            if (num % i == 0){
                contador++;
                System.out.println(i);
            }
            num++;
        }
    }
}
