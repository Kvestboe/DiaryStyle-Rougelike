import controller.GameController;
import service.SetupService;
import view.ConsoleIO;
import view.ConsoleInput;
import view.ConsoleView;

import java.util.Scanner;

public class Application {
    GameController gameController;

    public Application() {
        // low level initializer (ui
        Scanner scanner = new Scanner(System.in);
        ConsoleView consoleView = new ConsoleView();
        ConsoleInput consoleInput = new ConsoleInput(scanner);
        ConsoleIO consoleIO = new ConsoleIO(consoleView, consoleInput);

        // mid level initializer (services
        SetupService setupService = new SetupService();

        // high level initializer (controllers
        gameController = new GameController(consoleIO, setupService);

    }

    public void run() {
        gameController.startGame();
    }

}
