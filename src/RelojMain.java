package TEMA4;

public class RelojMain {
    public static void main(String[] args) {
        Reloj reloj = new Reloj( );
        reloj.formato24 = true;
        reloj.setHora(16);
        reloj.setMinuto(20);
        reloj.setSegundo(40);
        System.out.println(reloj);
    }
}
