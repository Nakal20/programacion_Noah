package Tema3.arrays;

import java.util.Scanner;

public class SimulacionWifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hotel = new int[20];

        int habitacion =1;
        int intensidad;
        System.out.print("\n Selecciona un número de habitación para el router (1-20): ");
        habitacion = sc.nextInt();
        while (habitacion >= 1 || habitacion <= 20){
            System.out.print("Numero incorrecto: Selecciona un número de habitación para el router (1-20): ");
            habitacion = sc.nextInt();
        }
        System.out.print("Selecciona la intensidad para el router (1-6): ");
        intensidad = sc.nextInt();
        while (intensidad < 1 || intensidad > 6){
            System.out.print("Numero incorrecto: Selecciona la intensidad para el router (1-6): ");
            intensidad = sc.nextInt();
        }
        intensidad = sc.nextInt();
        while (intensidad < 1 || intensidad > 6){
            System.out.print("Numero incorrecto: Selecciona la intensidad para el router (1-6): ");
            intensidad = sc.nextInt();
        }
        wifi(habitacion - 1, hotel, intensidad);
        for (int i = 0; i < hotel.length; i++) {
            System.out.println(hotel[i]);
        }
    }

    public static void wifi(int habitacion, int[] hotel, int intensidad){
        hotel[habitacion] = intensidad;

        int distancia = intensidad - 1;
        for (int i = habitacion - 1; i >= 0 && distancia > 0; i--) {
            hotel[i] = distancia;
            distancia--;
        }

        distancia = intensidad - 1;
        for (int i = habitacion + 1; i < hotel.length && distancia > 0; i++) {
            hotel[i] = distancia;
            distancia--;
        }
    }
}
