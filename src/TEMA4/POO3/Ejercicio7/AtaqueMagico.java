package Tema4.POO3.Ejercicio7;

public class AtaqueMagico extends Ataque {
    private int mana;
    private int danyo;

    private final int MANA_DEFECTO = 100;
    private final int DANYO_DEFECTO = 76;

    public AtaqueMagico(int mana, int danyo) {
        this.mana = mana;
        this.danyo = danyo;
    }

    public AtaqueMagico(){
        this.mana = MANA_DEFECTO;
        this.danyo = DANYO_DEFECTO;
    }

    @Override
    public void lanzar() {
        System.out.println("ataque mágico...");
    }

    @Override
    public int coste() {
        System.out.println("Cuesta 10");
        return mana - 10;
    }

    @Override
    public int danyoInfligido() {
        return danyo;
    }
}
