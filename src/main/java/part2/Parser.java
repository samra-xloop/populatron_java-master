package part2;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Parser {
    public static List<Long> parser(List<String> lines){
        return lines.stream().skip(1)
                    .map(line->line.split(","))
                    .map(term-> term[4])
                    .filter(popText-> !popText.isEmpty())
                    .map(Long::parseLong)
                    .collect(Collectors.toList());

    }
}
