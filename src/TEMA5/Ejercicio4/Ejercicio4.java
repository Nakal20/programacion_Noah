package TEMA5.Ejercicio4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> productos = new HashSet<>();
        int opcion = 0;
        String producto;
        Set<String> compra = new HashSet<>();

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
                case 4:
                    System.out.println("Que producto quieres añadir?");
                    producto = sc.next();
                    if (compra.contains(producto)) {
                        System.out.println("El producto ya esta en la lista.");
                    }else {
                        compra.add(producto);
                    }
                    break;
                case  5:
                    System.out.println(productos.retainAll(compra));
                    System.out.println(productos);

                    break;
            }
        }
    }
    public static void menu(){
        System.out.println("--- compra ---\n");
        System.out.println("Que quieres hacer?");
        System.out.println("1 añadir producto a la lista \n" + "2 verificar producto de la lista \n" + "3 salir\n" + "4 añadir producto a la lista \n" + "5 verificar producto de la lista \n");
    }
}
