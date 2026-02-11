package Tema5.Excepciones;

public class Gato {
    private String nombre;
    private int edad;


    public Gato(){
        this.nombre = "Pelusa";
        this.edad = 12;
    }

    public Gato(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception("El nombre debe tener al menos 3 caracteres.");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if(edad < 0){
            throw new Exception("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
    public String toString() {
        return "\n Nombre: " + nombre + "\n Edad: " + edad;
    }
}
