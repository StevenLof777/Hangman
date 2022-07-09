import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class PrintHangman {

    public static void hangmanImage(int count) throws IOException {

//        ArrayList<String> list = new ArrayList<>();
        String line = "";

        line = Files.lines(Path.of("src/main/Hangman.txt"))
                .collect(Collectors.joining(""));

        String[] hangman = line.split(",");



        switch (count){
            case 0:
                System.out.println(
                    hangman[0].substring(0,5) +
                "\n" + hangman[0].substring(5,10) +
                "\n" + hangman[0].substring(10,15) +
                "\n" + hangman[0].substring(15,20) +
                "\n" + hangman[0].substring(20,25)
                );
                break;
            case 1:
                System.out.println(
                    hangman[1].substring(0,5) +
                "\n" + hangman[1].substring(5,10) +
                "\n" + hangman[1].substring(10,15) +
                "\n" + hangman[1].substring(15,20) +
                "\n" + hangman[1].substring(20,25)
                );
                break;
            case 2:
                System.out.println(
                    hangman[2].substring(0,5) +
                "\n" + hangman[2].substring(5,10) +
                "\n" + hangman[2].substring(10,15) +
                "\n" + hangman[2].substring(15,20) +
                "\n" + hangman[2].substring(20,25)
                );
                break;
            case 3:
                System.out.println(
                    hangman[3].substring(0,5) +
                "\n" + hangman[3].substring(5,10) +
                "\n" + hangman[3].substring(10,15) +
                "\n" + hangman[3].substring(15,20) +
                "\n" + hangman[3].substring(20,25)
                );
                break;
        }
    }
}
