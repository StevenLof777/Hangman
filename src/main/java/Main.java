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

        System.out.println(word);

        List<Character> playerGuesses = new ArrayList<>();

        printWordState(word, playerGuesses);

        while(true){
            getPlayerGuess(keyboard, word, playerGuesses);
        }
    }

    public static void getPlayerGuess(Scanner keyboard, String word, List<Character> playerGuesses) {
        System.out.println("\nGuess a letter");
        String letterGuess = keyboard.nextLine();
        playerGuesses.add(letterGuess.charAt(0));

        printWordState(word, playerGuesses);
    }

    public static void printWordState(String word, List<Character> playerGuesses) {
        for (int i = 0; i < word.length(); i++) {
            if (playerGuesses.contains((word.charAt(i)))) {
                System.out.print(word.charAt(i));
            } else {
                System.out.print("_");
            }
        }
    }

}