package model.gamedata;

import model.characters.Character;
import model.characters.Mage;
import model.characters.Rouge;
import model.characters.Warrior;
import model.items.AbstractItem;

import java.util.List;

public class Player {

    private int position;
    private Character character;
    private int health;
    private List<AbstractItem> inventory;

    public Player getPlayer() {
        return null;
    }

    public Character pickCharacter(int choice) {
        switch (choice) {
            case 1 -> {
                return new Warrior();
            }
            case 2 -> {
                return new Mage();
            }
            case 3 -> {
                return new Rouge();
            }
        }
        return null;
    };
}
