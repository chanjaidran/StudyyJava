package SDET_Programs.Numbers;

public class ArmStrongNumber {

    public static void main(String[] args) {

        int num=153;
        int store=0;
        while (num!=0)
        {
            int c=num%10;
            store=store+c*c*c;
            num=num/10;
        }

        System.out.println(store);


    }
}
