package Tema6;

public class Funko {
    private String cod;
    private String nombre;
    private String modelo;
    private double precio;
    private int anio;

    public Funko(String cod, String nombre, String modelo, double precio, int anio) {
        this.cod = cod;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.anio = anio;
    }

    public String getCod() { return cod; }
    public String getNombre() { return nombre; }
    public String getModelo() { return modelo; }
    public double getPrecio() { return precio; }
    public int getAnio() { return anio; }

    public String toCSV() {
        return cod + "," + nombre + "," + modelo + "," + precio + "," + anio + "-01-01";
    }

    @Override
    public String toString() {
        return "Funko{" +
                "cod='" + cod + '\'' +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", anio=" + anio +
                '}';
    }
}