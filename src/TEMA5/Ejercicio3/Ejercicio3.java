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
        int posicion;

        while(opcion != 3) {
            System.out.println("--- cola ---\n");
            System.out.println("Que quieres hacer?");
            System.out.println("1 añadir usuario \n" + "2 eliminar usuario \n" + "3 mostrar cola \n" + "4 salir \n");
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
                    posicion = sc.nextInt();
                    System.out.println(usuarios.get(posicion) +  "se ha ido de la cola");
                    usuarios.remove(posicion);
                    break;
                case 3:
                    for (int i=0;i<usuarios.size();i++) {
                        System.out.println("\n Posicion: " + i + "\n" + usuarios.get(i));
                    }
                case 4:
                    System.out.println("adios");
                    break;
            }
        }
    }
}
