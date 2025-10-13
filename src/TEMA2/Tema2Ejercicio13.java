package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime la hora");
        int hora = in.nextInt();
        System.out.println("Dime los minutos");
        int min = in.nextInt();
        System.out.println("Dime los segundos");
        int sec = in.nextInt();

        //comprovar si les dades son correctes
        if (sec < 60){
            sec = sec + 1;
        }
        if (sec == 60) {
            sec = 0;
            min = min+1;
        }
        if (min >= 60) {
            min = 0;
            hora = hora+1;
        }
        if (hora >= 24){
            hora = 0;
        }
        if (hora > 25 || min > 61 || sec > 61){
            System.out.println("no puedes poner esos numeros");
        }
        System.out.println(hora + ":" + min + ":" + sec);
    }
}
