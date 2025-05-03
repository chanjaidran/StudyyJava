package SDET_Programs.Arrays;

import java.util.Arrays;

public class MissingNumberInArray {

    public static void main(String[] args) {


     //int arr[]={1,3,4,5};
       int arr[] ={3,0,1};
        int sum1= Arrays.stream(arr).sum();
        Arrays.sort(arr);
        int n=0;

        if(arr[0]==0)
            n = arr.length;
        else
            n=arr.length+1;
        System.out.println(sum1);

       // int n = arr.length +1; // because one number is missing

        System.out.println(n);
        int expectedSum = n * (n + 1) / 2;
        System.out.println(expectedSum-sum1);


    }
}
