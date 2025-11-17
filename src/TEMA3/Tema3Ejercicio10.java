package TEMA3;

import java.util.Scanner;

import static TEMA3.Tema3Ejercicio1.numbersing;
import static TEMA3.Tema3Ejercicio2.isAdult;
import static TEMA3.Tema3Ejercicio3.*;
import static TEMA3.Tema3Ejercicio4.*;
import static TEMA3.Tema3Ejercicio5.tablaMultiplicar;
import static TEMA3.Tema3Ejercicio6.numero;
import static TEMA3.Tema3Ejercicio7.esPrimo;
import static TEMA3.Tema3Ejercicio8.dia;
import static TEMA3.Tema3Ejercicio8.mes;
import static TEMA3.Tema3Ejercicio9.piramides;

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
                System.out.println("Dime que numero de 1 a 10 que quieres multiplicar?");
                num = sc.nextInt();
                while (num <= 0 || num > 10) {
                    System.out.println("Numero invalido");
                    System.out.println("Dime que numero que quieres multiplicar?");
                    num = sc.nextInt();
                }
                tablaMultiplicar(num);
                break;
            case 'f':
                numero();
                break;
            case 'g':
                System.out.print("Ingrese el numero y te digo si es primo o no: ");
                num = sc.nextInt();
                while (num != 0) {
                    int contador = esPrimo(num);
                    if (contador == 0) {
                        System.out.println("es primo");
                    } else {
                        System.out.println("No es primo");
                    }
                    System.out.print("Ingrese el numero y te digo si es primo o no: ");
                    num = sc.nextInt();
                }
                break;
            case 'h':
                int ano;
                System.out.println("Dime un mes");
                int mes = sc.nextInt();
                boolean valor = false;
                int comprobar2 = mes(mes);
                if (comprobar2 == 0){
                    System.out.println("El mes no es corecto ");
                    valor = true;
                }
                System.out.println("Dime un año");
                ano = sc.nextInt();
                System.out.println("Dime un dia");
                int dia = sc.nextInt();
                comprobar2 = dia(dia, mes, ano);
                if (comprobar2 == 1){
                    System.out.println("El dia no es corecto ");
                    valor = true;
                }
                if (valor == true){
                    System.out.println("hay valores incorrectos");
                }else {
                    System.out.println(dia + "/" + mes + "/" + ano);
                }
                break;
            case 'i':
                System.out.println("dime el caracter que quieres");
                char caracter = sc.next().charAt(0);
                System.out.println("Dime cuantas lineas tiene");
                int lineas = sc.nextInt();
                piramides(caracter, lineas);
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
