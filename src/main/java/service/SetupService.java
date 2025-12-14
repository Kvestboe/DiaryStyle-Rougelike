package service;

import model.characters.Character;
import model.characters.Mage;
import model.characters.Rouge;
import model.characters.Warrior;

public class SetupService {

    public Character makeCharacter(int choice) {
        return switch (choice) {
            case 1 -> new Warrior();
            case 2 -> new Mage();
            case 3 -> new Rouge();
            default -> null;
        };
    }

}
