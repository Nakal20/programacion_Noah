package Tema4;

public class Hero {
    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;


    public Hero(){
        this.name = "Bille";
        this.level = 20;
        this.health = 50;
        this.maxHealth = 100;
        this.experience = 30;
        this.attack = 60;
        this.defense = 200;
    }

    public int drinkPotion(){
        return this.health = health + 10;
    }

    public int rest(){
        return this.health = health + 50;
    }

}
