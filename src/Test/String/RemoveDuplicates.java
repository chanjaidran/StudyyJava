package Test.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String s1="jaichandran";

       String s= s1.chars().distinct().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
        System.out.println(s);

        //even totaly remove;

      List<Character> cc=  s1.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

      //Most frequent char print

     Character q=   s1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                        .entrySet()
                        .stream().max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey).orElse(null);
        System.out.println(q);



        Map<Character,Integer> map=new HashMap<>();
        for(char c:s1.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int max=Integer.MIN_VALUE;
        char c=0;
        for(Map.Entry<Character,Integer> m:map.entrySet())
        {
            if (m.getValue()>max)
            {
                max=m.getValue();
                c=m.getKey();

            }
        }

        System.out.println(c+" "+max);






        System.out.println(cc);



    }
}
