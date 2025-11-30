package Tema3.arrays;

import java.util.Random;
import java.util.Scanner;

public class JuegoDeLaMosca {
    static void main() {
        int[] grade = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int num;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int mosca = random.nextInt(grade.length);
        System.out.println("Dime un numero entre 1 y 15");
        num = sc.nextInt();
        int resultado = mosca(num,mosca);
        while (resultado != 0){
            if (resultado == 1){
                System.out.println("Has dado al lado de la mosca y se ha movido");
                System.out.println("Dime un numero");
                num = sc.nextInt();
                mosca = random.nextInt(grade.length);
            }
            if(resultado == 2){
                System.out.println("Has fallado");
                System.out.println("Dime un numero");
                num = sc.nextInt();
            }
            if(resultado == 3){
                System.out.println("numero invalido");
                System.out.println("Dime un numero");
                num = sc.nextInt();
            }
            resultado = mosca(num,mosca);
        }
        System.out.println("Le has dado");
    }
public static int mosca(int num, int mosca){
    System.out.println(mosca);
    if (mosca == num){
        return 0;
    }
    else if(mosca == num + 1 || mosca == num - 1 ){
        return 1;
    }
    else if (num < 1 || num > 15) {
        return 3;
    }
    return 2;
}

}
