package TEMA4.POO2;

public class Cuenta {
    private String ncuenta;
    private double saldo;

    public Cuenta(){
        this.ncuenta = "2";
        this.saldo = 1000;
    }

    public Cuenta(String ncuenta,double saldo){
        this.ncuenta = ncuenta;
        this.saldo = saldo;
    }

    public String getNcuenta() {
        return ncuenta;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void abono(double cantidad) {
        saldo += cantidad;
    }

    public void recibo(double cantidad) {
        saldo -= cantidad;
    }

    public boolean esMorosa() {
        boolean morosa;
        if (saldo < 0){
           morosa = true;
        }else{
            morosa = false;
        }
        return morosa;
    }

    public void mostrarSaldo(){
        System.out.println(saldo);
    }
}
