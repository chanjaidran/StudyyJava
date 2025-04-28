package SDET_Programs.Strings;

public class MidlleCharInString {

    public static void main(String[] args) {

       // String name="jai";
        String name="test";
        char arr[]=name.toCharArray();



        int mid=arr.length/2;
        System.out.println(mid);

        if (arr.length%2==0)
          System.out.println(arr[mid]+" "+arr[mid-1]);
        else
            System.out.println(arr[mid]);



    }
}
