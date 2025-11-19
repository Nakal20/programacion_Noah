package TEMA3.Modulo1;

import java.util.Scanner;

public class Tema3Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius;
        System.out.println("Dime el radio del circulo");
        radius = sc.nextInt();

        boolean comprobar = validRadius(radius);


        if (!comprobar) {
            System.out.println("El radio no puede ser negativo");
        }else{
            //calculateCirclePerimeter(radius);
            System.out.println(calculateCirclePerimeter(radius) + " Es el perimetro del circulo ");
            //double resultado = calculateArea(radius);
            System.out.println(calculateArea(radius) + " Es el area del circulo ");
        }

    }
    public static boolean validRadius( int radius) {
        if (radius < 0) {
            return false;
        }else {
            return true;
        }
    }
    public static double calculateCirclePerimeter(int radius) {
        return  2 * radius * Math.PI;
    }
    public static double calculateArea(int radius) {
        return  radius * radius * Math.PI;
    }
}
