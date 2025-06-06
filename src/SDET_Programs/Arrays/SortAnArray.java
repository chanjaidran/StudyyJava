package SDET_Programs.Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortAnArray {

    public static void main(String[] args) {

        Integer arr[]={3,2,7,8,1,1};
       Map<Integer,Long> map= Arrays.stream(arr).sorted().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);

        for(Map.Entry<Integer,Long>  i:map.entrySet())

        {

        }
    }
}
