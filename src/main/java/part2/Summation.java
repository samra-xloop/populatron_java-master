package part2;

import java.util.List;

public class Summation {
    public static Long sum(List<Long> list_of_cities_pop){
        return list_of_cities_pop.stream().reduce(0L, Long::sum);

        // return list_of_cities_pop..stream().mapToLong(Long::longValue).sum();
    }
}
