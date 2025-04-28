package SDET_Programs.Arrays;

public class MissingEvenNumber {

    public static void main(String[] args) {


       // int arr[]={2,4,8,10};
        int arr[]={1,2,3,4,6};

        int len=arr.length;

        for (int i=0;i<arr.length-1;i++)
        {
            int current=arr[i];
            int next=arr[i+1];

            if(next-current!=1)
            {
                int missing =current+1;
                System.out.println(missing);
                break;
            }
        }


    }
}


