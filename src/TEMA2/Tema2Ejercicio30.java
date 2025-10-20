package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double resultado;
        System.out.println("Escribe 's' en el momento de la operacion para terminar");


        System.out.print("Introduce el primer número: ");
        int num1 = in.nextInt();

        System.out.print("Introduce la operación (+, -, *, /, %): ");
        char operacion = in.next().charAt(0);

        System.out.print("Introduce el segundo número: ");
        int num2 = in.nextInt();

        do {
            switch (operacion) {
                case '+':
                    resultado = num1 + num2;
                    System.out.println(resultado);

                    System.out.print("Introduce el primer número: ");
                    num1 = in.nextInt();
                    System.out.print("Introduce la operación (+, -, *, /, %): ");
                    operacion = in.next().charAt(0);
                    System.out.print("Introduce el segundo número: ");
                    num2 = in.nextInt();
                    break;

                case '-':
                    resultado = num1 - num2;
                    System.out.println(resultado);

                    System.out.print("Introduce el primer número: ");
                    num1 = in.nextInt();
                    System.out.print("Introduce la operación (+, -, *, /, %): ");
                    operacion = in.next().charAt(0);
                    System.out.print("Introduce el segundo número: ");
                    num2 = in.nextInt();
                    break;

                case '*':
                    resultado = num1 * num2;
                    System.out.println(resultado);

                    System.out.print("Introduce el primer número: ");
                    num1 = in.nextInt();
                    System.out.print("Introduce la operación (+, -, *, /, %): ");
                    operacion = in.next().charAt(0);
                    System.out.print("Introduce el segundo número: ");
                    num2 = in.nextInt();
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println(" No se puede dividir entre 0.");
                    } else {
                        resultado = num1 / num2;
                        System.out.println(resultado);

                        System.out.print("Introduce el primer número: ");
                        num1 = in.nextInt();
                        System.out.print("Introduce la operación (+, -, *, /, %): ");
                        operacion = in.next().charAt(0);
                        System.out.print("Introduce el segundo número: ");
                        num2 = in.nextInt();
                    }

                case '%':
                    if (num2 == 0) {
                        System.out.println(" No se puede calcular el módulo con 0.");
                    } else {
                        resultado = num1 % num2;
                        System.out.println(resultado);

                        System.out.print("Introduce el primer número: ");
                        num1 = in.nextInt();
                        System.out.print("Introduce la operación (+, -, *, /, %): ");
                        operacion = in.next().charAt(0);
                        System.out.print("Introduce el segundo número: ");
                        num2 = in.nextInt();
                    }
                    break;
            }
        } while (operacion != 's');
    }
}

