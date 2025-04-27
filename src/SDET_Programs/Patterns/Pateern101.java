package SDET_Programs.Patterns;

public class Pateern101 {

    public static void main(String[] args) {


        for (int i=1;i<=5;i++)
        {

            for (int j=1;j<=i;j++)
            {
                System.out.print((i+j+1)%2);


            }

            System.out.println();
        }


        System.out.println();
        int n=1;

        for(int i=1;i<=5;i++)
        {

            for (int j=1;j<=i;j++)
            {
                System.out.print(n+" ");
                n++;
            }

            System.out.println();
        }


        for(int i=1; i<=5; i++) {
            // Spaces
            for(int j=1; j<=5-i; j++) {
                System.out.print(" ");
            }
            // Stars
            for(int k=1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
