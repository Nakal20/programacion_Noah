package Tema5.Coleciones2.Ejercicio1;

public class Serpiente extends Avistamientos {

    private double longitud;
    private String especie;

    private final double LONGITUD_DEFECTO = 10;
    private final String ESPECIE_DEFECTO = "cuervo";

    public Serpiente() {
        super(20);
        this.longitud = LONGITUD_DEFECTO;
        this.especie = ESPECIE_DEFECTO;
    }

    public Serpiente(int hora, double longitud, String especie) {
        super(hora);
        this.longitud = longitud;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Serpiente -> Longitud: " + longitud +
                "\n Especie: " + especie;
    }
}