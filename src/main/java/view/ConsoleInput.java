package view;

import java.util.Scanner;

import static view.ConsoleView.viewError;

public class ConsoleInput {
    Scanner input = new Scanner(System.in);

    public ConsoleInput(Scanner scanner) {
        input = scanner;
    }

    public int validateCharacterPick() {
        while (true) {
            int pick = 0;
            try {
                pick = input.nextInt();
            } catch (Exception e) {
                viewError("Pick a number between 1 and 3.");
            }
            if (pick >= 1 && pick <= 3) {
                return pick;
            }
        }
    }

}
