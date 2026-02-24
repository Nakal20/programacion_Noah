package Tema4.POO3.Ejercicio7;

public class AtaqueFisico extends Ataque {
    private int resistencia;
    private int danyo;

    private final int RESISTENCIA_DEFECTO = 100;
    private final int DANYO_DEFECTO = 76;

    public AtaqueFisico(int resistencia, int danyo) {
        this.resistencia = resistencia;
        this.danyo = danyo;
    }

    public AtaqueFisico(){
        this.resistencia = RESISTENCIA_DEFECTO;
        this.danyo = DANYO_DEFECTO;
    }

    @Override
    public void lanzar() {
        System.out.println("ataque fisico...");
    }

    @Override
    public int coste() {
        System.out.println("Cuesta 10");
        return resistencia - 10;
    }

    @Override
    public int danyoInfligido() {
        return danyo;
    }
}
