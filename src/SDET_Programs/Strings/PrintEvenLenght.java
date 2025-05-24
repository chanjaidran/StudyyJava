package SDET_Programs.Strings;

public class PrintEvenLenght {
    public static void main(String[] args) {

        String s="This is a java language";
       String arr[]=s.split(" ");

       reverse(arr,0,arr.length-1);



       for (String i:arr)
       {
//           if (i.length()%2==0)
//           {
               System.out.println(i);
         //  }
       }
    }

    static  void reverse(String arr[],int left,int right)
    {
        while (left<right)
        {
            String temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

    }
}
