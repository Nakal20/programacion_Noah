package Tema5.Excepciones;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;

        while (num != 0) {
            try {
                System.out.println("Introduce un número (0 para salir): ");
                System.out.println(" dime la p");
                num = sc.nextInt();
                imprimePositivo(num);

                System.out.println(" dime la n");
                num = sc.nextInt();
                imprimeNegativo(num);

            } catch (Exception ex) {
                System.err.println("Excepción: " + ex.getMessage());
            }
        }
    }

    public static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("El número es negativo");
        }
        System.out.println("Número positivo: " + p);
    }

    public static void imprimeNegativo(int n) throws Exception {
        if (n >= 0) {
            throw new Exception("El número no es negativo");
        }
        System.out.println("Número negativo: " + n);
    }

}

