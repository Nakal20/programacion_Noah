package TEMA3;

import java.util.Scanner;

public class Tema3Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        eleguir();
        char opcion = sc.next().charAt(0);
        switch (opcion) {
            case 'a':
                Tema3Ejercicio1.main(args);
            case 'b':
                Tema3Ejercicio2.main(args);
            case 'c':
                Tema3Ejercicio3.main(args);
            case 'd':
                Tema3Ejercicio4.main(args);
            case 'e':
                Tema3Ejercicio5.main(args);
            case 'f':
                Tema3Ejercicio6.main(args);
            case 'g':
                Tema3Ejercicio7.main(args);
            case 'h':
                Tema3Ejercicio8.main(args);
            case 'i':
                Tema3Ejercicio9.main(args);

        }
    }
    public static void eleguir(){
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
