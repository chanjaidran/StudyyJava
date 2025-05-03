package SDET_Programs.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxProductOfTriplets {

    public static void main(String[] args) {


        int arr[]={1, -7, 3, -6,-8,5, 0};
        Arrays.sort(arr);

        Arrays.stream(arr).forEach(System.out::println);

        int n=arr.length;

        int max1=arr[0]*arr[1]*arr[n-1];
        int max2=arr[n-1]*arr[n-2]*arr[n-3];
        System.out.println(Math.max(max1,max2));



    }
}
