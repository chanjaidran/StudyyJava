package SDET_Programs.Hasmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHahMapByValue {
    public static void main(String[] args) {


        Map<String,Integer> map=new HashMap<>();
        map.put("a",5);
        map.put("b",3);
        map.put("c",2);
        map.put("d",1);
        map.put("e",4);

        Map<String,Integer> sortedByMap=map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

        sortedByMap.forEach((k,v)-> System.out.println(k+" "+v));


        Map<String,Integer> sortedByMapDesc=map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

        sortedByMapDesc.forEach((k,v)-> System.out.println(k+" "+v));


        map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(a,b)->a,LinkedHashMap::new));

        System.out.println(sortedByMap);



    }
}
