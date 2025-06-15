package SDET_Programs.Numbers;

public class ArmStrongNumber {

    public static void main(String[] args) {

        int num=153;
        int store=0;
        int rev=0;
        while (num!=0)
        {
            int c=num%10;
            rev=rev*10+c;
            store=store+c*c*c;
            num=num/10;
        }

        System.out.println(store);
        System.out.println(rev);


    }
}
