package TEMA3;

import java.util.Scanner;

public class Tema3Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Dime que numero de 1 a 10 que quieres multiplicar?");
        Scanner sc = new Scanner(System.in);
        //comprobar que sea entero y que no pase del 10
        int num = sc.nextInt();
        while (num <= 0 || num > 10) {
            System.out.println("Numero invalido");
            System.out.println("Dime que numero que quieres multiplicar?");
            num = sc.nextInt();
        }
        tablaMultiplicar(num);
    }

    public static void tablaMultiplicar(int num) {
        //TODO: for
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
