package TEMA3.Modulo2;

import java.util.Scanner;

import static TEMA3.Modulo2.MyMatch.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        double lado;
        double altura;
        double base;
        double radio;
        //
        char opcion;
        int num;
        int contador = 0;
        int factorialRecusivo = 1;
        int suma=0;
        int a;
        int b;
        int c;

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

                        System.out.println("El area es " + squareArea(lado));
                        System.out.println("El perimetro es " + squarePerimeter(lado));
                        break;
                    case 'b':
                        System.out.println("Dime la base y la altura");
                        base = sc.nextDouble();
                        altura = sc.nextDouble();

                        System.out.println("El area es " + rectangleArea(base, altura));
                        System.out.println("El perimetro es " + rectanglePerimeter(base, altura));
                        break;
                    case 'c':
                        System.out.println("Dime el radio");
                        radio = sc.nextDouble();

                        System.out.println("El area es " + circleArea(radio));
                        System.out.println("El perimetro es " + circlePerimeter(radio));
                }
                break;
            case 'b':
                System.out.println("Dime que opcion que quieres \n" +
                        "a saber si es primo \n" +
                        "b saber si no es primo \n");
                opcion = sc.next().charAt(0);
                switch (opcion) {
                    case 'a':
                        System.out.println("Dime un numero");
                        num = sc.nextInt();
                        System.out.println(esPrimo(num));
                        break;
                    case 'b':
                        System.out.println("Dime un numero");
                        num = sc.nextInt();
                        System.out.println(noEsPrimo(num));
                }
                break;
            case 'c':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                System.out.println("tiene " + cantidadDeDigitos(num) + " digitos");
                break;
            case 'd':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                System.out.println("Digitos pares: " + cantidadDeDigitosPares(num));
                break;
            case 'e':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                System.out.println("Digitos impares: " + CantidadDeDigitosImpares(num));
                break;
            case 'f':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                int factorial2 = numFactorial(num);
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
//TODO: revisar
                System.out.println("esta ecuadión tiene " + ecuaciones(a,b,c) + " solucines");
                break;
            case 'i':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                System.out.println("La suma de los digitos es " + sumaDigitos(num, suma));
                break;
        }
    }
}
