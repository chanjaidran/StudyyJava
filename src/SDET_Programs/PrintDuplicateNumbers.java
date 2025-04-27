package SDET_Programs;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateNumbers {

    public static void main(String[] args) {


        int num[]={1,2,3,4,1,3};

        Map<Integer,Integer> map=new HashMap<>();

        for(int i:num)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        System.out.println(map);









        for (int i=0;i<num.length-1;i++)
        {
            if (num[i]==num[i+1])
                  System.out.println(num[i]);
        }

        System.out.println();
        for (int i=0;i< num.length;i++)
        {
            for(int j=i+1;j<num.length;j++) {
                if (num[i] == num[j]) {
                    System.out.println(num[i]);
                }
            }

        }
    }
}
