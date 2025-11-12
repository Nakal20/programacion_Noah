package TEMA3;

import java.util.Scanner;

public class Tema3Ejercicio8 {
    public static void main(String[] args) {
int ano = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un mes");
        int mes = sc.nextInt();
        boolean valor = false;
       int comprobar = mes(mes);
        if (comprobar == 0){
            System.out.println("El mes no es corecto ");
            valor = true;
        }
        System.out.println("Dime un año");
        ano = sc.nextInt();
        System.out.println("Dime un dia");
        int dia = sc.nextInt();
        comprobar = dia(dia, mes, ano);
        if (comprobar == 1){
            System.out.println("El dia no es corecto ");
            valor = true;
        }
        if (valor == true){
            System.out.println("hay valores incorrectos");
        }else {
            System.out.println(dia + "/" + mes + "/" + ano);
        }
    }

    public static int dia(int dia, int mes, int ano) {
        int comprobar = comprobar(mes, ano);
        if(dia < 1 || dia > comprobar){
            return 1;
        }
        return 0;
    }

    public static int mes(int mes){
        if(mes >= 1 && mes <= 12){
            return 1;
        }
        return 0;
    }
    public static int comprobar(int mes, int ano){
        if(mes == 1  || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            return 31;
        }
        if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            return 30;
        }
        if (mes == 2){
            if (bisiesto(ano) == true){
                return 29;
            }else{
                return 28;
            }
        }
        return 0;
    }
    public static boolean bisiesto(int ano){
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
            return true;
        }else{
            return false;
        }
    }
}
