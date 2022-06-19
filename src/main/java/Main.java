import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String randomWord() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/main/hangman_words.txt"));
        List<String> words = new ArrayList<>();
        while(sc.hasNext()) words.add(sc.nextLine());
        String randomWord = words.get((int) (Math.random()*words.size()));
        return randomWord;
    }


    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = null;
        try {
            keyboard = new Scanner(System.in);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String word = randomWord();
        System.out.println("\nword = " + word);
        List<Character> playerGuesses = new ArrayList<>();
        System.out.println("\nMissed Letters");

        int wrong = 0;
        while(true){
            if (wrong == 0)
            {
                System.out.println(
                        "\n+---+" +
                        "\n    |" +
                        "\n    |" +
                        "\n    |" +
                        "\n   ==="
                );
            }
            else if (wrong == 1)
            {
                System.out.println(
                        "\n+---+" +
                        "\n0   |" +
                        "\n    |" +
                        "\n    |" +
                        "\n   ==="
                );
            }
            else if (wrong == 2)
            {
                System.out.println(
                        "\n+---+" +
                        "\n0   |" +
                        "\n|   |" +
                        "\n    |" +
                        "\n   ==="
                );
            }
            else if (wrong == 3)
            {
                System.out.println(
                        "\n+---+" +
                        "\n0   |" +
                        "\n|   |" +
                        "\n|   |" +
                        "\n   ==="
                );
            }

            printWordState(word, playerGuesses);

                if (!getPlayerGuess(keyboard,word,playerGuesses)){
                wrong++;
                System.out.println("wrong count = " + wrong);
            }

            getPlayerGuess(keyboard, word, playerGuesses);

            if(printWordState(word, playerGuesses)){
            System.out.println("\n\nYes! The scret word is \"" + word + "\"! You have won!" +
                    "\nDo you want to play again? (yes or no)");
                break;
            }
        }
    }

    public static boolean getPlayerGuess(Scanner keyboard, String word, List<Character> playerGuesses) {
        System.out.println("\nGuess a letter");
        String letterGuess = keyboard.nextLine();
//        if (playerGuesses.contains(letterGuess)){
//            System.out.println("You have already guessed that letter. Choose again.");
//        } else {
//            playerGuesses.add(letterGuess.charAt(0));
//        }

        return word.contains(letterGuess);
    }

    public static boolean printWordState(String word, List<Character> playerGuesses) {
        int correct = 0;
        for (int i = 0; i < word.length(); i++) {
            if (playerGuesses.contains((word.charAt(i)))) {
                correct++;
                System.out.print(word.charAt(i));
            } else {
                System.out.print("_");
            }
        }
        return (word.length()==correct);
    }

}