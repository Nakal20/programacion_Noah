package TEMA3;

import java.util.Scanner;

public class Tema3Ejercicio7 {
    public static void main(String[] args) {
        int contador;
        int num = 1;
        Scanner sc = new Scanner(System.in);
        while (num != 0) {
            System.out.print("Ingrese el numero y te digo si es primo o no: ");
            num = sc.nextInt();
            contador = numero(num);
            if (contador == 0) {
                System.out.println("es primo");
            } else {
                System.out.println("No es primo");
            }
        }
    }
    public static int numero(int num) {
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

