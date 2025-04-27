package SDET_Programs;

public class SumofElementArray_Equals_K {

    public static void main(String[] args) {


        int arr[]={1,2,3,4,5};
        int k=6;

        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }


    }
}
