package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio16 {
    public static void main(String[] args) {
        System.out.println("Dime un numero");
        Scanner in = new Scanner(System.in);
        double dinero = in.nextDouble();
        System.out.println("Pon D si quieres pasar de euros a dolares o E si es de dolares a euros");

        char opcion = in.next().toUpperCase().charAt(0);

        double dolar = dinero*1.16;
        double euro = dinero/1.16;

        switch (opcion) {
            case'D':
                System.out.println("son " + dolar + "$");
                break;
            case 'E':
                System.out.println("son " + euro + "€");
                break;

        }

    }
}
