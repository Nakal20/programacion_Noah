package TEMA3.arrays;

import java.util.Random;
import java.util.Scanner;

public class BuscaMinas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] minas = new int[]{0,0,-1,0,0,0,-1,0,0,-1,0,-1,0,0,-1,0,0,-1,0,0};
        Random random = new Random();
        for (int i = 0; i < minas.length; i++) {
            int pos = random.nextInt(minas.length);
            int temp = minas[i];
            minas[i] = minas[pos];
            minas[pos] = temp;
        }
        boolean juegoActivo = true;
        int casillasReveladas = 0;
        boolean[] visible = new boolean[20];
        int mina = random.nextInt(minas.length);
        int posicion = 0;
        int resultado = buscaminas(mina);
        while (resultado != 0){
            for (int i = 0; i < minas.length; i++) {
                System.out.print(minas[i] + " ");

                    if(mina == posicion + 1){
                        System.out.print("[*]");
                    }
                    if(mina == posicion - 1){
                        System.out.print("[*]");
                    }

            }
            if (resultado == 1){
                System.out.println("\n La mina esta a una posicion de distancia");
                System.out.println("Dime un numero");
                posicion = sc.nextInt();
            }
            else if(resultado == 2){
                System.out.println("\n La mina esta a dos posicion de distancia");

            }
            else if(resultado == 3){
                System.out.println("numero invalido");
            }
            else if(resultado == 4){
                System.out.println("\n La mina esta lejos");
            }
            resultado = buscaminas(mina);
        }
        System.out.println("Le has dado");
    }

    public static int buscaminas(int mina){
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println(mina);
        System.out.print("Dime una posición (0 a 19): ");
        int posicion = sc.nextInt();
        if (mina == posicion){
            return 0;
        }
        return posicion;
    }

}
