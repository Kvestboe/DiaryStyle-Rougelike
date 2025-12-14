package view;

import java.util.Scanner;

public class ConsoleIO {

    ConsoleView view;
    ConsoleInput input;

    public ConsoleIO(ConsoleView view, ConsoleInput input) {
        this.view = view;
        this.input = input;
    }

    public void printMessage(String message) {
        view.viewLine(message);
    }

    public int promptMakeCharacter() {
        view.viewCharacter();
        return input.validateCharacterPick();
    }

}
