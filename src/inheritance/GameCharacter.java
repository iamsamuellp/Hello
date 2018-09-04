package inheritance;

import java.util.ArrayList;

public class GameCharacter {
    private String name;
    private int health;
    private int power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", power=" + power +
                '}';
    }

    public GameCharacter(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;

    }
    public static void main(String[] args) {
    Monster x1 = new Monster( "Artery The Father of Darkness",100,85);
    Monster x2 = new Monster( "Goblin",50,25 );
    Monster x3 = new Monster( "Death The Grimm Reaper", 150,90 );
    Monster x4 = new Monster( "Lesser Demon",75, 35 );
    }
}

class WareWolf extends GameCharacter {
    private float fury;
    private ArrayList<String> abilities;

    public float getFeed() {
        return fury;
    }

    public float getFury() {
        return fury;
    }

    public void setFury(float fury) {
        this.fury = fury;
    }

    public ArrayList<String> getAbilities() {
        return abilities;
    }


    public WareWolf(String name, int health, int power, float feed, ArrayList<String> skills) {
        super(name, health, power);
        this.fury = fury;
        this.abilities = abilities;
    }
}

class Wizard extends GameCharacter {
    private float mana;
    private ArrayList<String> spells;

    public float getMana() {
        return mana;
    }

    public void setMana(float mana) {
        this.mana = mana;
    }

    public ArrayList<String> getSpells() {
        return spells;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", spells=" + spells +
                '}';
    }

    public Wizard(String name, int health, int power, float mana) {
        super(name, health, power);
        this.mana = mana;
        spells = new ArrayList<>();
    }
}

class Monster extends GameCharacter {
    private ArrayList<String> curses;

    public Monster(String name, int health, int power) {
        super(name, health, power);
        curses = new ArrayList<>();
    }

    public ArrayList<String> getCurses() {
        return curses;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "curses=" + curses +
                '}';
    }
}

