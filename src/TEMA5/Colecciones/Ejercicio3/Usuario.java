package TEMA5.Colecciones.Ejercicio3;

public class Usuario {
    private String nombre;
    private int edad;
    private String DNI;

    public  Usuario(String nombre, int edad, String DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }
    public Usuario() {
        this.nombre = "Paco";
        this.edad = 40;
        this.DNI = "1234A";
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String toString() {
        return  "nombre=" + nombre + "\n edad=" + edad + "\n DNI=" + DNI;
    }
}
