package TEMA4.POO2;

public class Cuenta {
    private String ncuenta;
    private double saldo;
    private double pago;

    public Cuenta(){
        this.ncuenta = "1234567890123456";
        this.saldo = 1000;
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

    public void abono(){
        System.out.println(saldo);
        System.out.println(pago);
        this.saldo = saldo + pago;
        System.out.println(saldo);
    }

    public void mostrarSaldo(){
        System.out.println(saldo);
    }
}
