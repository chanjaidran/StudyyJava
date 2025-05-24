package SDET_Programs.Arrays;

import java.util.Arrays;

public class RotateArrayWithKTimes {


    public static void main(String[] args) {



        int arr[]={1,2,3,4,5};
        //rotate one element

        int temp=arr[0];
        int n=arr.length;

        for (int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }

        arr[n-1]=temp;


        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

        int arr1[]={1,2,3,4,5,6,7};
        int k=3;



        System.out.println("kk");
        reverse1(arr1,0,k-1);
        reverse1(arr1,k,arr1.length-1);
        System.out.println("Final");
        reverse1(arr1,0,arr1.length-1);

        for (int i :arr1)
        {
            System.out.println(i);
        }




        int num[]={1,2,0,0,3,0,3,2,0,5};

        int j=0;

        for (int i=0;i<num.length;i++)
        {
            if (num[i]!=0)
            {
                num[j]=num[i];
                j++;
            }
        }

        for (int i=j;i<num.length;i++)
        {
            num[i]=0;
        }

        for(int i:num) {
            System.out.println(i);
        }

    }





    public static void reverse1(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
