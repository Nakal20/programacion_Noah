package Tema3.arrays;

import java.util.Scanner;

public class MyArray {

    public static void main(String[] args) {
        char opcion;
        Scanner sc = new Scanner(System.in);

        int num1= 0;
        int num2= 2;
        int num3= 4;
        int num4= 6;
        int num5= 8;
        int num6= 10;
        int num7= 12;
        int num8= 14;

        int[] grade = new int[]{num1, num2, num3, num4, num5, num6, num7, num8,};

        int n1= 1;
        int n2= 3;
        int n3= 5;
        int n4= 7;
        int n5= 9;
        int n6= 11;
        int n7= 13;
        int n8= 15;

        int[] grade2 = new int[]{n1, n2, n3, n4, n5, n6, n7, n8,};

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
                "i) Haz una función que invierta el orden de un array.\n" +
                "j) Haz un procedimiento que invierta el orden de un array.\n" +
                "k) Haz una función que nos indique si un array es capicua o no.\n" +
                "l) Haz un programa con un menú que te permita introducir uno o dos vectores y hacer todas las operaciones anteriores.");
        opcion = sc.next().charAt(0);

        switch (opcion) {
            case 'a':
                imprimir(grade);
                break;
            case 'b':
                System.out.println(maximo(grade));
                break;
            case 'c':
                System.out.println(minimo(grade));
                break;
            case 'd':
                System.out.println(media(grade));
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
            case 'h':
                System.out.println(escalar(grade, grade2));
                break;
            case 'i':
                System.out.println(invertir(grade));
                break;
            case 'j':
                invertir2(grade);
                break;
            case 'k':
                if (capicua(grade) == true) {
                    System.out.println("Si es capicua");
                }
                else {
                    System.out.println("No es capicua");
                }
                break;
            case 'l':
                System.out.println("Dime que opcion que quieres \n" +
                        "a) crear un arrar.\n" +
                        "b) crear dos array");
                opcion = sc.next().charAt(0);
                switch (opcion) {
                    case 'a':
                        for (int i = 0; i < grade.length; i++) {
                            System.out.println("Dime el número " + (i + 1) + " para el primer array:");
                            grade[i] = sc.nextInt();
                        }
                        break;
                    case 'b':
                        for (int i = 0; i < grade.length; i++) {
                            System.out.println("Dime el número " + (i + 1) + " para el primer array:");
                            grade[i] = sc.nextInt();
                        }

                        for (int i = 0; i < grade2.length; i++) {
                            System.out.println("Dime el número " + (i + 1) + " para el segundo array:");
                            grade2[i] = sc.nextInt();
                        }
                    break;
               }
                System.out.println("Dime que opcion que quieres \n" +
                        "a) Un procedimiento que imprima el array.\n" +
                        "b) Una función que devuelva el máximo del array.\n" +
                        "c) Una función que devuelva el mínimo del array.\n" +
                        "d) Una función que devuelva la media.\n" +
                        "e) Una función que te diga si un elemento existe en el array o no.\n" +
                        "f) Una función que haga la suma de dos vectores (arrays).\n" +
                        "g) Una función que haga la resta de dos vectores (arrays).\n" +
                        "h) Una función que haga el producto escalar de dos vectores\n" +
                        "i) Haz una función que invierta el orden de un array.\n" +
                        "j) Haz un procedimiento que invierta el orden de un array.\n" +
                        "k) Haz una función que nos indique si un array es capicua o no.\n" +
                        "l) Haz un programa con un menú que te permita introducir uno o dos vectores y hacer todas las operaciones anteriores.");
                opcion = sc.next().charAt(0);

                switch (opcion) {
                    case 'a':
                        imprimir(grade);
                        break;
                    case 'b':
                        System.out.println(maximo(grade));
                        break;
                    case 'c':
                        System.out.println(minimo(grade));
                        break;
                    case 'd':
                        System.out.println(media(grade));
                        break;
                    case 'e':
                        System.out.println("dime un numero");
                        num = sc.nextInt();
                        if (existe(grade, num) == true) {
                            System.out.println("Si existe");
                        } else {
                            System.out.println("No existe");
                        }
                        break;
                    case 'f':
                        suma(grade, grade2);
                        break;
                    case 'g':
                        resta(grade, grade2);
                        break;
                    case 'h':
                        System.out.println(escalar(grade, grade2));
                        break;
                    case 'i':
                        System.out.println(invertir(grade));
                        break;
                    case 'j':
                        invertir2(grade);
                        break;
                    case 'k':
                        if (capicua(grade) == true) {
                            System.out.println("Si es capicua");
                        } else {
                            System.out.println("No es capicua");
                        }
                        break;
                }
            break;
        }
    }

    public static void imprimir(int[] grade) {
        for (int i = 0; i < grade.length; i++) {
            System.out.println(grade[i]);
        }
    }

    public static int maximo(int[] grade) {
        int max;
        int max1 = 0;
        for (int i = 0; i < grade.length; i++) {
            max = grade[i];
            if (max > max1) {
                max1 = grade[i];
            }
        }
        return max1;
    }

    public static int minimo(int[] grade) {
        int min;
        int min1 = grade[0];
        for (int i = 0; i < grade.length; i++) {
            min = grade[i];
            if (min < min1) {
                min1 = grade[i];
            }
        }
        return min1;
    }

    public static int media(int[] grade) {
        int media = 0;
        for (int i = 0; i < grade.length; i++){
            media = media + grade[i];
        }
        media = media /grade.length;
        return media;
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

    public static int escalar(int[] grade, int[] grade2) {
        int[] suma = new int[grade.length];
        int[] multiplicacion = new int[grade.length];
        int max;
        int max1 = 0;

        for (int i = 0; i < grade.length; i++) {
            multiplicacion[i] = grade[i] * grade2[i];
        }
        suma[0] = multiplicacion[0];
        for (int j = 1; j < multiplicacion.length; j++) {
            suma[j] = multiplicacion[j] + multiplicacion[j-1];
            max = multiplicacion[j];
            if (max > max1) {
                max1 =  multiplicacion[j];
            }
        }
        return max1;
    }

    //revisar
    public static int[] invertir(int[] grade) {
        int[] invertido = new int[grade.length];
        int i;
        for (i = 0; i < grade.length; i++) {
        }
        System.out.println(" ");
        for (i = 0; i < grade.length; i++) {
            invertido[i] = grade[grade.length - 1 - i];
        }
        return invertido;
    }

    public static void invertir2(int[] grade) {
        int[] invertido = new int[grade.length];
        int i;
        for (i = 0; i < grade.length; i++) {
            System.out.println(grade[i]);
        }
        System.out.println(" ");
        for (i = 0; i < grade.length; i++) {
            invertido[i] = grade[grade.length - 1 - i];
            System.out.println(invertido[i]);
        }
    }

    public static boolean capicua(int[] grade) {
        int n = grade.length;

        for (int i = 0; i < n / 2; i++) {
            if (grade[i] != grade[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}
