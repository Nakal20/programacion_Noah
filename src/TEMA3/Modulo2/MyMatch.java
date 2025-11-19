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
        System.out.println("Dime que opcion que quieres \n" +
                "a el perímetro y el área de un círculo \n" +
                "b el perímetro y el área de un cuadrado \n" +
                "c el perímetro y el área de un rectángulo \n");
        char opcion = sc.next().charAt(0);
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
        circleArea = Math.PI * radio *radio;
        return circleArea;
    }
    public static double CirclePerimeter (double circlePerimeter, double radio) {
        circlePerimeter  = 2 * Math.PI * radio;
        return circlePerimeter;
    }
}
