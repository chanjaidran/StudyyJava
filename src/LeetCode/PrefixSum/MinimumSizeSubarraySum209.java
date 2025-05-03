package LeetCode.PrefixSum;

public class MinimumSizeSubarraySum209 {

    public static void main(String[] args) {

        int arr[] = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];

                if (sum >= target) {
                    min = Math.min(min, j - i + 1); // Corrected line
                    break; // No need to continue further for this i
                }
            }
        }

        if (min == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(min);
        }

    }
}
