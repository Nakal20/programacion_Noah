package TEMA5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;
        try {
            System.out.print("Introduce el primer número entero: ");
            num1 = sc.nextInt();
            System.out.print("Introduce el segudo número entero: ");
            num2 = sc.nextInt();
            resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);

        } catch (InputMismatchException e) {
            System.err.println("Valor introducido incorrecto");
        }  catch (ArithmeticException e) {
            System.err.println("Operacion incorrecta");
        }
    }
}
