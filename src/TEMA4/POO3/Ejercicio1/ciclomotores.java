package TEMA4.POO3.Ejercicio1;

public class ciclomotores extends vehiculo {
    private int cilindrada;

    public ciclomotores(String matricula, String modelo, String marca, String color, int cilindrada) {
        super(matricula, modelo, marca, color);
        this.cilindrada = cilindrada;
    }
    public boolean carnet(int cilindrada){
        boolean carnet = false;
        if(cilindrada >= 120){
            boolean carnet2 = true;
        }else {
            carnet = false;
        }
        return carnet;
    }
}
