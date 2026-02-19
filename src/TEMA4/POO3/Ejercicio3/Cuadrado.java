package TEMA4.POO3.Ejercicio3;

public class Cuadrado extends Figura2D{

    private double base;
    private double altura;

    private final double BASE_DEFECTO = 10;
    private final double ALTURA_DEFECTO = 10;

    public Cuadrado(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public Cuadrado(){
        this.base = BASE_DEFECTO;
        this.altura = ALTURA_DEFECTO;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area(){
        return this.base * this.altura;
    }
    public double perimetro(){
        return this.base * this.altura * 2;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "altura=" + altura +
                ", base=" + base +
                '}';
    }
}
