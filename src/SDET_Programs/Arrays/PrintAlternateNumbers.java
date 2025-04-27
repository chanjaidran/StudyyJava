package SDET_Programs.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintAlternateNumbers {

    public static void main(String[] args) {


        int[] arr={1,2,3,4,5,6,9};

       // Arrays.stream(arr).collect(Collectors.toList());
        String[] array = {"Apple", "Banana", "Orange"};
        List<String> list = Arrays.stream(array).collect(Collectors.toList());

        Arrays.stream(arr).filter(i->i%2!=0).forEach(s-> System.out.println(s));


      int sum=  Arrays.stream(arr).sum();
        System.out.println(sum);
        int max=  Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
        int min=  Arrays.stream(arr).min().getAsInt();
        System.out.println(min);


        System.out.println("");
        for (int i=0;i<arr.length;i=i+2)
        {
            System.out.println(arr[i]);
        }

    }
}
