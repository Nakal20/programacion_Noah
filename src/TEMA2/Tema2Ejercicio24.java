package TEMA2;

import java.util.Scanner;

public class Tema2Ejercicio24 {
    public static void main(String[] args) {
        //System.out.println("Dime un numero");
        Scanner in = new Scanner(System.in);
        int num;
        int contadora=0;
        int contadors=0;

        do{
            System.out.println("Dime un  numero: ");
            num = in.nextInt();
            if (num>=5){
                contadora++;
            } else if (num<5 && num>0) {
                contadors++;
            }
        }while (num>0);
        System.out.println("Han aprobado "+contadora+" Han suspendido "+contadors);
    }
}
