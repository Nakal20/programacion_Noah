package Tema4.POO3.Ejercicio4;

public class Libros extends Ficha {

    private String autor;
    private String editorial;

    private final String AUTOR_DEFECTO = "juan";
    private final String EDITORIAL_DEFECTO = "juans editorial";

    public Libros(String titulo, int numero, String autor, String editorial){
        super(titulo, numero);
        this.autor = autor;
        this.editorial = editorial;
    }

    public Libros(){
        super("El nombre del viento", 20);
        this.autor = AUTOR_DEFECTO;
        this.editorial = EDITORIAL_DEFECTO;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libros{" +
                "autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", titulo='" + titulo + '\'' +
                ", numero=" + numero +
                '}';
    }
}
