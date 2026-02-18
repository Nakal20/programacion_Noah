package TEMA4.POO3.Ejercicio1;

public class Ciclomotores extends Vehiculo {
    private int cilindrada;

    private static final int CILINDRADA_DEFECTO = 75;

    public Ciclomotores(String matricula, String modelo, String marca, String color, int cilindrada) {
        super(matricula, modelo, marca, color);
        this.cilindrada = cilindrada;
    }

    public Ciclomotores() {
        this("1234bbb", "4x4", "kia", "rojo", CILINDRADA_DEFECTO);
    }

    public boolean carnet(int cilindrada){
        boolean carnet;
        if(cilindrada >= 125){
            carnet = true;
        }else {
            carnet = false;
        }
        return carnet;
    }
}
