package TEMA4.POO3.Ejercicio1;

public class turismo extends vehiculo {
    private int plazas;
    private boolean profesional;

    public turismo(String matricula, String modelo, String marca, String color, int plazas, boolean profesional) {
        super(matricula, modelo, marca, color);
        this.plazas = plazas;
        this.profesional = profesional;

    }

    @Override
    public String toString() {
        return "turismo{" +
                "plazas=" + plazas +
                ", profesional=" + profesional +
                '}';
    }
}
