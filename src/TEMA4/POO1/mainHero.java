package TEMA4.POO1;

import java.util.Scanner;

public class mainHero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elegir;

        System.out.println("Héroe 1");
        Hero hero1 = new Hero();
        System.out.println("introduce el nombre: ");
        hero1.setName(sc.next());
        System.out.println("introduce el nivel: ");
        hero1.setLevel(sc.nextInt());
        System.out.println("introduce la vida: ");
        hero1.setMaxHealth(sc.nextInt());
        hero1.setHealth(hero1.getMaxHealth());
        System.out.println("introduce la experiencia: ");
        hero1.setExperience(sc.nextInt());
        System.out.println("introduce la ataque: ");
        hero1.setAttack(sc.nextInt());
        System.out.println("introduce la defensa: ");
        hero1.setDefense(sc.nextInt());

        System.out.println(hero1);

        System.out.println("Héroe 2");
        Hero hero2 = new Hero();
        System.out.println("introduce el nombre: ");
        hero2.setName(sc.next());
        System.out.println("introduce el nivel: ");
        hero2.setLevel(sc.nextInt());
        System.out.println("introduce la vida: ");
        hero2.setMaxHealth(sc.nextInt());
        hero2.setHealth(hero2.getMaxHealth());
        System.out.println("introduce la experiencia: ");
        hero2.setExperience(sc.nextInt());
        System.out.println("introduce la ataque: ");
        hero2.setAttack(sc.nextInt());
        System.out.println("introduce la defensa: ");
        hero2.setDefense(sc.nextInt());

        System.out.println(hero2);

        while(hero1.getHealth()>0 && hero2.getHealth()>0) {

            if (hero1.getHealth() > 0) {
                System.out.println(hero1.getName() + " ¿Que quieres hacer?");
                System.out.println("1 Atacar \n" + "2 curarse \n");
                elegir = sc.nextInt();
                switch (elegir) {
                    case 1: {
                            hero1.attack(hero2);
                            System.out.println(hero1);
                            System.out.println(hero2);
                    }
                    break;
                    case 2: {
                        System.out.println(hero1.getName() + " ¿Que quieres hacer?");
                        System.out.println("1 pocion(10 vida) \n" + "2 descansar(50 vida) \n");
                        elegir = sc.nextInt();

                        switch (elegir) {
                            case 1: {
                                hero1.drinkPotion();
                            }
                            break;
                            case 2: {
                                hero1.rest();
                            }

                        }

                    }
                }
            } else {
                System.out.println(hero2.getName() + " gana");
            }
            if (hero2.getHealth() > 0) {
                System.out.println(hero2.getName() + " ¿Que quieres hacer?");
                System.out.println("1 Atacar \n" + "2 curarse \n");
                elegir = sc.nextInt();
                switch (elegir) {
                    case 1: {
                            hero2.attack(hero1);
                            System.out.println(hero1);
                            System.out.println(hero2);
                    }
                    break;
                    case 2: {
                        System.out.println(hero2.getName() + " ¿Que quieres hacer?");
                        System.out.println("1 pocion(10 vida) \n" + "2 descansar(50 vida) \n");
                        elegir = sc.nextInt();

                        switch (elegir) {
                            case 1: {
                                hero2.drinkPotion();
                            }
                            break;
                            case 2: {
                                hero2.rest();
                            }
                        }
                    }
                }
            }else {
                System.out.println(hero1.getName() + " gana");
            }
        }
    }
}