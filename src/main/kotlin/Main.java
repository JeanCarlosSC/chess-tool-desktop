import view.ConsoleGame;
import view.Frame;

import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Would you like the desktop version? (y/n)");
        String input = s.nextLine();
        if(input.equals("y")) {
            new Frame();
        }
        else {
            new ConsoleGame();
        }

    }
}
