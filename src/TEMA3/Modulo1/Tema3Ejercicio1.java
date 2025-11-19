package TEMA3.Modulo1;

import java.util.Scanner;

public class Tema3Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Dime un numero");
        num = sc.nextInt();
        int respuesta = numbersing(num);
        if (respuesta == 1){
            System.out.println("Es positivo");
        }
        else if (respuesta == -1){
            System.out.println("Es negativo");
        }else{
            System.out.println("es 0");
        }


    }
    public static int numbersing(int num) {
        if(num < 0){
            return -1;
        }
        else if (num > 0){
           return 1;
        }
        else {
            return 0;
        }
    }
}
