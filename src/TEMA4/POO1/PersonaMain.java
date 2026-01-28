package TEMA4.POO1;

import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Persona persona = new Persona();
        System.out.println("Persona 1");

        System.out.println("introduce el nombre: ");
        persona.setNombre(sc.next());
        System.out.println("introduce el primer apellido: ");
        persona.setApellido1(sc.next());
        System.out.println("introduce el segundo apellido: ");
        persona.setApellido2(sc.next());
        System.out.println("introduce la edad: ");
        persona.setEdad(sc.nextInt());
        System.out.println("introduce el DNI: ");

        System.out.println(persona.checkDNI());
        persona.print();

        Persona persona2 = new Persona();
        System.out.println("\n Persona 2");

        System.out.println("introduce el nombre: ");
        persona2.setNombre(sc.next());
        System.out.println("introduce el primer apellido: ");
        persona2.setApellido1(sc.next());
        System.out.println("introduce el segundo apellido: ");
        persona2.setApellido2(sc.next());
        System.out.println("introduce la edad: ");
        persona2.setEdad(sc.nextInt());
        System.out.println("introduce el DNI: ");

        System.out.println(persona2.checkDNI( ));
        persona2.print();
        System.out.println(persona2.ageDifference(persona.edad, persona2.edad2));



    }
}
