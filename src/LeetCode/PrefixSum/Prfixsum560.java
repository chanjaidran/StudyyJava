package LeetCode.PrefixSum;

public class Prfixsum560 {

    public static void main(String[] args) {


        int arr[]={1,1,1};
        int sum=2;


        int count =0;

        for (int i=0;i<arr.length;i++)
        {
            int target=0;

            for (int j=i;j<arr.length;j++)
            {
                target=target+arr[j];

                if (sum==target)
                    count++;


            }
        }

        System.out.println(count);

    }
}
