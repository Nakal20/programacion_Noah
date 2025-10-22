package TEMA2;

import java.util.Scanner;

public class Tema2ejercicio_combate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----COMBATE----");
        System.out.println("----REGLAS----");
        System.out.println("La suma de los atributos de un jugador no podrá ser superior a 500. Cada uno de los atributos debe tener un valor entre 1 y 200");

        int total1;
        int vel1;
        int ata1;
        int def1;
        int vida1;

        int total2;
        int vel2;
        int ata2;
        int def2;
        int vida2;
        do {
            System.out.println("--jugador1--");

            System.out.print("Introduce la velocidad del jugador1: ");
            vel1 = sc.nextInt();
            do {
                if (vel1 > 200 || vel1 < 1) {
                    System.out.println("la velocidad es inconrecta, vuelve a introducir el valor");
                    vel1 = sc.nextInt();
                }
            } while (vel1 > 200 || vel1 < 1);

            System.out.print("Introduce el ataque del jugador1: ");
            ata1 = sc.nextInt();
            do {
                if (ata1 > 200 || ata1 < 1) {
                    System.out.println("El ataque es inconrecta, vuelve a introducir el valor");
                    ata1 = sc.nextInt();
                }
            } while (ata1 > 200 || ata1 < 1);

            System.out.print("Introduce la defensa del jugador1: ");
            def1 = sc.nextInt();
            do {
                if (def1 > 200 || def1 < 1) {
                    System.out.println("La defensa es inconrecta, vuelve a introducir el valor");
                    def1 = sc.nextInt();
                }
            } while (def1 > 200 || def1 < 1);

            System.out.print("Introduce la vida del jugador1: ");
            vida1 = sc.nextInt();
            do {
                if (vida1 > 200 || vida1 < 1) {
                    System.out.println("La vida es inconrecta, vuelve a introducir el valor");
                    vida1 = sc.nextInt();
                }
            } while (vida1 > 200 || vida1 < 1);

            total1 = vel1 + ata1 + def1 + vida1;

            System.out.println("----------------------------------------------------");
            System.out.println("velocidad: " + vel1 + "\n" + "ataque: " + ata1 + "\n" + "defensa: " + def1 + "\n" + "vida: " + vida1);

            if (total1 > 500){
                System.out.println("te has pasado de 500 vuelve ha poner los valores");
            }
        }while (total1 > 500);

        do {
            System.out.println("----------------------------------------------------");
            System.out.println("--jugador2--");

            System.out.print("Introduce la velocidad del jugador2: ");
            vel2 = sc.nextInt();
            do {
                if (vel2 > 200 || vel2 < 1) {
                    System.out.println("la velocidad es inconrecta, vuelve a introducir el valor");
                    vel2 = sc.nextInt();
                }
            } while (vel2 > 200 || vel2 < 1);

            System.out.print("Introduce el ataque del jugador2: ");
            ata2 = sc.nextInt();
            do {
                if (ata2 > 200 || ata2 < 1) {
                    System.out.println("El ataque es inconrecta, vuelve a introducir el valor");
                    ata2 = sc.nextInt();
                }
            } while (ata2 > 200 || ata2 < 1);

            System.out.print("Introduce la defensa del jugador2: ");
            def2 = sc.nextInt();
            do {
                if (def2 > 200 || def2 < 1) {
                    System.out.println("La defensa es inconrecta, vuelve a introducir el valor");
                    def2 = sc.nextInt();
                }
            } while (def2 > 200 || def2 < 1);

            System.out.print("Introduce la vida del jugador2: ");
            vida2 = sc.nextInt();
            do {
                if (vida2 > 200 || vida2 < 1) {
                    System.out.println("La vida es inconrecta, vuelve a introducir el valor");
                    vida2 = sc.nextInt();
                }
            } while (vida2 > 200 || vida2 < 1);

            total2 = vel2 + ata2 + def2 + vida2;

            System.out.println("----------------------------------------------------");
            System.out.println("velocidad: " + vel1 + "\n" + "ataque: " + ata1 + "\n" + "defensa: " + def1 + "\n" + "vida: " + vida1);

            if (total2 > 500){
                System.out.println("te has pasado de 500 vuelve ha poner los valores");
            }
        }while (total2 > 500);

        while (vel1 > vel2){

        }
    }
}
