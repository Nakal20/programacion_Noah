package EXAMEN;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int opcion = 0;
        int dia = -1;
        String dia2 = "";
        while (opcion != 3) {
            int hora = -1;
            int minutos = -1;
            System.out.println("De donde eres? \n (1) España (2) Japon (3) Salir");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    while (dia < 0 || dia > 7){
                        System.out.println("Dime el numero del dia de la semana en el que estas");
                        dia = sc.nextInt();
                        if (dia < 0 || dia > 7) {
                            System.out.println("dia invalido invalidos");
                        }
                    }
                    while (minutos < 0 || minutos > 60) {
                        System.out.println("Cuales son tus minutos?");
                        minutos = sc.nextInt();
                        if (minutos < 0 || minutos > 60) {
                            System.out.println("minutos invalidos");
                        }
                    }
                    while (hora < 0 || hora > 24) {
                        System.out.println("Cual es tu hora?");
                        hora = sc.nextInt();
                        if (hora < 0 || hora > 24) {
                            System.out.println("hora invalida");
                        }
                    }
                    if (dia == 1) {
                        dia2 = "lunes";
                    }
                    if (dia == 2) {
                        dia2 = "martes";
                    }
                    if (dia == 3) {
                        dia2 = "miercoles";
                    }
                    if (dia == 4) {
                        dia2 = "jueves";
                    }
                    if (dia == 5) {
                        dia2 = "viernes";
                    }
                    if (dia == 6) {
                        dia2 = "sabado";
                    }
                    if (dia == 7) {
                        dia2 = "domingo";
                    }
                    System.out.println("Tu hora es " + hora + ":" + minutos + " " + dia2);

                    hora = hora + 8;
                    if (hora > 24) {
                        hora = hora - 24;
                        dia++;
                        if (dia > 7) {
                            dia = 1;
                        }
                    }
                    if (dia == 1) {
                        dia2 = "lunes";
                    }
                    if (dia == 2) {
                        dia2 = "martes";
                    }
                    if (dia == 3) {
                        dia2 = "miercoles";
                    }
                    if (dia == 4) {
                        dia2 = "jueves";
                    }
                    if (dia == 5) {
                        dia2 = "viernes";
                    }
                    if (dia == 6) {
                        dia2 = "sabado";
                    }
                    if (dia == 7) {
                        dia2 = "domingo";
                    }
                    System.out.println("En japon son las " + hora + ":" + minutos + " " + dia2 + "\n");
                    break;
                case 2:
                    System.out.println("Dime el numero del dia de la semana en el que estas");
                    dia = sc.nextInt();
                    while (minutos < 0 || minutos > 60) {
                        System.out.println("Cuales son tus minutos?");
                        minutos = sc.nextInt();
                        if (minutos < 0 || minutos > 60) {
                            System.out.println("minutos invalidos");
                        }
                    }
                    while (hora < 0 || hora > 24) {
                        System.out.println("Cual es tu hora?");
                        hora = sc.nextInt();
                        if (hora < 0 || hora > 24) {
                            System.out.println("hora invalida");
                        }
                    }
                    if (dia == 1) {
                        dia2 = "lunes";
                    }
                    if (dia == 2) {
                        dia2 = "martes";
                    }
                    if (dia == 3) {
                        dia2 = "miercoles";
                    }
                    if (dia == 4) {
                        dia2 = "jueves";
                    }
                    if (dia == 5) {
                        dia2 = "viernes";
                    }
                    if (dia == 6) {
                        dia2 = "sabado";
                    }
                    if (dia == 7) {
                        dia2 = "domingo";
                    }

                    System.out.println("Tu hora es " + hora + ":" + minutos + " " + dia2);

                    hora = hora - 8;
                    if (hora < 0) {
                        hora = hora + 24;
                        dia--;
                        if (dia < 1) {
                            dia = 7;
                        }

                    }
                    if (dia > 7) {
                        dia = 1;
                    }
                    if (dia == 1) {
                        dia2 = "lunes";
                    }
                    if (dia == 2) {
                        dia2 = "martes";
                    }
                    if (dia == 3) {
                        dia2 = "miercoles";
                    }
                    if (dia == 4) {
                        dia2 = "jueves";
                    }
                    if (dia == 5) {
                        dia2 = "viernes";
                    }
                    if (dia == 6) {
                        dia2 = "sabado";
                    }
                    if (dia == 7) {
                        dia2 = "domingo";
                    }
                    System.out.println("En españa son las " + hora + ":" + minutos + " " + dia2 + "\n");

            }
            System.out.println("Desea terminar? \n (3) Salir (4) Seguir");
            opcion = sc.nextInt();
        }
        System.out.println("Estas fuera");
    }
}
