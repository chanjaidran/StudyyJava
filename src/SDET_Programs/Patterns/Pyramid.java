package SDET_Programs.Patterns;

public class Pyramid {


    public static void main(String[] args) {

        int a= 5;


        for (int i=0;i<=5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
