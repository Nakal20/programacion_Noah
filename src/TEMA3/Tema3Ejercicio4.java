package TEMA3;

import java.util.Scanner;

public class Tema3Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elegir;
        showMenu();
        elegir = sc.nextInt();
        switch (elegir){
            case 1:
                euro2dolar();
                break;
            case 2:
                dolar2Euro();

        }

    }
    public static void showMenu() {
        System.out.println("1 pasar de Euro a Dollar");
        System.out.println("2 pasar de Dollar a Euro");
    }
    public static double euro2dolar(){
        Scanner sc = new Scanner(System.in);
        double dolares;
        double euros;
        System.out.println("Cuantos euros quieres pasar a dolar?");
        euros = sc.nextDouble();
        dolares = euros * 1.16;
        System.out.println("Son " + dolares + "$");
        return dolares;
    }
    public static double dolar2Euro() {
        Scanner sc = new Scanner(System.in);
        double dolares;
        double euros;
        System.out.println("Cuantos euros quieres pasar a dolar?");
        dolares = sc.nextDouble();
        euros = dolares * 0.86;
        System.out.println("Son " + euros + "€");
        return euros;
    }
}
