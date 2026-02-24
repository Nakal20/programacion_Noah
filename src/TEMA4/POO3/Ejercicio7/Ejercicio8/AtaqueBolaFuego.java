package Tema4.POO3.Ejercicio7.Ejercicio8;

import Tema4.POO3.Ejercicio7.Ataque;

public class AtaqueBolaFuego extends Ataque {
    private int mana;
    private int danyo;

    private final int MANA_DEFECTO = 100;
    private final int DANYO_DEFECTO = 40;

    public AtaqueBolaFuego(int mana, int danyo) {
        this.mana = mana;
        this.danyo = danyo;
    }

    public AtaqueBolaFuego(){
        this.mana = MANA_DEFECTO;
        this.danyo = DANYO_DEFECTO;
    }

    @Override
    public void lanzar() {
        System.out.println("ataque mágico...");
    }

    @Override
    public int coste() {
        return mana - 10;
    }

    @Override
    public int danyoInfligido() {
        return danyo;
    }
}
