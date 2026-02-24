package Tema5.Coleciones2.Ejercicio2;

import java.util.HashMap;
import java.util.Random;

public class Acortador {

    private HashMap<String, RegistroURL> mapa;

    public Acortador() {
        mapa = new HashMap<>();
    }

    private String generarClave() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random r = new Random();
        StringBuilder clave = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            clave.append(caracteres.charAt(r.nextInt(caracteres.length())));
        }

        return clave.toString();
    }

    public void crearRegistro(String url) {

        String clave;

        do {
            clave = generarClave();
        } while (mapa.containsKey(clave)); // Evita claves duplicadas

        RegistroURL registro = new RegistroURL(clave, url);
        mapa.put(clave, registro);

        System.out.println("URL acortada creada:");
        System.out.println("https://acortar.link/" + clave);
    }

    public void resolver(String clave) {

        if (mapa.containsKey(clave)) {
            System.out.println("URL original: " + mapa.get(clave).getUrl());
        } else {
            System.out.println("No existe esa clave.");
        }
    }

    public void borrar(String clave) {

        if (mapa.remove(clave) != null) {
            System.out.println("Registro eliminado.");
        } else {
            System.out.println("No existe esa clave.");
        }
    }
    
    public void mostrarTodos() {

        if (mapa.isEmpty()) {
            System.out.println("No hay registros.");
            return;
        }

        for (RegistroURL r : mapa.values()) {
            System.out.println(r);
        }
    }
}