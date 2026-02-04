package TEMA5.Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();
        String dni;
        String nombre;
        int edad;
        int opcion = 0;

        while(opcion != 3) {
            System.out.println("--- cola ---\n");
            System.out.println("Que quieres hacer?");
            System.out.println("1 añadir usuario \n" + "2 eliminar usuario \n" + "3 salir \n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Dime el nombre");
                    nombre = sc.next();
                    System.out.println("Dime el edad");
                    edad = sc.nextInt();
                    System.out.println("Dime el dni");
                    dni = sc.next();

                    usuarios.add(new Usuario(nombre,edad,dni));

                    break;
                case 2:
                    System.out.println("Dime la posicion del usuario");
                    usuarios.remove(sc.nextInt());
                    System.out.println(usuarios.get(0) +  "");

                    break;
                case 3:
                    System.out.println("adios");
                    break;
            }
        }
    }
}
