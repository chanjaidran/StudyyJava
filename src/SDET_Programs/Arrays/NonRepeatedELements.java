package SDET_Programs.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NonRepeatedELements {

    public static void main(String[] args) {

        int arr[]={1,1,2,2,3,4,5,5,6,6};

        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();



        Map<Integer,Integer> map=new HashMap<>();

        for (int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for (Map.Entry<Integer,Integer> i:map.entrySet())
        {
            if (i.getValue()<=1)
            {
                System.out.println(i.getKey());
            }
        }

    }
}
