package SDET_Programs.Arrays;

public class TwoSum {

    public static void main(String[] args) {


        int ar[]={1,2,3,4,5,6};
        int target=7;

        for(int i=0;i<ar.length;i++)
        {
            for (int j=i+1;j<ar.length;j++)
            {
                if (ar[i]+ar[j]==target)
                    System.out.println(ar[i]+" "+ar[j]);
            }
        }

    }
}
