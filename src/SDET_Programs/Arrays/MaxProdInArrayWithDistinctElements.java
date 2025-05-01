package SDET_Programs.Arrays;

public class MaxProdInArrayWithDistinctElements {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,-8,-7,5};

        int max=Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]*arr[j]>max)
                {
                    max=arr[i]*arr[j];
                }
            }
        }

        System.out.println(max);

    }
}
