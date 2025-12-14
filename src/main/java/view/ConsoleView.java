package view;

public class ConsoleView {

    public void viewLine(String prompt) {
        System.out.println(prompt);
    }

    public void viewCharacter() {
        System.out.println("You must first make a character.");
        System.out.println("What class shall your character be:");
        System.out.println("1: Warrior");
        System.out.println("2: Mage");
        System.out.println("3: Rouge");
        System.out.print("> ");
    }

    public static void viewError(String prompt) {
        System.err.println(prompt);
    }
}
