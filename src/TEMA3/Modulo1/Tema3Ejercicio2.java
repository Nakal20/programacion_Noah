package TEMA3.Modulo1;

import java.util.Scanner;

import static TEMA3.Modulo1.Tema3Ejercicio1.numbersing;

public class Tema3Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Dime un numero");
        num = sc.nextInt();
        int respuesta = numbersing(num);
        if (respuesta == 1){
            System.out.println("Es positivo \n");
        }
        else if (respuesta == -1){
            System.out.println("Es negativo \n");
        }else{
            System.out.println("es 0 \n");
        }

        int age;
        System.out.println("Dime un numero");
        age = sc.nextInt();

        boolean respuesta2 = isAdult(age);
        if (respuesta2 == true) {
            System.out.println("Es mayor");
        }else{
            System.out.println("Es menor");
        }
    }
    public static boolean isAdult(int age) {
        //return age>18;

        if (age > 18){
            return true;
        }
        else{
            return false;
        }
    }
}

