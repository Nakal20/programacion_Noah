package TEMA3;

public class Tema3Ejercicio6 {
    public static void main(String[] args) {
        //int num = 0;
        numero();
    }

    public static void numero() {
        //TODO: for
        int num = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println(num + " * " + j + " = " + (num * j));
            }
            System.out.println("\n");
            num++;
        }
    }
}
