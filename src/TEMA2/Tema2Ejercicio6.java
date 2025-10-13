package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Dime un numero");
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();

        if (numero>0){
            System.out.println("Es positivo");
        } else if (numero<0) {
            System.out.println("Es negativo");
        }
        else {
            System.out.println("Es 0");
        }
    }
}
