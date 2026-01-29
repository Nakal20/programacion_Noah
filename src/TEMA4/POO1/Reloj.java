package TEMA4.POO1;

public class Reloj {
    public static final int horaDefecto = 0;
    public static final int minutoDefecto = 0;
    public static final int segundoDefecto = 0;

    private int hora;
    private int hora12 = hora;
    private int minuto;
    private int segundo;

    boolean formato24;

    public Reloj(){
        this.hora = horaDefecto;
        this.minuto = minutoDefecto;
        this.segundo = segundoDefecto;
    }

    public Reloj(int h, int m, int s){
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }

    public boolean isFormato24() {
        return formato24;
    }

    public int getHora(){
        return hora;
    }

    public int getMinuto(){
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        if(formato24) {
            if (hora >= 0 && hora <= 24) {
                this.hora = hora;
            }else{
                this.hora=horaDefecto;
            }
        }else{
            if (hora > 0 && hora <= 12) {
                this.hora = hora;
            } else if (hora == 0) {
                this.hora12 = hora + 12;
            }else{
                this.hora12 = hora - 12;
            }
        }
    }

    public void setMinuto(int minuto) {
        if (minuto>0 && minuto<60)
            this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        if (segundo>0 && segundo<60)
            this.segundo = segundo;
    }

    public String toString(){
        if(formato24) {
            return  String.format(" Son las: " + hora + ":" + minuto + ":" + segundo);
        }
        if(!formato24) {
            if (hora > 0 && hora <= 12){
                return  String.format("Son las: " + hora + ":" + minuto + ":" + segundo + " AM");
            }else{
                return  String.format("Son las: " + hora12 + ":" + minuto + ":" + segundo + " PM");
            }
        }
        return "";
    }
}
