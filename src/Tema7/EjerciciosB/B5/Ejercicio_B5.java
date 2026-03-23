package TEMA7.EjerciciosB.B5;

import java.io.*;
import java.nio.file.*;

public class Ejercicio_B5 {
    public static void main(String[] args) {

        //crear carpeta Diccionario (poner toda la ruta y al final el nombre de la carpeta para que es te donde quieres)
        Path dir = Paths.get("/home/noabertau/IdeaProjects/programacion/src/TEMA7/EjerciciosB/B5/Diccionario");
        try {
            Files.createDirectories(dir);
            System.out.println("Directorio creado correctamente");
        } catch (IOException e) {
            System.err.println("Error creating directory: " + e.getMessage());
        }
        //un for que crea los archivos de la A hasta la Z saltandose la Ñ
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            File archivo = new File(dir.toFile(), letra + ".txt");
            try {
                if(!archivo.exists()) {
                    archivo.createNewFile();
                    System.out.println(archivo + " se ha creado");
                }else{
                    System.out.println(archivo + " ya existe");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //aqui lee el archivo diccionario.txt es muy importante poner la ruta completa si no no lo encuentra y no lo puede leer
        try (BufferedReader br = new BufferedReader(new FileReader("/home/noabertau/IdeaProjects/programacion/src/TEMA7/EjerciciosB/Archivos/diccionario.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (line.isEmpty()) continue;//si la linea esta vacia pasa a la siguiente
                char primera = Character.toUpperCase(line.charAt(0));//coge la primera letra de cada linea y lo combierte en mayuscula con toUpperCase para comparar
                if (primera >= 'A' && primera <= 'Z') {
                    File archivo = new File(dir.toFile(), primera + ".txt");
                    Files.write(
                            archivo.toPath(),
                            (line + "\n").getBytes(),
                            StandardOpenOption.APPEND
                    );//escribe la palabra con un salto de linea
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
