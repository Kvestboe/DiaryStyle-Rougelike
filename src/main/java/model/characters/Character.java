package model.characters;

import model.interfaces.Combatant;

public abstract class Character implements Combatant {
    String name;
    int hp;
    int attack;
    int defence;

    Character(String name, int hp, int attack, int defence) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
    }

    @Override
    public String getCharacterName() {
        return name;
    }
}
