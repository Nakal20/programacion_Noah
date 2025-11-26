package TEMA3.Modulo2;

public class MyMath {

    public static double squareArea(double lado) {
        double squareArea;
        squareArea = lado * lado;
        return squareArea;
    }

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
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            System.out.println("no es primo");
            return false;
        } else {
            for (int i = 2; i < num - 1; i++) {

                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean noEsPrimo(int num) {
        return !esPrimo(num);
    }

    //ejercicio3
    public static int cantidadDeDigitos(int num) {
        int contador = 0;
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
    public static int cantidadDeDigitosImpares(int num) {
        if (num == 0) {
            return 1;
        }
int impares=0;
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
        int factorial = num;
        int resultado = num;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * (resultado - 1);
            resultado--;
        }
        return factorial;
    }

    //ejercicio7
    public static int numFactorialRecursivo(int num) {
        int factorialRecursivo = 1;
        for (int i = 1; i <= num; i++) {
            factorialRecursivo = factorialRecursivo * i;
        }
        return factorialRecursivo;
    }

    //ejercicio8
    public static int ecuaciones(int a, int b, int c) {
        int d = b * b - 4 * a * c;
        if (d > 0) {
            return 2;
        }
        else if (d < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

    //ejercicio9
    public static int sumaDigitos(int num, int suma) {
        while (num > 0) {
            suma = suma + num % 10;
            num = num / 10;
        }
        return suma;
    }
}

