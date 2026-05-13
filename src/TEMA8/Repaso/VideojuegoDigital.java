package TEMA8.Repaso;

class VideojuegoDigital extends Videojuego {

    private String tiendaOnline;
    private double tamanyoGB;

    public VideojuegoDigital(String titulo, String plataforma, int nota, String tiendaOnline, double tamanyoGB) {

        super(titulo, plataforma, nota);

        this.tiendaOnline = tiendaOnline;
        this.tamanyoGB = tamanyoGB;
    }

    public String getTiendaOnline() {
        return tiendaOnline;
    }

    public void setTiendaOnline(String tiendaOnline) {
        this.tiendaOnline = tiendaOnline;
    }

    public double getTamanyoGB() {
        return tamanyoGB;
    }

    public void setTamanyoGB(double tamanyoGB) {
        this.tamanyoGB = tamanyoGB;
    }

    @Override
    public String getTipo() {
        return "Digital";
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Tienda Online: " + tiendaOnline +
                ", Tamaño: " + tamanyoGB + "GB";
    }
}
