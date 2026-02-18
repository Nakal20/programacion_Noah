package TEMA4.POO3.Ejercicio2;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    public Perro() {
        this("Dani", 12, "Pastor aleman");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau");
    }
}
