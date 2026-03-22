package Tema7.ejerciciosB.B5;

import java.io.*;
import java.nio.file.*;

public class B5 {
    public static void main(String[] args) {

        //crear carpeta Diccionario (poner toda la ruta y al final el nombre de la carpeta para que es te donde quieres)
        File dir = new File("C:/Users/noah/IdeaProjects/Pruebas/src/Tema7/ejerciciosB/B5/Diccionario");
        //verifica si existe(si no existe lo crea y te lo dice, si ya existe te lo dice y ya)
        if (!dir.exists()) {
            dir.mkdir();
            System.out.println("Diccionario se esta creado");
        }else{
            System.out.println("Diccionario ya existe");
        }
        //un for que crea los archivos de la A hasta la Z saltandose la Ñ
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            File archivo = new File(dir, letra + ".txt");
            try {
                if(!archivo.exists()) {
                    archivo.createNewFile();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //aqui lee el archivo diccionario.txt es muy importante poner la ruta completa si no no lo encuentra y no lo puede leer
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/noah/IdeaProjects/Pruebas/src/Tema7/ejerciciosB/diccionario.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (line.isEmpty()) continue;//si la linea esta vacia pasa a la siguiente
                char primera = Character.toUpperCase(line.charAt(0));//coge la primera letra de cada linea y lo combierte en mayuscula con toUpperCase para comparar
                if (primera >= 'A' && primera <= 'Z') {
                    File archivo = new File(dir, primera + ".txt");
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
