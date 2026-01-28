package TEMA4.POO1;

public class Hero {
    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    public static final int levelDefecto = 20;
    public static final int maxHealthDefecto = 100;
    public static final int attackDefecto = 60;
    public static final int defenseDefecto = 200;
    public static final int experienceDefecto = 0;

    public Hero(){
        this.name = "Bille";
        this.level = levelDefecto;
        this.maxHealth = maxHealthDefecto;
        this.health = maxHealth;
        this.experience = experienceDefecto;
        this.attack = attackDefecto;
        this.defense = defenseDefecto;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;

    }

    public int getExperience() {
        return experience;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        if (level>=0 && level<100){
            this.level = level;
        }else {
            this.level=levelDefecto;
        }
    }

    public void setHealth(int health) {
        if (health>=0 && health<100){
            this.health = health;
        }else {
            this.health=maxHealthDefecto;
        }
    }

    public void setMaxHealth(int maxHealth) {
        if (maxHealth>=0 && maxHealth<100){
            this.maxHealth = maxHealth;
        }else {
            this.maxHealth=maxHealthDefecto;
        }
    }

    public void setExperience(int experience) {
        if (experience>=0 && experience<=50){
            this.experience = experience;
        }else {
            this.experience=experienceDefecto;
        }
    }

    public void setAttack(int attack) {
        if (attack>=0 && attack<1000){
            this.attack = attack;
        }else {
            this.attack=attackDefecto;
        }
    }

    public void setDefense(int defense) {
        if (defense>=0 && defense<1000){
            this.defense = defense;
        }else {
            this.defense=defenseDefecto;
        }
    }


    public int drinkPotion(){
       this.health = health + 10;
       if (health >= maxHealth){
           return this.health = maxHealth;
       }else {
           return this.health;
       }
    }

    public int rest(){
        this.health = health + 50;
        if (health >= maxHealth){
            return this.health = maxHealth;
        }else {
            return this.health;
        }
    }
    public void attack(Hero enemy) {
        int damage = Math.max(this.attack - enemy.defense, 10);
        System.out.println(enemy.name + " recive " + damage + " de daño");
        enemy.health -= damage;

        if (enemy.health < 0) {
            enemy.health = 0;
        }

        this.experience += 10;

        if (this.experience >= 50) {
            this.experience -= 50;
            levelUp();
        }

    }

    public void levelUp(){
        this.level = level + 1;
        this.maxHealth = maxHealth + 5;
        this.health = health + 5;
        this.attack = attack + 1;
        this.defense = defense +1;
    }

    public String toString() {
        return "\n Nombre: " + name + "\n Nivel: " + level + "\n vida: " + health + "/" + maxHealth + "\n experiencia: " + experience + "\n ataque: " + attack + "\n defensa: " + defense;
    }
}
