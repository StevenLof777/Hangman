import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {
    public static String word;

    static {
        try {
            word = RandomWord.randomWord();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static String underscore = new String(new char[word.length()]).replace("\0", "_");
    public static String missedLetters = "";
    public static int count = 0;
    public static void play() throws FileNotFoundException {
        word = RandomWord.randomWord();
        count = 0;
        missedLetters="";
        underscore = new String(new char[word.length()]).replace("\0", "_");

//        System.out.println("word = " + word);
        System.out.println("HANGMAN");

        Scanner sc = new Scanner(System.in);

        while (count <= 4 && underscore.contains("_")) {
            PrintHangman.hangmanImage(count);
            System.out.println(underscore);
            System.out.println("Guess a letter.");
            String guess = sc.next();
            checkGuesses(guess);
        }
    }

    public static void checkGuesses(String guess) throws FileNotFoundException {
        if (missedLetters.contains(guess) || underscore.contains(guess)){
            count--;
            System.out.println("You have already tried that letter. Choose again.");
        }

        Scanner sc = new Scanner(System.in);
        String newUnderscore = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newUnderscore += guess.charAt(0);
            } else if (underscore.charAt(i) != '_') {
                newUnderscore += word.charAt(i);
            }
            else {
                newUnderscore += "_";
            }
        }

        if (underscore.equals(newUnderscore)) {
            count++;
            if (!missedLetters.contains(guess)){
                missedLetters = missedLetters + guess;
            }
        } else {
            underscore = newUnderscore;
        }

        if (count == 4){
            System.out.println("You are out of tries. The word was "+word+". Would you like to play again? (yes/no)");
            String input = sc.nextLine();
            if (input.equals("yes")) {
                play();
            } else {
                System.exit(0);
            }
        }

        if (underscore.equals(word)) {
            System.out.println("Yes! The secret word is " + Game.word + "! You have won!");
            System.out.println("Do you want to play again? (yes / no)");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("yes")) {
                play();
            } else {
                System.exit(0);
            }
        }
    }
}
