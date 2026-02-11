package Tema5.Excepciones;

import java.util.InputMismatchException;

public class Ejercicio6 {
        public static void main(String[] args) {

            try {
                Gato g1 = new Gato("Misu", 3);
                g1.imprimir();

                Gato g2 = new Gato();
                g2.setNombre("Ma");
                g2.imprimir();

                Gato g3 = new Gato();
                g3.setEdad(-2);
                g3.imprimir();

            }catch (InputMismatchException ex) {
                System.err.println("Error: " + ex.getMessage());
            }catch (Exception ex) {
                System.err.println("Error: " + ex.getMessage());
            }
        }
}
