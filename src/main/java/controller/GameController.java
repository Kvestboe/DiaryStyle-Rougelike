package controller;

import model.characters.Character;
import service.SetupService;
import view.ConsoleIO;

public class GameController {

    ConsoleIO consoleIO;
    SetupService setupService;
    Character character;

    public GameController(ConsoleIO consoleIO, SetupService setupService) {
        this.consoleIO = consoleIO;
        this.setupService = setupService;
    }


    public void startGame() {
        int pick = consoleIO.promptMakeCharacter();
        character = setupService.makeCharacter(pick);
        consoleIO.printMessage("you picked " + character.getCharacterName());

    }


}
