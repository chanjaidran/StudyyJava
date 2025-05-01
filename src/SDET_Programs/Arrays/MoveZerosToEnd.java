package SDET_Programs.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args)
    {



        int arr[] ={1,0,2,3,0,0,9,3};


        int index=0;
        for (int i=0;i<arr.length;i++)
        {
                if(arr[i]!=0)
                {
                    arr[index]=arr[i];
                    index++;
                }
        }

        System.out.println(index);

        for (int i=index;i<arr.length;i++)
        {
            arr[i]=0;
        }

        for (int i:arr)
        {
            System.out.print(i+" ");
        }

    }
}
