package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Dime 3 numeros");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if (num1>num2 && num2>num3){
            System.out.println(num1 + ">" + num2 + ">" + num3);
        } else if (num1>num3 && num3>num2) {
            System.out.println(num1 + ">" + num3 + ">" + num2);
        } else if (num2>num1 && num1>num3) {
            System.out.println(num2 + ">" + num1 + ">" + num3);
        } else if (num3>num2 && num2>num1) {
            System.out.println(num3 + ">" + num2 + ">" + num1);
        } else if (num2>num3 && num3>num1) {
            System.out.println(num2 + ">" + num3 + ">" + num1);
        } else if (num3>num1 && num1>num2) {
            System.out.println(num3 + ">" + num1 + ">" + num2);
        }
    }
}
