package Tema4.POO3.Ejercicio7.Ejercicio8;

import Tema4.POO3.Ejercicio7.Ataque;

public class AtaqueEspadazoEncantado extends Ataque {
    private int mana;
    private int resistencia;
    private int danyo;

    private final int MANA_DEFECTO = 100;
    private final int RESISTENCIA_DEFECTO = 100;
    private final int DANYO_DEFECTO = 76;

    public AtaqueEspadazoEncantado(int mana,int resistencia, int danyo) {
        this.mana = mana;
        this.resistencia = resistencia;
        this.danyo = danyo;
    }

    public AtaqueEspadazoEncantado(){
        this.mana = MANA_DEFECTO;
        this.resistencia = RESISTENCIA_DEFECTO;
        this.danyo = DANYO_DEFECTO;
    }

    @Override
    public void lanzar() {
        System.out.println("ataque fisico y magico...");
    }

    @Override
    public int coste() {
        System.out.println("Cuesta 10 de cada");
        return mana - 10 + resistencia - 10;
    }

    @Override
    public int danyoInfligido() {
        return danyo;
    }
}
