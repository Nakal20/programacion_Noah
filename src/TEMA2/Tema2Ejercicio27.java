package TEMA2;

public class Tema2Ejercicio27 {
    public static void main(String[] args) {

        int num = 2;
        int contadorp = 0;

//usar un contadorDePrimos que debe llegar hasta  que encuentre 20 primos
        while (contadorp < 20) {
            int contador = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    contador++;
                    break;
                }
            }
            if (contador == 0) {
                System.out.println(num);
                contadorp++;
            }
            num++;
        }
    }
}