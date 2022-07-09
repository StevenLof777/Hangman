import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
public class Update_db {
//    public static void update_db(Player p) {
//        try {
////            BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/db.txt", true));
////            bw.append("NAME: " + p.getName() + " | SCORE: " + p.getScore());
////            bw.append("\n");
////            bw.close();
//            RandomAccessFile writer = new RandomAccessFile("src/main/db.txt", "rw");
//            writer.seek(0);
//            writer.writeBytes(" Clarence ");
//            writer.close();
//        } catch (Exception e){
//            System.out.println(e.getMessage());;
//        }
//
//    }
    public static File file = new File("src/main/hangman_words.txt");

    public static void update_db(Player obj) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
            oos.flush();
        }
    }
    // Deserialization
    // Get object from a file.
//    public static Person readObjectFromFile(File file) throws IOException, ClassNotFoundException {
//        Person result = null;
//        try (FileInputStream fis = new FileInputStream(file);
//             ObjectInputStream ois = new ObjectInputStream(fis)) {
//            result = (Person) ois.readObject();
//        }
//        return result;
//    }
}
