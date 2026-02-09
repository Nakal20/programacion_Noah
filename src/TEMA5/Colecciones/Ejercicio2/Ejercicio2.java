package TEMA5.Colecciones.Ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Usuario> usuarios = new HashMap<>();
        int opcion = 0;
        String dni;
        String nombre;
        int edad;

        while(opcion != 5) {
            System.out.println("--- gimnasio ---\n");
            System.out.println("Que quieres hacer?");
            System.out.println("1 añadir usuario \n" + "2 eliminar usuario \n" + "3 buscar usuario\n" + "4 modificar usuario \n" + "5 salir \n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Dime el dni");
                    dni = sc.next();
                    System.out.println("Dime el nombre");
                    nombre = sc.next();
                    System.out.println("Dime el edad");
                    edad = sc.nextInt();
                    //cmoprobar si se ha añadido correctamente
                    usuarios.put(dni, new Usuario(nombre, edad));
                    break;
                case 2:
                    System.out.println("Dime el dni, para poder eliminar el usuario");
                    usuarios.remove(sc.next());
                    break;
                case 3:
                    System.out.println("Que usuario quieres buscar? por DNI");
                    dni = sc.next();
                    if (usuarios.containsKey(dni)) {
                        System.out.println("Nombre y edad de " + dni + " es: " + usuarios.get(dni).getNombre() + " " + usuarios.get(dni).getEdad());
                    }else {
                        System.out.println("Nombre no existe");
                    }
                    break;
                case 4:
                    System.out.println("Que usuario quieres modificar? por DNI");
                    dni = sc.next();
                    if (usuarios.containsKey(dni)) {
                        System.out.println("Dime el nombre");
                        nombre = sc.next();
                        System.out.println("Dime el edad");
                        edad = sc.nextInt();
                        usuarios.put(dni, new Usuario(nombre, edad));
                    }else {
                        System.out.println("Nombre no existe");
                    }
                    break;
                case 5:
                    System.out.println("adios");
                    break;
            }
        }

    }
}
