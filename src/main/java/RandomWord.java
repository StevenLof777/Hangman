import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class RandomWord {
    public static List words = Arrays.asList("pineapple", "bridge", "trouble", "keyboard", "stove", "pirate");
    public static String randomWord() throws IOException {

        String randomWord = (String) words.get((int) (Math.random()*words.size()));
        return randomWord;
    }


}
