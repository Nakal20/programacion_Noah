package Tema4.POO3.Ejercicio3;

public class Circulo extends Figura2D{
    private double radio;

    private final double RADIO_DEFECTO = 10;

    public Circulo(double radio){
        this.radio = radio;
    }

    public Circulo(){
        this.radio = RADIO_DEFECTO;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area(){
        return Math.PI * this.radio * this.radio;
    }
    public double perimetro(){
        return 2 * Math.PI * this.radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
