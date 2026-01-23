package Tema4;

import java.util.Random;
import java.util.Scanner;

public class Horda {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Héroe 1");
        Hero hero = new Hero();
        System.out.println("introduce el nombre: ");
        hero.setName(sc.next());
        System.out.println("introduce el nivel: ");
        hero.setLevel(sc.nextInt());
        System.out.println("introduce la vida: ");
        hero.setMaxHealth(sc.nextInt());
        hero.setHealth(hero.getMaxHealth());
        System.out.println("introduce la experiencia: ");
        hero.setExperience(sc.nextInt());
        System.out.println("introduce la ataque: ");
        hero.setAttack(sc.nextInt());
        System.out.println("introduce la defensa: ");
        hero.setDefense(sc.nextInt());

        int hordasSuperadas = 0;

        while (hero.getHealth() > 0) {

            hordasSuperadas++;
            System.out.println("\n Horda " + hordasSuperadas);

            int enemigosVivos = random.nextInt(3) + 1;
            System.out.println("Enemigos aparecen: " + enemigosVivos);

            while (hero.getHealth() > 0 && enemigosVivos > 0) {

                for (int i = 0; i < enemigosVivos; i++) {
                    if (random.nextInt(100) < 10) {
                        enemigosVivos--;
                        System.out.println("Un enemigo huye");
                        i--;
                    }
                }

                if (enemigosVivos <= 0) {
                    break;
                }

                Hero enemy = crearEnemigoDebil(hero);
                hero.attack(enemy);

                if (enemy.getHealth() == 0) {
                    enemigosVivos--;
                    System.out.println("☠️ Enemigo derrotado");
                }

                for (int i = 0; i < enemigosVivos; i++) {
                    Hero enemigoAtacante = crearEnemigoDebil(hero);
                    enemigoAtacante.attack(hero);
                }
            }

            if (random.nextInt(1000) == 0) {
                System.out.println("Descansas y recuperas vida");
                hero.rest();
            }

            if (random.nextInt(100) < 10) {
                System.out.println("Encuentras una poción");
                hero.drinkPotion();
            }

            System.out.println(hero);
        }

        System.out.println("\n GAME OVER");
        System.out.println("Has sobrevivido a " + hordasSuperadas + " hordas");
    }

    private static Hero crearEnemigoDebil(Hero hero) {
        Hero enemy = new Hero();
        enemy.setName("Enemigo");
        enemy.setMaxHealth(hero.getMaxHealth() - 10);
        enemy.setDefense(hero.getDefense() - 10);
        enemy.setAttack(hero.getAttack() - 10);
        enemy.setLevel(hero.getLevel() - 10);
        enemy.setExperience(0);
        return enemy;
    }
}
