package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio23 {
    public static void main(String[] args) {
        System.out.println("Dime un numero");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int media=0;
        int contador=0;
        int resultado = 0;

        do{
            System.out.println("Dime otro");
            num = in.nextInt();
            contador++;
            resultado = resultado + num;
        }while (num>0);
        resultado = resultado - num;
        media=resultado/contador;
        System.out.println(media);
    }
}
