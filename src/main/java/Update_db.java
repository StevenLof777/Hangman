import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;
public class Update_db {
    public static void update_db(Player p) {

        HashMap<String, Integer> map = new HashMap<>();
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        try {
            Stream.of(Files.readAllLines(Path.of("src/main/db.txt")))
                    .flatMap(List::stream)
                    .map(line -> new String[]{
                            line.split(",")[0],
                            line.split(",")[1]
                    })
                    .forEach(line -> {
                        map.put(line[0], Integer.valueOf(line[1]));
                        if (map.containsKey(p.getName())) map.put(p.getName(),  map.get(p.getName()) + p.getScore());
                        else map.put(p.getName(), 0);
//                        if (!map.containsKey(p.getName())) map.put(p.getName(),  p.getScore());
//                        else map.put(p.getName(), Integer.parseInt(line[1]));
                    });

//            Sort Map
            map.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

//            Write map to db text file
            Files.write(Path.of("src/main/db.txt"), () -> sortedMap.entrySet().stream()
                    .<CharSequence>map(e -> e.getKey() + ',' + e.getValue())
                    .iterator());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }

