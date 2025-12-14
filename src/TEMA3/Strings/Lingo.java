package Tema3.string;

import java.util.Scanner;

public class Lingo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hidden = "HUESO";
        int intentos = 5;
        boolean ganado = false;

        System.out.println("Bienvenido al juego LINGO \n" +
                "Adivina la palabra de 5 letras" );
        String hint = "-----";

        while (intentos > 0 && !ganado) {

            System.out.println("\nHint: " + hint);
            System.out.print("Try : ");
            String intento = sc.nextLine().toUpperCase();

            if (intento.length() != 5) {
                System.out.println("La palabra debe tener 5 letras");
                continue;
            }

            hint = generarHint(hidden, intento);

            if (intento.equals(hidden)) {
                ganado = true;
            }

            intentos--;
        }

        if (ganado) {
            System.out.println("\n¡Has ganado!");
        } else {
            System.out.println("\nHas perdido. La palabra era: " + hidden);
        }

        sc.close();
    }

    public static String generarHint(String hidden, String intento) {
        String resultado = "";

        for (int i = 0; i < 5; i++) {
            char c = intento.charAt(i);

            if (c == hidden.charAt(i)) {
                resultado += "*";
            } else if (hidden.indexOf(c) != -1) {
                resultado += c;
            } else {
                resultado += "-";
            }
        }

        return resultado;
    }
}

