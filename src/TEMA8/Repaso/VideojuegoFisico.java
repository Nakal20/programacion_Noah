package TEMA8.Repaso;

class VideojuegoFisico extends Videojuego {

    private String tiendaCompra;
    private String estado;

    public VideojuegoFisico(String titulo, String plataforma, int nota, String tiendaCompra, String estado) {

        super(titulo, plataforma, nota);

        this.tiendaCompra = tiendaCompra;
        this.estado = estado;
    }

    public String getTiendaCompra() {
        return tiendaCompra;
    }

    public void setTiendaCompra(String tiendaCompra) {
        this.tiendaCompra = tiendaCompra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String getTipo() {
        return "Fisico";
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Tienda: " + tiendaCompra +
                ", Estado: " + estado;
    }
}