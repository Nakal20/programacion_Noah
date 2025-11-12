package TEMA3;

import java.util.Scanner;

public class Tema3Ejercicio7 {
    public static void main(String[] args) {
        int contador;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero y te digo si es primo o no: ");
        int num = sc.nextInt();
        contador = numero(num);
        if (contador == 0){
            System.out.println("es primo");
        }else {
            System.out.println("No es primo");
        }
    }
    public static int numero(int num) {
        int contador = 0;
        if (num <= 1) {
            System.out.println("no es primo");
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

