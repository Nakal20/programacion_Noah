package TEMA4.POO2;

import java.util.Scanner;

public class mainPruebaCuenta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Persona[] personas = new Persona[10];
        int numPersonas = 0;

        int elegir;

        do {
            System.out.println("\n---QUE QUIERES HACER---");
            System.out.println("1. Crear persona");
            System.out.println("2. Crear cuenta");
            System.out.println("3. Mostrar persona");
            System.out.println("4. Abono");
            System.out.println("5. Pago recibo");
            System.out.println("6. Mostrar morosos");
            System.out.println("0. Salir");

            System.out.print("Opción: ");
            elegir = Integer.parseInt(sc.nextLine());

            switch (elegir) {
                default:{
                    System.out.println("opcion no valida");
                }

                case 0:{
                    System.out.println("adios, vuelve pronto");
                }

                case 1: {
                    System.out.print("DNI: ");
                    personas[numPersonas++] = new Persona(sc.nextLine());
                }break;

                case 2: {
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();
                    int pos = buscarPersona(personas, numPersonas, dni);

                    if (pos != -1) {
                        System.out.print("Número de cuenta: ");
                        String nc = sc.nextLine();
                        System.out.print("Saldo inicial: ");
                        double saldo = Double.parseDouble(sc.nextLine());

                        if (!personas[pos].crearCuenta(nc, saldo)) {
                            System.out.println("Máximo de cuentas alcanzado");
                        }
                    } else {
                        System.out.println("Persona no encontrada");
                    }
                }break;

                case 3: {
                    System.out.print("DNI: ");
                    int pos = buscarPersona(personas, numPersonas, sc.nextLine());
                    if (pos != -1) {
                        personas[pos].mostrarDatos();
                    } else {
                        System.out.println("Persona no encontrada");
                    }
                }break;

                case 4: {
                    System.out.print("DNI: ");
                    int pos = buscarPersona(personas, numPersonas, sc.nextLine());

                    if (pos != -1) {
                        System.out.print("Cuenta: ");
                        String nc = sc.nextLine();
                        System.out.print("Cantidad: ");
                        double cant = Double.parseDouble(sc.nextLine());

                        if (!personas[pos].abono(nc, cant)) {
                            System.out.println("Cuenta no encontrada");
                        }
                    } else {
                        System.out.println("Persona no encontrada");
                    }
                }break;

                case 5: {
                    System.out.print("DNI: ");
                    int pos = buscarPersona(personas, numPersonas, sc.nextLine());

                    if (pos != -1) {
                        System.out.print("Cuenta: ");
                        String nc = sc.nextLine();
                        System.out.print("Cantidad: ");
                        double cant = Double.parseDouble(sc.nextLine());

                        if (!personas[pos].recibo(nc, cant)) {
                            System.out.println("Cuenta no encontrada");
                        }
                    } else {
                        System.out.println("Persona no encontrada");
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

        } while (elegir != 0);
    }

    private static int buscarPersona(Persona[] personas, int total, String dni) {
        for (int i = 0; i < total; i++) {
            if (personas[i].getDNI().equals(dni)) {
                return i;
            }
        }
        return -1;
    }
}
