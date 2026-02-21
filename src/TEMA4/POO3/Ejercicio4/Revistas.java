package Tema4.POO3.Ejercicio4;

public class Revistas extends Ficha{

    private int npublicacion;
    private int anyo;

    private final int NPUBLICACION_DEFECTO = 20;
    private final int ANYO_DEFECTO = 2024;

    public Revistas(String titulo, int numero, int npublicacion, int anyo){
        super(titulo, numero);
        this.anyo = anyo;
        this.npublicacion = npublicacion;
    }

    public Revistas(){
        super("El nombre del viento", 20);
        this.anyo = ANYO_DEFECTO;
        this.npublicacion = NPUBLICACION_DEFECTO;
    }

    public int getNpublicacion() {
        return npublicacion;
    }

    public void setNpublicacion(int npublicacion) {
        this.npublicacion = npublicacion;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "Revistas{" +
                "npublicacion=" + npublicacion +
                ", anyo=" + anyo +
                ", titulo='" + titulo + '\'' +
                ", numero=" + numero +
                '}';
    }
}
