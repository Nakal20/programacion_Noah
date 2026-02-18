package TEMA4.POO3.Ejercicio1;

enum riesgo{
    PELIGROSO,SEGURO
}

public class Camiones extends Vehiculo {
    private int peso;
    private riesgo peligrosidad;

    private static final int PESO_DEFECTO = 3750;
    private static final riesgo RIESGO_DEFECTO = riesgo.SEGURO;

    public Camiones(String matricula, String modelo, String marca, String color, int peso, riesgo peligrosidad) {
        super(matricula, modelo, marca, color);
        this.peso = peso;
        this.peligrosidad = peligrosidad;
    }
    public Camiones(){
        this("5678ggg", "4x4", "mercedes", "blanco", PESO_DEFECTO, RIESGO_DEFECTO);
    }
}
