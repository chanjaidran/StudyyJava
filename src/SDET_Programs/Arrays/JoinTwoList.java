package SDET_Programs.Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinTwoList {
    public static void main(String[] args) {


        List<Integer> list1 = Arrays.asList(1, 2, 4);
        List<Integer> list2 = Arrays.asList(1, 3, 4);

        List<List<Integer>> list3 = Arrays.asList(list1, list2);

       List<Integer> list4= list3.stream().flatMap(List::stream).sorted().collect(Collectors.toList());
        System.out.println(list4);

    }
}
