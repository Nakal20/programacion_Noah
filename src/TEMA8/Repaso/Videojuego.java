package TEMA8.Repaso;

import java.io.Serializable;

abstract class Videojuego implements Serializable {

    protected String titulo;
    protected String plataforma;
    protected int nota;

    public Videojuego(String titulo, String plataforma, int nota) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return "Titulo: " + titulo +
                ", Plataforma: " + plataforma +
                ", Nota: " + nota +
                ", Tipo: " + getTipo();
    }
}

