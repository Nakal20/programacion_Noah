package Tema3;

import java.util.Scanner;

import static Tema3.MyMatch.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        double squarePerimeter = 0;
        double squareArea = 0;
        double rectanglePerimeter = 0;
        double rectangleArea = 0;
        double circlePerimeter = 0;
        double circleArea = 0;
        //
        double lado;
        double altura;
        double base;
        double radio;
        //
        char opcion;
        int num;
        int contador = 0;
        boolean primo;
        int pares = 0;
        int impares = 0;
        int factorial = 1;
        int factorialRecusivo = 1;
        int suma=0;
        int a;
        int b;
        int c;
        int D;


        System.out.println("Dime que opcion que quieres \n" +
                "a calcular area y perimetro \n" +
                "b saber si es primo o no \n" +
                "c el numero de digitos de un numero \n" +
                "d cantidad de digitos pares en un numero \n" +
                "e cantidad de digitos impares en un numero \n"+
                "f calcular el factorial de un numero \n"+
                "g calcular el factorial recursivo de un numero \n"+
                "h cantidad de resultados de una ecuacion \n"+
                "i suma los digitos de un numero \n");
        opcion = sc.next().charAt(0);

        switch (opcion) {
            case 'a':
                System.out.println("Dime que opcion que quieres \n" +
                        "a el perímetro y el área de un círculo \n" +
                        "b el perímetro y el área de un cuadrado \n" +
                        "c el perímetro y el área de un rectángulo \n");
                opcion = sc.next().charAt(0);
                switch (opcion) {
                    case 'a':
                        System.out.println("Dime el lado");
                        lado = sc.nextDouble();

                        System.out.println("El area es " + SquareArea(squareArea, lado));
                        System.out.println("El perimetro es " + SquarePerimeter(squarePerimeter, lado));
                        break;
                    case 'b':
                        System.out.println("Dime la base y la altura");
                        base = sc.nextDouble();
                        altura = sc.nextDouble();

                        System.out.println("El area es " + RectangleArea(rectangleArea, base, altura));
                        System.out.println("El perimetro es " + RectanglePerimeter(rectanglePerimeter, base, altura));
                        break;
                    case 'c':
                        System.out.println("Dime el radio");
                        radio = sc.nextDouble();

                        System.out.println("El area es " + CircleArea(circleArea, radio));
                        System.out.println("El perimetro es " + CirclePerimeter(circlePerimeter, radio));
                }
                break;
            case 'b':
                System.out.println("Dime un numero");
                num = sc.nextInt();
                primo = NoEsPrimo(num);
                if (primo == true) {
                    System.out.println("El numero " + num + " no es primo");
                } else {
                    System.out.println("EL " + EsPrimo(num) + " es primo");
                }
                break;
            case 'c':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                System.out.println("tiene " + CantidadDeDigitos(num, contador) + " digitos");
                break;
            case 'd':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                System.out.println("Digitos pares: " + CantidadDeDigitosPares(num,pares));
                break;
            case 'e':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                System.out.println("Digitos impares: " + CantidadDeDigitosImpares(num,impares));
                break;
            case 'f':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                int factorial2 = numFactorial(num,factorial);
                System.out.println("El factorial de " + num + " es " + factorial2);
                break;
            case 'g':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                int factorialRecusivo2 = numFactorialRecursivo(num,factorialRecusivo,contador);
                System.out.println("El factorial de " + num + " es " + factorialRecusivo2);
                break;
            case 'h':
                System.out.println("Dime un numero");
                a = sc.nextInt();
                System.out.println("Dime otro numero");
                b = sc.nextInt();
                System.out.println("Dime otro numero");
                c = sc.nextInt();

                D = ecuaciones(a,b,c);
                if(D > 0){
                    System.out.println(D + "tiene mas de una solucion");
                } else if (D < 0) {
                    System.out.println(D + "no tiene solucion");
                }else {
                    System.out.println(D + "tiene una solucion");
                }
                break;
            case 'i':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                System.out.println("La suma de los digitos es " + sumaDigitos(num, suma));
                break;
        }
    }
}
