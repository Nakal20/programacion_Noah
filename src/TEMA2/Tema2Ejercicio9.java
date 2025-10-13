package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Dime un cantidad de dolares");
        Scanner in = new Scanner(System.in);
        double dolares = in.nextDouble();
        double euros = dolares / 1.17;
        System.out.println(dolares + "$ son " + euros + "€");
    }
}
