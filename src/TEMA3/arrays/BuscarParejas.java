package Tema3.arrays;

import java.util.Random;
import java.util.Scanner;

public class BuscarParejas {
    public static void main(String[] args) {
        int tigre = 0;
        int perro = 1;
        int gato = 2;
        int elefante = 3;
        int jirafa = 4;
        int ballena = 5;
        int pez = 6;
        int oso = 7;
        int pulpo = 8;
        int cerdo = 9;
        int[] posiciones = new int[]{tigre, perro, gato, elefante, jirafa, ballena, pez, oso, pulpo, cerdo, tigre, perro, gato, elefante, jirafa, ballena, pez, oso, pulpo, cerdo};

        String[] animales = {"tigre ", "perro ", "gato ", "elefante ", "jirafa ", "ballena ", "pez ", "oso ", "pulpo ", "cerdo ", "tigre ", "perro ", "gato ", "elefante ", "jirafa ", "ballena ", "pez ", "oso ", "pulpo ", "cerdo "};
        Scanner sc = new Scanner(System.in);
        System.out.println("Estos son los animales");
        for (int i = 0; i < animales.length; i++) {
            System.out.print(animales[i]);
            if ((i + 1) % 5 == 0) System.out.println();
        }

        Random random = new Random();
        for (int i = 0; i < animales.length; i++) {
            int pos = random.nextInt(animales.length);
            String temp = animales[i];
            animales[i] = animales[pos];
            animales[pos] = temp;
        }
        boolean[] visible = new boolean[20];
        int parejas = 0;

        while (parejas < 10) {
            boolean encontrada = buscarPareja(animales, visible, sc);
            if (encontrada) {
                parejas++;
            }
        }

        System.out.println("¡¡Has encontrado todas las parejas!!");
    }

    public static boolean buscarPareja(String[] animales, boolean[] visible, Scanner sc) {

        for (int i = 0; i < animales.length; i++) {
            if (visible[i]) {
                System.out.print("[" + animales[i] + "] ");
            } else if(i>9){
                System.out.print("[" + (i + 1) + ":?] ");
            } else {
                System.out.print("[" + (i + 1) + ":??] ");
            }
            if ((i + 1) % 5 == 0) System.out.println();
        }

        System.out.println("Elige la primera posición (1-20): ");
        int p1 = sc.nextInt() -1;
        if (p1 < 0 || p1 >= 20) {
            System.out.println("Posición inválida.");
            return false;
        }
        if (visible[p1]) {
            System.out.println("Esa posición ya está descubierta.");
            return false;
        }

        System.out.println("Elige la segunda posición (1-20): ");
        int p2 = sc.nextInt() - 1;
        if (p2 < 0 || p2 >= 20) {
            System.out.println("Posición inválida.");
            return false;
        }
        if (p2 == p1) {
            System.out.println("No puedes elegir la misma posición dos veces.");
            return false;
        }
        if (visible[p2]) {
            System.out.println("Esa posición ya está descubierta.");
            return false;
        }

        System.out.println("Has elegido: ");
        System.out.println("Posición " + (p1 + 1) + ": " + animales[p1]);
        System.out.println("Posición " + (p2 + 1) + ": " + animales[p2]);

        if (animales[p1].equals(animales[p2])) {
            System.out.println("¡Pareja encontrada!");
            visible[p1] = true;
            visible[p2] = true;
            return true;
        } else {
            System.out.println("No coinciden... se ocultan otra vez");
            for (int i = 0; i < 5; i++) System.out.println();
            return false;
        }
    }
}