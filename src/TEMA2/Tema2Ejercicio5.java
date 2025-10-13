package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Dime 3 numeros");
        Scanner in = new Scanner(System.in);
        double numero1 = in.nextDouble();
        double numero2 = in.nextDouble();
        double numero3 = in.nextDouble();

        double mediadec = (numero3+numero2+numero1)/3;
        int mediaen = (int) ((numero3+numero2+numero1)/3);

        System.out.println(mediadec);
        System.out.println(mediaen);
    }
}
