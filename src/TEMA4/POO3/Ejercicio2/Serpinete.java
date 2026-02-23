package TEMA4.POO3.Ejercicio2;

public class Serpinete extends Animal {

    private boolean mudar_piel;

    public Serpinete(String nombre, int edad, boolean mudar_piel) {
        super(nombre, edad);
        this.mudar_piel = mudar_piel;
    }
    public Serpinete() {
        this("Dani", 12, true);
    }

    public boolean isMudar_piel() {
        return mudar_piel;
    }

    public void setMudar_piel(boolean mudar_piel) {
        this.mudar_piel = mudar_piel;
    }

    @Override
    public void hacerRuido() {
        System.out.println("ssssh");
    }

    public void morder(){
        System.out.println(nombre + " te a mordido");
    }

    @Override
    public String toString() {
        return "Serpinete{" +
                "mudar_piel=" + mudar_piel +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
