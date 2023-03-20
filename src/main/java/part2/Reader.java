package part2;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Reader {
    
    public static List<String> read(String filePath){
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath), StandardCharsets.ISO_8859_1);
            return lines;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        

    }
}
