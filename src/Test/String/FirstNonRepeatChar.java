package Test.String;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatChar {

    public static void main(String[] args) {


        String s1="jajcoboacj";

        s1.replaceAll("\\s+", "") // remove spaces
                .chars()
                .mapToObj(s -> (char) s)
                .collect(() -> new LinkedHashMap<Character, Integer>(),
                        (map, ch) -> map.put(ch, map.getOrDefault(ch, 0) + 1),
                        Map::putAll)
                .entrySet()
                .stream()
                .filter(e -> e.getValue().equals( 1))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);


        Character mostFrequent =s1.chars().mapToObj(s->(char)s).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse(null);

        System.out.println(mostFrequent);

              //  .forEach((a,b)-> System.out.println(a+" "+b));


    }


}
