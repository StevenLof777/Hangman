import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RandomWord {
    public static String randomWord() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/main/hangman_words.txt"));
        List<String> words = new ArrayList<>();
        while(sc.hasNext()) words.add(sc.nextLine());
        String randomWord = words.get((int) (Math.random()*words.size()));
        return randomWord;
    }
}
