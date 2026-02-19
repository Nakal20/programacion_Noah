package TEMA4.POO3.Ejercicio3;

public class Triangulo {

    private double base;
    private double altura;

    private final double BASE_DEFECTO = 10;
    private final double ALTURA_DEFECTO = 10;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(){
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
        return 1/2 * this.base * this.altura;
    }
    public double perimetro(){
        return (2 * this.base) + this.altura;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "altura=" + altura +
                ", base=" + base +
                '}';
    }
}
