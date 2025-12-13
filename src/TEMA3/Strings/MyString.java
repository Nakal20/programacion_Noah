package Tema3.string;

import java.util.Scanner;

public class MyString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion;


            System.out.println("\nMENU MyString \n" +
                    "a) Una función que reciba una cadena y devuelva esta cadena invertida y en mayúsculas.\n" +
                    "b) Una función que reciba una cadena y devuelva el número de vocales.\n" +
                    "c) Una función que reciba una cadena y devuelva la palabra de mayor longitud.\n" +
                    "d) Una función que reciba dos cadenas y devuelva el número de veces que la segunda cadena está incluida en la primera.\n" +
                    "e) Una función que reciba una cadena y devuelva el número de palabras que contiene.\n" +
                    "f) Una función que reciba un número de teléfono, por ejemplo “34555332211” y lo convierta al formato (+34)-555-332211.\n" +
                    "g) Un procedimiento que reciba una cadena y muestre por pantalla el histograma de frecuencias de las vocales");

            opcion = sc.next().charAt(0);
            sc.nextLine();

            switch (opcion) {
                case 'a':
                    System.out.println("Cadena:");
                    String cad1 = sc.nextLine();
                    System.out.println(invertirYMayusculas(cad1));
                break;

                case 'b':
                    System.out.println("Cadena:");
                    String cad2 = sc.nextLine();
                    System.out.println("Vocales: " + contarVocales(cad2));
                break;

                case 'c':
                    System.out.println("Cadena:");
                    String cad3 = sc.nextLine();
                    System.out.println("Mayor: " + palabraMayor(cad3));
                break;

                case 'd':
                    System.out.println("Cadena 1:");
                    String c1 = sc.nextLine();
                    System.out.println("Cadena 2:");
                    String c2 = sc.nextLine();
                    System.out.println("Veces incluida: " + vecesIncluida(c1, c2));
                break;

                case 'e':
                    System.out.println("Cadena:");
                    String cad5 = sc.nextLine();
                    System.out.println("Palabras: " + contarPalabras(cad5));
                break;

                case 'f':
                    System.out.println("Número telefónico:");
                    String tel = sc.nextLine();
                    System.out.println(formatearTelefono(tel));
                break;

                case 'g':
                    System.out.println("Cadena:");
                    String cad7 = sc.nextLine();
                    histogramaVocales(cad7);
                break;
            }

        sc.close();
    }

    public static String invertirYMayusculas(String cad) {
        String invertida = "";
        for (int i = cad.length() - 1; i >= 0; i--) {
            invertida += cad.charAt(i);
        }
        return invertida.toUpperCase();
    }

    public static int contarVocales(String cad) {
        cad = cad.toLowerCase();
        int contador = 0;

        for (int i = 0; i < cad.length(); i++) {
            char c = cad.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static String palabraMayor(String cad) {
        String[] palabras = cad.split(" ");
        String mayor = "";

        for (String p : palabras) {
            if (p.length() > mayor.length()) {
                mayor = p;
            }
        }

        return mayor;
    }

    public static int vecesIncluida(String cad1, String cad2) {
        int contador = 0;
        int pos = cad1.indexOf(cad2);

        while (pos != -1) {
            contador++;
            pos = cad1.indexOf(cad2, pos + cad2.length());
        }

        return contador;
    }

    public static int contarPalabras(String cad) {
        String[] palabras = cad.trim().split("\\s+");
        if (cad.trim().equals("")) return 0;
        return palabras.length;
    }

    public static String formatearTelefono(String tel) {
        String pais = tel.substring(0, 2);
        String parte1 = tel.substring(2, 5);
        String parte2 = tel.substring(5);

        return "(+" + pais + ")-" + parte1 + "-" + parte2;
    }

    public static void histogramaVocales(String cad) {
        cad = cad.toLowerCase();
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int k = 0; k < cad.length(); k++) {
            char c = cad.charAt(k);
            switch (c) {
                case 'a': a++; break;
                case 'e': e++; break;
                case 'i': i++; break;
                case 'o': o++; break;
                case 'u': u++; break;
            }
        }

        System.out.println("a " + a + " " + "*".repeat(a));
        System.out.println("e " + e + " " + "*".repeat(e));
        System.out.println("i " + i + " " + "*".repeat(i));
        System.out.println("o " + o + " " + "*".repeat(o));
        System.out.println("u " + u + " " + "*".repeat(u));
    }
}


