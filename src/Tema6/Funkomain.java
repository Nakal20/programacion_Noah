package Tema6;

import java.io.*;
import java.util.*;

public class Funkomain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funko> lista = cargarFunkos();
        char opcion = 9;

        while (opcion != 0) {
            System.out.println("\n1. Añadir");
            System.out.println("2. Borrar");
            System.out.println("3. Mostrar todos");
            System.out.println("4. Más caro");
            System.out.println("5. Media precio");
            System.out.println("6. Agrupar por modelo");
            System.out.println("7. Funkos 2023");
            System.out.println("0. Salir");

            opcion = sc.next().charAt(0);
            sc.nextLine();


            switch (opcion) {
                case '1':
                    nuevoFunko(lista, sc);
                break;
                case '2':
                    borrarFunko(lista, sc);
                break;
                case '3':
                    mostrarTodos(lista);
                break;
                case '4':
                    masCaro(lista);
                break;
                case '5':
                    media(lista);
                break;
                case '6':
                    modelo(lista);
                break;
                case '7':
                    funko2023(lista);
                break;
            }

            guardarFunkos(lista);

        }
    }
    private static final String FICHERO = "C:\\Users\\noah\\IdeaProjects\\Pruebas\\src\\Tema6\\funkos.csv";

    public static List<Funko> cargarFunkos() {
        List<Funko> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FICHERO))) {
            String linea;

            br.readLine();

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                String cod = datos[0];
                String nombre = datos[1];
                String modelo = datos[2];
                double precio = Double.parseDouble(datos[3]);
                int anio = Integer.parseInt(datos[4].split("-")[0]);

                lista.add(new Funko(cod, nombre, modelo, precio, anio));
            }

        } catch (IOException e) {
            System.out.println("Fichero no encontrado, se creará uno nuevo.");
        }

        return lista;
    }

    public static void guardarFunkos(List<Funko> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FICHERO))) {
            for (Funko f : lista) {
                bw.write(f.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void nuevoFunko(List<Funko> lista, Scanner sc) {
        System.out.println("COD: ");
        String cod = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        System.out.print("Año: ");
        int anio = sc.nextInt();
        sc.nextLine();

        lista.add(new Funko(cod, nombre, modelo, precio, anio));
    }

    public static void borrarFunko(List<Funko> lista, Scanner sc) {
        System.out.print("Nombre del funko a borrar: ");
        String nombre = sc.nextLine();

        lista.removeIf(f -> f.getNombre().equalsIgnoreCase(nombre));
    }

    public static void mostrarTodos(List<Funko> lista) {
        lista.forEach(System.out::println);
    }

    public static void masCaro(List<Funko> lista) {
        Funko max = Collections.max(lista, Comparator.comparing(Funko::getPrecio));
        System.out.println(max);
    }

    public static void media(List<Funko> lista) {
        double media = lista.stream()
                .mapToDouble(Funko::getPrecio)
                .average()
                .orElse(0);

        System.out.println("Media: " + media);
    }

    public static void modelo(List<Funko> lista) {
        Map<String, List<Funko>> mapa = new HashMap<>();

        for (Funko f : lista) {
            mapa.putIfAbsent(f.getModelo(), new ArrayList<>());
            mapa.get(f.getModelo()).add(f);
        }

        for (String modelo : mapa.keySet()) {
            System.out.println("Modelo: " + modelo);
            mapa.get(modelo).forEach(System.out::println);
        }
    }

    public static void funko2023(List<Funko> lista) {
        lista.stream()
                .filter(f -> f.getAnio() == 2023)
                .forEach(System.out::println);
    }
}
