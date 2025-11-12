package TEMA3;

import java.util.Scanner;

public class Tema3Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Dime que numero que quieres multiplicar?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        numero(num);
    }

    public static void numero(int num) {
        System.out.println(num + " * 1 = " + num * 1);
        System.out.println(num + " * 2 = " + num * 2);
        System.out.println(num + " * 3 = " + num * 3);
        System.out.println(num + " * 4 = " + num * 4);
        System.out.println(num + " * 5 = " + num * 5);
        System.out.println(num + " * 6 = " + num * 6);
        System.out.println(num + " * 7 = " + num * 7);
        System.out.println(num + " * 8 = " + num * 8);
        System.out.println(num + " * 9 = " + num * 9);
        System.out.println(num + " * 10 = " + num * 10);
    }
}
