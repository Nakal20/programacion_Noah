package TEMA3;

import java.util.Scanner;

public class Tema3Ejercicio7 {
    public static void main(String[] args) {
        int contador;
        int num = 1;
        Scanner sc = new Scanner(System.in);
        //pedir fuera el número
        System.out.print("Ingrese el numero y te digo si es primo o no: ");
        num = sc.nextInt();
        while (num != 0) {
            contador = esPrimo(num);
            if (contador == 0) {
                System.out.println("es primo");
            } else {
                System.out.println("No es primo");
            }
            System.out.print("Ingrese el numero y te digo si es primo o no: ");
            num = sc.nextInt();
            //volverlo a pedir ants de cerrar el while
        }
    }
    public static int esPrimo(int num) {
        int contador = 0;
        if (num == 0) {
            System.out.println("adios");
        }
        if (num <= 1) {
            contador++;
        } else {
            for (int i = 2; i < num -1 ; i++) {
                if (num % i == 0){
                    contador++;
                }
            }
        }
        return contador;
    }
}

