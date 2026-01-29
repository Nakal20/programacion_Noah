package TEMA4.POO2;

public class Persona {
    private String DNI;
    private Cuenta[] cuentas;
    private int contadorCuentas;

    public Persona(){
        this.DNI = "12345678K";
        this.cuentas = new Cuenta[3];
        this.contadorCuentas = 0;
    }

    public Persona(String DNI){
        this.DNI = DNI;
        this.cuentas = new Cuenta[3];
        this.contadorCuentas = 0;
    }

    public String getDNI(){
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public boolean crearCuenta(String ncuenta, double saldo) {
        if (contadorCuentas < 3) {
            cuentas[contadorCuentas++] = new Cuenta(ncuenta, saldo);
            return true;
        }
        return false;
    }

    public boolean abono(String ncuenta, double pago) {
        for (int i = 0; i < contadorCuentas; i++) {
            if (cuentas[i].getNcuenta().equals(ncuenta)) {
                cuentas[i].abono(pago);
                return true;
            }
        }
        return false;
    }

    public boolean recibo(String ncuenta, double cantidad) {
        for (int i = 0; i < contadorCuentas; i++) {
            if (cuentas[i].getNcuenta().equals(ncuenta)) {
                cuentas[i].recibo(cantidad);
                return true;
            }
        }
        return false;
    }

    public void mostrarDatos() {
        System.out.println("DNI: " + DNI);
        for (int i = 0; i < contadorCuentas; i++) {
            System.out.println("Cuenta: " + cuentas[i].getNcuenta()
                    + " | Saldo: " + cuentas[i].getSaldo());
        }
    }

    public boolean esMorosa() {
        for (int i = 0; i < contadorCuentas; i++) {
            if (cuentas[i].getSaldo() < 0) {
                return true;
            }
        }
        return false;
    }
}
