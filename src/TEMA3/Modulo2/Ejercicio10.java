import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        double lado;
        double altura;
        double base;
        double radio;
        //
        char opcion;
        int num;
        int contador = 0;
        int factorialRecusivo = 1;
        int suma=0;
        int a;
        int b;
        int c;

        System.out.println("Dime que opcion que quieres \n" +
                "a calcular area y perimetro \n" +
                "b saber si es primo o no \n" +
                "c el numero de digitos de un numero \n" +
                "d cantidad de digitos pares en un numero \n" +
                "e cantidad de digitos impares en un numero \n"+
                "f calcular el factorial de un numero \n"+
                "g calcular el factorial recursivo de un numero \n"+
                "h cantidad de resultados de una ecuacion \n"+
                "i suma los digitos de un numero \n");
        opcion = sc.next().charAt(0);

        switch (opcion) {
            case 'a':
                System.out.println("Dime que opcion que quieres \n" +
                        "a el perímetro y el área de un círculo \n" +
                        "b el perímetro y el área de un cuadrado \n" +
                        "c el perímetro y el área de un rectángulo \n");
                opcion = sc.next().charAt(0);
                switch (opcion) {
                    case 'a':
                        System.out.println("Dime el lado");
                        lado = sc.nextDouble();

                        break;
                    case 'b':
                        System.out.println("Dime la base y la altura");
                        base = sc.nextDouble();
                        altura = sc.nextDouble();

                        break;
                    case 'c':
                        System.out.println("Dime el radio");
                        radio = sc.nextDouble();

                }
                        break;
                    case 'b':
                        System.out.println("Dime un numero");
                        num = sc.nextInt();
                }
                break;
            case 'c':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                break;
            case 'd':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                break;
            case 'e':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                break;
            case 'f':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                System.out.println("El factorial de " + num + " es " + factorial2);
                break;
            case 'g':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                int factorialRecusivo2 = numFactorialRecursivo(num,factorialRecusivo,contador);
                System.out.println("El factorial de " + num + " es " + factorialRecusivo2);
                break;
            case 'h':
                System.out.println("Dime un numero");
                a = sc.nextInt();
                System.out.println("Dime otro numero");
                b = sc.nextInt();
                System.out.println("Dime otro numero");
                c = sc.nextInt();
                break;
            case 'i':
                System.out.println("Dime un numero");
                num = sc.nextInt();

                System.out.println("La suma de los digitos es " + sumaDigitos(num, suma));
                break;
        }
    }
}
