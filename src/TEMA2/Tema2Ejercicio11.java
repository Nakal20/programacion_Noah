package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("dime 3 numeros");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if (num2 == num1+1 && num3 == num2+1 || num1 == num2+1 && num2 == num3+1){
            System.out.println("si son consecutivos");
        }
        else {
            System.out.println("no son conscutivos");
        }
    }
}
