package TEMA4.POO3.Ejercicio1;

public class camiones extends vehiculo {
    private int peso;
    private boolean peligrosa;

    public camiones(String matricula, String modelo, String marca, String color, int peso, boolean peligrosa ) {
        super(matricula, modelo, marca, color);
        this.peso = peso;
        this.peligrosa = peligrosa;

    }
}
