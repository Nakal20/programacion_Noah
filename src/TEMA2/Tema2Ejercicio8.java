package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Dime un cantidad de euros");
        Scanner in = new Scanner(System.in);
        double euros = in.nextDouble();
        double dolares = euros * 1.17;
        System.out.println(euros + "€ son " + dolares + "$");
    }
}
