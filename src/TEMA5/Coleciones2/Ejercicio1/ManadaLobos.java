package Tema5.Coleciones2.Ejercicio1;

public class ManadaLobos extends Avistamientos {

    private int numeroLobos;
    private String observaciones;

    private final int NUMEROLOBOS_DEFECTO = 10;
    private final String OBSERVACIONES_DEFECTO = "son muchos";

    public ManadaLobos() {
        super(20);
        this.numeroLobos = NUMEROLOBOS_DEFECTO;
        this.observaciones = OBSERVACIONES_DEFECTO;
    }

    public ManadaLobos(int hora, int numeroLobos, String observaciones) {
        super(hora);
        this.numeroLobos = numeroLobos;
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Manada de lobos -> Nº Lobos: " + numeroLobos +
                "\n Observaciones: " + observaciones;
    }
}
