package TEMA5.Ejercicio2;

public class Usuario {
    private String nombre;
    private int edad;

    public  Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Usuario() {
        this.nombre = "Paco";
        this.edad = 40;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {
        return  "nombre=" + nombre + "\n edad=" + edad;
    }
}
