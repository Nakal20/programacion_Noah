package Tema3;


import java.util.Random;
import java.util.Scanner;

public class Combate_modular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//estadisticas jugador1
        int vel1 = 0;
        int ata1 = 0;
        int def1 = 0;
        int vida1 = 0;
        int vidamax1;
        int ataque1 = 0;
//estadisticas jugador2
        int vel2 = 0;
        int ata2 = 0;
        int def2 = 0;
        int vida2 = 0;
        int vidamax2;
        int ataque2 = 0;
//otras estadisticas
        Random random = new Random();
        int decision;
        int elegir;

        System.out.println("----COMBATE----");
        System.out.println("----REGLAS----");
        System.out.println("La suma de los atributos de un jugador no podrá ser superior a 500. Cada uno de los atributos debe tener un valor entre 1 y 200");
        System.out.println(" Jugador 1 ¿Que quieres hacer?");
        System.out.println("1 crear personaje \n" + "2 usar personaje \n");
        elegir = sc.nextInt();

        switch (elegir) {
            case 1:
                do {
                    System.out.println("--jugador1--");
//Elecion de estadisticas
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
                break;
            case 2:
                System.out.println(" Jugador 1 ¿Que personaje quieres?");
                System.out.println("1 GORVAK EL MURALLA \n" + "2 LIRA LA FÉRREA \n" + "3 KAEN EL RELÁMPAGO \n" + "4 SERIS EL EQUILIBRADO \n");
                elegir = sc.nextInt();

                switch (elegir) {
                    case 1:
                        vel1 = 50;
                        def1 = 200;
                        ata1 = 90;
                        vida1 = 160;
                        System.out.println("----------------------------------------------------");
                        System.out.println("velocidad: " + vel1 + "\n" + "ataque: " + ata1 + "\n" + "defensa: " + def1 + "\n" + "vida: " + vida1);
                        break;
                    case 2:
                        vel1 = 90;
                        def1 = 80;
                        ata1 = 200;
                        vida1 = 130;
                        System.out.println("----------------------------------------------------");
                        System.out.println("velocidad: " + vel1 + "\n" + "ataque: " + ata1 + "\n" + "defensa: " + def1 + "\n" + "vida: " + vida1);
                        break;
                    case 3:
                        vel1 = 200;
                        def1 = 70;
                        ata1 = 130;
                        vida1 = 100;
                        System.out.println("----------------------------------------------------");
                        System.out.println("velocidad: " + vel1 + "\n" + "ataque: " + ata1 + "\n" + "defensa: " + def1 + "\n" + "vida: " + vida1);
                        break;
                    case 4:
                        vel1 = 120;
                        def1 = 110;
                        ata1 = 130;
                        vida1 = 140;
                        System.out.println("----------------------------------------------------");
                        System.out.println("velocidad: " + vel1 + "\n" + "ataque: " + ata1 + "\n" + "defensa: " + def1 + "\n" + "vida: " + vida1);
                        break;
                }
                break;
        }

        System.out.println(" Jugador 2 ¿Que quieres hacer?");
        System.out.println("1 crear personaje \n" + "2 usar personaje \n");
        elegir = sc.nextInt();

        switch (elegir) {
            case 1:
                do {
                    System.out.println("----------------------------------------------------");
                    System.out.println("--jugador2--");
//eleguir estadisticas
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
                break;
            case 2:
                System.out.println(" Jugador 2 ¿Que personaje quieres?");
                System.out.println("1 GORVAK EL MURALLA \n" + "2 LIRA LA FÉRREA \n" + "3 KAEN EL RELÁMPAGO \n" + "4 SERIS EL EQUILIBRADO \n");
                elegir = sc.nextInt();
                switch (elegir) {
                    case 1:
                        vel2 = 50;
                        def2 = 200;
                        ata2 = 90;
                        vida2 = 160;
                        System.out.println("----------------------------------------------------");
                        System.out.println("velocidad: " + vel2 + "\n" + "ataque: " + ata2 + "\n" + "defensa: " + def2 + "\n" + "vida: " + vida2);
                        break;
                    case 2:
                        vel2 = 90;
                        def2 = 80;
                        ata2 = 200;
                        vida2 = 130;
                        System.out.println("----------------------------------------------------");
                        System.out.println("velocidad: " + vel2 + "\n" + "ataque: " + ata2 + "\n" + "defensa: " + def2 + "\n" + "vida: " + vida2);
                        break;
                    case 3:
                        vel2 = 200;
                        def2 = 70;
                        ata2 = 130;
                        vida2 = 100;
                        System.out.println("----------------------------------------------------");
                        System.out.println("velocidad: " + vel2 + "\n" + "ataque: " + ata2 + "\n" + "defensa: " + def2 + "\n" + "vida: " + vida2);
                        break;
                    case 4:
                        vel2 = 120;
                        def2 = 110;
                        ata2 = 130;
                        vida2 = 140;
                        System.out.println("----------------------------------------------------");
                        System.out.println("velocidad: " + vel2 + "\n" + "ataque: " + ata2 + "\n" + "defensa: " + def2 + "\n" + "vida: " + vida2);
                        break;
                }
                break;
        }
        vidamax1 = vida1;
        vidamax2 = vida2;

        //combate
        // si jugaror 1 es mas rapido que jugador 2
        if (vel1 > vel2) {
            atacaJugado1(vel1, ata1, def1, vida1, vidamax1, ataque1, vel2, ata2, def2, vida2, vidamax2, ataque2);
        }

        // si jugaror 2 es mas rapido que jugador 1

        if (vel2 > vel1) {
            atacaJugado2(vel1, ata1, def1, vida1, vidamax1, ataque1, vel2, ata2, def2, vida2, vidamax2, ataque2);
        }
        // si los jugadores tienen la misma velocidad
        if (vel1 == vel2) {
            //elige un numero con random para decidir quien va antes
            decision = random.nextInt(2) + 1;

            if (decision == 1) {   // si jugaror 1 es mas rapido que jugador 2
                    atacaJugado1(vel1, ata1, def1, vida1, vidamax1, ataque1, vel2, ata2, def2, vida2, vidamax2, ataque2);
            } else {   // si jugaror 2 es mas rapido que jugador 1
                atacaJugado2(vel1, ata1, def1, vida1, vidamax1, ataque1, vel2, ata2, def2, vida2, vidamax2, ataque2);
            }
        }
    }

    public static void atacaJugado1(  int vel1, int ata1, int def1, int vida1, int vidamax1, int ataque1, int vel2, int ata2, int def2, int vida2, int vidamax2, int ataque2 ){

        int ronda = 0;
        int masataque;
        int esquive;
        int critico;
        int curacion;
        int elegir;

        int totalBarras1;
        int totalBarras2;
        int barras1;
        int barras2;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        while (vida1 > 0 && vida2 > 0) {

            ronda++;
            System.out.println("------Ronda:" + ronda + "------");

            System.out.println(" Jugador 1 ¿Que quieres hacer?");
            System.out.println("1 Atacar \n" + "2 curarse \n");
            elegir = sc.nextInt();

            switch (elegir) {
                //atacar
                case 1: {
                    masataque = random.nextInt(10);
                    critico = random.nextInt(100);
                    esquive = random.nextInt(100);
                    // si vel1/10 es mas alto que esquive, esquivas el ataque asi cuanto mayor sea tu velocidad tienes mayor posibilidad de esquivar
                    if (vel2 / 10 > esquive) {
                        ataque1 = 0;
                        System.out.println("El jugador 1 ataca y hace " + ataque1 + " de daño porque el jugador 2 esquivo el ataque");
                    }
                    if (critico < 20 && vel1 / 10 < esquive) {
                        masataque = random.nextInt(10);

                        critico = ata1 / 4;
                        ataque1 = ata1 - def2 / 2 + masataque;
                        if (ataque1 < 0) {
                            ataque1 = masataque;
                            System.out.println("El jugador 1 ataca y hace " + ataque1 + " de daño + " + critico + " de critico" + "\n");
                            ataque1 = masataque + critico;
                        } else {
                            System.out.println("El jugador 1 ataca y hace " + ataque1 + " de daño + " + critico + " de critico" + "\n");
                        }
                    }
                    if (critico > 20 && vel1 / 10 < esquive) {
                        ataque1 = ata1 - def2 / 2 + masataque;
                        if (ataque1 < 0) {
                            ataque1 = masataque;
                            System.out.println("El jugador 1 ataca y hace " + ataque1 + " de daño" + "\n");
                        } else {
                            System.out.println("El jugador 1 ataca y hace " + ataque1 + " de daño" + "\n");
                        }
                    }

                    vida2 = vida2 - ataque1;
                    if (vida2 < 0) {
                        vida2 = 0;
                        System.out.println("Jugador1 gana");
                    }
                }
                break;
                //curarse
                case 2: {
                    if (vida1 == vidamax1) {
                        System.out.println("No te puedes curar mas de tu vida maxima");
                    } else {
                        curacion = random.nextInt(vidamax1 / 4) + 1;
                        vida1 = vida1 + curacion;
                        System.out.println("El jugador 1 se cura " + curacion + " puntos de vida " + "\n");
                    }
                    if (vida1 > vidamax1) {
                        vida1 = vidamax1;
                    }
                }
                break;
            }

            if (vida2 > 0) {

                System.out.println(" Jugador 2 ¿Que quieres hacer?");
                System.out.println("1 Atacar" + "\n" + "2 curarse" + "\n");
                elegir = sc.nextInt();

                switch (elegir) {

                    case 1:
                        masataque = random.nextInt(10);
                        critico = random.nextInt(100);
                        esquive = random.nextInt();

                        if (vel1 / 10 > esquive) {
                            ataque2 = 0;
                            System.out.println("El jugador 2 ataca y hace " + ataque2 + " de daño porque el jugador 1 esquivo el ataque");
                        }
                        if (critico < 20 && vel2 / 10 < esquive) {
                            critico = ata2 / 4;
                            ataque2 = ata2 - def1 / 2 + masataque;
                            if (ataque2 < 0) {
                                ataque2 = masataque;
                                System.out.println("El jugador 2 ataca y hace " + ataque2 + " de daño + " + critico + " de critico" + "\n");
                                ataque2 = masataque + critico;
                            } else {
                                System.out.println("El jugador 2 ataca y hace " + ataque2 + " de daño + " + critico + " de critico" + "\n");
                            }
                        }
                        if (critico > 20 && vel2 / 10 < esquive) {
                            ataque2 = ata2 - def1 / 2 + masataque;
                            if (ataque2 < 0) {
                                ataque2 = masataque;
                                System.out.println("El jugador 2 ataca y hace " + ataque2 + " de daño" + "\n");
                            } else {
                                System.out.println("El jugador 2 ataca y hace " + ataque2 + " de daño" + "\n");
                            }
                        }

                        vida1 = vida1 - ataque2;
                        if (vida1 < 0) {
                            vida1 = 0;
                            System.out.println("Jugador2 gana");
                        }
                        break;
                    case 2: {
                        if (vida2 == vidamax2) {
                            System.out.println("No te puedes curar mas de tu vida maxima");
                        } else {
                            curacion = random.nextInt(vidamax2 / 4) + 1;
                            vida2 = vida2 + curacion;
                            System.out.println("El jugador 2 se cura " + curacion + " puntos de vida " + "\n");
                        }
                        if (vida2 > vidamax2) {
                            vida2 = vidamax2;
                        }
                    }
                    break;
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

    public static void atacaJugado2(  int vel1, int ata1, int def1, int vida1, int vidamax1, int ataque1, int vel2, int ata2, int def2, int vida2, int vidamax2, int ataque2 ) {

        int ronda = 0;
        int masataque;
        int esquive;
        int critico;
        int curacion;
        int elegir;

        int totalBarras1;
        int totalBarras2;
        int barras1;
        int barras2;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        while (vida2 > 0 && vida1 > 0) {

            ronda++;
            System.out.println("------Ronda:" + ronda + "------");

            System.out.println(" Jugador 2 ¿Que quieres hacer?");
            System.out.println("1 Atacar" + "\n" + "2 curarse" + "\n");
            elegir = sc.nextInt();

            switch (elegir) {

                case 1:
                    masataque = random.nextInt(10);
                    critico = random.nextInt(100);
                    esquive = random.nextInt();

                    if (vel1 / 10 > esquive) {
                        ataque2 = 0;
                        System.out.println("El jugador 2 ataca y hace " + ataque2 + " de daño porque el jugador 1 esquivo el ataque");
                    }
                    if (critico < 20 && vel2 / 10 < esquive) {
                        critico = ata2 / 4;
                        ataque2 = ata2 - def1 / 2 + masataque;
                        if (ataque2 < 0) {
                            ataque2 = masataque;
                            System.out.println("El jugador 2 ataca y hace " + ataque2 + " de daño + " + critico + " de critico" + "\n");
                            ataque2 = masataque + critico;
                        } else {
                            System.out.println("El jugador 2 ataca y hace " + ataque2 + " de daño + " + critico + " de critico" + "\n");
                        }
                    }
                    if (critico > 20 && vel2 / 10 < esquive) {
                        ataque2 = ata2 - def1 / 2 + masataque;
                        if (ataque2 < 0) {
                            ataque2 = masataque;
                            System.out.println("El jugador 2 ataca y hace " + ataque2 + " de daño" + "\n");
                        } else {
                            System.out.println("El jugador 2 ataca y hace " + ataque2 + " de daño" + "\n");
                        }
                    }

                    vida1 = vida1 - ataque2;
                    if (vida1 < 0) {
                        vida1 = 0;
                        System.out.println("Jugador2 gana");
                    }
                    break;
                case 2: {
                    if (vida2 == vidamax2) {
                        System.out.println("No te puedes curar mas de tu vida maxima");
                    } else {
                        curacion = random.nextInt(vidamax2 / 4) + 1;
                        vida2 = vida2 + curacion;
                        System.out.println("El jugador 2 se cura " + curacion + " puntos de vida " + "\n");
                    }
                    if (vida2 > vidamax2) {
                        vida2 = vidamax2;
                    }
                }
                break;
            }

            if (vida1 > 0) {
                System.out.println(" Jugador 1 ¿Que quieres hacer?");
                System.out.println("1 Atacar \n" + "2 curarse \n");
                elegir = sc.nextInt();

                switch (elegir) {
                    //atacar
                    case 1: {
                        masataque = random.nextInt(10);
                        critico = random.nextInt(100);
                        esquive = random.nextInt(100);
                        // si vel1/10 es mas alto que esquive, esquivas el ataque asi cuanto mayor sea tu velocidad tienes mayor posibilidad de esquivar
                        if (vel2 / 10 > esquive) {
                            ataque1 = 0;
                            System.out.println("El jugador 1 ataca y hace " + ataque1 + " de daño porque el jugador 2 esquivo el ataque");
                        }
                        if (critico < 20 && vel1 / 10 < esquive) {
                            masataque = random.nextInt(10);

                            critico = ata1 / 4;
                            ataque1 = ata1 - def2 / 2 + masataque;
                            if (ataque1 < 0) {
                                ataque1 = masataque;
                                System.out.println("El jugador 1 ataca y hace " + ataque1 + " de daño + " + critico + " de critico" + "\n");
                                ataque1 = masataque + critico;
                            } else {
                                System.out.println("El jugador 1 ataca y hace " + ataque1 + " de daño + " + critico + " de critico" + "\n");
                            }
                        }
                        if (critico > 20 && vel1 / 10 < esquive) {
                            ataque1 = ata1 - def2 / 2 + masataque;
                            if (ataque1 < 0) {
                                ataque1 = masataque;
                                System.out.println("El jugador 1 ataca y hace " + ataque1 + " de daño" + "\n");
                            } else {
                                System.out.println("El jugador 1 ataca y hace " + ataque1 + " de daño" + "\n");
                            }
                        }

                        vida2 = vida2 - ataque1;
                        if (vida2 < 0) {
                            vida2 = 0;
                            System.out.println("Jugador1 gana");
                        }
                    }
                    break;
                    //curarse
                    case 2: {
                        if (vida1 == vidamax1) {
                            System.out.println("No te puedes curar mas de tu vida maxima");
                        } else {
                            curacion = random.nextInt(vidamax1 / 4) + 1;
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