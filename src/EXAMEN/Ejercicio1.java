package EXAMEN;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String opcion;
        System.out.println("Que quieres hacer? \n (a) Aprobados y suspendidos (b) Billetes a Madrid (c) Salir");
        Scanner sc = new Scanner(System.in);
        opcion = sc.next();
        switch (opcion) {
            case "a":
                int cantidad;
                int cont = 0;
                int nota;
                int contadora = 0;
                int contadors = 0;
                System.out.println("Dime cuantas notas hay");
                cantidad = sc.nextInt();
                while (cont < cantidad) {
                    System.out.println("Dime una nota");
                    nota = sc.nextInt();
                    if (nota >= 5 && nota < 10) {
                        contadora++;
                        cont++;
                    } else if (nota < 5 && nota >= 0) {
                        contadors++;
                        cont++;
                    } else {
                        System.out.println("Ese numero no es valido");
                    }
                }
                System.out.println(contadora + " aprobados y " + contadors + " suspendidos");
                break;
            case "b":
                String nombre;
                int edad;
                double precio = 32;
                int contadorprecio = 0;
                double preciomayor = 0;
                int contadormayor = 0;
                double preciojoven = 0;
                int contadorjoven = 0;
                double precionino = 0;
                int contadornino = 0;
                double num;
                int cantidadb;
                int contadorb = 0;
                double preciototal;
                System.out.println("Para poder combrar los billetes necesito esta informacion");
                System.out.println("Dime cuantos billetes"); //con esto cuento los miembros de la familia y se cuantas vezes tengo que preguntar
                cantidadb = sc.nextInt();

                while (contadorb < cantidadb) {

                    System.out.println("Dime tu nombre");
                    nombre = sc.next();
                    System.out.println("Dime tu edad");
                    edad = sc.nextInt();

                    if (edad >= 65) {
                        num = (double) (32 * 10) / 100;
                        preciomayor = precio - num;
                        System.out.println(nombre + " pagara " + preciomayor + "€");
                        contadormayor++;
                        contadorb++;
                    }
                    if (edad > 15 && edad < 65) {
                        System.out.println(nombre + " pagara " + precio + "€");
                        contadorprecio++;
                        contadorb++;
                    }
                    if (edad <= 15 && edad >= 12) {
                        num = (double) (32 * 8) / 100;
                        preciojoven = precio - num;
                        System.out.println(nombre + " pagara " + preciojoven + "€");
                        contadorjoven++;
                        contadorb++;
                    }
                    if (edad <= 11 && edad >= 4) {
                        num = (double) (32 * 35) / 100;
                        precionino = precio - num;
                        System.out.println(nombre + " pagara " + precionino + "€");
                        contadornino++;
                        contadorb++;
                    }
                    if (edad < 4 && edad >= 0){
                        System.out.println(nombre + "no paga");
                        contadorb++;
                    }
                    if (edad < 0) {
                        System.out.println("Numero invalido");
                    }
                }
                preciototal = contadormayor*preciomayor + contadorprecio*precio + contadorjoven*preciojoven + contadornino*precionino;
                System.out.println("El total a pagar son " + preciototal + "€");
            break;
            case "c":
                System.out.println("Estas fuera :)");
        }
    }
}