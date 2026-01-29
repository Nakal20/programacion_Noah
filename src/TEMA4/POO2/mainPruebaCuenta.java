package TEMA4.POO2;

import java.util.Scanner;

public class mainPruebaCuenta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elegir;
        Persona[] personas = new Persona[10];
        int numPersonas = 0;

        do {
            System.out.println("\n1. Crear persona");
            System.out.println("2. Crear cuenta");
            System.out.println("3. Mostrar persona");
            System.out.println("4. Abono");
            System.out.println("5. Pago recibo");
            System.out.println("6. Mostrar morosos");
            System.out.println("0. Salir");
            elegir = sc.nextInt();

            switch (elegir) {
                default:{
                    System.out.println("opcion no valida");
                }break;

                case 0:{
                    System.out.println("adios");
                }break;

                case 1: {
                    System.out.print("DNI: ");
                    personas[numPersonas++] = new Persona(sc.nextLine());
                }break;

                case 2: {
                    Persona p = buscarPersona(personas, numPersonas, sc);
                    if (p.crearCuenta(
                            pedirTexto(sc, "Número de cuenta: "),
                            pedirNumero(sc, "Saldo inicial: "))) {
                        System.out.println("Cuenta creada");
                    } else {
                        System.out.println("No se pudo crear la cuenta");
                    }
                }break;

                case 3:{
                    buscarPersona(personas, numPersonas, sc).mostrarDatos();
                }break;

                case 4:{
                    Persona p = buscarPersona(personas, numPersonas, sc);
                    if (p.abono(
                            pedirTexto(sc, "Cuenta: "),
                            pedirNumero(sc, "Cantidad: "))) {
                        System.out.println("Abono realizado");
                    } else {
                        System.out.println("Cuenta no encontrada");
                    }
                }break;

                case 5: {
                    Persona p = buscarPersona(personas, numPersonas, sc);
                    if (p.recibo(
                            pedirTexto(sc, "Cuenta: "),
                            pedirNumero(sc, "Cantidad: "))) {
                        System.out.println("Pago realizado");
                    } else {
                        System.out.println("Cuenta no encontrada");
                    }
                }break;

                case 6: {
                    for (int i = 0; i < numPersonas; i++) {
                        if (personas[i].esMorosa()) {
                            System.out.println("Persona morosa: " + personas[i].getDNI());
                        }
                    }
                }
            }

        }while(elegir != 0);

    }

        private static Persona buscarPersona(Persona[] personas, int total, Scanner sc) {
            System.out.print("DNI: ");
            String dni = sc.nextLine();

            for (int i = 0; i < total; i++) {
                if (personas[i].getDNI().equals(dni)) {
                    return personas[i];
                }
            }
            System.out.println("Persona no encontrada");
            return personas[0];
        }

        private static String pedirTexto(Scanner sc, String msg) {
            System.out.print(msg);
            return sc.nextLine();
        }

        private static double pedirNumero(Scanner sc, String msg) {
            System.out.print(msg);
            return sc.nextDouble();
        }
    }
