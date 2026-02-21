package Tema4.POO3.Ejercicio4;

public class Ficha {
    protected String titulo;
    protected int numero;

    public Ficha(String titulo, int numero){
        this.titulo = titulo;
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "titulo='" + titulo + '\'' +
                ", numero=" + numero +
                '}';
    }
}
