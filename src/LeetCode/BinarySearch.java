package LeetCode;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        System.out.println(binarySearch(arr,5));

    }

    public static int binarySearch(int[] arr,int target)
    {
        int left=0;
        int right=arr.length-1;



        while (left<=right)
        {

            int mid=(right+left)/2;


            if (arr[mid]==target)
            {
                return mid;
            }

            if(arr[mid]<target)
            {
                left=mid+1;

            }

            else {
                right=mid-1;
            }
        }
        return -1;
    }
}
