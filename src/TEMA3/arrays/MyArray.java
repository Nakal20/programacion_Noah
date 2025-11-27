package TEMA3.arrays;

import java.util.Scanner;

public class MyArray {

    public static void main(String[] args) {
        char opcion;
        Scanner sc = new Scanner(System.in);
        int[] grade = new int[]{0, 2, 4, 6, 8, 10, 12, 14, 16};
        int[] grade2 = new int[]{1,3, 5, 7, 9, 11, 13, 15, 17};

        int num;
        System.out.println("Dime que opcion que quieres \n" +
                "a) Un procedimiento que imprima el array.\n" +
                "b) Una función que devuelva el máximo del array.\n" +
                "c) Una función que devuelva el mínimo del array.\n" +
                "d) Una función que devuelva la media.\n" +
                "e) Una función que te diga si un elemento existe en el array o no.\n" +
                "f) Una función que haga la suma de dos vectores (arrays).\n" +
                "g) Una función que haga la resta de dos vectores (arrays).\n" +
                "h) Una función que haga el producto escalar de dos vectores\n" +
                "i) Haz una función que invierta el orden de un array. Por ejemplo:\n" +
                "j) Haz un procedimiento que invierta el orden de un array.\n" +
                "k) Haz una función que nos indique si un array es capicua o no. El siguiente array por ejemplo es capicua.\n" +
                "l) Haz un programa con un menú que te permita introducir uno o dos vectores y hacer todas las operaciones anteriores.");
        opcion = sc.next().charAt(0);

        switch (opcion) {
            case 'a':
                imprimir(grade);
                break;
            case 'b':
                maximo(grade);
                break;
            case 'c':
                minimo(grade);
                break;
            case 'd':
                media(grade);
                break;
            case 'e':
                System.out.println("dime un numero");
                num = sc.nextInt();
                if (existe(grade, num) == true) {
                    System.out.println("Si existe");
                }
                else {
                    System.out.println("No existe");
                }
                break;
            case 'f':
                suma(grade, grade2);
                break;
            case 'g':
                resta(grade, grade2);
                break;
        }
    }

    public static void imprimir(int[] grade) {
        for (int i = 0; i < grade.length; i++) {
            System.out.println(grade[i]);
        }
    }

    public static void maximo(int[] grade) {
        int max;
        int max1 = 0;
        for (int i = 0; i < grade.length; i++) {
            max = grade[i];
            if (max > max1) {
                max1 = grade[i];
            }
        }
        System.out.println(max1);
    }

    public static void minimo(int[] grade) {
        int min;
        int min1 = grade[0];
        for (int i = 0; i < grade.length; i++) {
            min = grade[i];
            if (min < min1) {
                min1 = grade[i];
            }
        }
        System.out.println(min1);
    }

    public static void media(int[] grade) {
        int media = 0;
        for (int i = 0; i < grade.length; i++){
            media = media + grade[i];
        }
        media = media /grade.length;
        System.out.println(media);
    }

    public static boolean existe(int[] grade, int num) {
        for (int i = 0; i < grade.length; i++){
            if (grade[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void suma(int[] grade, int[] grade2) {
        int[]suma = new int[grade.length];
        for (int i = 0; i < grade.length; i++){
           suma[i] = grade[i] + grade2[i];
            System.out.println(grade[i] + "+" + grade2[i] + "=" + suma[i]);
        }
    }
    public static void resta(int[] grade, int[] grade2) {
        int[]resta = new int[grade.length];
        for (int i = 0; i < grade.length; i++){
            resta[i] = grade[i] - grade2[i];
            System.out.println(grade[i] + "-" + grade2[i] + "=" + resta[i]);
        }
    }

}
