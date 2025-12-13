package Tema3.string;

import java.util.Scanner;

public class HangmanGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la palabra secreta:");
        String palabra = sc.nextLine().toUpperCase();

        for (int i = 0; i < 10; i++) System.out.println();

        char[] progreso = new char[palabra.length()];
        for (int i = 0; i < progreso.length; i++) progreso[i] = '_';

        int intentos = 6;
        boolean resuelto = false;

        while (intentos > 0 && !resuelto) {

            System.out.println("Palabra: " + String.valueOf(progreso));
            System.out.println("Intentos restantes: " + intentos);
            dibujarAhorcado(intentos);

            System.out.println("\nIntroduce una letra (o escribe RESOLVER):");
            String entrada = sc.nextLine().toUpperCase();

            if (entrada.equals("RESOLVER")) {
                System.out.println("Escribe la palabra completa:");
                String solucion = sc.nextLine().toUpperCase();

                if (solucion.equals(palabra)) {
                    resuelto = true;
                } else {
                    intentos--;
                    System.out.println("¡Incorrecto!");
                }
                continue;
            }

            char letra = entrada.charAt(0);
            boolean acierto = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    progreso[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                intentos--;
                System.out.println("Esa letra no está.");
            }

            if (String.valueOf(progreso).equals(palabra)) {
                resuelto = true;
            }
        }

        if (resuelto) {
            System.out.println("\n¡HAS GANADO! La palabra era: " + palabra);
        } else {
            dibujarAhorcado(0);
            System.out.println("\nHAS PERDIDO. La palabra era: " + palabra);
        }

        sc.close();
    }

    public static void dibujarAhorcado(int intentos) {
        switch (intentos) {
            case 6:
                System.out.println(" ");
                break;
            case 5:
                System.out.println(" O");
                break;
            case 4:
                System.out.println(" O \n" +
                                   " |");
                break;
            case 3:
                System.out.println(" O \n" +
                                   "/|");
                break;
            case 2:
                System.out.println(" O \n" +
                                   "/|\\" );
                break;
            case 1:
                System.out.println(" O \n" +
                                   "/|\\ \n" +
                                  "/");
                break;
            case 0:
                System.out.println(" O \n" +
                                   "/|\\ \n" +
                                   "/ \\" );
                break;
        }
    }
}
