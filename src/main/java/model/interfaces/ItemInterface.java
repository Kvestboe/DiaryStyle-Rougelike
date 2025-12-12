package model.interfaces;

import model.gamedata.Player;

public interface ItemInterface {
    String getName();
    String getDescription();

    void use(Player player);
}
