package SDET_Programs.Arrays;

import java.math.BigInteger;

public class ArrayIsSortedOrNot {

    public static void main(String[] args) {


        int arr[]={1,2,3,4,5};
        boolean check=true;


        for (int i=0;i<arr.length-1;i++)
        {

            if (arr[i]>arr[i+1])
            {
              check=false;
              break;
            }

        }

        if (check)
            System.out.println("Sorted");
        else
            System.out.println("not sorted");



    }
}
