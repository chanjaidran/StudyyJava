package SDET_Programs.Patterns;

public class FullPyramid {

    public static void main(String[] args) {


        for(int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
