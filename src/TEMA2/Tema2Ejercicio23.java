package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio23 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num; //= in.nextInt();
        int media;
        int contador=0;
        int resultado = 0;

        do{
            System.out.println("Dime un numero");
            num = in.nextInt();
            contador++;
            resultado = resultado + num;
        }while (num>0);
        resultado = resultado - num;
        media=resultado/contador;
        System.out.println(media);
    }
}
