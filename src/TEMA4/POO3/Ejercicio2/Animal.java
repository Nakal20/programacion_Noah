package TEMA4.POO3.Ejercicio2;

public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer(){
        System.out.println("Comiendo...");
    }
    public void dormir(){
        System.out.println("Durmiendo...");
    }
    public void hacerRuido(){
        System.out.println("ruido");
    }
}
