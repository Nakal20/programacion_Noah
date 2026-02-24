package Tema5.Coleciones2.Ejercicio1;

public abstract class Avistamientos {

    protected int hora;

    public Avistamientos() {
    }

    public Avistamientos(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora >= 0 || hora <= 23){
            this.hora = hora;
        }else {
            this.hora = 10;
        }

    }

    @Override
    public String toString() {
        return "Hora: " + hora;
    }
}
