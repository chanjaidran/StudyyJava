package SDET_Programs.Arrays;

public class SearchElement {
    public static void main(String[] args) {


        int arr[]={1,2,3,6,7,8};
        int tar=6;

        int left=0;
        int right=arr.length-1;

        while (left<=right)
        {
            int mid=(left+right)/2;
            if (tar==mid)
            {
                arr[mid]=tar;
                System.out.println(arr[mid]);
            }

            if (arr[mid]<tar)
            {
              left=mid+1;
            }
            else
            {
                right=mid-1;
            }


        }




    }
}
