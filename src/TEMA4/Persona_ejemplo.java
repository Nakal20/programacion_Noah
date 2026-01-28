package TEMA4;

public class Persona_ejemplo {
    public String nombre;
    public String getnombre(){
        return nombre ;}
    public int edad;
    public int getedad(){
        return edad ;}
    public static final int edadDefecto = 0;
    public Persona_ejemplo() {
        nombre = "Bielle";
        edad = edadDefecto;
    }
    public Persona_ejemplo(String nombre) {
        this.nombre = nombre;
    }
    public Persona_ejemplo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void saludar() {
         System.out.println("¡Hola!");
    }
    public void  presentarme(){
        System.out.println("soy " + nombre + " y tengo " + edad + " años.");
    }
    public void saludarA(String nombre) {
        System.out.println("¡Hola " + nombre + "!");
    }

    public static void showInfo (){
        System.out.println("Las personas tienen nombre y edad");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}

