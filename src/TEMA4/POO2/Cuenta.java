package TEMA4.POO2;

public class Cuenta {
    private String ncuenta;
    private double saldo;
    private double pago;

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

    public double getPago() {
        return pago;
    }

    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }


    public void abono(double cantidad) {
        saldo += cantidad;
    }

    public void recibo(double cantidad) {
        saldo -= cantidad;
    }

    public boolean esMorosa() {
        if (saldo < 0){
            return true;
        }
        return false;
    }

    public void mostrarSaldo(){
        System.out.println(saldo);
    }
}
