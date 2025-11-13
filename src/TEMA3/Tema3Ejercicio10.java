package TEMA3;

import java.util.Scanner;

import static TEMA3.Tema3Ejercicio1.numbersing;
import static TEMA3.Tema3Ejercicio2.isAdult;
import static TEMA3.Tema3Ejercicio3.*;
import static TEMA3.Tema3Ejercicio4.*;

public class Tema3Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int respuesta;
        int radius;
        eleguir();
        char opcion = sc.next().charAt(0);
        switch (opcion) {
            case 'a':
                System.out.println("Dime un numero");
                num = sc.nextInt();
                respuesta = numbersing(num);
                if (respuesta == 1){
                    System.out.println("Es positivo");
                }
                else if (respuesta == -1){
                    System.out.println("Es negativo");
                }else{
                    System.out.println("es 0");
                }
                break;
            case 'b':
                System.out.println("Dime un numero");
                num = sc.nextInt();
                respuesta = numbersing(num);
                if (respuesta == 1){
                    System.out.println("Es positivo \n");
                }
                else if (respuesta == -1){
                    System.out.println("Es negativo \n");
                }else{
                    System.out.println("es 0 \n");
                }

                int age;
                System.out.println("Dime un numero");
                age = sc.nextInt();

                boolean respuesta2 = isAdult(age);
                if (respuesta2 == true) {
                    System.out.println("Es mayor");
                }else{
                    System.out.println("Es menor");
                }
                break;
            case 'c':
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
                break;
            case 'd':
                int elegir;
                showMenu();
                elegir = sc.nextInt();
                switch (elegir){
                    case 1:

                        double dolares = euro2dolar();
                        System.out.println("Son " + dolares + "$");
                        break;
                    case 2:
                        double euros = dolar2Euro();
                        System.out.println("Son " + euros + "€");

                }
                break;
            case 'e':
                Tema3Ejercicio5.main(args);
                break;
            case 'f':
                Tema3Ejercicio6.main(args);
                break;
            case 'g':
                Tema3Ejercicio7.main(args);
                break;
            case 'h':
                Tema3Ejercicio8.main(args);
                break;
            case 'i':
                Tema3Ejercicio9.main(args);
        }
    }

    public static void eleguir() {
        System.out.println("Elige una opcion \n" +
                "a) Muestra el signo de un número introducido por el usuario.\n" +
                "b) Indica si el usuario es mayor de edad o no.\n" +
                "c) Calcula el área y perímetro de un círculo.\n" +
                "d) Conversor de euros a dólares y de dólares a euros.\n" +
                "e) Mostrar tabla de multiplicar de un número.\n" +
                "f) Mostrar tablas de multiplicar del 1 al 10.\n" +
                "g) Comprobador de números primos.\n" +
                "h) Comprobador de fechas.\n" +
                "i) Dibujar triángulos");
    }
}
