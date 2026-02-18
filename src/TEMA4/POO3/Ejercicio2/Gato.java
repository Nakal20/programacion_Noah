package TEMA4.POO3.Ejercicio2;

public class Gato extends Animal {

    private int vidas;

    public Gato(String nombre, int edad, int vidas) {
        super(nombre, edad);
        this.vidas = 7;
    }
    public Gato() {
        this("Dani", 12, 6);
    }
    @Override
    public void hacerRuido() {
        System.out.println("miau");
    }
}
