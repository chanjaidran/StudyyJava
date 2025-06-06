package Test.Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Integerss {

    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(1,2,3,9,5,6,7,8,9,10,1);

        Optional<Integer> max= integerList.stream().max(Integer::compareTo);
        System.out.println(max.get());

        Optional<Integer> min= integerList.stream().min(Integer::compareTo);
        System.out.println(min.get());

        long sum=  integerList.stream().collect(Collectors.summarizingInt(Integer::intValue)).getSum();
        System.out.println(sum);

       int max1= integerList.stream().mapToInt(Integer::intValue).max().getAsInt();

        IntSummaryStatistics all=integerList.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(all.getMax());

        integerList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(n->n.getValue()>1).map(Map.Entry::getKey).forEach(s-> System.out.println(s));

//
//      Map<String,List<Integer>> map=  integerList.stream().collect(Collectors.partitioningBy((n->n % 2==0)?"even":"odd"));
//        System.out.println(map);


    }
}


