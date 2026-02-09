package TEMA5.Colecciones.Ejercicio4;

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

        while(opcion != 5) {
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
                        System.out.println("El producto se a añadido a la lista.");
                    }
                    break;
                case 2:
                    System.out.println(productos);
                    break;
                case 3:
                    System.out.println("Que producto quieres añadir?");
                    producto = sc.next();
                    if (compra.contains(producto)) {
                        System.out.println("El producto ya esta en la lista.");
                    } else if (productos.contains(producto)) {
                        compra.add(producto);
                    }else {
                        System.out.println("El producto no esta en la lista.");
                    }
                    break;
                case  4:
                    productos.removeAll(compra);
                    System.out.println(compra);
                    break;
                case 5:
                    System.out.println("adios");
                    break;
            }
        }
    }
    public static void menu(){
        System.out.println("--- compra ---\n");
        System.out.println("Que quieres hacer?");
        System.out.println("1 añadir producto a la lista \n" + "2 verificar producto de la lista \n" + "3 añadir producto al carrito \n" + "4 verificar producto del carrito\n" + "5 salir\n");
    }
}
