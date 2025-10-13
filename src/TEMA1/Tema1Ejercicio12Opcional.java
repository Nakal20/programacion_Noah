package TEMA1;

import java.util.Scanner;

public class Tema1Ejercicio12Opcional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("dime un año");

        int Anyo = in.nextInt();

        if (Anyo % 4 == 0) {
            System.out.println("Es un año bisiesto");
        } else {
            System.out.println("No es un año bisiesto");
        }
    }
}
