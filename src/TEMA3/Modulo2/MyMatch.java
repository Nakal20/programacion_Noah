package TEMA3.Modulo2;

import java.util.Scanner;

public class MyMatch {
    //TODO: metodos en minuscula
    public static double squareArea(double lado) {

        double squareArea = lado * lado;

        return squareArea;
        //return lado * lado;
    }
//TODO: quitar en todos la mayúscula, y la variable que pasas por parametro innecesariamente
    public static double squarePerimeter(double lado) {
        double squarePerimeter;
        squarePerimeter = lado * 4;
        return squarePerimeter;
    }

    public static double rectangleArea(double base, double altura) {
        double rectangleArea;
        rectangleArea = base * altura;
        return rectangleArea;
    }

    public static double rectanglePerimeter(double base, double altura) {
        double rectanglePerimeter;
        rectanglePerimeter = 2 * (base * altura);
        return rectanglePerimeter;
    }

    public static double circleArea(double radio) {
        double circleArea;
        circleArea = Math.PI * radio * radio;
        return circleArea;
    }

    public static double circlePerimeter(double radio) {
        double circlePerimeter;
        circlePerimeter = 2 * Math.PI * radio;
        return circlePerimeter;
    }

    //ejercicio2
    //TODO: devolver un booleano y revisar
    public static boolean esPrimo(int num) {
        boolean primo = false;
        if (num <= 1) {
            System.out.println("no es primo");
            return false;
        } else {
            for (int i = 2; i < num - 1; i++) {

                if (num % i == 0) {
                    primo = true;
                    return false;
                }
            }
        }
        return true;
    }

    //TODO: revisa y entender. Quitar mayúsculas
    public static boolean noEsPrimo(int num) {
        return !esPrimo(num);
    }

    //ejercicio3
    //TODO: contador debe ser local, no pasar por parámetro
    public static int cantidadDeDigitos(int num) {
        int contador=0;
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
    public static int cantidadDeDigitosPares(int num) {
        if (num == 0) {
            return 1;
        }
        int pares = 0;
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
    public static int CantidadDeDigitosImpares(int num){
        int impares = 0;
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
    public static int numFactorial(int num) {
        int factorial = 1;
        factorial = num;
        int resultado = num;
        for (int i = 1; i < num; i++) {
            factorial = factorial * (resultado - 1);
            resultado --;
        }
        return factorial;
    }

    //ejercicio7
    public static int numFactorialRecursivo(int num, int factorialRecusivo, int contador) {
        if (num <= 1) {
            return 1;
        }
        for (int i = 1; i <= num; i++) {
            factorialRecusivo = factorialRecusivo* i;
        }
        return factorialRecusivo;
    }

    //ejercicio8
    //TODO: revisar y cambiar
    public static int ecuaciones(int a, int b, int c) {
        int d = b*b-4*a*c;
        if (d > 0) {
            return 2;
        }
        else if (d < 0) {
            return 1;
        }
        else {
            return 0;
        }
        //TODO: aqui dentro deberias comprobar si el Discriminante es >0, <0 o =0, y devolver 2, 1 o 0
        /*
        int discriminant = b*b-4*a*c
        if(discriminant>0) return 2
        else if( discri>0
         */
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
