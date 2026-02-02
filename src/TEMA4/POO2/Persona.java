package TEMA4.POO2;

public class Persona {
    private String DNI;
    private Cuenta[] cuentas;
    private int contadorCuentas;

    public String toString(){
        String resul="";
        resul = resul + "\n DNI: " + DNI;
        for(int i=0; i<cuentas.length; i++){
            resul = resul + cuentas[i].toString();
        }
        return resul;
    }

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
        boolean cuentaExiste = false;
        if (contadorCuentas < 3) {
            cuentas[contadorCuentas] = new Cuenta(ncuenta, saldo);
            contadorCuentas++;
            cuentaExiste = true;
        }
        return cuentaExiste;
    }

    public boolean abono(String ncuenta, double pago) {
        boolean abono = false;
        for (int i = 0; i < contadorCuentas; i++) {
            if (cuentas[i].getNcuenta().equals(ncuenta)) {
                cuentas[i].abono(pago);
                abono = true;
            }
        }
        return abono;
    }

    public boolean recibo(String ncuenta, double cantidad) {
        boolean recibo = false;
        for (int i = 0; i < contadorCuentas; i++) {
            if (cuentas[i].getNcuenta().equals(ncuenta)) {
                cuentas[i].recibo(cantidad);
                recibo = true;
            }
        }
        return recibo;
    }

    public void mostrarDatos() {
        System.out.println("DNI: " + DNI);
        for (int i = 0; i < contadorCuentas; i++) {
            System.out.println("Cuenta: " + cuentas[i].getNcuenta()
                    + " | Saldo: " + cuentas[i].getSaldo());
        }
    }

    public boolean esMorosa() {
        boolean esMorosa = false;
        for (int i = 0; i < contadorCuentas; i++) {
            if (cuentas[i].getSaldo() < 0) {
                esMorosa = true;
            }
        }
        return esMorosa;
    }
}
