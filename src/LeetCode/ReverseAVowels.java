package LeetCode;

public class ReverseAVowels {

    public static void main(String[] args) {


        System.out.println(reverseVowels("Jaichandran"));
        System.out.println(10%50);
        System.out.println(100/50);
        //aaia
        //jaachndr n

    }


    public static  String reverseVowels(String name) {

        char[] arr=name.toCharArray();
        int left=0;
        int right=arr.length-1;
        String vowels="aeiouAEIOU";

        while (left<=right)
        {
            while (left<right && vowels.indexOf(arr[left])==-1)
            {
                left++;
            }

            while (left<right && vowels.indexOf(arr[right])==-1)
            {
                right--;
            }

            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;


        }

        return new String(arr);

    }
}
