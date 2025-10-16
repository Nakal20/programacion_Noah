package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio22 {
    public static void main(String[] args) {
        System.out.println("Dime un numero");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int contador=0;

        do{
            num=num/10;
            contador++;
        }while (num>10);
        if (num != 0){
            contador++;
        }
        System.out.println(contador);
    }
}
