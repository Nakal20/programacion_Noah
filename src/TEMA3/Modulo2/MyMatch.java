package Tema3;

import java.util.Scanner;

public class MyMatch {
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
    }

    public static double SquareArea(double squareArea, double lado) {
        squareArea = lado * lado;
        return squareArea;
    }

    public static double SquarePerimeter(double squarePerimeter, double lado) {
        squarePerimeter = lado * 4;
        return squarePerimeter;
    }

    public static double RectangleArea(double rectangleArea, double base, double altura) {
        rectangleArea = base * altura;
        return rectangleArea;
    }

    public static double RectanglePerimeter(double rectanglePerimeter, double base, double altura) {
        rectanglePerimeter = 2 * (base * altura);
        return rectanglePerimeter;
    }

    public static double CircleArea(double circleArea, double radio) {
        circleArea = Math.PI * radio * radio;
        return circleArea;
    }

    public static double CirclePerimeter(double circlePerimeter, double radio) {
        circlePerimeter = 2 * Math.PI * radio;
        return circlePerimeter;
    }

    //ejercicio2
    public static int EsPrimo(int num) {
        boolean primo = false;
        if (num <= 1) {
            System.out.println("no es primo");
        } else {
            for (int i = 2; i < num - 1; i++) {

                if (num % i == 0) {
                    primo = true;
                }
            }
        }
        return num;
    }

    public static boolean NoEsPrimo(int num) {
        boolean primo = false;
        if (num <= 1) {
            System.out.println("no es primo");
        } else {
            for (int i = 2; i < num - 1; i++) {

                if (num % i == 0) {
                    primo = true;
                }
            }
        }
        return primo;
    }

    //ejercicio3
    public static int CantidadDeDigitos(int num, int contador) {
        while (num >= 10) {
            num = num / 10;
            contador++;
        }
        if (num != 0) {
            contador++;
        }
        return contador;
    }

    //ejercicio4
    public static int CantidadDeDigitosPares(int num, int pares) {
        if (num == 0) {
            return 1;
        }

        while (num > 0) {
            int digito = num % 10;
            if (digito % 2 == 0) {
                pares++;
            }
            if (digito == 0) {
                pares++;
            }
            num = num / 10;
        }
        return pares;
    }

//ejercicio5
public static int CantidadDeDigitosImpares(int num, int impares) {
    if (num == 0) {
        return 1;
    }

    while (num > 0) {
        int digito = num % 10;
        if (digito % 2 != 0) {
            impares++;
        }
        num = num / 10;
    }
    return impares;
}

    //ejercicio6
    public static int numFactorial(int num, int factorial) {
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    //ejercicio7
    public static int numFactorialRecursivo(int num, int factorialRecusivo, int contador) {
        if (num <= 1) {
            return 1;
        }

        int i;
        for (i = 2; factorialRecusivo < num; i++) {
            factorialRecusivo = factorialRecusivo * i;
        }
        return i - 1 ;
    }

    //ejercicio8
    public static int ecuaciones(int a, int b, int c) {
        return b*b-4*a*c;
    }

    //ejercicio9
    public static int sumaDigitos(int num, int suma) {
        while (num > 0) {
            suma= suma + num % 10;
            num = num / 10;
        }
        return suma;
    }
}


