package SDET_Programs.Numbers;

public class PrintDigitsInNumbers {

    public static void main(String[] args) {

        int number=12345;

        while (number!=0)
        {
            int digit=number%10;
            System.out.print(digit+"");
            number=number/10;
        }
    }
}
