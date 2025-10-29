package TEMA2;


import java.util.Random;
import java.util.Scanner;

public class Tema2ejercicio_combate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----COMBATE----");
        System.out.println("----REGLAS----");
        System.out.println("La suma de los atributos de un jugador no podrá ser superior a 500. Cada uno de los atributos debe tener un valor entre 1 y 200");
//estadisticas jugador1
        int vel1;
        int ata1;
        int def1;
        int vida1;
        int vidamax1;
        int ataque1;
//estadisticas jugador2
        int vel2;
        int ata2;
        int def2;
        int vida2;
        int vidamax2;
        int ataque2;

        Random random = new Random();
        int masataque;
        int ronda = 0;
        int decision;
        boolean esquive;
        int critico;
        int curacion;
        int elegir;

//para poder crear la barra de vida
        int totalBarras1;
        int totalBarras2;
        int barras1;
        int barras2;

        //Elecion de estadisticas
        do {
            System.out.println("--jugador1--");

            System.out.print("Introduce la velocidad del jugador1: ");
            vel1 = sc.nextInt();
            while (vel1 > 200 || vel1 < 1) {
                System.out.println("la velocidad es inconrecta, vuelve a introducir el valor");
                System.out.print("Introduce la velocidad del jugador1: ");
                vel1 = sc.nextInt();
            }

            System.out.print("Introduce el ataque del jugador1: ");
            ata1 = sc.nextInt();
            while (ata1 > 200 || ata1 < 1) {
                System.out.println("El ataque es inconrecta, vuelve a introducir el valor");
                System.out.print("Introduce el ataque del jugador1: ");
                ata1 = sc.nextInt();
            }

            System.out.print("Introduce la defensa del jugador1: ");
            def1 = sc.nextInt();
            while (def1 > 200 || def1 < 1) {
                System.out.println("La defensa es inconrecta, vuelve a introducir el valor");
                System.out.print("Introduce la defensa del jugador1: ");
                def1 = sc.nextInt();
            }

            System.out.print("Introduce la vida del jugador1: ");
            vida1 = sc.nextInt();
            while (vida1 > 200 || vida1 < 1) {
                System.out.println("La vida es inconrecta, vuelve a introducir el valor");
                vida1 = sc.nextInt();
            }

            System.out.println("----------------------------------------------------");
            System.out.println("velocidad: " + vel1 + "\n" + "ataque: " + ata1 + "\n" + "defensa: " + def1 + "\n" + "vida: " + vida1);

            if (vel1 + ata1 + def1 + vida1 > 500) {
                System.out.println("te has pasado de 500 vuelve ha poner los valores");
            }
        } while (vel1 + ata1 + def1 + vida1 > 500);

        do {
            System.out.println("----------------------------------------------------");
            System.out.println("--jugador2--");

            System.out.print("Introduce la velocidad del jugador2: ");
            vel2 = sc.nextInt();
            while (vel2 > 200 || vel2 < 1) {
                System.out.println("la velocidad es inconrecta, vuelve a introducir el valor");
                System.out.print("Introduce la velocidad del jugador2: ");
                vel2 = sc.nextInt();
            }

            System.out.print("Introduce el ataque del jugador2: ");
            ata2 = sc.nextInt();
            while (ata2 > 200 || ata2 < 1) {
                System.out.println("El ataque es inconrecta, vuelve a introducir el valor");
                System.out.print("Introduce el ataque del jugador2: ");
                ata2 = sc.nextInt();
            }

            System.out.print("Introduce la defensa del jugador2: ");
            def2 = sc.nextInt();
            while (def2 > 200 || def2 < 1) {
                System.out.println("La defensa es inconrecta, vuelve a introducir el valor");
                System.out.print("Introduce la defensa del jugador2: ");
                def2 = sc.nextInt();
            }

            System.out.print("Introduce la vida del jugador2: ");
            vida2 = sc.nextInt();
            while (vida2 > 200 || vida2 < 1) {
                System.out.println("La vida es inconrecta, vuelve a introducir el valor");
                System.out.print("Introduce la vida del jugador2: ");
                vida2 = sc.nextInt();
            }

            System.out.println("----------------------------------------------------");
            System.out.println("velocidad: " + vel2 + "\n" + "ataque: " + ata2 + "\n" + "defensa: " + def2 + "\n" + "vida: " + vida2);

            if (vel2 + ata2 + def2 + vida2 > 500) {
                System.out.println("te has pasado de 500 vuelve ha poner los valores");
            }
        } while (vel2 + ata2 + def2 + vida2 > 500);
        vidamax1 = vida1;
        vidamax2 = vida2;

        //combate
        // si jugaror 1 es mas rapido que jugador 2
        if (vel1 > vel2) {
            while (vida1 > 0 && vida2 > 0) {

                ronda++;
                System.out.println("------Ronda:" + ronda + "------");

                if (vida1 > 0) {

                    System.out.println(" Jugador 1 ¿Que quieres hacer?");
                    System.out.println("1 Atacar" + "\n" + "2 curarse" + "\n");
                    elegir = sc.nextInt();

                    switch (elegir) {

                        case 1: {
                            masataque = random.nextInt(10);
                            critico = random.nextInt(100);
                            if (critico < 20) {
                                critico = ata1 / 4;
                                ataque1 = ata1 - def2 + masataque;
                                if (ataque1 < 0) {
                                    ataque1 = masataque;
                                    System.out.println("El jugador 1 ataca y hace " + ataque1 + " de daño + " + critico + " de critico" + "\n");
                                    ataque1 = masataque + critico;
                                }
                            } else {
                                ataque1 = ata1 - def2 + masataque;
                                if (ataque1 < 0) {
                                    ataque1 = masataque;
                                    System.out.println("El jugador 1 ataca y hace " + ataque1 + " de daño" + "\n");
                                }
                            }

                            vida2 = vida2 - ataque1;
                            if (vida2 < 0) {
                                vida2 = 0;
                            }
                        }
                        break;
                        case 2: {
                            if (vida1 == vidamax1) {
                                System.out.println("No te puedes curar mas de tu vida maxima");
                            } else {
                                curacion = vida1 / 4;
                                vida1 = vida1 + curacion;
                                System.out.println("El jugador 1 se cura " + curacion + " puntos de vida " + "\n");
                            }
                            if (vida1 > vidamax1) {
                                vida1 = vidamax1;
                            }
                        }
                        break;
                    }
                }

                if (vida2 > 0) {

                    System.out.println(" Jugador 2 ¿Que quieres hacer?");
                    System.out.println("1 Atacar" + "\n" + "2 curarse" + "\n");
                    elegir = sc.nextInt();

                    switch (elegir) {

                        case 1: {
                            masataque = random.nextInt(10);
                            critico = random.nextInt(100);
                            if (critico < 20) {
                                critico = ata2 / 4;
                                ataque2 = ata2 - def1 + masataque;
                                if (ataque2 < 0) {
                                    ataque2 = masataque;
                                    System.out.println("El jugador 2 ataca y hace " + ataque2 + " de daño + " + critico + " de critico" + "\n");
                                    ataque2 = masataque + critico;
                                }
                            } else {
                                ataque2 = ata1 - def2 + masataque;
                                if (ataque2 < 0) {
                                    ataque2 = masataque;
                                    System.out.println("El jugador 2 ataca y hace " + ataque2 + " de daño" + "\n");
                                }
                            }

                            vida1 = vida1 - ataque2;
                            if (vida1 < 0) {
                                vida1 = 0;
                            }
                        }break;
                        case 2: {
                            if (vida1 == vidamax1) {
                                System.out.println("No te puedes curar mas de tu vida maxima");
                            } else {
                                curacion = vida2 / 4;
                                vida2 = vida2 + curacion;
                                System.out.println("El jugador 2 se cura " + curacion + " puntos de vida " + "\n");
                            }
                            if (vida2 > vidamax2) {
                                vida2 = vidamax2;
                            }
                        }break;
                    }
                }

                if (vida1 >= 0 || vida2 >= 0) {
                    totalBarras1 = vidamax1 / 10;
                    totalBarras2 = vidamax2 / 10;
                    barras1 = vida1 / 10;
                    barras2 = vida2 / 10;

                    String barra1 = "";
                    String barra2 = "";

                    for (int i = 0; i < barras1; i++) barra1 += "/";
                    for (int i = barras1; i < totalBarras1; i++) barra1 += " ";

                    for (int i = 0; i < barras2; i++) barra2 += "/";
                    for (int i = barras2; i < totalBarras2; i++) barra2 += " ";

                    System.out.println("Jugador 1 [" + barra1 + "] " + vida1 + "/" + vidamax1);
                    System.out.println("Jugador 2 [" + barra2 + "] " + vida2 + "/" + vidamax2);
                    System.out.println("--------------------------------------------\n");

                } else {
                    vida1 = 0;
                    vida2 = 0;
                    System.out.println("Jugador 1 [] " + vida1 + "/" + vidamax1);
                    System.out.println("Jugador 2 [] " + vida2 + "/" + vidamax2);
                    System.out.println("--------------------------------------------\n");
                }
            }
        }

        // si jugaror 2 es mas rapido que jugador 1

        if (vel2 > vel1) {
            while (vida2 > 0 && vida1 > 0) {

                ronda++;
                System.out.println("------Ronda:" + ronda + "------");

                if (vida2 > 0) {
                    masataque = random.nextInt(10);
                    critico = random.nextInt(100);
                    if (critico < 20) {
                        critico = ata2 / 4;
                        ataque2 = ata2 - def1 + masataque;
                        System.out.println("El jugador 2 ataca y hace " + ataque2 + " de daño + " + critico + " de critico" + "\n");
                        ataque2 = ata2 - def1 + masataque + critico;
                    } else {
                        ataque2 = ata2 - def1 + masataque;
                        System.out.println("El jugador 2 ataca y hace " + ataque2 + " de daño" + "\n");
                    }

                    vida1 = vida1 - ataque2;
                    if (vida1 < 0) {
                        vida1 = 0;
                    }
                }

                if (vida1 > 0) {
                    masataque = random.nextInt(10);
                    critico = random.nextInt(100);
                    if (critico < 20) {
                        critico = ata1 / 4;
                        ataque1 = ata1 - def2 + masataque;
                        System.out.println("El jugador 1 ataca y hace " + ataque1 + " de daño + " + critico + " de critico" + "\n");
                        ataque1 = ata1 - def2 + masataque + critico;
                    } else {
                        ataque1 = ata1 - def2 + masataque;
                        System.out.println("El jugador 1 ataca y hace " + ataque1 + " de daño " + "\n");
                    }

                    vida2 = vida2 - ataque1;
                    if (vida2 < 0) {
                        vida2 = 0;
                    }
                }

                if (vida2 >= 0 || vida1 >= 0) {
                    totalBarras1 = vidamax1 / 10;
                    totalBarras2 = vidamax2 / 10;
                    barras1 = vida1 / 10;
                    barras2 = vida2 / 10;

                    String barra1 = "";
                    String barra2 = "";

                    for (int i = 0; i < barras1; i++) barra1 += "/";
                    for (int i = barras1; i < totalBarras1; i++) barra1 += " ";

                    for (int i = 0; i < barras2; i++) barra2 += "/";
                    for (int i = barras2; i < totalBarras2; i++) barra2 += " ";

                    System.out.println("Jugador 1 [" + barra1 + "] " + vida1 + "/" + vidamax1);
                    System.out.println("Jugador 2 [" + barra2 + "] " + vida2 + "/" + vidamax2);
                    System.out.println("--------------------------------------------\n");

                } else {
                    vida1 = 0;
                    vida2 = 0;
                    System.out.println("Jugador 1 [] " + vida1 + "/" + vidamax1);
                    System.out.println("Jugador 2 [] " + vida2 + "/" + vidamax2);
                    System.out.println("--------------------------------------------\n");
                }
            }
        }
        // si los jugadores tienen la misma velocidad
        if (vel1 == vel2) {
            //elige un numero con random para decidir quien va antes
            decision = random.nextInt(2) + 1;

            if (decision == 1) {
                while (vida1 > 0 && vida2 > 0) {

                    ronda++;
                    System.out.println("------Ronda:" + ronda + "------");

                    if (vida1 > 0) {
                        masataque = random.nextInt(10);
                        ataque1 = ata1 - def2 + masataque;
                        vida2 = vida2 - ataque1;
                        if (vida2 < 0) {
                            vida2 = 0;
                        }
                    } else {
                        ataque1 = 0;
                    }

                    System.out.println("El jugador 1 ataca y hace " + ataque1 + " de daño" + "\n");


                    if (vida2 > 0) {
                        masataque = random.nextInt(10);
                        ataque2 = ata1 - def2 + masataque;
                        vida1 = vida1 - ataque2;
                        if (vida1 < 0) {
                            vida1 = 0;
                        }
                    } else {
                        ataque2 = 0;
                    }

                    System.out.println("El jugador 2 ataca y hace " + ataque2 + " de daño" + "\n");

                    if (vida1 >= 0 || vida2 >= 0) {
                        totalBarras1 = vidamax1 / 10;
                        totalBarras2 = vidamax2 / 10;
                        barras1 = vida1 / 10;
                        barras2 = vida2 / 10;

                        String barra1 = "";
                        String barra2 = "";

                        for (int i = 0; i < barras1; i++) barra1 += "/";
                        for (int i = barras1; i < totalBarras1; i++) barra1 += " ";

                        for (int i = 0; i < barras2; i++) barra2 += "/";
                        for (int i = barras2; i < totalBarras2; i++) barra2 += " ";

                        System.out.println("Jugador 1 [" + barra1 + "] " + vida1 + "/" + vidamax1);
                        System.out.println("Jugador 2 [" + barra2 + "] " + vida2 + "/" + vidamax2);
                        System.out.println("--------------------------------------------\n");

                    } else {
                        vida1 = 0;
                        vida2 = 0;
                        System.out.println("Jugador 1 [] " + vida1 + "/" + vidamax1);
                        System.out.println("Jugador 2 [] " + vida2 + "/" + vidamax2);
                        System.out.println("--------------------------------------------\n");
                    }
                }
            } else {

                // si jugaror 2 es mas rapido que jugador 1

                while (vida2 > 0 && vida1 > 0) {

                    ronda++;
                    System.out.println("------Ronda:" + ronda + "------");

                    if (vida2 > 0) {
                        masataque = random.nextInt(10);
                        ataque2 = ata1 - def2 + masataque;
                        vida1 = vida1 - ataque2;
                        if (vida1 < 0) {
                            vida1 = 0;
                        }
                    } else {
                        ataque2 = 0;
                    }

                    System.out.println("El jugador 2 ataca y hace " + ataque2 + " de daño" + "\n");

                    if (vida1 > 0) {
                        masataque = random.nextInt(10);
                        ataque1 = ata1 - def2 + masataque;
                        vida2 = vida2 - ataque1;
                        if (vida2 < 0) {
                            vida2 = 0;
                        }
                    } else {
                        ataque1 = 0;
                    }

                    System.out.println("El jugador 1 ataca y hace " + ataque1 + " de daño" + "\n");

                    if (vida2 >= 0 || vida1 >= 0) {
                        totalBarras1 = vidamax1 / 10;
                        totalBarras2 = vidamax2 / 10;
                        barras1 = vida1 / 10;
                        barras2 = vida2 / 10;

                        String barra1 = "";
                        String barra2 = "";

                        for (int i = 0; i < barras1; i++) barra1 += "/";
                        for (int i = barras1; i < totalBarras1; i++) barra1 += " ";

                        for (int i = 0; i < barras2; i++) barra2 += "/";
                        for (int i = barras2; i < totalBarras2; i++) barra2 += " ";

                        System.out.println("Jugador 1 [" + barra1 + "] " + vida1 + "/" + vidamax1);
                        System.out.println("Jugador 2 [" + barra2 + "] " + vida2 + "/" + vidamax2);
                        System.out.println("--------------------------------------------\n");

                    } else {
                        vida1 = 0;
                        vida2 = 0;
                        System.out.println("Jugador 1 [] " + vida1 + "/" + vidamax1);
                        System.out.println("Jugador 2 [] " + vida2 + "/" + vidamax2);
                        System.out.println("--------------------------------------------\n");
                    }
                }
            }
        }
    }
}
