package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Dime el numero de un mes y un año");
        Scanner in = new Scanner(System.in);
        int mes = in.nextInt();
        int anio = in.nextInt();

        //hazlo solo con 3 ifs usando OR
        if (mes == 1 || mes ==3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            System.out.println("Tiene 31 días");
        }
        if (mes == 2 && anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
            System.out.println("Es febrero y es un año bisiesto por lo tanto tiene 29");
        }else {
            System.out.println("Es febrero y no es un año bisiesto por lo tanto tiene 28");
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            System.out.println("Tiene 30 días");
        }
    }
}
