package Tema4.POO3.Ejercicio4;

enum Tipo{
    ANIMACION, ACCION, DOCUMENTAL, CIENCIA, FICCION
}

public class DVD extends Ficha{
    private String director;
    private int anyo;
    private Tipo tipo;

    private final String DIRECTOR_DEFECTO = "juan";
    private final int ANYO_DEFECTO = 2024;
    private final Tipo TIPO_DEFECTO = Tipo.ACCION;

    public DVD(String titulo, int numero, String director, int anyo, Tipo tipo){
        super(titulo, numero);
        this.director = director;
        this.anyo = anyo;
        this.tipo = tipo;
    }

    public DVD(){
        super("El nombre del viento", 20);
        this.director = DIRECTOR_DEFECTO;
        this.anyo = ANYO_DEFECTO;
        this.tipo = TIPO_DEFECTO;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "director='" + director + '\'' +
                ", anyo=" + anyo +
                ", tipo=" + tipo +
                ", titulo='" + titulo + '\'' +
                ", numero=" + numero +
                '}';
    }
}
