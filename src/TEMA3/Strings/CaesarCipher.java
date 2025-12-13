package Tema3.string;

import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion;

        System.out.println("Dime que opcion que quieres \n" +
                "a) cifrar \n" +
                "b) descifrar");
            opcion = sc.next().charAt(0);
            sc.nextLine();

            switch (opcion) {
                case 'a':
                    System.out.println("Introduce texto a cifrar:");
                    String t1 = sc.nextLine();
                    System.out.println("Cifrado: " + encrypt(t1));
                break;

                case 'b':
                    System.out.println("Introduce texto a descifrar:");
                    String t2 = sc.nextLine();
                    System.out.println("Descifrado: " + decrypt(t2));
                break;
            }
        sc.close();
    }

    public static String encrypt(String text) {
        text = text.toUpperCase();
        String resultado = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                if (c == 'Z') {
                    resultado += 'A';
                } else {
                    resultado += (char) (c + 1);
                }
            } else if (c >= '0' && c <= '9') {
                if (c == '9') {
                    resultado += '0';
                } else {
                    resultado += (char) (c + 1);
                }
            } else {
                resultado += c;
            }
        }
        return resultado;
    }

    public static String decrypt(String text) {
        text = text.toUpperCase();
        String resultado = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                if (c == 'A') {
                    resultado += 'Z';
                } else {
                    resultado += (char) (c - 1);
                }
            } else if (c >= '0' && c <= '9') {
                if (c == '0') {
                    resultado += '9';
                } else {
                    resultado += (char) (c - 1);
                }
            } else {
                resultado += c;
            }
        }
        return resultado;
    }
}

