package SDET_Programs.Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNameOcuurence {

    public static void main(String[] args) {

        String name="Jai is good boy jai chan also good";
        String[] arr1=name.split(" ");
        System.out.println(arr1.length);




        Map<String,Integer> characterHashMap=new HashMap<>();


        for (String c:arr1)
        {
            c=c.toLowerCase();
            characterHashMap.put(c,characterHashMap.getOrDefault(c,0)+1);
        }

        System.out.println(characterHashMap);

        String arr[] ={"jai","chan","chan","jai","siva"};

      Map<String,Long> map= Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

      for (Map.Entry<String,Long> c:map.entrySet())
      {
          if(c.getValue()>1)
          {
              System.out.println(c.getKey()+" "+c.getValue());
          }
      }
        System.out.println(map);
    }
}
