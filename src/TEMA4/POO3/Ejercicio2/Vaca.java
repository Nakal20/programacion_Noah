package TEMA4.POO3.Ejercicio2;

public class Vaca extends Animal {
    private boolean cuernos;

    public Vaca(String nombre, int edad, boolean cuernos) {
        super(nombre, edad);
        this.cuernos = cuernos;
    }
    public Vaca() {
        this("Dani", 12, true);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Muuu");
    }
}
