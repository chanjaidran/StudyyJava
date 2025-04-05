package LeetCode;

public class SearchInsertPosition {

    public static void main(String[] args) {

        int[] arr1={1,3,4,5};
        System.out.println(searchInsert(arr1,5));
    }

    public static  int searchInsert(int[] nums, int target) {

        int left=nums[0];
        int right=nums.length-1;

        while (left<=right)
        {
            int mid=left+(right-left)/2;

            if(nums[mid]==target)
            {
                return mid;
            }

            if (nums[mid]<target)
            {
                left=mid+1;
            }

            else
            {
                right=mid-1;
            }
        }
        return  left;
    }
}
