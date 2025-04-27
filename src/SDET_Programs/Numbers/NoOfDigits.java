package SDET_Programs.Numbers;

public class NoOfDigits {

    public static void main(String[] args) {

        int num=1110;
        int co=0;

        while (num!=0)
        {
            num=num/10;
            co++;
        }

        System.out.println(co);
    }
}
