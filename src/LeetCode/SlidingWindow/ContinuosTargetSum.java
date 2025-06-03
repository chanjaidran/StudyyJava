package LeetCode.SlidingWindow;

public class ContinuosTargetSum {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,8};
        int target=7;

        int i=0;
        int j=0;

        while (i<=j)
        {
            if (arr[i]+arr[j]==target)
                System.out.println(arr[i]+""+arr);

            j++;
        }
    }
}
