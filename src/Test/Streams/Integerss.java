package Test.Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Integerss {

    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(1,2,3,9,5,6,7,8,9,10,10,1);




        integerList.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).forEach(s-> System.out.println(s));

       Optional<Integer> max= integerList.stream().max(Comparator.comparingInt(Integer::intValue));
       System.out.println("max="+max.get());

        Optional<Integer> min= integerList.stream().min(Comparator.comparingInt(Integer::intValue));
        System.out.println("min="+min.get());

        Optional<Integer> maxx=  integerList.stream().collect(Collectors.maxBy(Comparator.comparingInt(Integer::intValue)));
        System.out.println("maxx="+maxx.get());


       integerList.stream().distinct().sorted(Comparator.comparingInt(Integer::intValue).reversed())

                .skip(1)
                .findFirst()
               .ifPresent(s-> System.out.println(s));


        int[] array = {1, 2, 3, 9, 5, 6, 7, 8, 9, 10, 10, 1,5};

       // Set<Integer> set=
                Map<Integer,Integer> map=new HashMap<>();

         Map<Integer,Long> longMap=Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println(longMap);
         longMap.entrySet().stream().sorted(Map.Entry.<Integer,Long>comparingByValue().reversed())
                 .map(Map.Entry::getKey)
                 .limit(2)
                 .forEach(s-> System.out.println(s));


//
//        System.out.println(set);
//
//        integerList.stream().toArray();


    }
}


