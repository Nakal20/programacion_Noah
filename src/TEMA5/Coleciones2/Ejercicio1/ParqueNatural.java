package Tema5.Coleciones2.Ejercicio1;

import java.util.ArrayList;

public class ParqueNatural {

    private ArrayList<Avistamientos> lista;

    public ParqueNatural() {
        lista = new ArrayList<>();
    }

    public void anyadirAvistamiento(Avistamientos a) {
        lista.add(a);
    }

    public void mostrarDesdeLas8() {
        for (Avistamientos a : lista) {
            if (a.getHora() >= 8) {
                System.out.println(a);
            }
        }
    }

    public void mostrarNocturnos() {
        for (Avistamientos a : lista) {
            if (a.getHora() >= 20 || a.getHora() < 8) {
                System.out.println(a);
            }
        }
    }

    public void mostrarManadas() {
        for (Avistamientos a : lista) {
            if (a instanceof ManadaLobos) {
                System.out.println(a);
            }
        }
    }

    public void mostrarSerpientes() {
        for (Avistamientos a : lista) {
            if (a instanceof Serpiente) {
                System.out.println(a);
            }
        }
    }

    public void mostrarPajaros() {
        for (Avistamientos a : lista) {
            if (a instanceof Pajaro) {
                System.out.println(a);
            }
        }
    }
}
