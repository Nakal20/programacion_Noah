package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Dime la base de un triangulo");
        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        System.out.println("Dime la altura de un triangulo");
        double altura = in.nextDouble();
        double A = (base * altura)/2;
        System.out.println("La superficie es " + A);
    }
}
