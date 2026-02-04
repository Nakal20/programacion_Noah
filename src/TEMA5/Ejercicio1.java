package TEMA5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> productos = new HashSet<>();
        int opcion = 0;
        String producto;

        while(opcion != 3) {
            menu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Que producto quieres añadir?");
                    producto = sc.next();
                    if (productos.contains(producto)) {
                        System.out.println("El producto ya esta en la lista.");
                    }else {
                        productos.add(producto);
                    }

                    break;
                case 2:
                    System.out.println("Que producto quieres combrobar?");
                    if (productos.contains(sc.next())) {
                        System.out.println("El producto esta en la lista.");
                    }else {
                        System.out.println("El producto no esta en la lista.");
                    }

                    break;
                case 3:
                    System.out.println("adios");
                    break;
            }
        }
    }
    public static void menu(){
        System.out.println("--- lista de la compra ---\n");
        System.out.println("Que quieres hacer?");
        System.out.println("1 añadir producto \n" + "2 verificar producto \n" + "3 salir\n");
    }
}
