package SDET_Programs.Arrays;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArray {

    public static void main(String[] args) {

        int arr1[]={1,2,3,4,5};
        int arr2[]={4,5,6,7,8};

        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();

        for (int i:arr1)
        {
            s1.add(i);
        }

        for (int i:arr2)
        {
            if (s1.contains(i))
                 s2.add(i);
        }

        System.out.println(s2);



    }
}
