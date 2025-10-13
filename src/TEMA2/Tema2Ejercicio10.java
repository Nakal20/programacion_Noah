package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Dime 3 numeros de menor a mayor");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if (num1<num2 && num2<num3){
            System.out.println("si esta en oreden de menor a mayor");
        }
        else {
            System.out.println("no esta en orden de menor a mayor");
        }
    }
}
