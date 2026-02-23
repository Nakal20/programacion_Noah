package TEMA4.POO3.Ejercicio2;

public class Camaleon extends Animal {

    private String color;

    public Camaleon(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }
    public Camaleon() {
        this("Dani", 12, "verde");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void hacerRuido() {
        System.out.println("silvido");
    }

    public void cambiarDeColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Camaleon{" +
                "color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
