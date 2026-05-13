package TEMA8.Repaso;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RankingVideojuego {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Videojuego> lista = cargarRanking();
        int opcion = 9;

        while (opcion != 0) {

            System.out.println("--- Ranking de Videojuegos ---\n" +
                    "1. Añadir videojuego\n" +
                    "2. Mostrar ranking\n" +
                    "3. Guardar ranking\n" +
                    "4. Cargar ranking\n" +
                    "5. Eliminar videojuego\n" +
                    "6. Exportar a texto\n" +
                    "0. Salir\n" +
                    "Elige una opción:");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    nuevoVideojuego(lista, sc);
                    break;
                case 2:
                    mostrarRanking(lista);
                    break;
                case 3:
                    guardarRanking(lista);
                    break;
                case 4:
                    cargarRanking();
                    break;
                case 5:
                    sc.nextLine();
                    eliminarVideojuego(lista, sc);
                    break;
                case 6:
                    exportarCSV(lista);
                    break;
            }
        }
    }
    private static final String FICHERO = "C:\\Users\\noah\\IdeaProjects\\Pruebas\\src\\TEMA8\\Repaso\\ranking.csv";

    public static List<Videojuego> cargarRanking() {

        try (ObjectInputStream ois =
                     new ObjectInputStream(
                             new FileInputStream("ranking.dat"))) {

            return (List<Videojuego>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {

            System.out.println("No se pudo cargar el ranking.");

            return new ArrayList<>();
        }
    }

    public static void nuevoVideojuego(List<Videojuego> lista, Scanner sc) {

        System.out.println("1. Fisico");
        System.out.println("2. Digital");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("titulo: ");
        String titulo = sc.nextLine();

        System.out.print("plataforma: ");
        String plataforma = sc.nextLine();

        System.out.print("nota: ");
        int nota = sc.nextInt();
        sc.nextLine();

        if(tipo == 1){

            System.out.print("tienda compra: ");
            String tienda = sc.nextLine();

            System.out.print("estado (nuevo/usado): ");
            String estado = sc.nextLine();

            lista.add(new VideojuegoFisico(titulo, plataforma, nota, tienda, estado));

        } else if(tipo == 2){

            System.out.print("tienda online: ");
            String tienda = sc.nextLine();

            System.out.print("tamaño GB: ");
            double tamanyo = sc.nextDouble();
            sc.nextLine();

            lista.add(new VideojuegoDigital(titulo, plataforma, nota, tienda, tamanyo));
        }else {
            System.out.println("opcion no valida");
        }
    }

    public static void mostrarRanking(List<Videojuego> lista) {
        lista.forEach(System.out::println);
    }

    public static void guardarRanking(List<Videojuego> lista) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ranking.dat"))) {

            oos.writeObject(lista);

            System.out.println("Ranking guardado correctamente.");

        } catch (IOException e) {

            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    public static void eliminarVideojuego(List<Videojuego> lista, Scanner sc) {
        System.out.print("Nombre del Videojuego a borrar: ");
        String titulo = sc.nextLine();

        lista.removeIf(v -> v.getTitulo().equalsIgnoreCase(titulo));
    }

    public static void exportarCSV(List<Videojuego> lista){

        try(PrintWriter pw = new PrintWriter(new FileWriter("ranking.csv"))){
            pw.println("tipo,titulo,plataforma,nota,extra1,extra2");

            for(Videojuego v : lista){

                if(v instanceof VideojuegoFisico){

                    VideojuegoFisico vf = (VideojuegoFisico) v;

                    pw.println(
                            vf.getTipo() + "," + vf.getTitulo() + "," + vf.getPlataforma() + "," + vf.getNota() + "," + vf.getTiendaCompra() + "," + vf.getEstado()
                    );

                } else if(v instanceof VideojuegoDigital){

                    VideojuegoDigital vd = (VideojuegoDigital) v;

                    pw.println(
                            vd.getTipo() + "," + vd.getTitulo() + "," + vd.getPlataforma() + "," + vd.getNota() + "," + vd.getTiendaOnline() + "," + vd.getTamanyoGB()
                    );
                }
            }

            System.out.println("CSV exportado correctamente.");

        } catch(IOException e){

            System.out.println("Error al exportar CSV.");
        }
    }
}
