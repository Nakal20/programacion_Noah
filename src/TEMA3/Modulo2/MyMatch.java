package TEMA3.Modulo2;

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

        System.out.println("Dime que opcion que quieres \n" +
                "a calcular area y perimetro \n" +
                "b saber si es primo o no \n" +
                "c el numero de digitos de un numero \n" +
                "d calcular area y perimetro \n");
        opcion = sc.next().charAt(0);

        switch (opcion) {
            case 'a':
                System.out.println("Dime un numero");
                num = sc.nextInt();
                primo = NoEsPrimo(num);
                if (primo == true) {
                    System.out.println("El numero " + num + " no es primo");
                } else {
                    System.out.println("EL " + EsPrimo(num) + " es primo");
                }
                break;
            case 'b':
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
            case 'c':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                System.out.println("tiene " + CantidadDeDigitos(num, contador) + " digitos");
                break;
            case 'd':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                int pares2 = CantidadDeDigitosPares(num,contador,pares);
                int contador2 = CantidadDeDigitosPares(num,contador,pares);
                System.out.println("Digitos pares: " + pares2 + " Digitos impares: " + contador2);

                break;
        }
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
    public static int CantidadDeDigitosPares(int num, int contador, int pares) {
       /* int comprobar;
        pares=num;
        while (num>=10){
            num=num/10;
            contador++;
        }
        if (num != 0){
            contador++;
        } */

        if (num == 0) {
            return 1;
        }

        while (num > 0) {
            int digito = num % 10;
            if (digito % 2 == 0) {
                pares++;
            }else{
                contador++;
            }
            num = num / 10;
        }

        return contador + pares;
    }
}
    
