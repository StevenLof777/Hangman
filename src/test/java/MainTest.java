import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MainTest {

    @Test
    void CheckForWords() throws FileNotFoundException {
        File words = new File("src/main/hangman_words.txt");
        assertTrue(words.exists());
    }
    @Test
    void CheckIfWordIsRandmom() throws FileNotFoundException {
        String word1 = RandomWord.randomWord();
        String word2 = RandomWord.randomWord();
        assertNotEquals(word1, word2);
    }
    @Test
    void CheckGuess(){
//        String word = Main.randomWord();
//        List<Character> playerGuesses = new ArrayList<>();
//        Main.getPlayerGuess("asdf", word, playerGuesses);
    }
}