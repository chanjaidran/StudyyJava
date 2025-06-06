package SDET_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesIn_Array {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,3,21,2};

        Arrays.stream(arr).distinct().forEach(System.out::print);
        Set<Integer> set=new HashSet<>();
        for (int i :arr)
        {
            set.add(i);
        }

        System.out.println(set);
    }
}
