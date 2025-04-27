package SDET_Programs.Arrays;

import java.util.Arrays;

public class MissingNumberInArray {

    public static void main(String[] args) {


       // int arr[]={1,3,4,5};
        int arr[] ={3,0,1};

        int len=arr.length;
        System.out.println(len);
        int sum=0;

        int sum1= Arrays.stream(arr).sum();
        System.out.println(sum1);

        for (int i=0;i<len;i++)
        {
             sum=sum+i;
        }
        System.out.println(sum);

        System.out.println(sum-sum1);

    }
}
