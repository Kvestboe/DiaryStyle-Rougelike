package model.characters;

import model.interfaces.Combatant;

abstract class Character implements Combatant {
    int hp;
    int attack;
    int defence;

    Character(int hp, int attack, int defence) {
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
    }
}
