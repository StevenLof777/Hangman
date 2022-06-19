import java.io.FileNotFoundException;

public class PrintHangman {

    public static void hangmanImage(int count) {
        if (count == 0) {
            System.out.println(
                      "+---+" +
                    "\n    |" +
                    "\n    |" +
                    "\n    |" +
                    "\n   ===" +
                    "\nMissed letters:"
            );
        }        if (count == 1) {
            System.out.println(
                    "\n+---+" +
                    "\n0   |" +
                    "\n    |" +
                    "\n    |" +
                    "\n   ===" +
                    "\nMissed letters: " + Game.missedLetters
            );
        }
        if (count == 2) {
            System.out.println(
                    "\n+---+" +
                    "\n0   |" +
                    "\n|   |" +
                    "\n    |" +
                    "\n   ===" +
                    "\nMissed letters: " + Game.missedLetters
            );
        }        if (count == 3) {
            System.out.println(
                    "\n+---+" +
                    "\n0   |" +
                    "\n|   |" +
                    "\n|   |" +
                    "\n   ===" +
                    "\nMissed letters: " + Game.missedLetters
            );
        }
        if (count == 4) {
            System.out.println(
                    "\n+---+" +
                    "\n0   |" +
                    "\n|   |" +
                    "\n|   |" +
                    "\n   ===" +
                    "\nYou're out of tries. The word is \"" + Game.word + "\"." +
                    "\nWould you like to play again? (yes/no)"
            );
        }
    }
}
