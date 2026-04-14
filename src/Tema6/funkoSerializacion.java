package Tema6;

import java.io.*;
import java.util.*;

public class funkoSerializacion {


    private static final String FICHERO_BIN = "C:\\Users\\noah\\IdeaProjects\\Pruebas\\src\\Tema6\\funkos.csv";

    public static void guardar(List<Funko> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHERO_BIN))) {
            oos.writeObject(lista);
            System.out.println("Funkos guardados en binario.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Funko> cargar() {
        List<Funko> lista = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICHERO_BIN))) {
            lista = (List<Funko>) ois.readObject();
            System.out.println("Funkos cargados desde binario.");
        } catch (FileNotFoundException e) {
            System.out.println("No existe fichero binario todavía.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
