package SDET_Programs.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentCharacter {

    public static void main(String[] args) {

        String str = "mississippi";

        //Streams
        str.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v)-> System.out.println(k+" "+v));

        Map<Character,Integer> characterHashMap=new HashMap<>();

        for (char c:str.toCharArray())
        {
            characterHashMap.put(c,characterHashMap.getOrDefault(c,0)+1);
        }

       int max=0;
        char cn=' ';

        for (Map.Entry<Character,Integer> c:characterHashMap.entrySet())
        {
            if (c.getValue()>max)
            {
                max=c.getValue();
                cn=c.getKey();

            }

        }

        System.out.println(max+" "+cn);

    }
}
