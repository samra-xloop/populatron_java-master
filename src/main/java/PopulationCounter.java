import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import part2.Parser;
import part2.Reader;
import part2.Summation;

public class PopulationCounter {
    public static void main(String[] args) throws Exception {
        // long sum = 0;
        String path = args[0];
        // List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.ISO_8859_1);
        // for(int i = 1; i < lines.size(); i++) {
        //     String line = lines.get(i);
        //     String[] terms = line.split(",");
        //     String popText = terms[4];
        //     if(popText.length() == 0) {
        //         continue;
        //     }
        //     long population = Integer.parseInt(popText);
        //     sum += population;
        // }
        // Driver driver = new Driver(args[0]);
        // long sum = driver.GetPopulation();
        // String num = NumberFormat.getInstance(Locale.getDefault()).format(sum);
        // System.out.printf("World population is: %s\n", num);

       List<String> list_of_string= Reader.read(path);
       List<Long> list_of_long=Parser.parser(list_of_string);
       long sum = Summation.sum(list_of_long);
       String num = NumberFormat.getInstance(Locale.getDefault()).format(sum);
        System.out.printf("World population is: %s\n", num);

    }
}
