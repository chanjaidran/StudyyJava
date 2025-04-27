package SDET_Programs.Hasmap;

public class FIndAllPairDifferenceWithK {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;

        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {

                if (arr[i]-arr[j]==2|| arr[i]-arr[j]==-2)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
