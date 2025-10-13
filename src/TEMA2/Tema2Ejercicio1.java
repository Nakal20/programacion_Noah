package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Dime el lado de un cuadrado");
        Scanner in = new Scanner(System.in);
        double lado = in.nextDouble();
        double A = lado * lado;
        double perimetro = lado + lado + lado + lado;
        System.out.println("El area es " + A + " y el perimetro es " + perimetro);
    }
}
