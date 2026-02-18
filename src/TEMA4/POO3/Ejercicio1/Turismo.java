package TEMA4.POO3.Ejercicio1;

enum tipo{
    profesional,particular
}

public class Turismo extends Vehiculo {
    private int plazas;
    private tipo uso;

    private static final int PLAZAS_DEFECTO = 4;
    private static final tipo USO_DEFECTO = tipo.profesional;

    public Turismo(String matricula, String modelo, String marca, String color, int plazas, tipo uso ) {
        super(matricula, modelo, marca, color);
        this.plazas = plazas;
        this.uso = uso;
    }
    public Turismo() {
       this("1234bbb", "4x4", "kia", "rojo", PLAZAS_DEFECTO, USO_DEFECTO);
    }

    public int getPlazas() {
        return plazas;
    }

    public tipo getUso() {
        return uso;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public void setUso(tipo uso) {
        this.uso = uso;
    }

    public void informacion(){
        System.out.println(matricula + " " + modelo + " " + marca + " " + color + " " + plazas + " " + uso);
    }
}
