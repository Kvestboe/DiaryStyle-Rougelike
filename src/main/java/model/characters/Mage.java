package model.characters;

public class Mage extends Character {
    private static final int BASE_HP = 50;
    private static final int BASE_ATTACK = 20;
    private static final int BASE_DEFENCE = 5;

    public Mage() {
        super("Mage", BASE_HP, BASE_ATTACK, BASE_DEFENCE);
    }

    @Override
    public void attack() {
        System.out.println("Mage casts fireball, or something...");
    }

    @Override
    public void defend() {
        System.out.println("Mage casts spell of protection, or something...");
    }
}
