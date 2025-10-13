package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Dime cuantos sois y cuantas noches");
        Scanner in = new Scanner(System.in);
        int npersona = in.nextInt();
        int noches = in.nextInt();
        double precio;

        precio = npersona*15*noches;
        if (npersona > 5 && noches > 6){
            precio = (double) (npersona*15*noches*0.75);
        }
        System.out.println("son " + precio + "€");
    }
}
