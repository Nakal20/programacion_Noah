package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Elige un opcion:");
        System.out.println("0, muestra la superficie y el perimetro de un cuadrado");
        System.out.println("1, muestra la superficie y el perímetro de un rectángulo");
        System.out.println("2, muestra la superficie de un triángulo");

        char option = in.next().toUpperCase().charAt(0);

        switch (option) {
            case'0':
                System.out.println("Dime el lado");

                double lado = in.nextDouble();
                double ac =lado*lado;
                double perimetroc = lado*4;

                System.out.println("El perimetro es " + perimetroc + " y el area " + ac);
                break;
            case'1':
                System.out.println("Dime la base y la altura");

                double baser = in.nextDouble();
                double alturar = in.nextDouble();
                double ar =baser*alturar;
                double perimetror = 2*(baser*alturar);

                System.out.println("El perimetro es " + perimetror + " y el area " + ar);
                break;
            case '2':
                System.out.println("Dime la base y la altura");

                double baset = in.nextDouble();
                double alturat = in.nextDouble();
                double at =(baset*alturat)/2;

                System.out.println("El area " + at);
        }
    }
}

