package Tema5.Coleciones2.Ejercicio1;

public class Pajaro extends Avistamientos {

    private double peso;
    private String especie;

    private final double PESO_DEFECTO = 10;
    private final String ESPECIE_DEFECTO = "cuervo";

    public Pajaro() {
        super(20);
        this.peso = PESO_DEFECTO;
        this.especie = ESPECIE_DEFECTO;
    }

    public Pajaro(int hora, double peso, String especie) {
        super(hora);
        this.peso = peso;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Pájaro -> Peso: " + peso +
                "kg \n" + " Especie: " + especie;
    }
}
