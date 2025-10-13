package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Dime la base de un rectangulo");
        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        System.out.println("Dime la altura de un rectangulo");
        double altura = in.nextDouble();
        double A = base * altura;
        double perimetro = 2 * (base+altura);
        System.out.println("El area es " + A + " y el perimetro es " + perimetro);
    }
}
