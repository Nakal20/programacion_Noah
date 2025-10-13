package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Dime 2 numeros");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if (num1>num2){
            System.out.println(num1 - num2);
        }
        else if (num2>num1) {
            System.out.println(num2 - num1);
        }
        else {
            System.out.println("Los dos son iguales");
        }
    }
}
