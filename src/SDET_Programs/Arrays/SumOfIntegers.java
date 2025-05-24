package SDET_Programs.Arrays;

public class SumOfIntegers {
    public static void main(String[] args) {

        String arr[]={"5","2","9","1","a","6","#","3"};

        int sum=0;

        for (String i:arr)
        {
            try {
                int k=Integer.parseInt(i);
                sum=sum+k;
            }
            catch (NumberFormatException e)
            {

            }

        }

        System.out.println(sum);
    }
}
